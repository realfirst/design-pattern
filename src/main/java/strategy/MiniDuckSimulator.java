/**
 * @file MiniDuckSimulator.java
 * @brief
 * @author dingje <dingje.gm@gmail.com>
 * @date Tue Apr 10 22:32:15 2012
 */
package strategy;

public class MiniDuckSimulator {
  public static void main(String[] args) {
    Duck mallard = new MallardDuck();
    mallard.performQuack();
    mallard.performFly();
  }
}
