package com.bd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class daraz extends BaseDriver{

	public static String baseUrl="https://www.daraz.com.bd/";
	public static String expectedtitle="Online Shopping in Bangladesh: Order Now from Daraz.com.bd";
   @Test(priority=0)
   public void openUrl() throws InterruptedException {
		Driver.get(baseUrl);
		Driver.manage().window().maximize();	
		Thread.sleep(500);
		
		String actualTitle = Driver.getTitle();
		System.out.println("Title:"+ actualTitle);
	
		if(actualTitle.equals(expectedtitle)) {
			System.out.println("Tittle matched");
		}
		else {
			System.out.println("Tittle didn't matched");
		}
}
	@Test(priority=1)
	public void Test1() throws InterruptedException {
		WebElement Userlogin=Driver.findElement(By.xpath("//a[contains(text(),'Signup / Login')]"));
		Userlogin.click();
		Thread.sleep(500);
	}
	@Test(priority=2)
	public void Test2() throws InterruptedException {
	
		WebElement email=Driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/form/div/div[1]/div[1]/input"));
		email.clear();
		email.sendKeys("01518389378");
		Thread.sleep(500);
	}
	@Test(priority=3)
	public void Test3() throws InterruptedException {
		
		WebElement password=Driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/form/div/div[1]/div[2]/input"));
		password.clear();
		password.sendKeys("Sarker524862");
		Thread.sleep(500);
	}
	@Test(priority=4)
	public void Test4() throws InterruptedException {
	
		WebElement login=Driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/form/div/div[2]/div[1]/button"));
		login.click();
		Thread.sleep(500);
	}
	@Test(priority=5)
	public void Test5() throws InterruptedException {
		Driver.get("https://www.daraz.com.bd/mens-sneakers/?spm=a2a0e.home.cate_4_2.1.735212f7UbySYm");
		Thread.sleep(2000);
	}
	@Test(priority=6)
	public void Test6() throws InterruptedException {
	
		WebElement Product=Driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/a[1]/div"));
		Product.click();
		Thread.sleep(500);
	}
	@Test(priority=7)
	public void Test7() throws InterruptedException {
	
		WebElement Bata=Driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div/div[1]/div[3]/div[1]/div"));
		Bata.click();
		Thread.sleep(500);
	}
	@Test(priority=8)
	public void Test8() throws InterruptedException {	
		WebElement addcart=Driver.findElement(By.xpath("//*[@id=\"module_add_to_cart\"]/div/button[2]"));
		addcart.click();
		Thread.sleep(500);
	}
	@Test(priority=9)
	public void Test9() throws InterruptedException {	
		WebElement addcart=Driver.findElement(By.xpath("/html/body/div[8]/div/div[2]/a"));
		addcart.click();
		Thread.sleep(500);
	}
	@Test(priority=10)
	public void Test10() throws InterruptedException {
		Thread.sleep(5000);
		WebElement Userlogout=Driver.findElement(By.id("myAccountTrigger"));
		Userlogout.click();
		WebElement logout=Driver.findElement(By.xpath("//*[@id=\"lzdMyAccountPop\"]/div/ul/li[6]/a"));
		logout.click();	
		}
	
}
