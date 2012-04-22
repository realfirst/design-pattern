/**
 * @file Singleton.java<stat>
 * @brief
 * @author dingje <dingje.gm@gmail.com>
 * @date Fri Apr 20 23:55:48 2012
 */

package singleton.stat;

public class Singleton {
  public static Singleton uniqueInstance = new Singleton(); // 急切创建

  private Singleton() {}

  public static Singleton getInstance() {
    return uniqueInstance;              // 直接使用
  }
  
}
