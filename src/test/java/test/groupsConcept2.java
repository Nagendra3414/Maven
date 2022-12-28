package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class groupsConcept2 {

	
	//Gropus 
	
	@Test(groups = {"ABC"})
	public void method1() throws Exception
	{

		WebDriver driver = new ChromeDriver();
		// maximize the browser window
		driver.get("https://demo.automationtesting.in/Register.html");

		// Maximizing window
		driver.manage().window().maximize();

		WebElement dropdown = driver.findElement(By.xpath("//*[@id ='Skills']"));

		Select s = new Select(dropdown);

		System.out.println(s.isMultiple());

		List<WebElement> dropdownOptions = s.getOptions();

		System.out.println(dropdownOptions.size());

		for (int i = 0; i < dropdownOptions.size(); i++) {
			String a = dropdownOptions.get(i).getText();
			System.out.println(a);
		}

		s.selectByVisibleText("AutoCAD");
		Thread.sleep(4000);
		s.selectByIndex(4);
		Thread.sleep(4000);
		s.selectByValue("HTML");

		Thread.sleep(4000);
		driver.close();
	}
	

	@Test(groups = {"Sanity"})
	public void method2()
	{
		System.out.println("Sanity");
	}
	

	@Test(groups = {"Smoke"})
	public void method3()
	{
		System.out.println("Smoke");
	}
	
	

	@Test(groups = {"Regression"})
	public void method4()
	{
		System.out.println("Regression");
	}
	
	

	@Test(groups = {"Sanity"})
	public void method5()
	{
		System.out.println("sanity");
	}
	
	

	@Test(groups = {"Smoke"})
	public void method6()
	{
		System.out.println("Smoke");
	}
	
	
	

	@Test(groups = {"Regression"})
	public void method7()
	{
		System.out.println("Regression");
	}
	
	
	

	@Test(groups = {"Regression"})
	public void method8()
	{
		System.out.println("Regression");
	}
	
	
	

	@Test(groups = {"Smoke"})
	public void method9()
	{
		System.out.println("Smoke");
	}
	
	

	@Test(groups = {"Regression"})
	public void method10()
	{
		System.out.println("Regression");
	}
	
	

	@Test(groups = {"Regression"})
	public void method11()
	{
		System.out.println("Regression");
	}
	
	
	
}
