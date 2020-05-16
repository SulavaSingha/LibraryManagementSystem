package com.library.Lib;

import com.library.Account.Account;

public class Librarian extends Account {
    public boolean addBookItem(BookItem bookItem){
      return true;
    }

    public boolean blockMember(Member member) {
        return true;
    }

    public boolean unBlockMember(Member member){
       return true;
    }

    public boolean resetPassword() {
        return false;
    }
}
