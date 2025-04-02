package TinhTruuTuong;

public class loginPage {
    public static void main(String[] args) {
        WebUI webUI = new WebUI() {
            @Override
            public String getUrl() {
                return "";
            }

            @Override
            public Object getBody() {
                return null;
            }

            @Override
            public int gestStatusCode() {
                return 0;
            }

            @Override
            public String getTextElement() {
                return "";
            }
        };

        webUI.openURL("https://anhtester.com/");
        webUI.setText("admin@gmail.com");
        webUI.setText("123456");
        webUI.clickElement();



    }
}
