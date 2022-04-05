package webCreative;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Locator {

	WebDriver driver;
	By serviceId = By.id("menu-item-22");
	By solutionId = By.id("menu-item-40");
	By processId = By.id("menu-item-771");
	By clientId = By.id("menu-item-2632");
	By workId = By.id("menu-item-183");
	By insightId = By.id("menu-item-186");
	By contactusId = By.id("menu-item-988");
	By dropDownBtn = By.xpath("//*[@id=\"header\"]/div[1]/div/button");
	By submitBtn = By.xpath("//*[@id=\'wpcf7-f910-p191-o1\']/form/div[10]/input");
	By mainBtn = By.xpath("//*[@id=\'banner\']/div[2]/div/a");
	By btnText = By.xpath("//*[@id=\'banner\']/div[2]/div/a");
	By serviceText = By.xpath("//*[@id=\"pageHeading\"]/div/div/div/div/h6");
	By solutionText = By.xpath("//*[@id=\"pageHeading\"]/div/div/div/div/h6");
	By processText = By.xpath("//*[@id=\"pageHeading\"]/div/div/div/div/h6");
	By clientText = By.xpath("//*[@id=\"pageHeading\"]/div/div/div/div/h6");
	By workText = By.xpath("//*[@id=\"pageHeading\"]/div/div/div/div/h6");
	By insightText = By.xpath("//*[@id=\"pageHeading\"]/div/div/div/div/h6");
	By contactText = By.xpath("//*[@id=\"pageHeading\"]/div/div/div/div/h6");
	
	public String creativeURL = "https://creativechaos.co/";
	public String actualtext;
	public String serviceURL = "https://creativechaos.co/services/";
	public String solutionURL = "https://creativechaos.co/solutions/";
	public String processURL = "https://creativechaos.co/process/";
	public String clientURL = "https://creativechaos.co/clients/";
	public String workURL = "https://creativechaos.co/work/";
	public String insightURL = "https://creativechaos.co/insights/";
	public String contactusURL = "https://creativechaos.co/contact-us/";
	public String expectedTitle = "Contact Us | Creative Chaos";
	public String expectedtext = "LET'S BUILD TOGETHER";
	public String expectedServiceText= "SERVICES";
	public String expectedSolutionText= "SOLUTIONS";
	public String expectedProcessText= "PROCESS";
	public String expectedClientText= "CLIENTS";
	public String expectedWorkText= "OUR WORK";
	public String expectedInsightText= "INSIGHTS";
	public String expectedContactText= "CONTACT US";

	public String companyName = "XYZ company";
	public String fullName = "Ahtisham Kashif";
	public String Email = "ahtishamkashif@gmail.com";
	public String phoneNumber = "+92 00 00000000";
	public String creativeDo = "Hello World";
	public String Budget = "0000000";
	public String hearAbout = "LinkedIn";
	

	public Locator(WebDriver driver) {
		this.driver = driver;
	}

	public void enterServiceId() {
		driver.findElement(serviceId).click();
	}

	public void entersolutionId() {
		driver.findElement(solutionId).click();
	}

	public void enterprocessId() {
		driver.findElement(processId).click();
	}

	public void enterclientId() {
		driver.findElement(clientId).click();
	}

	public void enterworkId() {
		driver.findElement(workId).click();
	}

	public void enterinsightId() {
		driver.findElement(insightId).click();
	}

	public void entercontactusId() {
		driver.findElement(contactusId).click();
	}

	public void enterXpathDd() {
		driver.findElement(dropDownBtn).click();
	}

	public void entersubmitBtn() {
		driver.findElement(submitBtn).click();
	}

	public boolean mainBtnEnable() {
		return driver.findElement(mainBtn).isEnabled();
	}

	public boolean mainBtnDisplay() {
		return driver.findElement(mainBtn).isDisplayed();
	}

	public void clickMainBtn() {
		driver.findElement(mainBtn).click();
	}

	public String getBtnText() {
		return driver.findElement(btnText).getText();
	}

	public String getServiceText() {
		return driver.findElement(serviceText).getText();
	}
	public String getSolutionText() {
		return driver.findElement(solutionText).getText();
	}
	public String getProcessText() {
		return driver.findElement(processText).getText();
	}
	
	public String getclientText() {
		return driver.findElement(clientText).getText();
	}
	public String getWorkText() {
		return driver.findElement(workText).getText();
	}
	public String getInsightText() {
		return driver.findElement(insightText).getText();
	}
	public String getContactText() {
		return driver.findElement(contactText).getText();
	}
}
