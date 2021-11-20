package structural7.proxy4.protection;

/**
 * Protection proxy: Yêu cầu người gọi proxy class phải chứng thực trước khi
 * proxy class truy xuất vào real class. Cái này rất hữu dụng khi bạn bạn viết
 * library cho một bên khác sử dụng và yêu cầu họ xác thực trước khi gọi hàm.
 * 
 * https://gpcoder.com/4644-huong-dan-java-design-pattern-proxy/
 * https://refactoring.guru/design-patterns/proxy
 * 
 * @author Duong Xuan Da
 * @date 2021-11-19
 */
public class ProtectionProxyClientDemo {
    public static void main(String[] args) {
        UserService admin = new UserServiceProxy("gpcoder", "admin");
        admin.load();
        admin.insert();

        System.out.println("======================================");
        
        UserService customer = new UserServiceProxy("customer", "guest");
        customer.load();
        customer.insert();
    }
}