package HamXayDung;

public class HamXayDungCoThamSo {
    public String name;
    public String phone;
    public String address;

    public HamXayDungCoThamSo(String name1, String phone1){
        name = name1;
        phone = phone1;

    }

    public HamXayDungCoThamSo(String name, String phone, String address){
        this.name = name;
        this.phone = phone;
        this.address = address;


    }

    public static void main(String[] args) {
        HamXayDungCoThamSo hamXayDungCoThamSo1 = new HamXayDungCoThamSo("Mai1","1234567");

        System.out.println(hamXayDungCoThamSo1.name);
        System.out.println(hamXayDungCoThamSo1.phone);

        HamXayDungCoThamSo hamXayDungCoThamSo2 = new HamXayDungCoThamSo("Mai","123456", "Hà Nội");

        System.out.println(hamXayDungCoThamSo2.name);
        System.out.println(hamXayDungCoThamSo2.phone);
        System.out.println((hamXayDungCoThamSo2.address));
    }
}
