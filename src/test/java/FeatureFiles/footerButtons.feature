Feature: All footer buttons

  Background:
    Given navigate to website
    And Click on following button in the "LoginPageElement" page
      | login |
    And Enter the following values in the "LoginPageElement" page
      | Email    | asd1223@gmail.com |
      | Password | asd1223           |
    And Click on following button in the "LoginPageElement" page
      | LogInButton |

  Scenario: Shipping and returns button
    And Click on following button in the "HomePageFooter" page
      | ShippingReturns |
    Then Verify following texts in the "HomePageElement" page
      | Put your shipping & returns information here. You can edit this in the admin site |

  Scenario:  Privacy Notice button
    And Click on following button in the "HomePageFooter" page
      | PrivacyNotice |
    Then Verify following texts in the "HomePageElement" page
      | Put your privacy policy information here. You can edit this in the admin site. |

  Scenario:  Condition of use button
    And Click on following button in the "HomePageFooter" page
      | Conditions_of_Use |
    Then Verify following texts in the "HomePageElement" page
      | Put your conditions of use information here. You can edit this in the admin site. |

  Scenario:  About us button
    And Click on following button in the "HomePageFooter" page
      | aboutUs |
    Then Verify following texts in the "HomePageElement" page
      | Put your "About Us" information here. You can edit this in the admin site. |

  Scenario:  My account button
    And Click on following button in the "HomePageFooter" page
      | My_account |
    Then Verify following texts in the "HomePageElement" page
      | My account - Customer info |
      | Gender                     |
      | First name:                |
      | Last name:                 |
      | Email:                     |

  Scenario:  Addresses button
    And Click on following button in the "HomePageFooter" page
      | Addresses |
    Then Verify following texts in the "HomePageElement" page
      | My account - Addresses |

  Scenario:  Shopping cart button
    And Click on following button in the "HomePageFooter" page
      | Shopping_cart |
    Then Verify following texts in the "HomePageElement" page
      | Shopping cart |
      | Product(s)    |
      | Discount Code |

  Scenario:  Wishlist button
    And Click on following button in the "HomePageFooter" page
      | Wishlist |
    Then Verify following texts in the "HomePageElement" page
      | The wishlist is empty!|

