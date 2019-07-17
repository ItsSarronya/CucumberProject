Feature: FaceBook functionalities

Background: Facebook is launched
Given The browser is open
When Facebook is launched

@PresenceCheck
Scenario: Login button exists
#Given The browser is open
#When Facebook is launched
Then Login button should be enabled

@PageNavigation
Scenario: Forgot password functionality exists
#Given The browser is open
#When Facebook is launched
And Click Forgot Password
Then Forgot Password Page should open

@BasicFunctionality1
Scenario: Login with incorrect credentials should be unsuccessful
#Given The browser is open
#When Facebook is launched
And User enters "user1" and "pass1"
Then Incorrect Password Page should open

@BasicFunctionality1
Scenario Outline: Login with incorrect credentials should be unsuccessful
#Given The browser is open
#When Facebook is launched
And User enters "<username>" and "<password>"
Then Incorrect Password Page should open
Examples:
| username  | password  | 
| username1 | password1 | 
| username2 | password2 |

@BasicFunctionality
Scenario: Login with incorrect credentials should be unsuccessful
#Given The browser is open
#When Facebook is launched
And User enters the data
| Fields                 | Values              |
| First Name             | Chetan                 | Sachin |
| Last Name              | Bhagat             | Tendy|
| Mobile Number          | 9940891300 |9843100399|
| Password               | bhagat123$           |Modi123*|
| Gender	             | Female                 |Male|
#Then  Account security page should open
#But SMS confirmation page should open
Then  SMS confirmation page should open