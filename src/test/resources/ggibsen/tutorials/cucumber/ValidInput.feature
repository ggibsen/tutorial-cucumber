Feature:  Validate business input

  Here's an optional description about this feature named 'Valid input'.  This feature is about validating a received
  business value proposition.

  I'm also including some acceptance criteria or business rules here about this feature:
  1) Need to be able to understand biz value
  2) Biz Value proposition should have adequate sponsorship

  Background:
    Given I have a business idea

  Scenario: Business idea has thorough explanation
    When Business idea is received
    Then Idea should be thoroughly explained

  Scenario: Business idea has adequate sponsors
    When Business idea is received
    Then Idea should have at least 2 sponsors

  # This scenario is example of number and string passing into a step definition
  Scenario: Business idea can't be duplicated
    And I have a duplicate business idea ID 1 "TEST_A_DUPLICATE_BIZ_IDEA"
    When Business idea is received
    Then Business idea is not accepted
