import java.io.File;
import java.io.IOException;

public class FileTest {

  public static void main(String[] args) throws IOException {
//    File file = new File("abc.txt");
//    System.out.println(file);

//    System.out.println(System.getProperty("user.dir"));
    String curPath = System.getProperty("user.dir");
    String abcPath = curPath + "/file/src/abc.json";

    System.out.println(abcPath);
    File abcFile = new File(abcPath);
    if (abcFile.exists()) {
      System.out.println("文件已存在");
    }else{
      abcFile.createNewFile();
    }
    System.out.println("完成");
  }
}
