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
public class Package {
    
    private String pType;
    private int pId;
    private double price;
    
    
    
    public Package(String pType,int pId,double price){
        this.pType = pType;
        this.pId  = pId;
        this.price = price;
    }
    public Package(){
    }

    public String getpType() {
        return pType;
    }

    public void setpType(String pType) {
        this.pType = pType;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
