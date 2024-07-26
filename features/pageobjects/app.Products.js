const { $ } = require('@wdio/globals')


/**
 * Products page containing specific selectors and methods 
 */
class ProductsPage {

    /**
     * Products Title selector
     */
    get productsTitle(){
        return $('//android.view.ViewGroup[@content-desc="container header"]/android.widget.TextView')

    }
    
    /**
     * Verify Products Title Displayed
     */
    async verifyProductsTitle(){
        await (await this.productsTitle).waitForDisplayed()
        await expect(this.productsTitle).toHaveText('Products')
    }
   
}

module.exports = new ProductsPage();
