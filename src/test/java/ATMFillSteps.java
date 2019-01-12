import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class ATMFillSteps {
    private ATM atm;

    private int available;

    @Given("ATM to fill has <atm_available>")
    public void createATM(@Named("atm_available") int available) { this.atm = new ATM(available); this.available=available;}

    @When("the money filler fill ATM by <request>")
    public void fillATM(@Named("request") int money) { this.atm.fillMoney(money);}

    @Then("the ATM should have <result>")
    public void checkATM(@Named("result") int money) { assertThat(money,is(this.atm.getMoney()));}


}

