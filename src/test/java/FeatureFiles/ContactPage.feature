Feature: login to website

  Background:
    Given navigate to website
    And Click on following button in the "login" page
      | login |
    And Enter the following values in the "login" page
      | Email    | asd1223@gmail.com |
      | Password | asd1223           |
    And Click on following button in the "login" page
      | LogInButton |

  Scenario: login with valid credentials
    And Click on following button in the "home" page
      | Contact us |
    And Enter the following values in the "myAccount" page
      | enquiry | go to hell |
    And Click on following button in the "myAccount" page
      | submitButton |
    Then Verify following texts in the "contact page" page
      | Your enquiry has been successfully sent to the store owner. |
