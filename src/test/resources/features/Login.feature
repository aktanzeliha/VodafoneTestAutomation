@regression
@smoke
@wip
Feature:Login test

  Scenario:1-Open browser and the Vodafone Page
    Given User open browser
    When User on the Vodafone website homepage
    Then User on the login page
  Scenario:2-Login test with valid username and password
    And User enter username
    And User enter password
    And User click with the "Sign in"
    And User click "Logout"

  Scenario:3-Negative Test for Login via valid username invalid  password
    And User enter username
    And User enter password "111111"
    And User click with the "Sign in"
    Then User verify message "Authentication failed"

  Scenario:4-Negative Test for Login via invalid username with space
    Then User clean the username password box
    And User enter username "negativeTest @test.com"
    And User enter password
    And User click with the "Sign in"
    Then User verify message "Invalid email address."

  Scenario:5-Negative Test for Login via wrong username and wrong password
    And User clean the username password box
    And User enter username "negativeTest@test.com"
    And User enter password "wrongPassword123"
    And User click with the "Sign in"
    Then User verify message "Authentication failed"

  Scenario:6-User  reset email test with invalid user email
    And User click the "Forgot your password?"
    And User enter username "negativeTest@test.com"
    And User click the "Retrieve Password"
    Then User verify message "There is no account registered for this email address."

  Scenario:7-User  reset email test with invalid email
    And User clear the box "(//div//input)[1]"
    And User enter username "invalid email"
    And User click the "Retrieve Password"
    Then User verify message "Invalid email address."
    And User clear the box "(//div//input)[1]"

  Scenario Outline:8-User  reset email test with invalid email
    And User clear the box "(//div//input)[1]"
    And User enter username "<email>"
    And User click the "Retrieve Password"
    Then User verify message "<message>"
    Then User close browser
    Examples:
      | email | message |
      | testsilicontest@gmail.com | A confirmation email has been sent to your address: testsilicontest@gmail.com |

