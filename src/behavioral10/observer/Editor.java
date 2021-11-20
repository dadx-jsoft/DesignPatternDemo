package behavioral10.observer;

import java.io.File;

import behavioral10.observer.publisher.EventManager;

public class Editor {
    public EventManager events;
    private File file;

    public Editor() {
        this.events = new EventManager("open", "save");
    }

    // Actions method đăng kí gọi notify
    public void openFile(String filePath) {
        this.file = new File(filePath);
        events.notify("open", file);
    }

    // Actions method đăng kí gọi notify
    public void saveFile() throws Exception {
        if (this.file != null) {
            events.notify("save", file);
        } else {
            throw new Exception("Please open a file first.");
        }
    }
}