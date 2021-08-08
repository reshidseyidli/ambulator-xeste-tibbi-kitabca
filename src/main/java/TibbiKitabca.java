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
import com.itextpdf.text.Element;

import java.io.IOException;

public class TibbiKitabca {

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
        Table table = new Table(new float[]{50f, 50f, 50f, 50f, 50f, 50f, 50f, 50f, 50f, 50f, 50f, 50f, 50f, 50f, 50f, 50f});
        table.setBorder(new SolidBorder(Color.WHITE, 0.7f));
        table.setMarginLeft(60f);
        table.setMarginRight(60f);

        table.addCell(new Cell(3, 2).add("sekil").setBorderBottom(Border.NO_BORDER));

        table.addCell(new Cell(3, 7)
                .add("Azerbaycan Respublikasi Sehiyye Nazirliyi")
                .add("Informatika ve statistika idearesi")
                .add("\n").setTextAlignment(TextAlignment.CENTER)
                .setBold().setBorder(new SolidBorder(Color.BLACK, 1.4f)));

        table.addCell(new Cell(3, 7)
                .add("Qeydiyyat formasi")
                .add("AZS NO 25")
                .add("01,09,12 tarixli 137 sayli emrle tsdiq edilmisdir")
                .setTextAlignment(TextAlignment.CENTER)
                .setBold().setBorder(new SolidBorder(Color.BLACK, 1.4f)));

        /************************************************************************************************************/

        table.addCell(new Cell(1, 12)
                .add("Muesisenin adi biologi tebabet klinikasi                                    " +
                        "                  formanin kodu")
                .setBorderBottom(new SolidBorder(Color.BLACK, 0.7f)).setMarginTop(5f)
                .setBorderRight(new SolidBorder(Color.WHITE, 0.7f))
                .setBorderTop(Border.NO_BORDER));


        table.addCell(new Cell(1, 4).setMarginRight(0f).setMarginBottom(0f).setMarginBottom(0f).setPaddingBottom(0f)
                .add(new Table(new float[]{30f, 30f, 30f, 30f, 30f, 30f, 30f})
                        .setMarginRight(0f).setMarginBottom(0f).setMarginBottom(0f).setPaddingBottom(0f)
                        .addCell(new Cell().add(" "))
                        .addCell(new Cell().add(" "))
                        .addCell(new Cell().add(" "))
                        .addCell(new Cell().add(" "))
                        .addCell(new Cell().add(" "))
                        .addCell(new Cell().add(" "))
                        .addCell(new Cell().add("h")))
                .setMarginTop(5f).setBorder(Border.NO_BORDER));

        /************************************************************************************************************/

        table.addCell(new Cell(1, 3).add("bmv elisi vesiqe no").setBorder(Border.NO_BORDER)
                .setMarginTop(10f));

