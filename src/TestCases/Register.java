package TestCases;

import HelpMethods.RandomGenerator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.Vector;


public class Register {

    private String Emailt[];
    private String PassWordt[];
    //WebDriver obj,

    static Vector<String> EmailNeu = new Vector<String>();
    static Vector<String> PassWord = new Vector<String>();


    public void Register(int AnzahlTest) {

        Emailt = new String[AnzahlTest];
        PassWordt = new String[AnzahlTest];

        for (int i = 0; i < AnzahlTest; i++) {

            System.out.println("TestNummer: " + i + 1);

            //click register
            WebElement RegistreButton = Browser.obj.findElement(By.className("ico-register"));
            RegistreButton.click();

            //radio button male
            WebElement MaleButton = Browser.obj.findElement(By.id("gender-male"));
            MaleButton.click();

            //First name
            String FirstName1 = RandomGenerator.RandomString(5);
            WebElement FirstName = Browser.obj.findElement(By.id("FirstName"));
            FirstName.sendKeys(FirstName1);
            System.out.println("FirstName " + i + ":" + FirstName1);

            //LastName
            String LastName1 = RandomGenerator.RandomString(5);
            WebElement LastName = Browser.obj.findElement(By.id("LastName"));
            LastName.sendKeys(LastName1);
            System.out.println("LastName " + i + ":" + LastName1);

            //Email
            try {
                String Email1 = RandomGenerator.RandomString(5);
                String Email2 = RandomGenerator.RandomString(5);


                Emailt[i] = Email1 + "@" + Email2 + ".de";

                EmailNeu.add(Emailt[i]);
                WebElement Email = Browser.obj.findElement(By.id("Email"));
                Email.sendKeys(Emailt[i]);
                System.out.println("Email " + i + ":" + Email1 + "@" + Email2 + ".de");
                // System.out.println("Hallo"+Emailt[i]);
            } catch (Exception e) {
                // DialogTest("login Fehler");
                System.out.println("login Fehler");
            }
            //PassWord
            PassWordt[i] = RandomGenerator.RandomStringNumber(8);
            PassWord.add(PassWordt[i]);
            //////////////////////////////////////////////////////////////////////////////
            WebElement Password = Browser.obj.findElement(By.id("Password"));
            Password.sendKeys(PassWordt[i]);
            System.out.println("Password " + i + ":" + PassWordt[i]);

            //ConfirmPassword
            WebElement ConfirmPassword = Browser.obj.findElement(By.id("ConfirmPassword"));
            ConfirmPassword.sendKeys(PassWordt[i]);
            System.out.println("ConfirmPassword " + i + ":" + PassWordt[i]);
            try {
                //register-button
                WebElement RegisterConfirm = Browser.obj.findElement(By.id("register-button"));
                RegisterConfirm.click();
            } catch (Exception e) {
                //  DialogTest("register Fehler");
                System.out.println("register Fehler");
            }
            System.out.println("Test:" + i + " erfolgreich durchgeführt!");
            System.out.println("");

            //logout
            if (AnzahlTest >= 1) {
                WebElement logout = Browser.obj.findElement(By.className("ico-logout"));
                logout.click();
            }

        }
    }

}
