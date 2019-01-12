Narrative: Account Holder pay cash into Account by CDM
    As a Account Holder
    I want to pay cash into an CDM
    In order to pay money into my Account when the bank is closed

Scenario: Account get money
Given the Account balance is <account_balance>
When the card is valid
When the machine contains <cdm_available> nad has limit <cdm_limit>
When the Account Holder pay <payment>
Then the CDM should dispense <result>
Then the account balance should be <newBalance>
Then the card should be returned

Examples:
|account_balance|cdm_available|cdm_limit|payment|result|newBalance|
|100            |100          |1000     |100    |0     |200       |
|100            |100          |200      |300    |300   |100       |