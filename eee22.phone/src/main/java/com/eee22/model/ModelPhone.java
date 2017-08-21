package com.eee22.model;

public class ModelPhone {
  private String name         ;// NVARCHAR(20)    NOT NULL 
  private String manufacturer ;// NVARCHAR(40)    NOT NULL 
  private Integer price        ;// INTEGER         DEFAULT 0 NOT NULL 
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public String getManufacturer() {
    return manufacturer;
}
public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
}
public Integer getPrice() {
    return price;
}
public void setPrice(Integer price) {
    this.price = price;
}
public ModelPhone(String name, String manufacturer, Integer price) {
    super();
    this.name = name;
    this.manufacturer = manufacturer;
    this.price = price;
}
public ModelPhone() {
    super();
}
@Override
public String toString() {
    return "ModelPhone [name=" + name + ", manufacturer=" + manufacturer
            + ", price=" + price + "]";
}
  
}
