package HamXayDung;

public class DemoHamXaydung {
    public String name;
    public String phone;
    public static String address = "Ha Noi";


    //Ham xau dung - có ten Ham giong ten class
    public DemoHamXaydung(){
        name = "Hoa";
        phone = "123456";
    }

    public static void main(String[] args) {
        DemoHamXaydung demoHamXaydung = new DemoHamXaydung();

        System.out.println(demoHamXaydung.name);
        System.out.println(demoHamXaydung.phone);
    }
}
