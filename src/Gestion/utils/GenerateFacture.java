/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion.utils;

import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.BarcodeQRCode;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import org.jpedal.PdfDecoder;
import org.jpedal.objects.PrinterOptions;

/**
 *
 * @author christian
 */
public class GenerateFacture {
   
    
     
    
    
    public GenerateFacture(){
       
         super();
    
         }
    
    /**
     * ligneFac 1 = num du magasin
     * ligneFac 0 = num facture
     * ligneFac 2 = logo de l'entreprise
     * ligneFac 3 = Nom de l'entreprise 
     * ligneFac 4 = BP de l'entreprise
     * ligneFac 5 = email de l'entreprise
     * ligneFac 6 = tel de l'entreprise
     * ligneFac 7 = devise
     * ligneFac (i) = NomProduit PrixUnitaie X Qte = Prixtotale(i)
     * ligneFac (n-6) = TOTAL = Prixtotale
     * ligneFac (n-5) = TVA = 150 FCFA
     * ligneFac (n-4) = Net a payer = Prixtotale+tva
     * ligneFac (n-3) = avancement
     * ligneFac (n-2) = reste a payer
     * ligneFac (n-1) = NomVendeur = nomduvendeur
     * ligneFac (n) = NomClient = nomduClient
     * @param ligneFac 
     */
    @SuppressWarnings({"UseSpecificCatch", "CallToPrintStackTrace", "empty-statement"})
    public static void PrintPDF(ArrayList<String> ligneFac){
    
         //ici on doit deja inserer l'entete des données.
        int height = 800;
        int width = 300;
        int dim = 15;
        
        String nomMaga = (String)ligneFac.get(1);     
        String NrFacture = (String)ligneFac.get(0);
        String nomFichier = "Documents/Factures/FKCTicket_" + NrFacture + ".pdf";
       
        int dimensionCourante = 0;
       
        dimensionCourante = height  +  dim*(ligneFac.size() -  6);
        
     // preparation ticket
        Document document = new Document(new Rectangle(width, dimensionCourante)); 
        document.addTitle(nomMaga);
        document.setMargins(4,2, 0, 0); 
 try {
            PdfWriter.getInstance(document,
            new FileOutputStream(nomFichier));
            document.open();
            // Insertion du logo de la companie
            Image image1 = Image.getInstance((String)ligneFac.get(2));
            image1.setAlignment(Image.ALIGN_TOP);
            image1.setAlignment(Image.ALIGN_CENTER);
            image1.scalePercent(70, 70);
            document.add(image1);
         
            // definition du style des caracteres
            Font font1 = new Font(Font.FontFamily.TIMES_ROMAN   , 11);
            Font font2 = new Font(Font.FontFamily.COURIER    , 10);
           // Font font3 = new Font(Font.FontFamily.TIMES_ROMAN, 10);
            //Font fontTicket = new Font(Font.FontFamily.TIMES_ROMAN, 10);
            Font fontTitre = new Font(Font.FontFamily.TIMES_ROMAN, 12);
            fontTitre.setStyle("bold");
       
           Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 11,Font.BOLD);
           Paragraph GrandTitre = new Paragraph(nomMaga, catFont);
    
           GrandTitre.setAlignment(Element.ALIGN_CENTER);

           document.add(GrandTitre);
           document.add(new Phrase("  "));       
           document.add(new Paragraph((String)ligneFac.get(3), font1));
           //document.add(new Paragraph(NrFacture, font2));
           // date ici
           document.add(new Paragraph((String)ligneFac.get(4), font2)); 
           document.add(new Paragraph((String)ligneFac.get(5), font2));
           document.add(new Paragraph((String)ligneFac.get(6), font2));
           document.add(new Phrase("  "));
           
          String ma = null;
          String date = Calendar.getInstance().getTime().toString();
             //String affichageMatches[] = new String[this.listPariMatches.size()];
             for(int i= 8; i < ligneFac.size()-7; i++){
                //  Jeu: 10256 - 24/05/2015 16:30\n Manchester – Queens Park Rangers\n Score(1-2) Mi-Temps, cote: 1.55"
               ma = (String)ligneFac.get(i);
               document.add(new Paragraph( ma,font1));         
            }
            document.add(new Paragraph("*****************************************************",font1));
            for(int i= ligneFac.size()-7; i < ligneFac.size(); i++){
               ma = (String)ligneFac.get(i);
               document.add(new Paragraph( ma,font1));
            }
            document.add(new Paragraph("*****************************************************",font1));
            document.add(new Paragraph("------ "+date+" ------",font2));
            document.add(new Paragraph("--------------------------------------------------------------------------------",font1));
            document.add(new Paragraph(""+ligneFac.get(7), font2));
            document.add(new Paragraph("--------------------------------------------------------------------------------",font1));          
            document.add(new Paragraph(" ******* Logiciel fourni par FKC&Group *******", font2));
            document.add(new Paragraph("************ Tel (+237)678-13-21-86 ************", font2));
            //String m = Gestion.utils.Utils.CrypterUneChaine(ligneFac.get(0)+"_"+date,"SHA-256");
            String m = "NUM FACTURE = "+ligneFac.get(0)+"\n"
                    + ligneFac.get(ligneFac.size()-2)+"\n"
                    + ligneFac.get(ligneFac.size()-1)+"\n"
                    + ligneFac.get(ligneFac.size()-5)+"\n"
                    + ligneFac.get(ligneFac.size()-4)+"\n"
                    + ligneFac.get(ligneFac.size()-3)+"\n"
                    + "Date de vente = "+date;
            BarcodeQRCode my_code = new BarcodeQRCode(m,150,150,null);
            Image image2 = my_code.getImage();
            image2.setAlignment(Image.ALIGN_TOP);
            image2.setAlignment(Image.ALIGN_CENTER);
            image2.scalePercent(70, 70);
            document.add(image2);
            document.close();
            try {
                Desktop.getDesktop().open(new File(nomFichier));
            } catch (IOException ex) {
                Gestion.utils.Utils.addMessage("GenerateFacture:printPDF:fichier facture",true);
            }
            prinTicketPDF(nomFichier);
              }catch(Exception e){
                  e.printStackTrace();
              };
         } 
      
      
