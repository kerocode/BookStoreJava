package com.bookstore;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by keroles5 on 12/27/16.
 */
public class Order {
    private  long OrderId ;
    private ArrayList<OrderItem> OrderItem ;
    private LocalDateTime OrderDate ;
    private BigDecimal Total ;
    private  int Quantity;

    public long getOrderId() {
        return OrderId;
    }

    public void setOrderId(long orderId) {
        OrderId = orderId;
    }

    public ArrayList<OrderItem> getOrderItem() {
        return OrderItem;
    }

    public void setOrderItem(ArrayList<OrderItem> orderItem) {
        OrderItem = orderItem;
    }

    public LocalDateTime getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        OrderDate = orderDate;
    }

    public BigDecimal getTotal() {
        return Total;
    }

    public void setTotal(BigDecimal total) {
        Total = total;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }
}
