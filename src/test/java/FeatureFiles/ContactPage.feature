Feature: login to website

  Background:
    Given navigate to website
    And Click on following button in the "LoginPageElement" page
      | login |
    And Enter the following values in the "LoginPageElement" page
      | Email    | asd1223@gmail.com |
      | Password | asd1223           |
    And Click on following button in the "LoginPageElement" page
      | LogInButton |

  Scenario: Contact use button is working
    And Click on following button in the "HomePageElement" page
      | Contact us |
    And Enter the following values in the "myAccountPage" page
      | enquiry | go to hell |
    And Click on following button in the "myAccountPage" page
      | submitButton |
    Then Verify following texts in the "contact page" page
      | Your enquiry has been successfully sent to the store owner. |



