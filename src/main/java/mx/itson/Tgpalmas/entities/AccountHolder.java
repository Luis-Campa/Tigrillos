/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.Tgpalmas.entities;


import com.google.gson.annotations.SerializedName;

/**
 *
 * @author luisantoniocamparubio
 */
public class AccountHolder  {

    /** 
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /** Unique code identifying the account holder
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /** the full name of the account holder
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /** the address of the account holder
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /** the city where the account holder resides
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the taxpayerId
     */
    public String getTaxpayerId() {
        return taxpayerId;
    }

    /** the taxpayer identification number of the account holder
     * @param taxpayerId the taxpayerId to set
     */
    public void setTaxpayerId(String taxpayerId) {
        this.taxpayerId = taxpayerId;
    }

    /**
     * @return the zipCode
     */
    public String getZipCode() {
        return zipCode;
    }

    /** Sets the zip code for the address
     * @param zipCode The zip code to be assigned to the zipCode property
     */

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    private String code;
    private String name;
    private String address;
    private String city;
    @SerializedName("taxpayer-id")
    private String taxpayerId;
     @SerializedName("zip-code")
    private String zipCode;
     
     
     
    }
    
    

    
     

