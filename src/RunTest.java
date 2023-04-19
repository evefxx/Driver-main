import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class RunTest {

	@Test
	void test() {
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver",
				"D:\\งานมหาลัย\\ปี 2 เทอม 2\\การตรวจสอบและทวนสอบซอฟต์แวร์\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.quit();
	}

}
