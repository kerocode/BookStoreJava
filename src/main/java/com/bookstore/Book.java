package com.bookstore;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Created by keroles5 on 12/27/16.
 */
public class Book {
        private   long BookId;
        private   long  DiscountId ;
        private  Category Category;

    public Category getCategory() {
        return Category;
    }

    public void setCategory(Category category) {
        Category = category;
    }

    private  String Name ;
        private  String Description ;
        private  LocalDateTime PublishData ;
        private  LocalDateTime CreatedAt ;
        private  BigDecimal Price ;
        private  boolean IsEnabled ;

    public long getBookId() {
        return BookId;
    }

    public void setBookId(long bookId) {
        BookId = bookId;
    }

    public long getDiscountId() {
        return DiscountId;
    }

    public void setDiscountId(long discountId) {
        DiscountId = discountId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public LocalDateTime getPublishData() {
        return PublishData;
    }

    public void setPublishData(LocalDateTime publishData) {
        PublishData = publishData;
    }

    public LocalDateTime getCreatedAt() {
        return CreatedAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        CreatedAt = createdAt;
    }

    public BigDecimal getPrice() {
        return Price;
    }

    public void setPrice(BigDecimal price) {
        Price = price;
    }

    public boolean isEnabled() {
        return IsEnabled;
    }

    public void setEnabled(boolean enabled) {
        IsEnabled = enabled;
    }
}
