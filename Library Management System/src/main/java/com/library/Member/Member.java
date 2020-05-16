package com.library.Member;

import com.library.Account.Account;
//import org.joda.time;

public class Member extends Account {
   // private DateTime dateOfMembership;
    private int totalBooksCheckedout;


    public boolean resetPassword() {
        return false;
    }
}
