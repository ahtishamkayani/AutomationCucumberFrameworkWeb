package webCreative;

import java.time.Duration;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class CreativeMainPage {
	WebDriver driver = null;
	Locator locator;

	@Before
	public void setUp() {

		System.setProperty("webdriver.chrome.driver",
				"C:/Users/Ahtisham Kashif/eclipse-workspace/Webautomation/src/test/resources/Driver/chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@After
	public void tearDown() {
		driver.manage().deleteAllCookies();
		driver.quit();
	}

	@Given("Verify creative Chaos Main page")
	public void creativeChaosPage() {
		locator = new Locator(driver);
		driver.navigate().to(locator.creativeURL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		Assert.assertEquals(driver.getCurrentUrl(), locator.creativeURL);

	}

	@When("Click Dropdown")
	public void clickDropDown() {

		locator.enterXpathDd();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

	}

	@And("Select service option")
	public void clickService() {

		locator.enterServiceId();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		Assert.assertEquals(driver.getCurrentUrl(), locator.serviceURL);
		Assert.assertEquals(locator.getServiceText(), locator.expectedServiceText);
		driver.navigate().back();

	}

	@And("Select solution option")
	public void clickSolution() {
		Assert.assertEquals(driver.getCurrentUrl(), locator.creativeURL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		locator.enterXpathDd();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		locator.entersolutionId();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		Assert.assertEquals(driver.getCurrentUrl(), locator.solutionURL);
		Assert.assertEquals(locator.getSolutionText(), locator.expectedSolutionText);
		driver.navigate().back();

	}

	@And("Select process option")
	public void clickProcess() {
		Assert.assertEquals(driver.getCurrentUrl(), locator.creativeURL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		locator.enterXpathDd();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		locator.enterprocessId();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		Assert.assertEquals(driver.getCurrentUrl(), locator.processURL);
		Assert.assertEquals(locator.getProcessText(), locator.expectedProcessText);
		driver.navigate().back();

	}

	@And("Select client option")
	public void clickClient() {
		Assert.assertEquals(driver.getCurrentUrl(), locator.creativeURL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		locator.enterXpathDd();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		locator.enterclientId();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		Assert.assertEquals(driver.getCurrentUrl(), locator.clientURL);
		Assert.assertEquals(locator.getclientText(), locator.expectedClientText);
		driver.navigate().back();
	}

	@And("Select work option")
	public void clickWork() {
		Assert.assertEquals(driver.getCurrentUrl(), locator.creativeURL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		locator.enterXpathDd();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		locator.enterworkId();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		Assert.assertEquals(driver.getCurrentUrl(), locator.workURL);
		Assert.assertEquals(locator.getWorkText(), locator.expectedWorkText);
		driver.navigate().back();
	}

	@And("Select insights option")
	public void clickInsights() {
		Assert.assertEquals(driver.getCurrentUrl(), locator.creativeURL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		locator.enterXpathDd();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		locator.enterinsightId();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		Assert.assertEquals(driver.getCurrentUrl(), locator.insightURL);
		Assert.assertEquals(locator.getInsightText(), locator.expectedInsightText);
		driver.navigate().back();
	}

	@And("Select contact option")
	public void clickContact() throws InterruptedException {
		Assert.assertEquals(driver.getCurrentUrl(), locator.creativeURL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		locator.enterXpathDd();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		locator.entercontactusId();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		Assert.assertEquals(driver.getCurrentUrl(), locator.contactusURL);
		Assert.assertEquals(locator.getclientText(), locator.expectedContactText);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.name("companyName"));
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		element.sendKeys(locator.companyName);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		js.executeScript("window.scrollBy(0,500);");
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.name("fullName")).sendKeys(locator.fullName);
		driver.findElement(By.name("email")).sendKeys(locator.Email);
		driver.findElement(By.name("phoneNumber")).sendKeys(locator.phoneNumber);
		driver.findElement(By.name("DoForyou")).sendKeys(locator.creativeDo);
		driver.findElement(By.name("budget")).sendKeys(locator.Budget);
		driver.findElement(By.name("hearAbout")).sendKeys(locator.hearAbout);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		js.executeScript("window.scrollBy(0,900);");

	}

	@Then("Verify submit button functionality")
	public void contactPage() throws Exception {
		Thread.sleep(2000);
		Assert.assertEquals(locator.expectedTitle, driver.getTitle());
		locator.entersubmitBtn();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		Thread.sleep(2000);
		driver.navigate().back();
	}

	@When("Verifying Lets Build button visibilty")
	public void verifyButton() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		Assert.assertEquals(driver.getCurrentUrl(), locator.creativeURL);
		boolean isEnabled = locator.mainBtnEnable();
		boolean isDisplayed = locator.mainBtnDisplay();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		Assert.assertEquals(locator.getBtnText(), locator.expectedtext);
	}

	@Then("user click on button")
	public void clickMainButton() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		locator.clickMainBtn();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
		Thread.sleep(3000);

	}

}
