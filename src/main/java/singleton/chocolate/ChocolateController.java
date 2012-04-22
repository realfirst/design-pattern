/**
 * @file ChocolateController.java
 * @brief
 * @author dingje <dingje.gm@gmail.com>
 * @date Fri Apr 20 23:34:53 2012
 */

package singleton.chocolate;

public class ChocolateController {

  public static void main(String[] args) {
    ChocolateBoiler boiler = ChocolateBoiler.getInstance();
    boiler.fill();
    boiler.boil();
    boiler.drain();

    // will return the existing instancee
    ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
    if (boiler2 == boiler) {
      System.out.println("=");
    } else {
      System.out.println("!=");
    }
  }
  
}
