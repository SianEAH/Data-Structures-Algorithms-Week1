/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package addressbookapp;

import java.io.Serializable;

/**
 *
 * @author siane
 */
public class AddressBook implements Serializable {
    //private data members
    protected String fName, sName, email, phone, address;
    
    //constructor
    public AddressBook(String fName, String sName, String email, String phone, String address) {
        this.fName = fName;
        this.sName = sName;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }
    
    //setters: one for each input
    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    //methods
    
    //getters: one for each output
     public String getfName() {
        return fName;
    }

    public String getsName() {
        return sName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }
    
    //my other methods
    
    //Back to String
    @Override
    public String toString() {
    return "Contact: \n" + "Name: " + fName + " " + sName + "\n Email: " + email + "\n Phone Number: " + phone + "\n Address: " + address;
}
    
}
