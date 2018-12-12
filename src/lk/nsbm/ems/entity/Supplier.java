/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.nsbm.ems.entity;

/**
 *
 * @author manjula
 */
public class Supplier {
    private int sId;
    private String sName;
    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private String contact;
    
    public Supplier(int sId,String sName,String addressLine1,String addressLine2,String addressLine3,String contact){
        this.sId = sId;
        this.sName = sName;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.addressLine3 = addressLine3;
        this.contact = contact;
    }
    public Supplier(){
        
    }
    public void setSId(int sId){
        this.sId = sId;
    }
    public void setSName(String sName){
        this.sName = sName;
    }
    public void setAddressLine1(String addressLine1){
        this.addressLine1 = addressLine1;
    }
    public void setAddressLine2(String addressLine2){
        this.addressLine2 = addressLine2;
    }
    public void setAddressLine3(String addressLine3){
        this.addressLine3 = addressLine3;
    }
    public void setContact(String contact){
        this.contact = contact;
    }
    public int getId(){
        return sId;
    }
    public String getsName(){
        return sName;
    }
    public String getAddressLine1(){
        return addressLine1;
    }
    public String getAddressLine2(){
        return addressLine2;
    }
    public String getAddressLine3(){
        return addressLine3;
    }
    public String getContact(){
        return contact;
    }
    
}
