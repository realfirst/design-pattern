/**
 * @file MallardDuck.java
 * @brief
 * @author dingje <dingje.gm@gmail.com>
 * @date Tue Apr 10 21:23:56 2012
 */

package strategy;

public class MallardDuck extends Duck {

  public MallardDuck() {
    quackBehavior = new Quack();
    flyBehavior = new FlyWithWings();
  }

  public void display() {
    System.out.println("I'm a real Mallard duck");
  }
  
}