        table.addCell(new Cell(1, 2).add("2").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(Color.BLACK, 0.7f))
                .setMarginTop(10f));

        table.addCell(new Cell(1, 8).add("qarabag muharibesi elili vesiqe no: ").setBorder(Border.NO_BORDER)
                .setMarginTop(10f).setTextAlignment(TextAlignment.RIGHT));

        table.addCell(new Cell(1, 3).add("2")
                .setBorder(Border.NO_BORDER)
                .setBorderBottom(new SolidBorder(Color.BLACK, 0.7f))
                .setMarginTop(10f));

        /**************************************************************************************************************/

        table.addCell(new Cell(1, 4).add("bmv istirakcisi vesiqe no").setBorder(Border.NO_BORDER)
                .setMarginTop(10f));

        table.addCell(new Cell(1, 2).add("2")
                .setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(Color.BLACK, 0.7f))
                .setMarginTop(10f));

        table.addCell(new Cell(1, 7).add("qarabag muharibesi istirakcisi vesiqe no").setBorder(Border.NO_BORDER)
                .setMarginTop(10f).setTextAlignment(TextAlignment.RIGHT));

        table.addCell(new Cell(1, 3).add("2").setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(Color.BLACK, 0.7f))
                .setMarginTop(10f));


        /**************************************************************************************************************/

        table.addCell(new Cell(1, 3).add("").setBorder(Border.NO_BORDER).setMarginTop(20f));

        table.addCell(new Cell(1, 8).add("AMBULATOR  XESTENIN  TIBBI  KITABCASI  NO").setBold()
                .setBorder(Border.NO_BORDER).setMarginTop(20f));

        table.addCell(new Cell(1, 2).add("334575")
                .setBorder(Border.NO_BORDER)
                .setBorderBottom(new SolidBorder(Color.BLACK, 0.7f)).setMarginTop(20f)
                .setTextAlignment(TextAlignment.CENTER).setMarginBottom(0).setPaddingBottom(0));

        table.addCell(new Cell(1, 3).add("").setBorder(Border.NO_BORDER).setMarginTop(20f));

        /**************************************************************************************************************/

        table.addCell(new Cell(1, 11).add("").setBorder(Border.NO_BORDER).setMarginTop(0f));

        table.addCell(new Cell(1, 2).add("kodu")
                .setBorder(Border.NO_BORDER).setBorderTop(new SolidBorder(Color.BLACK, 0.7f)).setMarginTop(0f).setPaddingTop(0f)
                .setTextAlignment(TextAlignment.JUSTIFIED).setTextAlignment(TextAlignment.CENTER)
                .setFontSize(8f));

        table.addCell(new Cell(1, 3).add("").setBorder(Border.NO_BORDER).setMarginTop(0f));

        /**************************************************************************************************************/

        table.addCell(new Cell(1, 4).add("Soyadi, adi, atasinin adi")
                .setMarginTop(20f).setBorder(Border.NO_BORDER));

        table.addCell(new Cell(1, 12).add("QENBEROVA  ILHAME  CEBRAYIL").setTextAlignment(TextAlignment.CENTER)
                .setMarginTop(20f).setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(Color.BLACK, 0.7f)));


        /**************************************************************************************************************/

        table.addCell(new Cell(1, 3).add("Anadan oldugu il").setBorder(Border.NO_BORDER)
                .setMarginTop(15f));

        table.addCell(new Cell(1, 3).add("18.18.1977").setTextAlignment(TextAlignment.CENTER)
                .setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(Color.BLACK, 0.7f))
                .setMarginTop(15f));

        table.addCell(new Cell(1, 1).add("").setBorder(Border.NO_BORDER).setMarginTop(10f));

        table.addCell(new Cell(1, 3).add("Daimi yasadigi unvan").setBorder(Border.NO_BORDER)
                .setMarginTop(15f));

        table.addCell(new Cell(1, 6)
                .add("address")
                .setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(Color.BLACK, 0.7f))
                .setMarginTop(15f));

        /**************************************************************************************************************/

        table.addCell(new Cell(1, 16).add("")
                        .setBorder(Border.NO_BORDER).setBorderBottom(new SolidBorder(Color.BLACK, 0.7f))
                .setMarginTop(30f));

        /**************************************************************************************************************/
        /**************************************************************************************************************/
        /**************************************************************************************************************/
        /**************************************************************************************************************/
        /**************************************************************************************************************/
        /**************************************************************************************************************/
        /**************************************************************************************************************/


