package behavioral10.observer;

import behavioral10.observer.subscriber.impl.EmailNotificationListener;
import behavioral10.observer.subscriber.impl.LogOpenListener;

/**
 * https://kieblog.vn/observer-pattern-nhat-tru-kinh-thien/
 * https://refactoring.guru/design-patterns/observer
 * 
 * @author Duong Xuan Da
 * @date   2021-11-19
 */
public class ObserverDemo {
    public static void main(String[] args) {
        Editor editor = new Editor();
      
        // Đăng kí loại event và các actions muốn làm với event đó
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            // Gọi tới notify để thông báo tới các subscriber
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}