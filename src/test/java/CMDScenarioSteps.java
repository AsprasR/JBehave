import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;

public class CMDScenarioSteps {

    private CDM cdm;
    private Account account;
    private CreditCard creditCard;

    private int money;

    @Given("the Account balance is <account_balance>")
    public void createAccount(@Named("account_balance") int balance) {
        account = new Account(balance);
    }

    @When("the card is $valid")
    public void createCreditCard() {
        creditCard = new CreditCard(account);
    }

    @When("the machine contains <cdm_available> nad has limit <cdm_limit>")
    public void createATM(@Named("cdm_available") int money,@Named("cdm_limit") int limit) {
        cdm = new CDM(money,limit);
    }

    @When("the Account Holder pay <payment>")
    public void requestMoney(@Named("payment") int amount) {
        money = cdm.receiveMoney(creditCard, amount);
    }

    @Then("the CDM should dispense <result>")
    public void checkMoney(@Named("result") int amount) {
        assertThat(money, is(amount));
    }

    @Then("the account balance should be <newBalance>")
    public void checkBalance(@Named("newBalance") int balance) {
        assertThat(balance, is(creditCard.getAccount().getBalance()));
    }

    @Then("the card should be returned")
    public void cardShouldBeReturned() {
        assertFalse(creditCard.isInUse());
    }


}