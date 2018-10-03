package org.fzs.ankiweb.webpages

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory

class EditPage(driver: WebDriver) {

    init {
        PageFactory.initElements(driver, this)
    }

    @FindBy(id = "deck")
    private val deckTxt: WebElement? = null

    @FindBy(id = "f0")
    private val frontTxt: WebElement? = null

    @FindBy(id = "f1")
    private val backTxt: WebElement? = null

    @FindBy(xpath = "//button[text()='Save']")
    private val saveButton: WebElement? = null

    @FindBy(xpath = "//a[text()='Log out']")
    private val logoutLink: WebElement? = null


    fun fill(deck: String, front: String, back: String) {
        deckTxt?.clear()
        deckTxt?.sendKeys(deck)
        frontTxt?.sendKeys(front)
        backTxt?.sendKeys(back)
    }

    fun save(){
        saveButton?.click()
    }
    fun logout(){
        logoutLink?.click()
    }
}