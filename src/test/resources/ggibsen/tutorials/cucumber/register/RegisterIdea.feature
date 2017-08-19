Feature:  Register business idea

  Acceptance criteria / business rules:
  1) Registration occurs only if has enough approvals
  2) Biz Value proposition should receive response in 5 days.

  NOTE:  Proof of concept:  This file is RE-USING steps from the OTHER file

  Scenario: Registered business idea has adequate approval
    Given I have a business idea
    When Business idea is registered
    Then Idea should have 3 approvals

  Scenario: A registered business idea has corporate sponsorship
    Given I have a business idea
    When Business idea is registered
    Then Idea should have at least 1 corporate sponsors
