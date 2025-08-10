public class App {
    public static void main(String[] args) throws Exception {

        Invoice ps5 = new Invoice("1", "Gaming console to play GTA 6", 100, 70000);

//      ps5.setPrice(-40000);
//      ps5.setQuantity(-32);
        System.out.println(ps5.getInvoiceAmount());
    }
}
