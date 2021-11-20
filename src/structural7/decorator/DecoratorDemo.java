package structural7.decorator;

/**
 * https://gpcoder.com/4574-huong-dan-java-design-pattern-decorator/
 * 
 * Decorator: Nó cho phép người dùng thêm chức năng mới vào đối tượng hiện tại
 * mà không muốn ảnh hưởng đến các đối tượng khác. Kiểu thiết kế này có cấu trúc
 * hoạt động như một lớp bao bọc (wrap) cho lớp hiện có. Mỗi khi cần thêm tính
 * năng mới, đối tượng hiện có được wrap trong một đối tượng mới (decorator
 * class).
 * 
 * Decorator pattern sử dụng composition thay vì inheritance (thừa kế) để mở
 * rộng đối tượng. Decorator pattern còn được gọi là Wrapper hay Smart Proxy.
 * 
 * @author Duong Xuan Da
 *
 */
public class DecoratorDemo {

    public static void main(String[] args) {
        System.out.println("NORMAL EMPLOYEE: ");
        EmployeeComponent employee = new EmployeeConcreteComponent("GPCoder");
        employee.showBasicInformation();
        employee.doTask();

        System.out.println("\nTEAM MEMBER: ");
        EmployeeComponent teamMember = new TeamMember(employee);
        teamMember.showBasicInformation();
        teamMember.doTask();

        System.out.println("\nTEAM LEADER: ");
        EmployeeComponent teamLeader = new TeamLeader(employee);
        teamLeader.showBasicInformation();
        teamLeader.doTask();

        System.out.println("\nMANAGER: ");
        EmployeeComponent manager = new Manager(employee);
        manager.showBasicInformation();
        manager.doTask();

        System.out.println("\nTEAM LEADER AND MANAGER: ");
        EmployeeComponent teamLeaderAndManager = new Manager(teamLeader);
        teamLeaderAndManager.showBasicInformation();
        teamLeaderAndManager.doTask();

    }
}