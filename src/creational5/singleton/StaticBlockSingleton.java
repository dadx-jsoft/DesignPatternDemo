package creational5.singleton;

//cách 2: static block initialization
// Implement tương tự Eager initializtion, chỉ khác phần static block cung cấp
// thêm lựa chọn cho handle exception hay các xử lý khác

public class StaticBlockSingleton {

    private static final StaticBlockSingleton INSTANCE;

    private StaticBlockSingleton() {

    }

    // static block initialization for exception handling
    static {
        try {
            INSTANCE = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return INSTANCE;
    }
}
