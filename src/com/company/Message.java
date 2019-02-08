package com.company;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;

public class Message {

    public String phoneNumber;
    public String textMessage;

    public Message(String a, String b){

        phoneNumber = a;
        textMessage = b;

    }

    public void displayText(){

        ArrayList textLog = new ArrayList();

            textLog.add(new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime()));
            textLog.add(phoneNumber);
            textLog.add(textMessage);
            System.out.println("This message was recieved at " + textLog.get(0));
            System.out.println(" it was recieved from " + textLog.get(1));
            System.out.println(": " + textLog.get(2));

    }


}
