/**
 * @file Singleton.java
 * @brief
 * @author dingje <dingje.gm@gmail.com>
 * @date Fri Apr 20 23:24:09 2012
 */

package singleton.classic;

public class Singleton {
  private static Singleton uniqueInstance;

  private Singleton() {}

  public static Singleton getInstance() {
    if (uniqueInstance == null) {
      uniqueInstance = new Singleton();
    }
    return uniqueInstance;
  }
  
}
