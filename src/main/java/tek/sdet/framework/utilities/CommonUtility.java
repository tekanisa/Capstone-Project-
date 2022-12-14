package tek.sdet.framework.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import tek.sdet.framework.base.BaseSetup;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Set;

public class CommonUtility extends BaseSetup {

	public WebDriverWait getWait() {
		return new WebDriverWait(getDriver(), Duration.ofSeconds(20));
	}

	public WebElement waitTillClickable(WebElement element) {
		return this.getWait().until(ExpectedConditions.elementToBeClickable(element));
	}

	public WebElement waitTillClickable(By by) {
		return this.getWait().until(ExpectedConditions.elementToBeClickable(by));
	}
	
	public String getText(WebElement ele) {
        String text = ele.getText();
        return text;
    }
	
	public void clickElementWithJS(WebElement element) {
        JavascriptExecutor js = ((JavascriptExecutor) getDriver());
         js.executeScript("arguments[0].click();", element);

	}
	
	public WebElement waitTillPresence(WebElement element) {
		return this.getWait().until(ExpectedConditions.visibilityOf(element));
	}

	public boolean isElementDisplayed(WebElement ele, String string) {
        if (ele.isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }
    
	public WebElement waitTillPresence(By by) {
		return this.getWait().until(ExpectedConditions.visibilityOfElementLocated(by));
	}

	public void selectByVisibleText(WebElement ele, String visibleText) {
        Select select = new Select(ele);
        select.selectByVisibleText(visibleText);


   }
	public void click(WebElement element) {
		this.waitTillClickable(element).click();
	}

	public void sendText(WebElement element, String value) {
		this.waitTillPresence(element).sendKeys(value);
	}

	public String getElementText(WebElement element) {
		return this.waitTillPresence(element).getText();
	}

	public byte[] takeScreenShotAsBytes() {
		return ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
	}

	public void click(By by) {
		waitTillClickable(by).click();
	}

	public void sendText(By by, String value) {
		this.waitTillPresence(by).sendKeys(value);
	}
	public boolean isElementDisplayed(WebElement ele) {
        if (ele.isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }
	public String getTitle() {
        String title = getDriver().getTitle();
        return title;
    }
	public void slowDown() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	public boolean isElementdisplayed(WebElement ele, String string) {
		if (ele.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}
	
	public void clearTextUsingSendKeys(WebElement toClear) {
		toClear.sendKeys(Keys.CONTROL + "a");
		toClear.sendKeys(Keys.DELETE);
	}
}