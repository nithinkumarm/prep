package com.nithin.core;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: Nithin Kumar
 * Date: 10/6/13
 * Time: 10:43 AM
 * To change this template use File | Settings | File Templates.
 */
public class StorableItem implements Comparable<StorableItem> {

    private String name;
    private String author;
    private String publisher;
    private int publishedYear;
    private String category;
    private String subCategory;
    private double price;
    private int count;
    private String[] indexes;

    @Override
    public String toString() {
        return "StorableItem{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", publishedYear=" + publishedYear +
                ", category='" + category + '\'' +
                ", subCategory='" + subCategory + '\'' +
                ", price=" + price +
                ", count=" + count +
                '}';
    }

    public StorableItem(String name, String author, String publisher, int publishedYear, double price) {

        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.publishedYear = (short) publishedYear;
        this.price = price;
        count = 1;
        indexes = new String[]{name};
    }

    public StorableItem(String name, String author, String publisher, int publishedYear, String category, String subCategory, double price) {
        this(name, author, publisher, publishedYear, price);
        this.category = category;
        this.subCategory = subCategory;
    }

    public StorableItem(String name, String author, String publisher, int publishedYear, String category, String subCategory, double price, int count) {
        this(name, author, publisher, publishedYear, category, subCategory,price);
        this.count = count;
    }

    @Override
    public int compareTo(StorableItem o) {

        String[] this_fields = new String[] { name, author, publisher, category, subCategory };
        String[] o_fields =  new String[] { name, author, publisher, category, subCategory };

        int c;
        for(int i=0; i<this_fields.length; i++) {
            c = this_fields[i].compareTo(o_fields[i]);
            if(c!=0)
                return c;
        }

        if(publishedYear != o.publishedYear)
            return new Integer(publishedYear).compareTo(o.publishedYear);

        if(price != o.price)
            return new Double(price).compareTo(price);

        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    public void setIndexes(String ...args) {

        if(args == null)
            return;

        indexes = args;
    }

    public String[] getIndexes() {
        return Arrays.copyOf(indexes, indexes.length);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(short publishedYear) {
        this.publishedYear = publishedYear;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}
