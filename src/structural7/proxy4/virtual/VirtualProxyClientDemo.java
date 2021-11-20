package structural7.proxy4.virtual;

/**
 * Virtual proxy: Trì hoãn việc tạo ra real subject bên trong proxy class. Chỉ
 * đến khi cần, proxy class mới thật sự khởi tạo real class. Loại Proxy này làm
 * việc theo cơ chế Lazy Loading.
 * 
 * https://gpcoder.com/4644-huong-dan-java-design-pattern-proxy/
 * https://refactoring.guru/design-patterns/proxy
 * 
 * @author Duong Xuan Da
 * @date 2021-11-19
 */
public class VirtualProxyClientDemo {
    public static void main(String[] args) {
        System.out.println("Init proxy image: ");
        ProxyImage proxyImage = new ProxyImage("http://gpcoder.com/favicon.ico");

        System.out.println("---");
        System.out.println("Call real service 1st: ");
        proxyImage.showImage();

        System.out.println("---");
        System.out.println("Call real service 2nd: ");
        proxyImage.showImage();
    }
}