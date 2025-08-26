public class Main {
    
    public static void main(String[] args) {
        
        AdobeAcrobat pdf = new AdobeAcrobat();

        GoogleDoc doc = new GoogleDoc();

        pdf.view("Design Pattern");
        
        doc.openFile("Design Pattern");

        doc.changeFont("Times Roman");
    }
}
