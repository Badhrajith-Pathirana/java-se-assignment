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
    
    //Date firstDate = new Date();
    public Event(int eId,Date edate,String EType){
        this.eId = eId;
        this.edate = edate;
        this.EType = EType;
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
}
