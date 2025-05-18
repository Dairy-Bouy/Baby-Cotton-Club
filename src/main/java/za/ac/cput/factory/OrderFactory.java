/*
OrderFactory Class
Author: Tsireledzo Netshilonwe
Student Number: 230666426
Date: 2025/05/10
*/
package za.ac.cput.factory;


import za.ac.cput.domain.Order;
import za.ac.cput.util.Helper;

import java.time.LocalDate;

public class OrderFactory {

    public static Order createOrder(String orderId, String customerId, String orderDate, double totalAmount, int discountId) {

        if (Helper.isNullOrEmpty(orderId) || Helper.isNullOrEmpty(customerId)) {
            return null;
        }

        LocalDate date = Helper.isValidDate(orderDate);
        if (date == null) {
            return null;
        }

        return new Order.Builder()
                .setOrderId(orderId)
                .setCustomerId(customerId)
                .setOrderDate(date)
                .setTotalAmount(totalAmount)
                .setDiscountId(discountId)
                .build();
    }
}
