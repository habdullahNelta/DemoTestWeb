package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login extends Register {
    //private String EmailT[];
   // private String PassWordT[];

    public void Login(int AnzahlTest) {

        for (int i = 0; i < AnzahlTest; i++) {
           // EmailT[i]=Register.Emailt[i];
           // PassWordT[i]=Register.PassWordt[i];
            try {
                WebElement login = Browser.obj.findElement(By.className("ico-login"));
                login.click();
            } catch (Exception e) {
               // DialogTest("login Fehler");
                System.out.println("login Fehler");
            }

            try {
                WebElement EmailLogin = Browser.obj.findElement(By.id("Email"));

               // EmailLogin.sendKeys(EmailT[i]);//    bearbeiten
                System.out.println(Register.EmailNeu.get(i));
               EmailLogin.sendKeys(Register.EmailNeu.get(i));/////////////////////////////////////////////////


            } catch (Exception e) {
               // DialogTest("Email Fehler");
                System.out.println("Email Fehler");
            }
            WebElement PassWordLogin = Browser.obj.findElement(By.id("Password"));

            ///////////////////////////

            PassWordLogin.sendKeys(Register.PassWord.get(i));//
            //loginButton
            WebElement loginButton = Browser.obj.findElement(By.className("login-button"));
            loginButton.click();
            //logoutButton
            WebElement logout = Browser.obj.findElement(By.className("ico-logout"));
            logout.click();
        }
    }

}
