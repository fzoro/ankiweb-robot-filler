package org.fzs.ankiweb.webpages

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory

class DecksPage(driver: WebDriver) {
    @FindBy(xpath = "//a[text()='Add']")
    private val addLink: WebElement? = null

    init {
        PageFactory.initElements(driver, this)
    }

    fun openAddPage() {
        addLink?.click()
    }
}