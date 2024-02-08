import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class MultiBrowser {

	@Test
	void testCase1() {
		WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost/customer/index.html");
        
        WebElement firstNameInput = driver.findElement(By.id("firstname"));
        WebElement lastNameInput = driver.findElement(By.id("lastname"));
        WebElement ageInput = driver.findElement(By.id("age"));
        WebElement submitButton = driver.findElement(By.id("sub"));
        firstNameInput.sendKeys("Johnjohn");
        lastNameInput.sendKeys("Cannonc");
        ageInput.sendKeys("2");
        
        submitButton.click();
        
        String result = driver.findElement(By.id("firstname")).getText();
        assertEquals("Johnjohn", result);
        driver.close();
	}
        @Test
    	void testCase2() {
    	WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost/customer/index.html");
            
        WebElement firstNameInput = driver.findElement(By.id("firstname"));
        WebElement lastNameInput = driver.findElement(By.id("lastname"));
        WebElement ageInput = driver.findElement(By.id("age"));
        WebElement submitButton = driver.findElement(By.id("sub"));
        firstNameInput.sendKeys("Johnj");
        lastNameInput.sendKeys("Canoncanoncano");
        ageInput.sendKeys("149");
            
        submitButton.click();
            
        String result = driver.findElement(By.id("firstname")).getText();
        assertEquals("Johnj", result);
        driver.close();
	}
        
        @Test
    	void testCase3() {
    	WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost/customer/index.html");
            
        WebElement firstNameInput = driver.findElement(By.id("firstname"));
        WebElement lastNameInput = driver.findElement(By.id("lastname"));
        WebElement ageInput = driver.findElement(By.id("age"));
        WebElement submitButton = driver.findElement(By.id("sub"));
        firstNameInput.sendKeys("Johnjo");
        lastNameInput.sendKeys("Canoncanoncanon");
        ageInput.sendKeys("150");
            
        submitButton.click();
            
        String result = driver.findElement(By.id("firstname")).getText();
        assertEquals("Johnjo", result);
        driver.close();
	}
        @Test
    	void testCase4() {
    	WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost/customer/index.html");
            
        WebElement firstNameInput = driver.findElement(By.id("firstname"));
        WebElement lastNameInput = driver.findElement(By.id("lastname"));
        WebElement ageInput = driver.findElement(By.id("age"));
        WebElement submitButton = driver.findElement(By.id("sub"));
        firstNameInput.sendKeys("Johnjohnjohnjo");
        lastNameInput.sendKeys("Canoncan");
        ageInput.sendKeys("75");
            
        submitButton.click();
            
        String result = driver.findElement(By.id("firstname")).getText();
        assertEquals("Johnjohnjohnjo", result);
        driver.close();
	}
        
        @Test
    	void testCase5() {
    	WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost/customer/index.html");
            
        WebElement firstNameInput = driver.findElement(By.id("firstname"));
        WebElement lastNameInput = driver.findElement(By.id("lastname"));
        WebElement ageInput = driver.findElement(By.id("age"));
        WebElement submitButton = driver.findElement(By.id("sub"));
        firstNameInput.sendKeys("johnjohnjohnjoh");
        lastNameInput.sendKeys("Canoncan");
        ageInput.sendKeys("75");
            
        submitButton.click();
            
        String result = driver.findElement(By.id("firstname")).getText();
        assertEquals("johnjohnjohnjoh", result);
        driver.close();
	}
        
        @Test
    	void testCase6() {
    	WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost/customer/index.html");
            
        WebElement firstNameInput = driver.findElement(By.id("firstname"));
        WebElement lastNameInput = driver.findElement(By.id("lastname"));
        WebElement ageInput = driver.findElement(By.id("age"));
        WebElement submitButton = driver.findElement(By.id("sub"));
        firstNameInput.sendKeys("jhon");
        lastNameInput.sendKeys("Canoncan");
        ageInput.sendKeys("75");
            
        submitButton.click();
            
        String result = driver.findElement(By.id("formname")).getText();
        assertEquals("Customer Details Form", result);
        driver.close();
	}
        
        @Disabled
    	void testCase7() {
    	WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost/customer/index.html");
            
        WebElement firstNameInput = driver.findElement(By.id("firstname"));
        WebElement lastNameInput = driver.findElement(By.id("lastname"));
        WebElement ageInput = driver.findElement(By.id("age"));
        WebElement submitButton = driver.findElement(By.id("sub"));
        firstNameInput.sendKeys("johnjohnjohnjhon");
        lastNameInput.sendKeys("Canoncan");
        ageInput.sendKeys("75");
            
        submitButton.click();
            
        String result = driver.findElement(By.id("firstname")).getText();
        assertEquals("johnjohnjohnjhon", result);
        driver.close();
	}
        
        @Test
    	void testCase8() {
    	WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost/customer/index.html");
            
        WebElement firstNameInput = driver.findElement(By.id("firstname"));
        WebElement lastNameInput = driver.findElement(By.id("lastname"));
        WebElement ageInput = driver.findElement(By.id("age"));
        WebElement submitButton = driver.findElement(By.id("sub"));
        firstNameInput.sendKeys("johnjohn");
        lastNameInput.sendKeys("Cano");
        ageInput.sendKeys("75");
            
        submitButton.click();
            
        String result = driver.findElement(By.id("formname")).getText();
        assertEquals("Customer Details Form", result);
        driver.close();
	}
        
        @Disabled
    	void testCase9() {
    	WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost/customer/index.html");
            
        WebElement firstNameInput = driver.findElement(By.id("firstname"));
        WebElement lastNameInput = driver.findElement(By.id("lastname"));
        WebElement ageInput = driver.findElement(By.id("age"));
        WebElement submitButton = driver.findElement(By.id("sub"));
        firstNameInput.sendKeys("johnjohn");
        lastNameInput.sendKeys("Canoncanoncanonc");
        ageInput.sendKeys("75");
            
        submitButton.click();
            
        String result = driver.findElement(By.id("formname")).getText();
        assertEquals("Customer Details Form", result);
        driver.close();
	}
        @Test
    	void testCase10() {
    	WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost/customer/index.html");
            
        WebElement firstNameInput = driver.findElement(By.id("firstname"));
        WebElement lastNameInput = driver.findElement(By.id("lastname"));
        WebElement ageInput = driver.findElement(By.id("age"));
        WebElement submitButton = driver.findElement(By.id("sub"));
        firstNameInput.sendKeys("johnjohn");
        lastNameInput.sendKeys("canoncan");
        ageInput.sendKeys("0");
            
        submitButton.click();
            
        String result = driver.findElement(By.id("formname")).getText();
        assertEquals("Customer Details Form", result);
        driver.close();
	}
        
        @Test
    	void testCase11() {
    	WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://localhost/customer/index.html");
            
        WebElement firstNameInput = driver.findElement(By.id("firstname"));
        WebElement lastNameInput = driver.findElement(By.id("lastname"));
        WebElement ageInput = driver.findElement(By.id("age"));
        WebElement submitButton = driver.findElement(By.id("sub"));
        firstNameInput.sendKeys("johnjohn");
        lastNameInput.sendKeys("canoncan");
        ageInput.sendKeys("151");
            
        submitButton.click();
            
        String result = driver.findElement(By.id("formname")).getText();
        assertEquals("Customer Details Form", result);
        driver.close();
	}
}
