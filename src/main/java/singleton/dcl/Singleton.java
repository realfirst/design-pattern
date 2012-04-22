/**
 * @file Singletion.java
 * @brief
 * @author dingje <dingje.gm@gmail.com>
 * @date Sat Apr 21 00:02:29 2012
 */

package singletion.dcl;

public class Singleton {
  private volatile static Singleton uniqueInstance;

  private Singleton() {}

  public static Singleton getInstance() {
    if (uniqueInstance == null) {
      synchronized (Singleton.class) {
        if (uniqueInstance == null) {
          uniqueInstance = new Singleton();
        }
      }
    }
    return uniqueInstance;
  }
  
}
