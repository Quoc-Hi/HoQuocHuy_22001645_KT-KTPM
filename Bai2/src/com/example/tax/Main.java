package com.example.tax;

import com.example.tax.context.Product;
import com.example.tax.decorator.EnvironmentalTax;
import com.example.tax.decorator.ServiceTax;
import com.example.tax.state.DiscountState;
import com.example.tax.state.LuxuryState;
import com.example.tax.strategy.VATTax;

public class Main {
    public static void main(String[] args) {

        Product product = new Product(100, new VATTax());

        // State: giảm giá
        product.setState(new DiscountState());

        // Decorator: thêm thuế/phí
        product = new EnvironmentalTax(product);
        product = new ServiceTax(product);

        System.out.println("Thuế (giảm giá): " + product.calculateTax());

        // Đổi trạng thái sang hàng xa xỉ
        product.setState(new LuxuryState());
        System.out.println("Thuế (xa xỉ): " + product.calculateTax());
    }
}