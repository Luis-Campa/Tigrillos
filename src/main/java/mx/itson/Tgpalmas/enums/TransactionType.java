/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package mx.itson.Tgpalmas.enums;

import com.google.gson.annotations.SerializedName;

/**
 * Represents different transaction Types
 * @author luisantoniocamparubio
 */
public enum TransactionType {
  @SerializedName("1")  
          /**income financial movement
           * @param INCOME option 1 of transaction type
           */
   INCOME,
  @SerializedName("2")
          /** expense financial movement
           * @param EXPENSE option 2 of transaction type
           */
   EXPENSE
    
}
