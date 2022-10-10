Feature: Checking The Hotel Boooking Functionality of an adactin application

@SmokeTest1
Scenario Outline: Login Functionality
Given user Must Launch The Url
When user Enter The "<uname>" In The Username Field
And user Enter The "<pword>" In The Password Field
Then user Click The Login Button And It Navigates To The Search Hotel Page

Examples:
|uname|pword|
|xyz|1234|
|hdshbv|567747|
|subburam1234|@Sanjana1618|

@SmokeTest2
Scenario: User Move to Search Hotel Page Functionality
When user Select The Location In Select Location Option 
And user Select Number Of Rooms From Number Of Rooms Option
And user Clear the Defult Date from Check In Date Field
And user Enter the Date Of CheckIn  In Check In Date Field
And user Clear the Defult Date from Check Out Date Field
And user Enter the Date Of CheckOut  In Check Out Date Field
And user Select Adult Per Room From Adult Per Room Option
Then user Click The Search Button And It Navigates To Select Hotel Page




