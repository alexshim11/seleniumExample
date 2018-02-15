package runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Install\\Install Developer\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.it-academy.by/");

		WebElement employmentOpportunity = driver
				.findElement(By.xpath("/html/body/div[1]/asside/div/div/div[2]/div[2]/ul/li[4]"));

		hover(driver, employmentOpportunity);

		WebElement tab = driver.findElement(By.xpath("/html/body/div[1]/main/section[1]/section[4]/div/ul"));

		System.out.println(tab.getText());
		System.out.println("-------------------------");

		WebElement specialization = driver
				.findElement(By.xpath("/html/body/div[1]/asside/div/div/div[2]/div[2]/ul/li[1]"));

		hover(driver, specialization);

		WebElement marketing = driver
				.findElement(By.xpath("/html/body/div[1]/main/section[1]/section[1]/div/ul/li[6]/ul/li[1]/a"));
		marketing.click();

		driver.get("http://www.tut.by");

		WebElement readNews = driver.findElement(
				By.cssSelector("#title_news_block > div.b-general.ni._titlealts_ > h3 > a >span.header._title"));

		System.out.println("Text of the Main news is: " + readNews.getText());

		WebElement mainNews = driver
				.findElement(By.cssSelector("#title_news_block > div.b-general.ni._titlealts_ > h3 > a"));
		mainNews.click();

		WebElement insideMainNews = driver.findElement(By.id("article_body"));

		int count = insideMainNews.findElements(By.tagName("p")).size();
		System.out.println("The number of paragraphs: " + count);
		System.out.println("-------------------------");

		driver.quit();

	}

	public static void hover(WebDriver driver, WebElement element) {

		Actions action = new Actions(driver);
		action.moveToElement(element).perform();

	}

}