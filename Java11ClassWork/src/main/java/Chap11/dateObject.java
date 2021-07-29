/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap11;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 *
 * @author jaden
 */
public class dateObject {
    public static void main(String[] args) {
          
          LocalDateTime myDate = LocalDateTime.now();
//        MinguoDate mDate = MinguoDate.from(myDate);
//        System.out.println("Minguo date: " + myDate);

//          myDate = myDate.minusMonths(13);
//          myDate = myDate.plusDays(70);
//          
//          System.out.println(myDate);

//        String sdate =
//                myDate.format(DateTimeFormatter.ISO_DATE_TIME);
//        System.out.println("Date in ISO_DATE_TIME format: " + sdate);
          
          String fDate =
                  myDate.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
          System.out.println("Formatted with MEDIUM FormatStyle " + fDate);
          
    }
}
