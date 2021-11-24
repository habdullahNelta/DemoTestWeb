package TestCases;

import HelpMethods.InputZahl;

import java.util.Scanner;

public class MainClass {


    public static void main(String[] args) {

    InputZahl Zahl=new InputZahl();
    Browser ChromeOpen=new Browser();
    Register RegisterTest=new Register();
    Login LoginTest=new Login();
    int Zahl1=Zahl.AnzahlTest("Bitte Anzahl der Testfealle eingeben");

        //Methoden aufrufen
        ChromeOpen.Chrome();
        RegisterTest.Register(Zahl1);
        LoginTest.Login(Zahl1);



        //Browser.obj.quit();
    }
}
