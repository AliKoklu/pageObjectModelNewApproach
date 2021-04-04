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

    Then Wait for 2 seconds
    Then Verify following texts in the "HomePage" page
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
