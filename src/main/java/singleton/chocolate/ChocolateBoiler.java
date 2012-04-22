/**
 * @file ChocolateBoiler.java
 * @brief
 * @author dingje <dingje.gm@gmail.com>
 * @date Fri Apr 20 23:28:55 2012
 */

package singleton.chocolate;

public class ChocolateBoiler {
  private boolean empty;
  private boolean boiled;
  private static ChocolateBoiler uniqueInstance;

  private ChocolateBoiler() {
    empty = true ;
    boiled = false ;
  }

  public static ChocolateBoiler getInstance() {
    if (uniqueInstance == null) {
      uniqueInstance = new ChocolateBoiler();
    }
    System.out.println("returning instance of chocolate boiler");
    return uniqueInstance;
  }

  public void fill() {
    if (isEmpty()) {
      empty = false ;
      boiled = false ;
    }
  }

  public void drain() {
    if (!isEmpty() && isBoiled()) {
      empty = true ;
    }
  }

  public void boil() {
    if (!isEmpty() && !isBoiled()) {
      boiled = true ;
    }
  }

  public boolean isEmpty() {
    return empty;
  }

  public boolean isBoiled() {
    return boiled;
  }
  
}
