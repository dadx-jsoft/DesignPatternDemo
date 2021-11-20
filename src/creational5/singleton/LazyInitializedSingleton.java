package creational5.singleton;

//cách 3: Lazy initialization
// Mở rộng hơn cách 1, 2 và hoạt động tốt hơn trong mt single-thread
// khắc phục nhược điểm của Eager initialization, chỉ khi getInstance() được gọi 
// thì mới khởi tạo instance

// Nhược: 
// + TH muilti-thread cùng chạy và cùng gọi hàm getInstance() 
// thì có thể nhiều hơn 1 instance --> khắc phục = cách dùng Thread safe Singleton
// + Đối với thao tác create instance quá chậm thì người dùng phải chờ lâu do lần đầu sd

public class LazyInitializedSingleton {

    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton() {

    }

    public static LazyInitializedSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}
