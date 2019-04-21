import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.pdf.*;

import java.awt.*;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class PdfWatermark {


    /**
     * @param old_pdf  原PDF位置
     * @param new_file 输出文件的路径
     * @throws DocumentException
     * @throws IOException
     */
    public static void setWatermark(String old_pdf, String new_file)
            throws DocumentException, IOException {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File(new_file)));
        PdfReader reader = new PdfReader(old_pdf);
        PdfStamper stamper = new PdfStamper(reader, bos);
        int total = reader.getNumberOfPages() + 1;
        PdfContentByte content;
//        BaseFont base = BaseFont.createFont("Helvetica", "Cp1252", BaseFont.EMBEDDED);
//        BaseFont base = BaseFont.createFont(BaseFont.TIMES_ROMAN, "Cp1252", false);
//        BaseFont base = BaseFont.createFont("C:/windows/fonts/simsun.ttc,1", "Cp1252", false);
//        BaseFont base = BaseFont.createFont("C:/windows/fonts/simsun.ttc,1", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
//        BaseFont base = BaseFont.createFont("C:\\Windows\\Fonts\\STKAITI.TTF", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
        BaseFont base = BaseFont.createFont("C:\\Windows\\Fonts\\simkai.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
        PdfGState gs = new PdfGState();
        gs.setFillOpacity(0.2f);

        PdfGState gs2 = new PdfGState();
        gs2.setFillOpacity(0.9F);
        for (int i = 1; i < total; i++) {
            content = stamper.getOverContent(i);// 在内容上方加水印
            // content = stamper.getUnderContent(i);//在内容下方加水印
            content.setGState(gs);
            content.beginText();
            content.setColorFill(Color.LIGHT_GRAY);
            content.setFontAndSize(base, 45);
            content.setTextMatrix(70, 200);
            content.showTextAligned(Element.ALIGN_CENTER, "传智播客-黑马程序员", 300, 420, 45);

//            Image image = Image.getInstance("C:\\Users\\likgj\\Pictures/福.jpg");
//            image.setAbsolutePosition(200, 206); // set the first background
//            image.scaleToFit(200, 200);
//            content.addImage(image);

            content.setGState(gs2);
            content.setColorFill(Color.BLACK);
            content.setFontAndSize(base, 20);
            content.showTextAligned(Element.ALIGN_CENTER, "黑马程序员-软件测试", 300, 10, 0);
            content.endText();

        }
        stamper.close();
        bos.close();
        reader.close();
    }
}