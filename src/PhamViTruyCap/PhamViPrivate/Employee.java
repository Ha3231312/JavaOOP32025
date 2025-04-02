package PhamViTruyCap.PhamViPrivate;

public class Employee {

    private String name = "Truc Phuong";
    private int age = 30;

    private void getInfo(){
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.getInfo();
    }

}
