package TinhKeThua;

public class Persontkt {
    protected String name;
    protected int age;
    protected float height;
    protected String address; // ✅ Thêm thuộc tính address

    public Persontkt(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.address = "Unknown"; // ✅ Giá trị mặc định
    }

    public void getInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Address: " + address);
    }
}
