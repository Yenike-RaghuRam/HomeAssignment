const { $ } = require('@wdio/globals')

/**
 * Common Items across all Pages and their selectors and methods 
 */
class CommonItems{

     /**
     * menuItem selector
     */
    get menuItem(){
        return $('~open menu')
    }

     /**
     * click On Menu
     */
    async clickOnMenu(){
        await (await this.menuItem).waitForDisplayed()
        await this.menuItem.click()
    }

}
module.exports = new CommonItems()