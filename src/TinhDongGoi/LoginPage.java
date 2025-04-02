package TinhDongGoi;

public class LoginPage {
    private String url;
    private String email;
    private String password;

    private int role;
    private String phone;
    private String address;

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    //Xóa hàm getUrl di thì chỉ cho phép lay ra url dùng k cho update value cho url
    public String getUrl() {
        System.out.println("Open URL CMR");
        System.out.println("save log to report");
        return url;
    }


    public String getURLLoginAdmin(){
        return url + "/admin/authentication";
    }

    public String getURLLoginCustomer(){
        return url + "/authentication/login";
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void loginCRM(){
        System.out.println("Open URL " + getUrl());
        System.out.println("Enter email " + getEmail());
        System.out.println("Enter passwork " + getPassword());
    }

    public static void main(String[] args) {
        LoginPage loginPage = new LoginPage();
        loginPage.setEmail("admin@gmail.com");
        loginPage.setUrl("https://anhtester.com/lesson/selenium-java-bai-2-java-oop");
        loginPage.setPassword("123456");
        loginPage.loginCRM();

        LoginPage loginPage2 = new LoginPage();
        loginPage2.setEmail("admin@gmail.com");
        loginPage2.setUrl("https://anhtester.com/lesson/selenium-java-bai-2-java-oop");
        loginPage2.setPassword("123456");
        loginPage2.loginCRM();
    }
}
