Feature: login functionality

  @wip
  Scenario: teacher login
    Given user logs in as a teacher
    When user logs in as a teacher "myemail@gmail.com" and "mysecurepassword"
    Then homepage should be displayed