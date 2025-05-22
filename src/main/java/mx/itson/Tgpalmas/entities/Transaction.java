/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.Tgpalmas.entities;

import java.util.Date;
import mx.itson.Tgpalmas.enums.TransactionType;

/**
 *
 * @author luisantoniocamparubio
 */
public class Transaction {

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**the date the transaction occurred
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    
    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**A description of the transaction occurred
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the reference
     */
    public String getReference() {
        return reference;
    }

    /** A reference code for the transaction
     * @param reference the reference to set
     */
    public void setReference(String reference) {
        this.reference = reference;
    }

    /**
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /** the amount involved un the transaction
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * @return the type
     */
    public TransactionType getType() {
        return type;
    }

    /** Sets the transaction type for this Instance
     * @param type The transaction type to be assigned
     */
    public void setType(TransactionType type) {
        this.type = type;
    }
    private Date date;
    private String description;
    private String reference;
    private double amount;
    private TransactionType type;
    
}
