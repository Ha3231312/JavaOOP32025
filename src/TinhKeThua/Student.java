package TinhKeThua;

public class Student extends Persontkt {
    public Student(String name, int age, float height) {
        super(name, age, height);
    }

    public void showInforStudent() {
        //Dung tu khoa supper de goi nhung thanh phan class cha khi trung vơi class con
        super.getInfo(); // ✅ Gọi phương thức lớp cha
        getInfo();
    }
    //Ghi de phuong thuc tu class cha
    public void getInfor(){
        //System.out.println("Phone" + phone);
        System.out.println("Phone" + address);
    }

    public static void main(String[] args) {
        Student student = new Student("Phương", 30, 165.5F);
        student.showInforStudent(); // ✅ In thông tin đúng
    }
}
