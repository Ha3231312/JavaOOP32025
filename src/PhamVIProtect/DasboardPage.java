package PhamVIProtect;

import Common.BasePage;


public class DasboardPage extends BasePage {
    public boolean getDriver(String driver) {
        System.out.println(getDriver(this.driver));
        return false;
    }

    public static void main(String[] args) {
        LoginPage loginPage = new LoginPage();
        System.out.println(loginPage.InputEmail);
        System.out.println(loginPage.InputPasswork);

        BasePage basePage = new BasePage();
        System.out.println(basePage.driver);
    }
}

