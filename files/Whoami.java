import java.io.*;


public class Whoami {
  public static void main(String[] args) {
    String userName = System.getProperty("user.name");
    String userDir = System.getProperty("user.dir");
    String userHome = System.getProperty("user.home");
    String osName = System.getProperty("os.name");
    String osArch = System.getProperty("os.arch");
    String osVersion = System.getProperty("os.version");
    System.out.println("{ \n");
    System.out.println("  \"changed\":" + " false,");
    System.out.println("  \"rc\":" + " 0,");
    System.out.println("  \"stderr_lines\":" + " [],");
    System.out.println("  \"results\":" + " {");
    System.out.println("     \"os.name\": \"" + osName + "\" ," );
    System.out.println("     \"os.arch\": \"" + osArch + "\" ," );
    System.out.println("     \"os.version\": \"" + osVersion + "\" ," );
    System.out.println("     \"user.dir\": \"" + userDir + "\" ," );
    System.out.println("     \"user.home\": \"" + userHome + "\" ," );
    System.out.println("     \"user.name\": \"" + userName + "\" " );
    System.out.println("  }\n}");
  }
}
