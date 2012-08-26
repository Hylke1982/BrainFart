package nl.bstoi.brainfart.thucydidessaucelabs.it.story;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;
import nl.bstoi.brainfart.thucydidessaucelabs.it.step.ReverseTextSteps;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(ThucydidesRunner.class)
public class ReverseTextStory {
	
	@Managed
	private WebDriver webDriver;
	
	@ManagedPages(defaultUrl = "http://localhost:48080")
    public Pages pages;
	
	@Steps
	public ReverseTextSteps reverseTextSteps;
	
	
	@Title("Validate if text is correctly reversed")
	@Test
	public void testIfTestIsReversed(){
		final String textToReverse = "reverse";
		reverseTextSteps.fillInTextToReverse(textToReverse);
		reverseTextSteps.shouldHaveResult("esrever");
	}

}
