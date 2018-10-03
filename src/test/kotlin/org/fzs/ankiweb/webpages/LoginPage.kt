package org.fzs.ankiweb.webpages

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory

class LoginPage(driver: WebDriver){
    @FindBy(id = "email")
    private val emailTxt: WebElement? = null

    @FindBy(id = "password")
    private val passwordTxt: WebElement? = null

    @FindBy(xpath = ".//*[@id='form']/div[3]/input")
    private val loginButton: WebElement? = null

    init {
        PageFactory.initElements(driver, this)
    }

    fun login(email:String, password:String){
        emailTxt?.sendKeys(email)
        passwordTxt?.sendKeys(password)
        loginButton?.click()
    }

}