package wek5.day1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {

	public static void main(String[] args) {
		ChromeDriver strBrowser=new ChromeDriver();
		strBrowser.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		strBrowser.manage().window().maximize();
		strBrowser.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		strBrowser.findElement(By.xpath("//button[text()='Try it']")).click();
		strBrowser.switchTo().alert().accept();

	}

}
