Feature: employee resource
  Scenario: create employee resource
    When I request a post to "/employee"
    Then I get an OK response
    And the resource has details:
    """
    {"name": "ruben", "address": "Graham"}
    """

  Scenario: read employee resource
    When I request a get to "/employee/{id}"
    Then I get an OK response
    And the resource has details:
      | id | 1 |
      | id | 2 |