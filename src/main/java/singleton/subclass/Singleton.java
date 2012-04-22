/**
 * @file Singleton.java<subclass>
 * @brief
 * @author dingje <dingje.gm@gmail.com>
 * @date Sat Apr 21 00:09:12 2012
 */

package singleton.subclass;

public class Singleton {

  protected static Singleton uniqueInstance;

  protected Singleton() {}

  public static synchronized Singleton getInstance() {
    if (uniqueInstance == null) {
      uniqueInstance = new Singleton();
    }
    return uniqueInstance;
  }
  
}
