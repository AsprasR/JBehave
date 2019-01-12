
Narrative: ATM Filler want to fill ATM
As a ATM Filler
I want fill a ATM
In order to fill money when ATM is empty

Scenario: scenario description
Given ATM to fill has <atm_available>
When the money filler fill ATM by <request>
Then the ATM should have <result>

Examples:
|atm_available|request|result|
|0            |100    |100   |
|10           |100    |110   |