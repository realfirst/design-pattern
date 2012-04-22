/**
 * @file InputTest.java
 * @brief
 * @author dingje <dingje.gm@gmail.com>
 * @date Sun Apr 15 16:51:31 2012
 */

package decotator.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {
  public static void main(String[] args) throws IOException {
    int c;
    try {
      InputStream in = new LowerCaseInputStream(
          new BufferedInputStream(
              new FileInputStream("test.txt")));

      while ((c = in.read()) > 0) {
        System.out.print((char)c);
      }

      in.close();
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}
