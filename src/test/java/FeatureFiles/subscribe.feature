Feature: Subscribe

  Background:
    Given navigate to website
    And Click on following button in the "LoginPageElement" page
      | login |
    And Enter the following values in the "LoginPageElement" page
      | Email    | asd1223@gmail.com |
      | Password | asd1223           |
    And Click on following button in the "LoginPageElement" page
      | LogInButton |

  Scenario: Subscribe valid email
    And Enter the following values in the "HomePageElement" page
      | subscribeInput | asd1223@gmail.com |
    And Click on following button in the "HomePageElement" page
      | subscribeButton |
    Then Verify following texts in the "contact page" page
      | Thank you for signing up! A verification email has been sent. We appreciate your interest. |


  Scenario: Subscribe invalid email
    And Enter the following values in the "HomePageElement" page
      | subscribeInput | asd |
    And Click on following button in the "HomePageElement" page
      | subscribeButton |
    Then Verify following texts in the "contact page" page
      | Enter valid email |



