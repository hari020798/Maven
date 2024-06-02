package com.adactin.stepdefenition;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.adactin.runner.RunnerClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Defenition {
	public static WebDriver driver = RunnerClass.driver;

	
	@Given("^user Launch The Adactin Application$")
	public void user_Launch_The_Adactin_Application() throws Throwable {
		driver.get("https://adactinhotelapp.com/");
	}
	@When("^user Enter The \"([^\"]*)\" In The Username Field$")
	public void user_Enter_The_In_The_Username_Field(String userId) throws Throwable {
		WebElement name = driver.findElement(By.xpath("//input[@id ='username']"));
        name.sendKeys(userId);
	}
	@When("^user Enter The \"([^\"]*)\" In The Password Field$")
	public void user_Enter_The_In_The_Password_Field(String userPass) throws Throwable {
		WebElement password = driver.findElement(By.xpath("//input[@name ='password']"));
		password.sendKeys(userPass);
	}

	@Then("^user Clicked The Login And It Navigated To The Search Hotel Page\\.$")

	public void user_Clicked_The_Login_And_It_Navigated_To_The_Search_Hotel_Page() throws Throwable {
	    driver.findElement(By.xpath("//input[@class ='login_button']")).click();

	}

	@When("^user Selects Location In The Location Field$")
	public void user_Selects_Location_In_The_Location_Field() throws Throwable {
		WebElement location = driver.findElement(By.xpath("//select[@name ='location']"));
        Select s = new Select(location);
        s.selectByIndex(4);	  
       
			
	}

	@When("^user Selects Hotel In The Hotel Field$")
	public void user_Selects_Hotel_In_The_Hotel_Field() throws Throwable {
		WebElement Hotel = driver.findElement(By.xpath("//select[@id='hotels']"));
        Select h = new Select(Hotel);
        h.selectByValue("Hotel Creek");
	}

	@When("^user Selects The Room Type In The Room Type Field$")
	public void user_Selects_The_Room_Type_In_The_Room_Type_Field() throws Throwable {
		 WebElement room = driver.findElement(By.xpath("//select[@name='room_type']"));
	        Select r = new Select(room);
	        r.selectByVisibleText("Double");

	}

	@When("^user Selects The Number Of Rooms\\.$")
	public void user_Selects_The_Number_Of_Rooms() throws Throwable {
		 
        WebElement roomss = driver.findElement(By.xpath("//select[@name='room_nos']"));
        Select nor = new Select(roomss);
        nor.selectByVisibleText("4 - Four");
	}

	@When("^user Selects The Check In Date In The Check In Date Field$")
	 
	public void user_Selects_The_Check_In_Date_In_The_Check_In_Date_Field() throws Throwable {
		  driver.findElement(By.xpath("//input[@name='datepick_in']")).sendKeys("15/04/2024");

		
	}
	
	@When("^user Selects The Check Out Date In The Check Out Date Field$")
	public void user_Selects_The_Check_Out_Date_In_The_Check_Out_Date_Field() throws Throwable {
		  driver.findElement(By.xpath("//input[@name='datepick_out']")).sendKeys("18/04/2024");

		 
	}

	@When("^user Selects The Number Of Adults In The Adults Per Room Field$")
	public void user_Selects_The_Number_Of_Adults_In_The_Adults_Per_Room_Field() throws Throwable {
		WebElement acount = driver.findElement(By.xpath("//select[@name='adult_room']"));
        Select c = new Select(acount);
        c.selectByIndex(3);
	}

	@When("^user Selects The Number of Childern In The Children Per Room Field$")
	public void user_Selects_The_Number_of_Childern_In_The_Children_Per_Room_Field() throws Throwable {
		WebElement ccount = driver.findElement(By.xpath("//select[@name='child_room']"));
        Select co = new Select(ccount);
        co.selectByIndex(4);
	}

	@Then("^user Clicked The Search Button And It's Navigated To The Select Hotel page$")
	public void user_Clicked_The_Search_Button_And_It_s_Navigated_To_The_Select_Hotel_page() throws Throwable {
        driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@When("^user Selects The Hotel By Cliking On The Select Radio Button Field$")
	public void user_Selects_The_Hotel_By_Cliking_On_The_Select_Radio_Button_Field() throws Throwable {
        driver.findElement(By.xpath("//input[@id='radiobutton_0']")).click();

	}

	@Then("^user Clicked The Continue Button And It's Navigates To The Book A Hotel Field$")
	public void user_Clicked_The_Continue_Button_And_It_s_Navigates_To_The_Book_A_Hotel_Field() throws Throwable {
        driver.findElement(By.xpath("//input[@name='continue']")).click();
}

	@When("^user Enters His First Name In The First Name Field$")
	public void user_Enters_His_First_Name_In_The_First_Name_Field() throws Throwable {
        driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Hari");

	}

	@When("^user Enters His Last Name In The Last Name Field$")
	public void user_Enters_His_Last_Name_In_The_Last_Name_Field() throws Throwable {
        driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("haran");

	}

	@When("^user Enters His Address In The Billing Address Field$")
	public void user_Enters_His_Address_In_The_Billing_Address_Field() throws Throwable {
        driver.findElement(By.xpath("//textarea[@name='address']")).sendKeys("67/2 kandaswamy koil st");

	}

	@When("^user Enters His Credit Card Number In The Credit Card No\\. Field$")
	public void user_Enters_His_Credit_Card_Number_In_The_Credit_Card_No_Field() throws Throwable {
        driver.findElement(By.xpath("//input[@id='cc_num']")).sendKeys("0402042515854525");

	}

	@When("^user Enters His Credit Card Type In The Credit Card Type Field$")
	public void user_Enters_His_Credit_Card_Type_In_The_Credit_Card_Type_Field() throws Throwable {
		WebElement Type = driver.findElement(By.xpath("//select[@id='cc_type']"));
        Select t = new Select(Type);
        t.selectByValue("VISA");
	}

	@When("^user Selects The Expiry Month Of Card In The Expiry Date Field$")
	public void user_Selects_The_Expiry_Month_Of_Card_In_The_Expiry_Date_Field() throws Throwable {
		WebElement month = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
        Select m = new Select(month);
        m.selectByVisibleText("August");
	}

	@When("^user Selects The Expiry Year Of Card In The Expiry Year Field$")
	public void user_Selects_The_Expiry_Year_Of_Card_In_The_Expiry_Year_Field() throws Throwable {
		WebElement year = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
        Select y = new Select(year);
        y.selectByValue("2027");
	}

	@When("^User Enters His CVV Number In The CVV Number Field$")
	public void user_Enters_His_CVV_Number_In_The_CVV_Number_Field() throws Throwable {
        driver.findElement(By.xpath("(//input[@type='text'])[14]")).sendKeys("035");
	}
	@Then("^User Clicked Book Now And It's Navigated To The Book Now Field$")
	public void user_Clicked_Book_Now_And_It_s_Navigated_To_The_Book_Now_Field() throws Throwable {
	       driver.findElement(By.xpath("//input[@value='Book Now']")).click();
	       Thread.sleep(10000);

	}

	@When("^user Confirming His Given Details In The Booking Confirmation Page\\.$")
	public void user_Confirming_His_Given_Details_In_The_Booking_Confirmation_Page() throws Throwable {
	}

	@Then("^user Clicked The My Itinerary Button And It's Navigated To The Booked Itinerary Field$")
	
	public void user_Clicked_The_My_Itinerary_Button_And_It_s_Navigated_To_The_Booked_Itinerary_Field() throws Throwable {
        driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();

	}

	@When("^user Checking For Available Order Id In The Order Id Page$")
	public void user_Checking_For_Available_Order_Id_In_The_Order_Id_Page() throws Throwable {
}

	@When("^user Cicks THe CheckBox Next To The Order Id$")
	public void user_Cicks_THe_CheckBox_Next_To_The_Order_Id() throws Throwable {
		 driver.findElement(By.xpath("(//input[@value='1229066'])")).click();       

	}

	@Then("^user Clicked The Logout And It's Naviagted To The Logged out Page$")
	public void user_Clicked_The_Logout_And_It_s_Naviagted_To_The_Logged_out_Page() throws Throwable {
	} 



}
