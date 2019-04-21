import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test {


    public static void main(String[] args) {

        Map<Integer, String> map = new TreeMap<Integer, String>();

        for (int i = 1; i <= 6; i++) {

            String dirName = "C:\\Users\\likgj\\Desktop\\课程\\性能测试视频\\性能测试第" + i + "天\\3-视频";
            File dir = new File(dirName);



            for (File f : dir.listFiles()) {
                String fName = f.getName();
                System.out.println(fName);

                int index = Integer.parseInt(fName.split("-")[0]);
                int base = i * 1000;
                map.put(base + index, fName);

            }
        }
        System.out.println("==========");

        for (Integer index : map.keySet()){
            System.out.println(map.get(index));
        }


    }
}
