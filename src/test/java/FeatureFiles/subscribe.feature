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
    And Enter the following values in the "home" page
      | subscribeInput | asd1223@gmail.com |
    And Click on following button in the "home" page
      | subscribeButton |
    Then Verify following texts in the "contact page" page
      | Thank you for signing up! A verification email has been sent. We appreciate your interest. |


  Scenario: login with valid credentials
    And Enter the following values in the "home" page
      | subscribeInput | asd |
    And Click on following button in the "home" page
      | subscribeButton |
    Then Verify following texts in the "contact page" page
      | Enter valid email |



