Feature: Add two numbers

  Scenario Outline: Add two number
    Given two number <num1> and <num2>
    When add operation is performed
    Then the output should be <result>

    Examples:
      | num1 | num2 | result |
      | 5    | 8    | 13     |
      | 3    | 9    | 12     |