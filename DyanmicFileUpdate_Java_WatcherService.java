package mytest.myexample;

import static java.nio.file.StandardWatchEventKinds.ENTRY_CREATE;
import static java.nio.file.StandardWatchEventKinds.ENTRY_DELETE;
import static java.nio.file.StandardWatchEventKinds.ENTRY_MODIFY;
 
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
 

public class DyanmicFileUpdate_Java_WatcherService {
 
    public static void main(String[] args) {
        try {
            WatchService watcher = FileSystems.getDefault().newWatchService();
            Path dir = Paths.get("D:/XXXX/XXXX_Platform_details");
            System.out.println("We are going to register the watcher server for specific director: " + dir.getFileName());
            dir.register(watcher, ENTRY_CREATE, ENTRY_DELETE, ENTRY_MODIFY);
             
            while (true) {
                WatchKey key;
                try {
                    key = watcher.take();
                } catch (InterruptedException e) {
                	System.err.println("The Exception has been occured " +e.getMessage());
                	e.printStackTrace();
                    return;
                }
                for (WatchEvent<?> event : key.pollEvents()) {
                    WatchEvent.Kind<?> kind = event.kind();
                     
                    @SuppressWarnings("unchecked")
                    WatchEvent<Path> ev = (WatchEvent<Path>) event;
                    Path fileName = ev.context();
                    if(fileName !=null){
	                    System.out.println("The Operation Name: " +kind.name() + ":: The file Name: " + fileName);
	                     
	                    if (kind == ENTRY_MODIFY && fileName.toString().equals("ImpNotes.txt.txt")) {
	                        System.out.println("My source file has changed!!!");
	                    }
                    }
                }
                boolean valid = key.reset();
                if (!valid) {
                    break;
                }
            }
        } catch (IOException e) {
        	System.err.println("The Exception has been occured " +e.getMessage());
        	e.printStackTrace();
        }
    }
}