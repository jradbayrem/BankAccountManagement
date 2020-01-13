Feature: Deposit Feature
 In order to save money As a bank client I want to make a deposit in my account
 Scenario: Make a money deposit in a bank account
  Given the bank Account ID
  And amount of deposit
  When account exists
  Then create and save deposit transaction
