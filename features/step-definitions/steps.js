const { Given, When, Then } = require('@wdio/cucumber-framework');

const AppLoginPage = require('../pageobjects/app.Login');
const CommonItems = require('../pageobjects/app.Common')
const Menu = require('../pageobjects/app.Menu')


Given(/^User is in Login Page$/, async()=> {

    if(!await AppLoginPage.isLoginPageDisplayed()){
        await CommonItems.clickOnMenu()
        await Menu.clickOnLogin()
    }

})

When(/^User enters username (.*) and password (.*)$/, async (username, password) =>{
    await AppLoginPage.setUserName(username)
    await AppLoginPage.setPassword(password)
});

When(/^Click on Login Button$/, async () =>{
    await AppLoginPage.clickLoginButton()
});

Then(/^Verify that (.*) is displayed$/, async (message) =>{
    await AppLoginPage.validateMessage(message)
});