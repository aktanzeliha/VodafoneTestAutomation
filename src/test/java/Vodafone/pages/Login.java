package Vodafone.pages;

import Vodafone.utilities.ConfigurationReader;
import Vodafone.utilities.GenericFunctions;
import org.openqa.selenium.By;

public class Login extends GenericFunctions {
    public void clickTheLoginButton(){

        click("//div[starts-with(@class,'header_user_info')]/a");




    }
    public void enterEmail(){

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(ConfigurationReader.get("username"));
    }
    public void enterPassword(){
        driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys(ConfigurationReader.get("password"));
    }
    public void user_click_with_the(String linkText ){
        click("//i[@class='icon-lock left']");


    }
    public void user_click_logout(String linkText ){
        click("//a[@class='logout']");


    }
    public void user_verify_message(String linkText){

        assertGetLinkTextWith(linkText);




    }
    public void enterPasswordWithData(String password){
        driver.findElement(By.xpath("//input[@id='passwd']")).clear();
        waitFor(1);
        driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys(password);
    }

    public void clearEmailBox(){
        driver.findElement(By.xpath("//input[@id='email']")).clear();
    }
    public void clearPasswordBox(){
        driver.findElement(By.xpath("//input[@id='passwd']")).clear();
    }
    public void enterEmailWithData(String username){
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
    }
    public void user_click_with_the_text(String linkText ){
        //clickLinkWithText(linkText);
        waitFor(1);
        clickLinkWithText2(linkText);


    }
}
