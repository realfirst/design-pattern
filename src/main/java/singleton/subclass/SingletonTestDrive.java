/**
 * @file SingletonTestDrive.java
 * @brief
 * @author dingje <dingje.gm@gmail.com>
 * @date Sat Apr 21 00:15:09 2012
 */

package singleton.subclass;

public class SingletonTestDrive {

  public static void main(String[] args) {
    Singleton foo = CoolerSingleton.getInstance();
    Singleton bar = HotterSingleton.getInstance();
    System.out.println(foo);
    System.out.println(bar);
  }
}
