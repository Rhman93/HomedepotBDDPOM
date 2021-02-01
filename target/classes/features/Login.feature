#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Login Functonality
  Register User should be able to login with valid credentials

  @tag1
  Scenario: Valied Login Functionality
  
    Given User should be in the homepage
    When User able to click to the MyAccount link
    And User able to click to SignIn Link
    Then User will be in the SignIn Page
    When User should put Valied Email Address and password
    And User should click to the SignIn button
    Then User should be in his Account
    
    Scenario: Invalied Login Functionality
    
    Given User should be in the homepage
     When User able to click to the MyAccount link
    And User able to click to SignIn Link
    Then User will be in the SignIn Page
    When User should put InValied Email Address and password
    And User able click to the SignIn button
    Then User Unable to LogIn inthe Account
    

 
