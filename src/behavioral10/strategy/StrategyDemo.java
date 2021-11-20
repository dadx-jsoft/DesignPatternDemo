package behavioral10.strategy;

/**
 * https://kieblog.vn/strategy-pattern-vi-du-trong-java/
 * https://refactoring.guru/design-patterns/strategy
 * 
 * @author Duong Xuan Da
 * @date   2021-11-19
 */
public class StrategyDemo {
    public static void main(String[] args) {
        // Vit troi
        Duck vitTroi = new VitTroi();
        vitTroi.display();
        vitTroi.performQuack();
        vitTroi.performFly();

        System.out.println("======");
        
        // Vit nhua
        Duck vitNhua = new VitNhua();
        vitNhua.display();
        vitNhua.performQuack();
        vitNhua.performFly();
    }
}