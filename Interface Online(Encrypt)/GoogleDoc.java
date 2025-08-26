public class GoogleDoc implements Editor{

    @Override
    public void openFile(String fileName) {

        System.out.println(fileName + " Opened");
    }
    
    public void changeFont(String F) {

        System.out.println("Changing Font: " + F);
    }
}
