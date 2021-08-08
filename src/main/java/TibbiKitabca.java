import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.border.SolidBorder;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;

import java.io.IOException;

public class TibbiKitabca {

    private static final SolidBorder blackBorder = new SolidBorder(Color.BLACK, 0.7f);

    public void createMexaricPdf(Entity entity) throws IOException {
        String pdfPath = "tibbi-kitabca.pdf";
        PdfWriter pdfWriter = new PdfWriter(pdfPath);
        PdfDocument pdfDocument = new PdfDocument(pdfWriter);

        pdfDocument.setDefaultPageSize(PageSize.A4.rotate());
        pdfDocument.addNewPage();

        PdfFont normalFont = PdfFontFactory.createFont("fonts/arial.ttf", "Identity-H", true);

        Document document = new Document(pdfDocument);
        document.setFont(normalFont);

        //TABLE MAIN
        Table table = new Table(new float[]{50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50});
        table.setBorder(new SolidBorder(Color.WHITE, 0.7f));
        table.setMarginLeft(60);
        table.setMarginRight(60);

        /************************************************************************************************************/

        table.addCell(cell(3, 2, false, false, -1, ""));

        String str1 = "Azərbaycan  Respublikası  Səhiyyə  Nazirliyi @ İnformatika  və  Statistika  İdarəsi @ \n";
        table.addCell(cell(3, 7, true, false, -1, str1)
                .setBorder(new SolidBorder(Color.BLACK, 1.4f)).setBold());

        String str2 = "QEYDİYYAT  FORMASI @ AZS  № 25 @ 01,09,12  tarixli  137  saylı  əmrlə  təsdiq  edilmişdir";
        table.addCell(cell(3, 7, true, false, -1, str2)
                .setBorder(new SolidBorder(Color.BLACK, 1.4f)).setBold());

        /************************************************************************************************************/

        String str3 = "Müəsisənin  adı    BİOLOJİ  TƏBABƏT  KLİNİKASI                     Formanın Kodu";
        table.addCell(cell(1, 12, false, true, 5, str3)
                .setBorderTop(Border.NO_BORDER));

        table.addCell(new Cell(1, 4).setMarginRight(0).setMarginBottom(0).setMarginBottom(0).setPaddingBottom(0)
                .add(new Table(new float[]{30, 30, 30, 30, 30, 30, 30})
                        .setMarginRight(0).setMarginBottom(0).setMarginBottom(0).setPaddingBottom(0)
                        .addCell(new Cell().add(" "))
                        .addCell(new Cell().add(" "))
                        .addCell(new Cell().add(" "))
                        .addCell(new Cell().add(" "))
                        .addCell(new Cell().add(" "))
                        .addCell(new Cell().add(" "))
                        .addCell(new Cell().add("\u200F\u200F\u200E \u200E")))
                .setMarginTop(5).setBorder(Border.NO_BORDER));

        /************************************************************************************************************/

        table.addCell(cell(1, 3, false, false, 10, "BVM əlili vəsiqə №"));

        String bvmElilVesieqNo = entity.getBvmElilVesieqNo();
        table.addCell(cell(1, 4, true, true, 10, bvmElilVesieqNo));

        String str5 = "Qarabağ müharibəsi əlili vəsiqə №";
        table.addCell(cell(1, 6, false, false, 10, str5)
                .setTextAlignment(TextAlignment.RIGHT));

        String qarabagElilVesieqNo = entity.getQarabagElilVesieqNo();
        table.addCell(cell(1, 3, true, true, 10, qarabagElilVesieqNo));

        /**************************************************************************************************************/

        table.addCell(cell(1, 4, false, false, 10, "BVM iştirakçısı vəsiqə №"));

        String bvmIstirakVesiqNo = entity.getBvmIstirakVesiqNo();
        table.addCell(cell(1, 3, true, true, 10, bvmIstirakVesiqNo));

        String str7 = "Qarabağ müharibəsi iştirakçısı vəsiqə №";
        table.addCell(cell(1, 6, false, false, 10, str7)
                .setTextAlignment(TextAlignment.RIGHT));

        String qarabagIstirakVesiqNo = entity.getQarabagIstirakVesiqNo();
        table.addCell(cell(1, 3, true, true, 10, qarabagIstirakVesiqNo));


        /**************************************************************************************************************/

        table.addCell(new Cell(1, 3).add("").setBorder(Border.NO_BORDER).setMarginTop(20));

        String str8 = "AMBULATOR  XƏSTƏNİN  TİBBİ  KİTABÇASI №";
        table.addCell(cell(1, 8, true, false, 20, str8).setBold());

        String tibbiKitabcaNo = entity.getTibbiKitabcaNo();
        table.addCell(cell(1, 2, true, true, 20, tibbiKitabcaNo));

        table.addCell(cell(1, 3, true, false, 20, ""));

        /**************************************************************************************************************/

        table.addCell(new Cell(1, 11).add("").setBorder(Border.NO_BORDER).setMarginTop(0));

        table.addCell(cell(1, 2, true, false, 0, "kodu")
                .setBorderTop(new SolidBorder(Color.BLACK, 0.7f)).setFontSize(8));

        table.addCell(new Cell(1, 3).add("").setBorder(Border.NO_BORDER).setMarginTop(0));

        /**************************************************************************************************************/

        String str10 = "Soyadı, adı, atasının adı";
        table.addCell(cell(1, 4, false, false, 5, str10));

        String fullName = entity.getFullName();
        table.addCell(cell(1, 12, true, true, 5, fullName));

        /**************************************************************************************************************/

        table.addCell(cell(1, 3, false, false, 15, "Anadan olduğu il"));

        String birthDay = entity.getBirthDay();
        table.addCell(cell(1, 3, true, true, 15, birthDay));

        table.addCell(new Cell(1, 1).add("").setBorder(Border.NO_BORDER).setMarginTop(15));

        table.addCell(cell(1, 4, false, false, 15, "Daimi yaşadığı ünvan"));

        String address = entity.getAddress();
        table.addCell(cell(1, 5, true, true, 15, address));

        table.addCell(cell(1, 16, false, true, 20, ""));

        /**************************************************************************************************************/

        String str14 = "İş (təhsil) yeri";
        table.addCell(cell(1, 2, false, false, 15, str14));

        String workEducationAddress = entity.getWorkEducationAddress();
        table.addCell(cell(1, 14, true, true, 15, workEducationAddress));

        /**************************************************************************************************************/

        table.addCell(cell(1, 2, false, false, 15, "Ev telefonu"));

        String phoneNumber = entity.getPhoneNumber();
        table.addCell(cell(1, 6, true, true, 15, phoneNumber));

        table.addCell(cell(1, 2, false, false, 15, "İş telefonu"));

        String mobileNumber = entity.getMobileNumber();
        table.addCell(cell(1, 6, true, true, 15, mobileNumber));

        /**************************************************************************************************************/

        table.addCell(cell(1, 6, false, false, 20, "Dispanserizasiyaya təhkim olunmuşdur"));
        table.addCell(cell(1, 10, false, false, 20, ""));

        table.addCell(cell(1, 3, false, false, 0, "Bu müəsisədə"));

        String thisLocation = entity.getThisLocation();
        table.addCell(cell(1, 13, true, true, 0, thisLocation));

        table.addCell(new Cell(1, 2).add("").setMarginTop(0).setBorder(Border.NO_BORDER));


        table.addCell(cell(1, 14, true, false, 0, "həkim sahəsinin adı (nömrəsi)")
                .setBorderTop(new SolidBorder(Color.BLACK, 0.7f)).setFontSize(8));

        /**************************************************************************************************************/


        table.addCell(cell(1, 3, false, false, 10, "Ayrı müəsisədə"));

        String otherLocation = entity.getOtherLocation();
        table.addCell(cell(1, 13, true, true, 10, otherLocation));

        table.addCell(new Cell(1, 3).add("").setMarginTop(10).setBorder(Border.NO_BORDER));

        table.addCell(cell(1, 13, true, false, 0, "idarənin adı")
                .setBorderTop(new SolidBorder(Color.BLACK, 0.7f)).setFontSize(8));

        /*************************************************************************************************/

        document.add(table);
        document.close();
        pdfDocument.close();
        pdfWriter.close();
        System.out.println("PDF created");
    }

    private static Cell cell(int rowSpan, int colSpan, boolean alignCenter, boolean bottomBorder, float marginTop, String text) {
        Cell cell = new Cell(rowSpan, colSpan);
        cell.setBorder(Border.NO_BORDER);

        if (alignCenter) {
            cell.setTextAlignment(TextAlignment.CENTER);
        }

        if (bottomBorder) {
            cell.setBorderBottom(blackBorder);
        }

        if (marginTop > -1) {
            cell.setMarginTop(marginTop);
        }

        if (text.contains(" @ ")) {
            String[] str = text.split(" @ ");
            for (String s : str) {
                cell.add(s);
            }
        } else {
            cell.add(text);
        }


        return cell;
    }

}
