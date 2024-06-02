package com.testLeaf.stepdefenition;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.testLeaf.runner.RunnerClasss;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class TestDefenition {
	
	public static WebDriver driver = RunnerClasss.driver;

	@Given("^user Launched The LeafGround Application$")
	public void user_Launched_The_LeafGround_Application() throws Throwable {
		driver.get("https://www.leafground.com/dashboard.xhtml");
	}

	@Then("^user Cliked On The Element And It's Navigated To Element Page$")
	public void user_Cliked_On_The_Element_And_It_s_Navigated_To_Element_Page() throws Throwable {
		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
		driver.findElement(By.xpath("//span[.='Text Box']")).click();

	}

	@When("^user Filling The Details From Type Your Name Field To Type About Yourself Field Using Ctrl\\+Tab Option$")
	public void user_Filling_The_Details_From_Type_Your_Name_Field_To_Type_About_Yourself_Field_Using_Ctrl_Tab_Option()
			throws Throwable {
		driver.findElement(By.xpath("//input[@id='j_idt88:name']"))
				.sendKeys("Hariharan" + Keys.TAB + "Chennai" + Keys.TAB + Keys.BACK_SPACE + Keys.TAB
						+ "Can you clear me, please?" + Keys.TAB + "Husseyhari@gmail.com" + Keys.TAB
						+ "My self Hariharan who has 4 years of experience in Automation");
	}

	@When("^user Enters Text In The Text Editor Field$")
	public void user_Enters_Text_In_The_Text_Editor_Field() throws Throwable {
		driver.findElement(By.xpath("//div[@data-gramm='false']")).sendKeys("Hey please type here");
	}

	@When("^user Pressed Enter And Confirms The Error In The Confirm Error Message Field And Went TO The Next Field Using Ctrl \\+ Tab And Confirmed The Label Posision Changes In The Label Position Field$")
	public void user_Pressed_Enter_And_Confirms_The_Error_In_The_Confirm_Error_Message_Field_And_Went_TO_The_Next_Field_Using_Ctrl_Tab_And_Confirmed_The_Label_Posision_Changes_In_The_Label_Position_Field()
			throws Throwable {
		driver.findElement(By.xpath("//input[@id='j_idt106:thisform:age']")).sendKeys("Confirm" + Keys.TAB + "Hari02");
	}

	@When("^user Selects (\\d+) In The Type Your name And Choose The Name In The Third Option Field$")
	public void user_Selects_In_The_Type_Your_name_And_Choose_The_Name_In_The_Third_Option_Field(int arg1)
			throws Throwable {
		WebElement Arrow = driver.findElement(By.xpath(
				"//button[@class='ui-autocomplete-dropdown ui-button ui-widget ui-state-default ui-corner-right ui-button-icon-only']"));
		Arrow.click();

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

		r.keyPress(KeyEvent.VK_ENTER);

		Thread.sleep(2000);
	}

	@When("^user Slects The Date Of Birth In The DOB Field$")
	public void user_Slects_The_Date_Of_Birth_In_The_DOB_Field() throws Throwable {
		driver.findElement(By.xpath("//button [@aria-label='Show Calendar']")).click();
		String Cmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String Cyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

		while ((!(Cmonth.equals("July")) && Cyear.equals("2024"))) {
			driver.findElement(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']")).click();
			Cmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			Cyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

		}

		driver.findElement(By.xpath("//a[.='17']")).click();
	}

	@When("^user Selects Number In The Value Changed Field$")
	public void user_Selects_Number_In_The_Value_Changed_Field() throws Throwable {
		WebElement spin = driver.findElement(By.xpath("//span[@class='ui-icon ui-c ui-icon-triangle-1-n']"));
		spin.click();
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_UP);
		r1.keyRelease(KeyEvent.VK_UP);
		r1.keyPress(KeyEvent.VK_UP);
		r1.keyRelease(KeyEvent.VK_UP);
		r1.keyPress(KeyEvent.VK_UP);
		r1.keyRelease(KeyEvent.VK_UP);
		r1.keyPress(KeyEvent.VK_ENTER);
	}

	@When("^user Enters Random Number And Confirms The Slider Moved In The Confirm Slider Field$")
	public void user_Enters_Random_Number_And_Confirms_The_Slider_Moved_In_The_Confirm_Slider_Field() throws Throwable {
		driver.findElement(By.xpath("//input[@id='j_idt106:slider']")).sendKeys("40" + Keys.TAB);
	}

	@Then("^user Selects The TestLeafImage And It's Navigated To The Home Page$")
	public void user_Selects_The_TestLeafImage_And_It_s_Navigated_To_The_Home_Page() throws Throwable {
		driver.findElement(By.xpath("//img[@id='j_idt13']")).click();
	}

	@When("^user Clicked The Element Icon In The Element Field$")
	public void user_Clicked_The_Element_Icon_In_The_Element_Field() throws Throwable {
		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
	}

	@When("^user Clicked The DropDown Icon In The Drop Down Field$")
	public void user_Clicked_The_DropDown_Icon_In_The_Drop_Down_Field() throws Throwable {
		driver.findElement(By.xpath("//i[@class='pi pi-fw pi-chevron-down layout-menuitem-icon']")).click();
	}

	@When("^user Selects Tool In The  favorite UI Automation Tool Field$")
	public void user_Selects_Tool_In_The_favorite_UI_Automation_Tool_Field() throws Throwable {
		WebElement tool = driver.findElement(By.xpath("//select[@style='overflow-wrap: break-word; height: 150%;']"));
		tool.click();
		// driver.findElement(By.xpath("//option[@class='Playwright']")).click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
	}

	@When("^user Selects The Country In The Country Field$")
	public void user_Selects_The_Country_In_The_Country_Field() throws Throwable {
	
	
		driver.findElement(By.xpath("//label[@id='j_idt87:country_label']")).click();
		List<WebElement> list = driver.findElements(By.xpath("//ul[@id='j_idt87:country_items']/li"));
		for (WebElement li : list) {
			String litext = li.getText();
			if (litext.equals("India")) {
				li.click();
				break;
			}
		}
	}

	@When("^user Selects The City In The City Field$")
	public void user_Selects_The_City_In_The_City_Field() throws Throwable {
		driver.findElement(By.xpath("//label[@id='j_idt87:city_label']")).click();

		List<WebElement> state = driver.findElements(By.xpath("//ul[@id='j_idt87:city_items']/li"));

		for (WebElement st : state) {
			String sta = st.getText();
			System.out.println(sta);
			if (sta.equals("Chennai")) {
				st.click();
				break;
			}
		}
	}
	@When("^user Selects The Course In The Course Field$")
	public void user_Selects_The_Course_In_The_Course_Field() throws Throwable {
		driver.findElement(By.xpath("//label[@id='j_idt87:lang_label']")).click();
	}

	@When("^user Selects The language In The Language Field$")
	public void user_Selects_The_language_In_The_Language_Field() throws Throwable {
		List<WebElement> Language = driver.findElements(By.xpath("//ul[@id='j_idt87:lang_items']/li"));

		for (WebElement lang : Language) {
			String lan = lang.getText();
			System.out.println(lan);
			if (lan.equals("English")) {
				lang.click();

			}
		}
	}

	@When("^user Selects Two In The Language Chosen Field$")
	public void user_Selects_Two_In_The_Language_Chosen_Field() throws Throwable {
		WebElement value = driver.findElement(By.xpath("//label[@id='j_idt87:value_label']"));
		value.click();
		driver.findElement(By.xpath("//li[@id='j_idt87:value_2']")).click();

	}
	

	@Then("^user Selects The Image And It's Navigated To The Home Page$")
	public void user_Selects_The_Image_And_It_s_Navigated_To_The_Home_Page() throws Throwable {
		driver.findElement(By.xpath("//img[@id='j_idt13']")).click();
}

	@When("^user Clicks The Element Icon In The Element Field$")
	public void user_Clicks_The_Element_Icon_In_The_Element_Field() throws Throwable {
		driver.findElement(By.xpath("//i[@class='pi pi-server layout-menuitem-icon']")).click();
}

	@When("^user Clicked The CheckBox Icon In The CheckBox Field$")
	public void user_Clicked_The_CheckBox_Icon_In_The_CheckBox_Field() throws Throwable {

		driver.findElement(By.xpath("//span[.='Check Box']")).click();

	}

	@When("^user Clicked The Basic Checkbox In The BasicCheckBox Field$")
	public void user_Clicked_The_Basic_Checkbox_In_The_BasicCheckBox_Field() throws Throwable {
		driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
	}

	@When("^user Selects Both Java And Python In The Favourite Language Field$")
	public void user_Selects_Both_Java_And_Python_In_The_Favourite_Language_Field() throws Throwable {
		WebElement Python = driver
				.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[2]"));
		WebElement java = driver
				.findElement(By.xpath("(//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[3]"));

		Actions ac = new Actions(driver);
		ac.keyDown(Keys.CONTROL).moveToElement(Python).click().perform();
		ac.keyDown(Keys.CONTROL).moveToElement(java).click().perform();
	}

	@When("^user Double Clicked The CheckBox In The TriBox Field$")
	public void user_Double_Clicked_The_CheckBox_In_The_TriBox_Field() throws Throwable {

		WebElement doub = driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(doub).doubleClick().perform();
	}

	@When("^user Clicked The Toggle Switch Box In The Toggle Switch Field$")
	public void user_Clicked_The_Toggle_Switch_Box_In_The_Toggle_Switch_Field() throws Throwable {
		driver.findElement(By.xpath("//div[@id='j_idt87:j_idt100']")).click();
	}

	@When("^user Checked The CheckBox Is Enabled$")
	public void user_Checked_The_CheckBox_Is_Enabled() throws Throwable {
		WebElement Verify = driver.findElement(By.xpath("//div[@id='j_idt87:j_idt102']"));
		boolean ver = Verify.isEnabled();
		System.out.println(ver);
	}

	@When("^user Selects Multiple Options In The Select Multiple Field$")
	public void user_Selects_Multiple_Options_In_The_Select_Multiple_Field() throws Throwable {
		driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
		WebElement paris = driver.findElement(By.xpath("(//div[@class='ui-chkbox ui-widget'])[10]"));
		paris.click();
		WebElement berlin = driver.findElement(By.xpath("(//div[@class='ui-chkbox ui-widget'])[12]"));
		Thread.sleep(2000);
		Actions ac = new Actions(driver);

		ac.keyDown(Keys.CONTROL).moveToElement(paris).moveToElement(berlin).click().perform();
		Thread.sleep(2000);
	}


}

