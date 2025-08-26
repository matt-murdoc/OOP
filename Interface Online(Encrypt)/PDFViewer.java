public abstract class PDFViewer implements Viewer{
    
    public void Highlighting(String T) {

        System.out.println("Highlighting Text: " + T);
    }
    
    public void changeView(double S) {

        System.out.println("Type, Size by: " + S);
    }
    
}
