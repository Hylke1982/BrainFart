package nl.bstoi.brainfart.thucydidessaucelabs.it.step;

import junit.framework.Assert;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import nl.bstoi.brainfart.thucydidessaucelabs.it.page.HomePage;

public class ReverseTextSteps extends ScenarioSteps {

	private static final long serialVersionUID = 5489207117863005621L;


	public ReverseTextSteps(Pages pages) {
		super(pages);
	}
	
	
	@Step("Fill in the text to reverse")
	public void fillInTextToReverse(String textToReverse){
		HomePage homePage = getPages().currentPageAt(HomePage.class);
		homePage.getInputTextToReverse().clear();
		homePage.getInputTextToReverse().sendKeys(textToReverse);
	}
	
	@Step("Validate in the result box that the text is correctly reversed")
	public void shouldHaveResult(String reversedText){
		HomePage homePage = getPages().currentPageAt(HomePage.class);
		waitFor(2).seconds();
		Assert.assertEquals(reversedText,homePage.getDataReversedText().getText());
	}
	
}
