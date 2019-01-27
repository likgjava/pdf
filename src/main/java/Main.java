import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Properties;

public class Main {

    private static final String SOURCE_FILE_PATH = "C:\\Users\\likgj\\Desktop\\1.pdf";

    public static void main(String[] args) throws Exception {

        System.out.println("args==" + Arrays.toString(args));
        if (args.length == 0) {
            // 要输出的pdf文件
            String new_file = makeNewFilePath(SOURCE_FILE_PATH);

            // 将pdf文件先加水印然后输出
            PdfWatermark.setWatermark(SOURCE_FILE_PATH, new_file);
        } else {
            // 加载配置文件
            String configFile = "C:\\PdfWatermark/pdf.properties";
            Properties prop = new Properties();
            prop.load(new FileInputStream(configFile));
            Enumeration<Object> elements = prop.elements();
            while (elements.hasMoreElements()) {
                Object filePath = elements.nextElement();
                String new_file = makeNewFilePath(filePath.toString());

                PdfWatermark.setWatermark(SOURCE_FILE_PATH, new_file);
            }
        }
    }

    private static String makeNewFilePath(String oldFilePath) {
        String new_file = oldFilePath.replace(".pdf", "-w.pdf");
        System.out.println("new_file===" + new_file);
        return new_file;
    }
}
