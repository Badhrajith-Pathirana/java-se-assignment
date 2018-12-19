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
import java.util.Date;
public class Event {
    private int eId;
    private Date edate;
    private String EType;
    private String customerNic;
    private int packageId;
    
    //Date firstDate = new Date();

    public Event(int eId, Date edate, String EType, String customerNic, int packageId) {
        this.eId = eId;
        this.edate = edate;
        this.EType = EType;
        this.customerNic = customerNic;
        this.packageId = packageId;
    }

    public Event(){
        eId = 000;
        edate = new Date(2018,12,06);
        EType = "Business event";      
    }
    public void setEId(int eId){
        this.eId = eId;
    }
    public void setEDate(Date edate){
        this.edate = edate;
    }
    public void setPackageType(String EType){
        this.EType = EType;
    }
    public int getEId(){
        return eId;
    }
    public Date getEDate(){
        return edate;
    }
    public String getEType(){
        return EType;
    }

    public String getCustomerNic() {
        return customerNic;
    }

    public void setCustomerNic(String customerNic) {
        this.customerNic = customerNic;
    }

    public int getPackageId() {
        return packageId;
    }

    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }
}
