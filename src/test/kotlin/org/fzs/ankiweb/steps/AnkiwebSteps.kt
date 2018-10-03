package org.fzs.ankiweb.steps

import cucumber.api.DataTable
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import org.fzs.ankiweb.webpages.DecksPage
import org.fzs.ankiweb.webpages.EditPage
import org.fzs.ankiweb.webpages.LoginPage
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver


class AnkiwebSteps {

    private val driver: WebDriver = ChromeDriver()

    @Given("^I am at Ankiweb home page$")
    fun i_am_at_Ankiweb_home_page() {
        driver.get("https://ankiweb.net/account/login")
    }

    @Given("^I sign in with \"([^\"]*)\" and \"([^\"]*)\" credentials$")
    fun i_sign_in_with_and_credentials(id: String, pwd: String) {
        val loginPage = LoginPage(driver)
        loginPage.login(id, pwd)
    }

    @When("^I am ready to create cards$")
    fun i_am_ready_to_create_cards() {
        val decksPage = DecksPage(driver)
        decksPage.openAddPage()
    }

    @Then("^I create \"([^\"]*)\" deck with following cards$")
    fun i_create_deck_with_following_cards(deck: String, table: DataTable) {
        val editPage = EditPage(driver)
        table.asMap(String::class.java, String::class.java)
                .forEach { front, back ->
                    editPage.fill(deck, front, back)
                    editPage.save()
                    Thread.sleep(1_000) // to prevent (http error 429 Too Many Requests)
                }
        editPage.logout()
        driver.close()
    }
}