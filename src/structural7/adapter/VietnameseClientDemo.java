package structural7.adapter;

import structural7.adapter.adaptee.JapaneseAdaptee;

/**
 * https://gpcoder.com/4483-huong-dan-java-design-pattern-adapter/
 * 
 * Adapter Pattern (Người chuyển đổi) là một trong những Pattern thuộc nhóm cấu
 * trúc (Structural Pattern). Adapter Pattern cho phép các inteface (giao diện)
 * không liên quan tới nhau có thể làm việc cùng nhau. Đối tượng giúp kết nối
 * các interface gọi là Adapter.
 * 
 * @author Duong Xuan Da
 * @date 2021/11/19
 */
public class VietnameseClientDemo {

    public static void main(String[] args) {
        VietnameseTarget client = new TranslatorAdapter(new JapaneseAdaptee());
        client.send("Xin chào");
    }
}