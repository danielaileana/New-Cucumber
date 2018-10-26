Feature:
  Scenario: Check if PetTypes title exists
   Given I have access to go to homepage
   When  I click PetTypes button
   Then  Validate if PetTypes title exist


    Scenario: User want to add a new Owner
      Given I have access to go to homepage
      When  I click addNewOwnerButton
      Then create a new owner