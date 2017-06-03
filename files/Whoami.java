//
import java.io.*;

public class Whoami {
  public static void main(String[] args) {
    String osName = System.getProperty("os.name");
    String osArch = System.getProperty("os.arch");
    String osVersion = System.getProperty("os.version");

    String userName = System.getProperty("user.name");
    String userDir = System.getProperty("user.dir");
    String userHome = System.getProperty("user.home");

    System.out.println("os.name:" + osName );
    System.out.println("os.arch:" + osArch );
    System.out.println("os.version:" + osVersion );

    System.out.println("user.name:" + userName );
    System.out.println("user.dir:" + userDir );
    System.out.println("user.home:" + userHome );
  }
}
