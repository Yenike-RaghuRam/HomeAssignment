const { $ } = require('@wdio/globals')

/**
 * Menu page containing specific selectors and methods 
 */
class AppMenu{

     /**
     * Login selector
     */
       get Login(){
        return $('~menu item log in')
    }    

     /**
     * click On Login
     */
    async clickOnLogin(){
        await (await this.Login).waitForDisplayed()
        await this.Login.click()
    }
 

}
module.exports = new AppMenu()