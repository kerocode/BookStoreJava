package com.bookstore;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Created by keroles5 on 12/27/16.
 */
public class OrderItem {
    private  long OrderItemId ;
    private  long OrderId ;
    private  long UserId ;
    private  long BookId ;
    private  int Quantity ;
    private  LocalDateTime OrderDate;
    private  BigDecimal Price ;
    private  byte[] Version;

    public long getOrderItemId() {
        return OrderItemId;
    }

    public void setOrderItemId(long orderItemId) {
        OrderItemId = orderItemId;
    }

    public long getOrderId() {
        return OrderId;
    }

    public void setOrderId(long orderId) {
        OrderId = orderId;
    }

    public long getUserId() {
        return UserId;
    }

    public void setUserId(long userId) {
        UserId = userId;
    }

    public long getBookId() {
        return BookId;
    }

    public void setBookId(long bookId) {
        BookId = bookId;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public LocalDateTime getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        OrderDate = orderDate;
    }

    public BigDecimal getPrice() {
        return Price;
    }

    public void setPrice(BigDecimal price) {
        Price = price;
    }

    public byte[] getVersion() {
        return Version;
    }

    public void setVersion(byte[] version) {
        Version = version;
    }
}
