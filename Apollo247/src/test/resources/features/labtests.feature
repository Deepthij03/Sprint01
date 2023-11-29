Feature: Verifying Lab Tests Functionality
 
Background: User is logged in
  Given user is on the Apollo App Login Screen
  When user enters a valid mobile number and OTP
  And user clicks on the Login button
  And user is logged in and clicks on lab tests
  Then user is on lab tests page
  
@Search_for_Particular_Test
Scenario Outline: User is able to search lab tests by entering test name manually
  Given user clicks on search bar and enters labTests "<sheetname>" and "<rownumber>"
  When user clicks on that particular Test
  Then user is redirected to that test page and sees product details
 Examples:
 |sheetname			|rownumber|
 |LabTestSheet	|0	| 
 

@Search_Suggested_Test 
Scenario: user is able to select the suggested lab test
  Given user clicks on search bar and selects one popular test
  When user clicks on complete blood count
  Then user is user is on complete blood count page

@Add_To_Cart  
Scenario: user is able add the lab tests to cart
  Given user clicks on viewAll of vital organs and selects Heart
  When user is able to click on Cholestrol serum
  And user clicks on add to cart button1 
  And user clicks on proceed to cart button
  Then user is on cart page and an item is present in the cart

@Remove_From_Cart  
Scenario: User is able to add and remove items from the cart
Given user clicks on view all of top booked tests
When user clicks add button of a labTest
|Lipid Profile| #Use Excel
And user clicks on top cart button
Then user remove the test from cart

#@negative_Scenario
#Scenario: invalid Lab test
#Given User clicks on search lab tests bar
#When user enters invalid labtest in search bar
#Then user should not be able to see the lab test 

#@Sort_By_Option
#Scenario: User is able to use sort by option
#Given user clicks on view all of top booked tests1
#When user clicks on Sort By and selects Popularity
#And user clicks on Show More button
#And user clicks on urea serum
#Then user is on urea serum page


