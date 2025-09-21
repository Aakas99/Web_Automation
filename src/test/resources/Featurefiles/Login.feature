Feature: Login the UI with multiple userID

Scenario Outline: Login functionality of UI
Given Launch the Web browser
When  UserId <userId> and password <password> is entered
Then  Login button is clicked

Examples:
      | userId          | password       |
      | standard_user   | secret_sauce   |
      | locked_out_user | secret_sauce   |
      | problem_user    | secret_sauce   |