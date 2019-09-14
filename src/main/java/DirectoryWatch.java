import java.io.IOException;
import java.nio.file.*;
import java.util.List;

/**
 * Class for monitoring modifications inside a folder
 *
 * @Version 1.0 12/09/2019
 *
 * @Author Juliano Nakamura
 */
public class DirectoryWatch {

    /** Object to print information in the console. */
    private Print printer = new Print();

    /** String with the relative path to da folder containing the documents to read. */
    private String pathname = "..\\Desafio-Analise-de-dados\\Data\\In";


    /**
     * Method to monitor the folder where are the documents in case of changes.
     * @return True if some change happened and False if not happened.
     */
    public boolean startWatching() {

        Path path = Paths.get(pathname);

        try {

            WatchService watcher = path.getFileSystem().newWatchService();

            path.register(watcher, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_DELETE, StandardWatchEventKinds.ENTRY_MODIFY);


            WatchKey watchKey = watcher.take();

            List<WatchEvent<?>> events = watchKey.pollEvents();

            for(WatchEvent event : events)
            {
                if(event.kind() == StandardWatchEventKinds.ENTRY_CREATE)
                {
                    printer.printing("New file in folder!\n");

                } else if(event.kind() == StandardWatchEventKinds.ENTRY_DELETE)
                {
                    printer.printing("File deleted!\n");

                } else if(event.kind() == StandardWatchEventKinds.ENTRY_MODIFY)
                {
                    printer.printing("File modified!\n");
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
            return false;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }
}
