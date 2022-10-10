Feature: Checking the hotel boooking functionality of an adactin application
Scenario: Login Functionality
Given user Must Launch The Url
When user Enter The Username In The Username Field
And user Enter The Password In The Password Field
Then user Click The Login Button And It Navigates To The Search Hotel Page

Scenario: User Move to Search Hotel Page Functionality
When user Select The Location In Select Location Option 
And user Select Number Of Rooms From Number Of Rooms Option
And user Clear the Defult Date from Check In Date Field
And user Enter the Date Of CheckIn  In Check In Date Field
And user Clear the Defult Date from Check Out Date Field
And user Enter the Date Of CheckOut  In Check Out Date Field
And user Select Adult Per Room From Adult Per Room Option
Then user Click The Search Button And It Navigates To Select Hotel Page

Scenario: User Move to Select Hotel Page Functionality
When user Select The Hotel And Click the Radio Button In Select Hotel Page
Then user Click The Continue Button And It Navigates To Book A Hotel Page

Scenario: User Move to Book A Hotel Page Functionality
When user Enter The Firstname In The Firstname Field
And user Enter The Lastname In The Lastname Field 
And user Enter The BillingAddress In The BillingAddress Field 
And user Enter The Credit Card No In The Credit Card No  Field 
And user Select The Credit Card type From The Credit Card Type Option 
And user Select The Expire Month From  Expire Month Option 
And user Select The Expire Year From  Expire Year Option
And user Enter The CVV Number In The CVV Number Field
Then user Click Book Now Button It Navigates To Booking Confirmation Page

Scenario: User Move To To Booking Confirmation Page Functionality
When user Take A Snap Shot Of order Confirm Page With My Itinery As Reference Field
Then User Click Logout Button
