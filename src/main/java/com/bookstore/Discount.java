package com.bookstore;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by keroles5 on 12/27/16.
 */
public class Discount {
    private  long DiscountId ;
    private  ArrayList<Book> books;
    private  String Name;
    private  String Description;
    private  LocalDateTime ValidUntil;
    private  LocalDateTime CreatedAt;
    private  boolean IsEnabled;

    public long getDiscountId() {
        return DiscountId;
    }

    public void setDiscountId(long discountId) {
        DiscountId = discountId;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
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

    public LocalDateTime getValidUntil() {
        return ValidUntil;
    }

    public void setValidUntil(LocalDateTime validUntil) {
        ValidUntil = validUntil;
    }

    public LocalDateTime getCreatedAt() {
        return CreatedAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        CreatedAt = createdAt;
    }

    public boolean isEnabled() {
        return IsEnabled;
    }

    public void setEnabled(boolean enabled) {
        IsEnabled = enabled;
    }
}
