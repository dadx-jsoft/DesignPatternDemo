package creational5.singleton;

// c4: Thread safe singleton

/**
 * Cách này có nhược điểm là một phương thức synchronized sẽ chạy rất chậm
 * và tốn hiệu năng, bất kỳ Thread nào gọi đến đều phải chờ nếu có một Thread
 * khác đang sử dụng. Có những tác vụ xử lý trước và sau khi tạo thể hiện không
 * cần thiết phải block. Vì vậy chúng ta cần cải tiến nó đi 1 chút với
 * Double Check Locking Singleton.
 */
public class ThreadSafeLazyInitializedSingleton {

    private static volatile ThreadSafeLazyInitializedSingleton instance;

    private ThreadSafeLazyInitializedSingleton() {
        
    }

    public static synchronized ThreadSafeLazyInitializedSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeLazyInitializedSingleton();
        }
        return instance;
    }

}
