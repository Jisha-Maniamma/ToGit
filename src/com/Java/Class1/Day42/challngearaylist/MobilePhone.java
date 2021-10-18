package com.Java.Class1.Day42.challngearaylist;

import java.util.ArrayList;
import java.util.List;

public class MobilePhone {


    private List<contacts> myContacts;

    public MobilePhone(){
        myContacts=new ArrayList<>();
    }
    // Able to store, modify, remove and query contact names.

    public void StoreConatct(String name,String number){
        contacts newContact=new contacts(name,number);
       if( !findContact(newContact)){
           myContacts.add(newContact);
       }
    }

    private boolean findContact(contacts cont){
        if(myContacts.indexOf(cont)>=0){
            //contains
            return true;
        }
        else{
            //dsnt contain
            return false;
        }
    }
    public void modifyContact(){

    }
    public void removeContact(){

    }
    public void queryContact(){

    }
}
