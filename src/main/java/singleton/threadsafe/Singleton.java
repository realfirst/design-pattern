/**
 * @file Singleton.java<threadsafe>
 * @brief
 * @author dingje <dingje.gm@gmail.com>
 * @date Sat Apr 21 00:18:25 2012
 */

package singleton.threadsafe;

public class Singleton {
  private static Singleton uniqueInstance;

  private Singleton() {}

  public static synchronized Singleton getInstance() {
    if (uniqueInstance == null) {
      uniqueInstance = new Singleton();
    }
    return uniqueInstance;
  }
}

