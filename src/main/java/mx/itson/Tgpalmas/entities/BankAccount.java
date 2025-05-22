/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.Tgpalmas.entities;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luisantoniocamparubio
 */
public class BankAccount {

    /**
     * @return the accountHolder
     */
    public AccountHolder getAccountHolder() {
        return accountHolder;
    }

    /**
     * @param accountHolder the accountHolder to set
     */
    public void setAccountHolder(AccountHolder accountHolder) {
        this.accountHolder = accountHolder;
    }

    /**
     * @return the product
     */
    public String getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(String product) {
        this.product = product;
    }

    /**
     * @return the accountNumber
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * @param accountNumber the accountNumber to set
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * @return the currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * @param currency the currency to set
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

  
    /**
     * @return the transactions
     */
    public List<Transaction> getTransactions() {
        return transactions;
    }

    /** Sets the list of transactations for this Instance
     * @param transactions The list of transactions to be assigned
     */
    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }
    private String product;
    @SerializedName("account-number")
    private String accountNumber;
    private String currency;
    @SerializedName("account-holder")
    private AccountHolder accountHolder;
    private List<Transaction> transactions;
    
    /**
     * Deserializes a BankAccount object from JSON String.
     * @param json the JSON string containing the bank account data.
     * @return A BankAccount object with the deserialized data, 
     * or a new instance in case of an error
     */
   
    public static BankAccount desearelizar(String json){
       
        BankAccount a = new BankAccount();
        try{
            Gson gson = new Gson();
            a = gson.fromJson(json, BankAccount.class);
        }catch (Exception ex){
            System.out.println("Error"+ ex.getMessage());
        }
        return a;

    }
}
