package me.mejet.AutoMJT;

import java.io.BufferedWriter;
import java.io.FileWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class App extends Start {
	String[] names = {};
	String[] contactNum = {};
	String[] email = {};
	String pass;

	void Execute() throws Exception {

		for (int i = 0, j = 0, k = 0; i < names.length && j < contactNum.length && k < email.length; i++, j++, k++) {
			try {

				FileWriter writer = new FileWriter("output.txt", true);
				System.setProperty("webdriver.edge.driver", "msedgedriver.exe");

//				WebDriver driver = new EdgeDriver();
				WebDriver driver = new HtmlUnitDriver(BrowserVersion.CHROME);
				driver.get("https://mejet.me/register?Ref=MJT483759");
				driver.manage().window().maximize();
				WebElement txtName = driver.findElement(By.xpath("//input[@name='txtName']"));
				WebElement txtMobile = driver.findElement(By.xpath("//input[@name='txtMobile']"));
				WebElement txtEmailId = driver.findElement(By.xpath("//input[@name='txtEmailId']"));
				WebElement txtpass = driver.findElement(By.xpath("//input[@name='txtpass']"));
				WebElement txtRePassword = driver.findElement(By.xpath("//input[@name='txtRePassword']"));
				WebElement checkbox1 = driver.findElement(By.xpath("//input[@name='checkbox1']"));
				WebElement btnRegister = driver.findElement(By.xpath("//input[@name='btnRegister']"));

				txtName.sendKeys(names[i]);
				txtMobile.sendKeys(contactNum[i]);
				txtEmailId.sendKeys(email[i]);
				txtpass.sendKeys(pass);
				txtRePassword.sendKeys(pass);
				checkbox1.click();
				btnRegister.click();
//				Thread.sleep(2000);

				WebElement lblsenno = driver.findElement(By.id("lblsenno"));
				try {
					writer.write("\n" + names[i] + "\t" + contactNum[i] + "\t" + email[i] + "\t" + pass + "\t"
							+ lblsenno.getText());

				} finally {
					writer.close();
				}
//				System.out.println(names[i] + "\'s ID is: " + lblsenno.getText());
				System.out.println("\n" + names[i] + "\t" + contactNum[i] + "\t" + email[i] + "\t" + pass + "\t"
						+ lblsenno.getText());

//				Thread.sleep(1000);
				driver.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		Process process = Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "output.txt");
		process.waitFor();
	}
}