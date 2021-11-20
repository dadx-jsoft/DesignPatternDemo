package behavioral10.observer.subscriber.impl;

import java.io.File;

import behavioral10.observer.subscriber.EventListener;

//Source code: refactoring.guru - observer pattern
public class EmailNotificationListener implements EventListener {
    private String email;

    public EmailNotificationListener(String email) {
        this.email = email;
    }

    // Override lại method update, tùy cơ ứng biến khi có thay đổi từ Publisher
    @Override
    public void update(String eventType, File file) {
        System.out.println("Email to " + email + ": Someone has performed " + eventType
                + " operation with the following file: " + file.getName());
    }
}