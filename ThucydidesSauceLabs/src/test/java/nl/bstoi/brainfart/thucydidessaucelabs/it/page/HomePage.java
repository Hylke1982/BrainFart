package nl.bstoi.brainfart.thucydidessaucelabs.it.page;

import lombok.Getter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.thucydides.core.annotations.At;
import net.thucydides.core.pages.PageObject;

@At(urls={"#HOST(/index.html)?"})
@Getter
public class HomePage extends PageObject{
	
	@FindBy(name="textToReverse")
	private WebElement inputTextToReverse;
	
	@FindBy(className="result-box")
	private WebElement dataReversedText;

	public HomePage(WebDriver driver, int ajaxTimeout) {
		super(driver, ajaxTimeout);
	}

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	

}
