const { $ } = require('@wdio/globals')
const productsPage = require('../pageobjects/app.Products')

/**
 * AppLogin page containing specific selectors and methods 
 */
class AppLoginPage {
    /**
     * input UserName selector
     */
    get inputUsername () {
        return $('~Username input field')
    }

    /**
     * input Password selector
     */
    get inputPassword () {
        return $('~Password input field')
    }

    /**
     * Login Button selector
     */
    get btnLogin () {
        return $('~Login button')
    }

    /**
     * No UserName Error selector
     */
    get noUserNameError() {
        return $('//android.view.ViewGroup[@content-desc="Username-error-message"]/android.widget.TextView')
    }

    /**
     * No Password Error selector
     */
    get noPasswordError() {
        return $('//android.view.ViewGroup[@content-desc="Password-error-message"]/android.widget.TextView')
    }

    /**
     * Generic Error selector
     */
    get genericError() {
        return $('//android.view.ViewGroup[@content-desc="generic-error-message"]/android.widget.TextView')

    }

   
    /**
     * Set User Name
     */    
    async setUserName(username) {
        this.username = username;
        await (await this.inputUsername).waitForDisplayed()
        await this.inputUsername.setValue(username)
    }

    /**
     * Set Password
     */  
    async setPassword(password) {
        this.password = password;
        await (await this.inputPassword).waitForDisplayed()
        await this.inputPassword.setValue(password);
    }

    /**
     * Click On Login Button
     */  
    async clickLoginButton() {
        await (await this.btnLogin).waitForDisplayed()
        await this.btnLogin.click()
    }

   
    /**
     * is Login Page Displayed
     */  
    async isLoginPageDisplayed(){
        return await (await this.inputUsername).isDisplayed()
    }

    /**
     * Validation of login messages
     */  
    async validateMessage(message) {
        if(!this.username){
            await (await this.noUserNameError).waitForDisplayed()
            await expect(this.noUserNameError).toHaveText(message)
        } else if(!this.password){
            await (await this.noPasswordError).waitForDisplayed()
            await expect(this.noPasswordError).toHaveText(message)
        } else if(message !== "Products"){
            await (await this.genericError).waitForDisplayed()
            await expect(this.genericError).toHaveText(message)
        } else {
            productsPage.verifyProductsTitle()
        }
    }

    /**
     * Login method to do all operations at once
     */
    async login (username, password, message) {
        await this.setUserName(username)
        await this.setPassword(password)
        await this.clickLoginButton()
        await this.validateMessage(message)
    }

}

module.exports = new AppLoginPage();
