package za.ac.cput.Factory;
import za.ac.cput.domain.OrderLine;

import za.ac.cput.util.Helper;

public class OrderLineFactory {
    public static OrderLine createOrderLine(String orderLineId, String orderId, String productId, int quantity, double unitPrice, int discountId) {
        if (Helper.isNullOrEmpty(orderLineId) || Helper.isNullOrEmpty(orderId) || Helper.isNullOrEmpty(productId)) {
            return null;
        }


        double subTotal = Helper.calculateSubTotal(quantity, unitPrice);




        return new OrderLine.Builder()
                .setOrderLineId(orderLineId)
                .setOrderId(orderId)
                .setProductId(productId)
                .setQuantity(quantity)
                .setUnitPrice(unitPrice)
                .setSubTotal(subTotal)
                .setDiscountId(discountId)
                .build();
    }
    public static OrderLine createOrderLine(String orderLineId, String orderId, String productId) {
        if (Helper.isNullOrEmpty(orderLineId) || Helper.isNullOrEmpty(orderId) || Helper.isNullOrEmpty(productId)) {
            return null;
        }


        return new OrderLine.Builder()
                .setOrderLineId(orderLineId)
                .setOrderId(orderId)
                .setProductId(productId)
                .build();
    }
}