//        Cell cellHeading = new Cell();
//        String headingTxtBioloji = "Bioloji  Təbabət  Klinikası";
//        cellHeading.setTextAlignment(TextAlignment.CENTER);
//        cellHeading.add(headingTxtBioloji);
//        cellHeading.setMarginTop(2f);
//        cellHeading.setMarginBottom(2f);
//
//        Cell cellOrta = new Cell();
//        cellOrta.setTextAlignment(TextAlignment.CENTER);
//        cellOrta.setBorderBottom(new SolidBorder(Color.BLACK, 2f));
//
//
//        Table tblSeria = new Table(new float[]{155, 50, 40, 155});
//        tblSeria.setMarginTop(10f);
//        tblSeria.setBorder(new SolidBorder(Color.WHITE, 1f));
//        tblSeria.addCell(new Cell().add("Seriya").setPaddingLeft(70f).setBorder(new SolidBorder(Color.WHITE, 1f)).setTextAlignment(TextAlignment.RIGHT));
//        tblSeria.addCell(new Cell().add(entity.getBTKM()).setUnderline().setBorder(new SolidBorder(Color.WHITE, 1f)));
//        tblSeria.addCell(new Cell().add("nömrə").setBorder(new SolidBorder(Color.WHITE, 1f)));
//        tblSeria.addCell(new Cell().add(entity.getM0374()).setPaddingRight(70f).setUnderline().setTextAlignment(TextAlignment.LEFT));
//
//        Table tblTarix = new Table(new float[]{30, 50, 30, 100, 190});
//        tblTarix.setMarginTop(10f);
//        tblTarix.setBorder(new SolidBorder(Color.WHITE, 1f));
//        tblTarix.addCell(new Cell().add("<<").setBorder(new SolidBorder(Color.WHITE, 1f)).setPaddingLeft(70));
//        tblTarix.addCell(new Cell().add(String.valueOf(entity.getTarix().getDayOfMonth())).setBorderBottom(new SolidBorder(Color.BLACK, 1f)));
//        tblTarix.addCell(new Cell().add(">>").setBorder(new SolidBorder(Color.WHITE, 1f)).setTextAlignment(TextAlignment.LEFT));
//        tblTarix.addCell(new Cell().add(String.valueOf(entity.getTarix().getMonth())).setBorderBottom(new SolidBorder(Color.BLACK, 1f)));
//        tblTarix.addCell(new Cell().add("2021 ci il.").setBorder(new SolidBorder(Color.WHITE, 1f)).setTextAlignment(TextAlignment.LEFT));
//
//
//        Table tblKimden = new Table(new float[]{70, 330});
//        tblKimden.setMarginTop(15f);
//        tblKimden.setBorder(new SolidBorder(Color.WHITE, 1f));
//
//        tblKimden.addCell(new Cell().add("Kimdən").setBorder(new SolidBorder(Color.WHITE, 1f)));
//        tblKimden.addCell(new Cell().add(entity.getKimden()).setBorderBottom(new SolidBorder(Color.BLACK, 1f)).setMarginRight(5f));
//        tblKimden.addCell(new Cell());
//
//        Cell cellPulOdeyen = new Cell();
//        cellPulOdeyen.setBorderLeft(new SolidBorder(Color.WHITE,1f));
//        cellPulOdeyen.setFontSize(8f);
//        String strPulOdeyenin = "(pul odəyənin vəzifəsi, soyadı, adı, atasının adı)";
//        cellPulOdeyen.add(strPulOdeyenin);
//        tblKimden.addCell(cellPulOdeyen);
//
//        Table tblShexUnvan = new Table(new float[]{380});
//        tblShexUnvan.setMarginTop(15f);
//        tblShexUnvan.setBorder(new SolidBorder(Color.WHITE, 1f));
//        tblShexUnvan.addCell(new Cell());
//        tblShexUnvan.addCell(new Cell().add("(şəxsiyyətini təsdiq edən sənəd, seriyası, nömrəsi, ünvanı)").setFontSize(8f));
//
//
//        Table tblNeUcun = new Table(new float[]{70, 330});
//        tblNeUcun.setMarginTop(15f);
//        tblNeUcun.setBorder(new SolidBorder(Color.WHITE, 1f));
//
//        tblNeUcun.addCell(new Cell().add("Nə üçün").setBorder(new SolidBorder(Color.WHITE, 1f)));
//        tblNeUcun.addCell(new Cell().add(entity.getNeUcun()).setBorderBottom(new SolidBorder(Color.BLACK, 1f)).setMarginRight(5f));
//        tblNeUcun.addCell(new Cell());
//
//        Cell cellMeqseq = new Cell();
//        cellMeqseq.setBorderLeft(new SolidBorder(Color.WHITE,1f));
//        cellMeqseq.setFontSize(8f);
//        String meqsed = "(məqsədi aydın yazmaq)";
//        cellMeqseq.add(meqsed);
//        tblNeUcun.addCell(cellMeqseq);
//
//        Table tblNeUcunAltXet = new Table(new float[]{40, 340});
//        tblNeUcunAltXet.setMarginTop(15f);
//        tblNeUcunAltXet.setBorder(new SolidBorder(Color.WHITE, 1f));
//        tblNeUcunAltXet.addCell(new Cell().setBorderRight(new SolidBorder(Color.WHITE, 1f)));
//        tblNeUcunAltXet.addCell(new Cell().setBorderBottom(new SolidBorder(Color.BLACK, 1f)));
//
//
//        Table tblMebleg = new Table(new float[]{70, 330});
//        tblMebleg.setMarginTop(15f);
//        tblMebleg.setBorder(new SolidBorder(Color.WHITE, 1f));
//
//        tblMebleg.addCell(new Cell().add("Məbləğ").setBorder(new SolidBorder(Color.WHITE, 1f)));
//        tblMebleg.addCell(new Cell().add(String.valueOf(entity.getMebleg())).setBorderBottom(new SolidBorder(Color.BLACK, 1f)).setMarginRight(5f));
//        tblMebleg.addCell(new Cell());
//
//        Cell cellReqem = new Cell();
//        cellReqem.setBorderLeft(new SolidBorder(Color.WHITE,1f));
//        cellReqem.setFontSize(8f);
//        String strReqem = "(rəqəm və yazı ilə tam aydın göstərmək)";
//        cellReqem.add(strReqem);
//        tblMebleg.addCell(cellReqem);
//
//
//        Cell cellManQep = new Cell();
//        cellManQep.setMarginTop(15f);
//        String strMaqQep = "______________________________________man.______qəp.";
//        cellManQep.add(strMaqQep);
//
//        cellOrta.add(tblSeria);
//        cellOrta.add(tblTarix);
//        cellOrta.add(tblKimden);
//        cellOrta.add(tblShexUnvan);
//        cellOrta.add(tblNeUcun);
//        cellOrta.add(tblNeUcunAltXet);
//        cellOrta.add(tblMebleg);
//
//        //////////////////////////////////////////////////////////
//
//        Cell cellAsagi = new Cell();
//        cellAsagi.setBorderTop(new SolidBorder(Color.WHITE, 1f));
//
//        Cell cellMyRehber = new Cell();
//        String strMyReh = "M.Y.             Rəhbər";
//        cellMyRehber.add(strMyReh);
//
//        Cell cellMuh = new Cell();
//        cellMuh.setMarginTop(10f);
//        cellMuh.setMarginLeft(68f);
//        String strMuhasib = "Baş mühasib";
//        cellMuh.add(strMuhasib);
//
//        Cell cellKassir = new Cell();
//        cellKassir.setMarginTop(10f);
//        cellKassir.setMarginLeft(68f);
//        String strKassir = "Kassir";
//        cellKassir.add(strKassir);
//
//        cellAsagi.add(cellMyRehber);
//        cellAsagi.add(cellMuh);
//        cellAsagi.add(cellKassir);
//
//        /*****************************************  TABLE - LEFT  *****************************************/
//
//        Table tableLeft = new Table(new float[]{420f});
//        tableLeft.setMarginRight(10f);
//        tableLeft.addCell(cellHeading);
//
//        ////////////////////////
//        tableLeft.startNewRow();
//        ////////////////////////
//
//        Cell cell_2_Left = new Cell();
//        String cell_2_LeftTxt = "KASSA  MəDAXİL  ORDENİNİN  KÜTÜYÜ  №";
//        cell_2_Left.setTextAlignment(TextAlignment.CENTER);
//        cell_2_Left.setBorderBottom(new SolidBorder(Color.WHITE, 1f));
//        cell_2_Left.add(cell_2_LeftTxt).setBold();
//        cell_2_Left.setMarginTop(20f);
//
//        tableLeft.addCell(cell_2_Left);
//
//        ////////////////////////
//        tableLeft.startNewRow();
//        ////////////////////////
//
//        tableLeft.addCell(cellOrta);
//
//        ////////////////////////
//        tableLeft.startNewRow();
//        ////////////////////////
//
//        tableLeft.addCell(cellManQep);
//
//
//        tableLeft.addCell(cellAsagi);
//
//        /*****************************************  TABLE - RIGHT  *****************************************/
//
//        Table tableRight = new Table(new float[]{420f});
//        tableRight.setMarginLeft(10f);
//        tableRight.addCell(cellHeading);
//
//        /////////////////////////
//        tableRight.startNewRow();
//        /////////////////////////
//
//        Cell cell_2_Right = new Cell();
//        String cell_2_RightTxt = "KASSA  MəDAXİL  ORDENİ  №";
//        cell_2_Right.setTextAlignment(TextAlignment.CENTER);
//        cell_2_Right.setBorderBottom(new SolidBorder(Color.WHITE, 1f));
//        cell_2_Right.add(cell_2_RightTxt).setBold();
//        cell_2_Right.setMarginTop(20f);
//
//        tableRight.addCell(cell_2_Right);
//
//        ////////////////////////
//        tableRight.startNewRow();
//        ////////////////////////
//
//        tableRight.addCell(cellOrta);
//
//        ////////////////////////
//        tableRight.startNewRow();
//        ////////////////////////
//
//        tableRight.addCell(cellManQep);
//        tableRight.addCell(cellAsagi);

        /*************************************************************************************************/

//        table.addCell(tableLeft);
//        table.addCell(tableRight);

        document.add(table);

        document.close();
        pdfDocument.close();
        pdfWriter.close();
        System.out.println("PDF created");
    }

}
