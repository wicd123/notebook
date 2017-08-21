package com.eee22.model;

public class ModelPhone {
  private String phname         ;// NVARCHAR(20)    NOT NULL 
  private String phfactory ;// NVARCHAR(40)    NOT NULL 
  private Integer phprice        ;// INTEGER         DEFAULT 0 NOT NULL 
public String getphname() {
    return phname;
}
public void setphname(String phname) {
    this.phname = phname;
}
public String getphfactory() {
    return phfactory;
}
public void setphfactory(String phfactory) {
    this.phfactory = phfactory;
}
public Integer getphprice() {
    return phprice;
}
public void setphprice(Integer phprice) {
    this.phprice = phprice;
}
public ModelPhone(String phname, String phfactory, Integer phprice) {
    super();
    this.phname = phname;
    this.phfactory = phfactory;
    this.phprice = phprice;
}
public ModelPhone() {
    super();
}
@Override
public String toString() {
    return "ModelPhone [phname=" + phname + ", phfactory=" + phfactory
            + ", phprice=" + phprice + "]";
}
  
}
