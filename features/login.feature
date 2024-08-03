Feature: Login Page

  Scenario Outline: Verify Login with username <username> and password <password> with message <message>
  Given User is in Login Page
  When User enters username <username> and password <password>
  And Click on Login Button
  Then Verify that <message> is displayed

  Examples:
      | username          | password  | message                                |
      | alice@example.com | 10203040  | Sorry, this user has been locked out.  |
      | 1@2.com           | f-o-o     | Provided credentials do not match any user in this service. |
      |                   |           | Username is required |
      | bob@example.com   |           | Password is required |
      | bob@example.com   | 10203040  | Products |
