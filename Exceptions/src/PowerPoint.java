import java.io.FileNotFoundException;

public class PowerPoint {
 
    public void Open(String fileName) throws FileNotFoundException{

        if (fileName.endsWith(".ppt") || fileName.endsWith(".pps")) {

            System.out.println("Microsoft powerpoint has opened " + fileName);
        }
        else 
        {
            throw new FileNotFoundException("fnfe");
        }
    }   
}