const { Given, When, Then } = require('@wdio/cucumber-framework');

const AppLoginPage = require('../pageobjects/app.Login');
const CommonItems = require('../pageobjects/app.Common')
const Menu = require('../pageobjects/app.Menu')




Given(/^User is in Login Page$/, async()=> {

    if(!await AppLoginPage.isLoginPageDisplayed()){
        CommonItems.clickOnMenu()
        Menu.clickOnLogin()
    }

})

When(/^User enter username (.*)$/, async (username) =>{
    AppLoginPage.setUserName(username)
});

When(/^User enter password (.*)$/, async (password) =>{
    await AppLoginPage.setPassword(password)
});

When(/^Click on Login Button$/, async () =>{
    await AppLoginPage.clickLoginButton()
});

Then(/^Verify that (.*) is displayed$/, async (message) =>{
    await AppLoginPage.validateMessage(message)
});


Given(/^I am on the login page (.*) and (.*) and (.*)$/, async (username, password, message) => {


    await (await $('~open menu')).waitForDisplayed()
    await $('~open menu').click()

    // driver.pause(40000)
    await (await $('~menu item log in')).waitForDisplayed()
    await $('~menu item log in').click()

    
    await AppLoginPage.login(username, password, message)
    // driver.pause(5000)
    

    // await (await $('~Username input field')).waitForDisplayed()
    // await $('~Username input field').setValue(username)

    // await (await $('~Password input field')).waitForDisplayed()
    // await $('~Password input field').setValue(password)

    // await (await $('~Login button')).waitForDisplayed()
    // await (await $('~Login button')).click()

    // await (await $('//android.view.ViewGroup[@content-desc="generic-error-message"]/android.widget.TextView')).waitForDisplayed
    // await expect(await $('//android.view.ViewGroup[@content-desc="generic-error-message"]/android.widget.TextView')).toHaveText(message)
    
    
});


