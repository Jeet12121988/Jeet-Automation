package jitendraSahuCompany.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import abstactMehodsReusable.ReusableMehods;

public class MyOrdersTest extends ReusableMehods{
	WebDriver driver;
	public MyOrdersTest(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	@FindBy (xpath="//tr//td[2]")
	List<WebElement> NameOfElementOrders;

	public boolean myOrdersCheckTest(String ProductName) {
		clickToMyOrders();
		
		boolean match=NameOfElementOrders.stream().anyMatch(s->s.getText().equalsIgnoreCase(ProductName));
		return match;	
		
	}

}
