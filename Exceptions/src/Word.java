public class Word {
    
    public void Open(String fileName){

        if (fileName.endsWith(".doc") || fileName.endsWith(".docx")) {

            System.out.println("Microsoft word has opened " + fileName);
        }
        else 
        {
            throw new SecurityException();
        }
    }

}