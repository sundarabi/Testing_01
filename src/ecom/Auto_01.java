package ecom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_01 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        driver.manage().window().maximize();
	}

}
