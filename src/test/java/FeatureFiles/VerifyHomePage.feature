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

  Scenario: login with valid credentials

    Then Wait for 2 seconds
    Then Verify following texts in the "HomePageElement" page
      | Do you like nopCommerce? |
      | Popular tags             |
      | Log out                  |
      | Newsletter               |
      | Popular tags             |
      | Manufacturers            |
      | Featured products        |
      | Information              |
      | Customer service         |
      | My account               |
      | Follow us                |
