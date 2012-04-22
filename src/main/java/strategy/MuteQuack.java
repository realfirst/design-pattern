/**
 * @file MuteQuack.java
 * @brief
 * @author dingje <dingje.gm@gmail.com>
 * @date Tue Apr 10 21:11:50 2012
 */

package strategy;

public class MuteQuack implements QuackBehavior {

  public void quack() {
    System.out.println("<< Slience >>");
  }
  
}
