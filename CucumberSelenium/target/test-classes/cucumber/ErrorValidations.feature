
@tag
Feature: Error validation


	Background:
	

  @tag2
  Scenario Outline: Error validation upon giving incorrect id in login section
    Given I landed on Ecommerce Page
    When Logged in with username <name> and password <password>
    Then "Incorrect email or password." message is displayed

    Examples: 
      | name  										 | password   | productName|
      | anshumanjenaman@gmail.com  |Stopit@2001 |ZARA COAT 3|
      
