package TinhTruuTuong;

public abstract class WebUI extends Action implements ActionInterface, ApiInterface{
    @Override
    public void clickElement() {
        System.out.println("click element");

    }

    @Override
    public void setText(String text) {
        System.out.println("Enter text: " + text);

    }


    @Override
    public void openURL(String url) {
        System.out.println("open url" + url);

    }

    @Override
    public void setText(String text, String key) {
        System.out.println("enter input: " + text);
        System.out.println("enter key: " + key);

    }
}
