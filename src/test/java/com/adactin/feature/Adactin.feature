@Scenario1
Feature: Hotel booking in Adactin Web Application
Scenario Outline: User Login In The Web Application
Given user Launch The Adactin Application
When user Enter The "<Username>" In The Username Field
And user Enter The "<Password>" In The Password Field
Then user Clicked The Login And It Navigated To The Search Hotel Page. 

Examples:
|Username|Password|
|hari0207|Hari@123|

@Scenario2
Scenario: User Searching Hotels in The Search Hotel Page
When user Selects Location In The Location Field
And user Selects Hotel In The Hotel Field
And user Selects The Room Type In The Room Type Field
And user Selects The Number Of Rooms.
And user Selects The Check In Date In The Check In Date Field
And user Selects The Check Out Date In The Check Out Date Field
And user Selects The Number Of Adults In The Adults Per Room Field
And user Selects The Number of Childern In The Children Per Room Field
Then user Clicked The Search Button And It's Navigated To The Select Hotel page
@Scenario3
Scenario: User Selecting The Hotel In The Select Hotel Page
When user Selects The Hotel By Cliking On The Select Radio Button Field
Then user Clicked The Continue Button And It's Navigates To The Book A Hotel Field
@Scenario4
Scenario: User Entering His Details In The Book A Hotel Page
When user Enters His First Name In The First Name Field
And user Enters His Last Name In The Last Name Field
And user Enters His Address In The Billing Address Field
And user Enters His Credit Card Number In The Credit Card No. Field
And user Enters His Credit Card Type In The Credit Card Type Field
And user Selects The Expiry Month Of Card In The Expiry Date Field
And user Selects The Expiry Year Of Card In The Expiry Year Field
And User Enters His CVV Number In The CVV Number Field
Then User Clicked Book Now And It's Navigated To The Book Now Field
@Scenario5
Scenario: User Confirming His Given Details In The Booking Confirmation Page
When user Confirming His Given Details In The Booking Confirmation Page. 
Then user Clicked The My Itinerary Button And It's Navigated To The Booked Itinerary Field
@Scenario6
Scenario: User Selecting The Order Id Page
When user Checking For Available Order Id In The Order Id Page
And user Cicks THe CheckBox Next To The Order Id
Then user Clicked The Logout And It's Naviagted To The Logged out Page
