
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;

// 利用Java代码给图片加水印
public class ImgWatermark {

    private static final String srcImgPath = "C:\\Users\\likgj\\Desktop\\2.png";

    public static void main(String[] args) {
        String tarImgPath = makeNewFilePath(srcImgPath);

        String waterMarkContent = "黑马程序员-软件测试";  //水印内容
        Color color = new Color(0, 0, 0, 200); //水印图片色彩以及透明度
        Font font = new Font("微软雅黑", Font.PLAIN, 16);

        new ImgWatermark().addWaterMark(srcImgPath, tarImgPath, waterMarkContent, color, font);

    }

    /**
     * @param srcImgPath       源图片路径
     * @param tarImgPath       保存的图片路径
     * @param waterMarkContent 水印内容
     * @param markContentColor 水印颜色
     * @param font             水印字体
     */
    public void addWaterMark(String srcImgPath, String tarImgPath, String waterMarkContent, Color markContentColor, Font font) {

        try {
            // 读取原图片信息
            File srcImgFile = new File(srcImgPath);//得到文件
            Image srcImg = ImageIO.read(srcImgFile);//文件转化为图片
            int srcImgWidth = srcImg.getWidth(null);//获取图片的宽
            int srcImgHeight = srcImg.getHeight(null);//获取图片的高
            // 加水印
            BufferedImage bufImg = new BufferedImage(srcImgWidth, srcImgHeight, BufferedImage.TYPE_INT_RGB);
            Graphics2D g = bufImg.createGraphics();
            g.drawImage(srcImg, 0, 0, srcImgWidth, srcImgHeight, null);
            g.setColor(markContentColor); //根据图片的背景设置水印颜色
            g.setFont(font);              //设置字体

            //设置水印的坐标
            int watermarkLength = getWatermarkLength(waterMarkContent, g);
//            System.out.println("srcImgWidth=" + srcImgWidth);
//            System.out.println("srcImgHeight=" + srcImgHeight);
//            System.out.println("watermarkLength=" + watermarkLength);
//            System.out.println("font.getSize()=" + font.getSize());
            int x = srcImgWidth - watermarkLength - 10;
            int y = srcImgHeight - font.getSize();
            g.drawString(waterMarkContent, x, y);  //画出水印
            g.dispose();
            // 输出图片
            FileOutputStream outImgStream = new FileOutputStream(tarImgPath);
            ImageIO.write(bufImg, "jpg", outImgStream);
            System.out.println("添加水印完成");
            outImgStream.flush();
            outImgStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private int getWatermarkLength(String waterMarkContent, Graphics2D g) {
        return g.getFontMetrics(g.getFont()).charsWidth(waterMarkContent.toCharArray(), 0, waterMarkContent.length());
    }

    private static String makeNewFilePath(String oldFilePath) {
        int dotIndex = oldFilePath.lastIndexOf(".");
//        System.out.println("dotIndex="+dotIndex);
        String new_file = new StringBuilder(oldFilePath).insert(dotIndex, "-w").toString();
        System.out.println("new_file===" + new_file);
        return new_file;
    }

}