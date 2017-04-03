Feature: Signin
  Background: I should see the accounts signin page

    Scenario: As an o2 user I should be able to signin successfully
      Given I navigate to "https://accounts.ref.o2.co.uk"
      When I enter username as "identityref01@mailinator.com"
      And I enter password as "test123"
      And I click on sigin button
      Then I should be currently on "O2 | My device"