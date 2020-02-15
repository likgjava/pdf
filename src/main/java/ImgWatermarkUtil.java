import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;

// 利用Java代码给图片加水印
public class ImgWatermarkUtil {

    private static final String srcImgPath = "C:\\Users\\Administrator\\Desktop\\a1.png";

    public static void main(String[] args) {
        String centerContent = "黑马程序员";  // 中间水印内容
        String footContent = "@黑马程序员-软件测试";  // 中间水印内容
        String tarImgPath = makeNewFilePath(srcImgPath);

        ImgWatermarkUtil.addWaterMarkToContent(srcImgPath, tarImgPath, centerContent);
        ImgWatermarkUtil.addWaterMarkToFoot(srcImgPath, tarImgPath, footContent);
    }

    /**
     * 添加内容水印
     *
     * @param srcImgPath       源图片路径
     * @param tarImgPath       保存的图片路径
     * @param waterMarkContent 水印内容
     */
    public static void addWaterMarkToContent(String srcImgPath, String tarImgPath, String waterMarkContent) {
        try {
            int degree = -45; //设置水印文字的旋转角度
            float alpha = 0.2f; //设置水印透明度 默认为1.0  值越小颜色越浅
            Color markContentColor = Color.GRAY;  //水印颜色
            Font font = new Font("微软雅黑", Font.PLAIN, 20); // 水印字体

            // 读取原图片信息
            File srcImgFile = new File(srcImgPath);//得到文件
            Image srcImg = ImageIO.read(srcImgFile);//文件转化为图片
            int srcImgWidth = srcImg.getWidth(null);//获取图片的宽
            int srcImgHeight = srcImg.getHeight(null);//获取图片的高
            System.out.println("srcImgWidth=" + srcImgWidth);
            System.out.println("srcImgHeight=" + srcImgHeight);

            // 加水印
            BufferedImage bufImg = new BufferedImage(srcImgWidth, srcImgHeight, BufferedImage.TYPE_INT_RGB);
            Graphics2D g = bufImg.createGraphics();
            g.drawImage(srcImg, 0, 0, srcImgWidth, srcImgHeight, null);
            g.setColor(markContentColor); //根据图片的背景设置水印颜色
            g.setFont(font);              //设置字体
            g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_ATOP, alpha));//设置水印文字透明度
            g.rotate(Math.toRadians(degree), (double) srcImgWidth / 2, (double) srcImgHeight / 2); //设置水印旋转

            //设置水印的坐标
            int space = 50; // 水印间距
            int watermarkWidth = getWatermarkLength(waterMarkContent, g) + space;
            int watermarkHeight = font.getSize() + space;
            System.out.println(String.format("watermarkWidth=%s watermarkHeight=%s", watermarkWidth, watermarkHeight));

            // 计算最大覆盖长度（可以想象成是圆的直径）
            int maxSrcLength = (int) Math.sqrt(srcImgWidth * srcImgWidth + srcImgHeight * srcImgHeight);
            int maxRows = maxSrcLength / watermarkHeight;
            System.out.println(String.format("maxSrcLength=%s maxRows=%s", maxSrcLength, maxRows));
            // 计算虚拟原点
            int vx = (srcImgWidth / 2) - (maxSrcLength / 2);
            int vy = (srcImgHeight / 2) - (maxSrcLength / 2);
            System.out.println(String.format("vx=%s vy=%s", vx, vy));

            for (int i = 0; i < maxRows; i++) {
                int y = vy + (i + 1) * watermarkHeight;
                for (int j = 0; j < maxRows; j++) {
                    int x = vx + j * watermarkWidth;
                    g.drawString(waterMarkContent, x, y); //画出水印
                }
            }
            g.dispose();

            // 输出图片
            FileOutputStream outImgStream = new FileOutputStream(tarImgPath);
            ImageIO.write(bufImg, "png", outImgStream);
            System.out.println("添加水印完成");
            outImgStream.flush();
            outImgStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 添加脚注水印
     *
     * @param srcImgPath       源图片路径
     * @param tarImgPath       保存的图片路径
     * @param waterMarkContent 水印内容
     */
    public static void addWaterMarkToFoot(String srcImgPath, String tarImgPath, String waterMarkContent) {
        try {
            Color markContentColor = Color.GRAY;  //水印颜色
            Font font = new Font("微软雅黑", Font.PLAIN, 16); // 水印字体

            // 读取原图片信息
            File srcImgFile = new File(srcImgPath);//得到文件
            Image srcImg = ImageIO.read(srcImgFile);//文件转化为图片
            int srcImgWidth = srcImg.getWidth(null);//获取图片的宽
            int srcImgHeight = srcImg.getHeight(null);//获取图片的高
            System.out.println("srcImgWidth=" + srcImgWidth);
            System.out.println("srcImgHeight=" + srcImgHeight);

            // 加水印
            BufferedImage bufImg = new BufferedImage(srcImgWidth, srcImgHeight, BufferedImage.TYPE_INT_RGB);
            Graphics2D g = bufImg.createGraphics();
            g.drawImage(srcImg, 0, 0, srcImgWidth, srcImgHeight, null);
            g.setColor(markContentColor); //根据图片的背景设置水印颜色
            g.setFont(font);              //设置字体

            //设置水印的坐标
            int watermarkLength = getWatermarkLength(waterMarkContent, g);
            System.out.println("watermarkLength=" + watermarkLength);
            System.out.println("font.getSize()=" + font.getSize());

            int x = srcImgWidth - watermarkLength - 10;
            int y = srcImgHeight - font.getSize();
            g.drawString(waterMarkContent, x, y);  //画出水印
            g.dispose();
            // 输出图片
            FileOutputStream outImgStream = new FileOutputStream(tarImgPath);
            ImageIO.write(bufImg, "png", outImgStream);
            System.out.println("添加水印完成");
            outImgStream.flush();
            outImgStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 文字水印的宽
    private static int getWatermarkLength(String waterMarkContent, Graphics2D g) {
        // 方法一
        //JLabel label = new JLabel(waterMarkContent);
        //FontMetrics metrics = label.getFontMetrics(g.getFont());
        //int width1 = metrics.stringWidth(label.getText());
        //System.out.println("width1=" + width1);

        // 方法二
        int width2 = g.getFontMetrics(g.getFont()).charsWidth(waterMarkContent.toCharArray(), 0, waterMarkContent.length());
        System.out.println("width2=" + width2);
        return width2;
    }

    private static String makeNewFilePath(String oldFilePath) {
        int dotIndex = oldFilePath.lastIndexOf(".");
        String new_file = new StringBuilder(oldFilePath).insert(dotIndex, "-w").toString();
        System.out.println("new_file===" + new_file);
        return new_file;
    }

}