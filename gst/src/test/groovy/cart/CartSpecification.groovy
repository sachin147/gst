package cart

import com.technogise.calculator.GstCalculator
import com.technogise.cart.domain.Cart
import com.technogise.cart.service.CartService
import com.technogise.item.domain.Item
import com.technogise.product.domain.ProductCategory
import com.technogise.tax.domain.TaxRate
import com.technogise.tax.domain.TaxRateC
import spock.lang.Specification

class CartSpecification extends Specification {

    CartService cartService
    GstCalculator gstCalculator

    void setup() {
        gstCalculator = new GstCalculator()
        cartService = new CartService(gstCalculator)
    }

    def "should print bill"() {
        given:

        ProductCategory productCategory = new ProductCategory()
        TaxRate taxRate = new TaxRateC()
        productCategory.setTaxRate(taxRate)
        Item item = new Item("Mobile", 5000, productCategory)

        Map<Integer, Item> itemMap = new HashMap<>()
        itemMap.put(2, item)
        Cart cart = new Cart(itemMap)

        when:
        String result = cartService.printBill(cart)

        then:
        result

    }
}
