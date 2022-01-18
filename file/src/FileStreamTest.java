import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class FileStreamTest {

    private final static String FILE_CHARSET = StandardCharsets.UTF_8.toString();

    public static void main(String[] args) throws IOException {
//    System.out.println(System.lineSeparator());
//    System.exit(2);

        String[] strArr = {"a", "中文", "c"};
        String projectPath = System.getProperty("user.dir") + "/file/src";
        String testStreamPath = projectPath + "/out.txt";
        File testFile = new File(testStreamPath);
        if (!testFile.exists()) {
            testFile.createNewFile();
        }
        writeToFile(testFile, strArr);

        readFile(testFile);
    }

    private static void readFile(File file) throws IOException {
        FileInputStream in = new FileInputStream(file);
        InputStreamReader inReader = new InputStreamReader(in, FILE_CHARSET);
        StringBuffer sb = new StringBuffer();
        while (inReader.ready()) {
            sb.append((char) inReader.read());
        }
        System.out.println(sb);
        inReader.close();
        in.close();
    }

    public static void writeToFile(File file, String[] tArr) throws IOException {
//    OutputStream out = new FileOutputStream(file);
//    for (String txt : tArr) {
//      out.write(txt.getBytes(StandardCharsets.UTF_8));
//    }
//    out.close();
//    System.out.println("write success");

//    File f = new File("a.txt");
        // 构建FileOutputStream对象,文件不存在会自动新建
        FileOutputStream fop = new FileOutputStream(file);

        // 构建OutputStreamWriter对象,参数可以指定编码,默认为操作系统默认编码,windows上是gbk
        OutputStreamWriter writer = new OutputStreamWriter(fop, FILE_CHARSET);
        // 写入到缓冲区
        for (String txt : tArr) {
            writer.append(txt);
//      writer.append("\r\n");
            writer.append(System.lineSeparator());
        }
        // 关闭写入流,同时会把缓冲区内容写入文件,所以上面的注释掉
        writer.close();

        // 关闭输出流,释放系统资源
        fop.close();
    }
}
