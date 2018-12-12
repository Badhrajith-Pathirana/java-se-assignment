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
public class Customer {
    private String NIC;
    private String name;
    private String Address;
    private String contact;
    
    public Customer(String NIC,String name,String Address,String contact){
        this.NIC = NIC;
        this.name = name;
        this.Address = Address;
        this.contact = contact;
    }
    public Customer(){
        NIC = "default id";
        name = "default name";
        Address = "default address";
        contact = "default contact";
    }
    public void setNIC(String NIC){
        this.NIC = NIC; 
    }
    public void setName(String name){
        this.name = name; 
    }
    public void setAddress(String Address){
        this.Address = Address; 
    }
    public void setContact(String contact){
        this.contact = contact; 
    }
    public String getNIC(){
        return NIC;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return Address;
    }
    public String getContact(){
        return contact;
    }
}