public static void prinTicketPDF(String url) {
    
     PrintService printService = PrintServiceLookup.lookupDefaultPrintService();
     String fichierTicket = url;
    try{
        
    // PrintService printService = PrintServiceLookup.lookupDefaultPrintService(); 
    //Open & decode the pdf file
    PdfDecoder decode_pdf = new PdfDecoder(true);
    decode_pdf.openPdfFile(fichierTicket); 
    //Get the total number of pages in the pdf file
    int pageCount = decode_pdf.getPageCount();
    //set to print all pages
    decode_pdf.setPagePrintRange(1, pageCount);
    //Auto-rotate and scale flag
    decode_pdf.setPrintAutoRotateAndCenter(false);
    // Are we printing the current area only
    decode_pdf.setPrintCurrentView(false);
    //set mode - see org.jpedal.objects.contstants.PrinterOptions for all values
    //the pdf file already is in the desired format. So turn off scaling
    decode_pdf.setPrintPageScalingMode(PrinterOptions.PAGE_SCALING_NONE);
    //by default scaling will center on page as well.
    decode_pdf.setCenterOnScaling(false);
    //flag if we use paper size or PDF size.
    //Use PDF size as it already has the desired paper size
    decode_pdf.setUsePDFPaperSize(false);
    //setup print job and objects
    PrinterJob printJob = PrinterJob.getPrinterJob();
    printJob.setPrintService(printService);
    //setup Java Print Service (JPS) to use JPedal
    printJob.setPageable(decode_pdf);
    //Print the file to the desired printer
    printJob.print(); 
    
         }catch(Exception e){ System.out.println("Erreur: "+e.toString());}
    
    
}      
  
    
    
}
