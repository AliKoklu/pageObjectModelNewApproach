Feature: WishList

  Background:
    Given navigate to website
    And Click on following button in the "LoginPageElement" page
      | login |
    And Enter the following values in the "LoginPageElement" page
      | Email    | asd1223@gmail.com |
      | Password | asd1223           |
    And Click on following button in the "LoginPageElement" page
      | LogInButton |

  Scenario: Add Remove to wishList
    And Hover over on the following element "electronics" in the "HomePageElement" page
    And Click on following button in the "HomePageElement" page
      | cameraAndPhoto |
