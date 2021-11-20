package behavioral10.observer.subscriber;

import java.io.File;

//Chỉ là interface, ông nào đăng kí thì implement interface này
public interface EventListener {
    public void update(String eventType, File file);
}