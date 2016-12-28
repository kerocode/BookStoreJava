package com.bookstore;

/**
 * Created by keroles5 on 12/27/16.
 */
public class Category {
    private  long CategoryId ;
    private  String Name ;
    private  String Description ;

    public long getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(long categoryId) {
        CategoryId = categoryId;
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
}
