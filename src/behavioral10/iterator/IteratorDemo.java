package behavioral10.iterator;

/**
 * https://www.tutorialspoint.com/design_pattern/iterator_pattern.htm
 * https://kieblog.vn/iterator-pattern-doi-dieu-thu-vi/
 * 
 * @author Duong Xuan Da
 * @date   2021-11-19
 */
// Call interator and print item in menu
public class IteratorDemo {

    public static void main(String[] args) {
        Menu menu = new Menu();

        for (Iterator iter = menu.getIterator(); iter.hasNext();) {
            String menuItem = (String) iter.next();
            System.out.println("Menu item : " + menuItem);
        }
    }
}