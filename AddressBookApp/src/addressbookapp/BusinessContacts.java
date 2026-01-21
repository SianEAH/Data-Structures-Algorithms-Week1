/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package addressbookapp;

/**
 *
 * @author siane
 */
public class BusinessContacts extends AddressBook {
    //private data members
    private String companyName, type;
    
    //constructor
    public BusinessContacts(String fName, String sName, String email, String phone, String address, String companyName, String type) {
        super(fName, sName, email, phone, address);
        this.companyName = companyName;
        this.type = type;
    }
    
    //setters
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    //methods
    
    //getters
     public String getCompanyName() {
        return companyName;
    }

    public String getType() {
        return type;
    }
    
    //my other methods
     //Back to String
    @Override
    public String toString() {
    return "Contact: \n" + "Name: " + fName + " " + sName + "\nCompany Name: " + companyName + "\n Email: " + email + "\n Phone Number: " + phone + "\n Type of Contact: " + type + "\n Address: " + address;
}
    
}
