package creational.pattern.builder.pattern;


import org.w3c.dom.stylesheets.LinkStyle;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Builder pattern is used to reduce the complexity of object creation.Just think that you class with value
 * and you you are using constructor to initialize the value. in this case we have to very conscious while creating on object
 * we have to give the argument in same order. here there is chance that we can make mistake.
 * for example: instead of sending first name we could send last name
 *
 * And just think that we out of 10 value we need only 3 values required but still we have to send other values as null.
 * So here in Builder pattern we can create on object with required field that is one of the biggest advantage
 *
 * In Builder pattern we have to follow certain rules
 * 1)Create static inner class Ends with builder
 * 2)Outer class constructor should be private
 * 3)Create build method in inner class where we can create object of outer class
 */
class Bank {

    private int accountNumber;
    private String accountName;
    private String bankName;
    private String ifscCode;
    private String branch;

    private Bank(){}
    private Bank(BankBuilder pBankBuilder) {
        accountNumber   = pBankBuilder.accountNumber;
        accountName     = pBankBuilder.accountName;
        bankName        = pBankBuilder.bankName;
        ifscCode        = pBankBuilder.ifscCode;
        branch          = pBankBuilder.branch;
    }

    /**
     * This method is used to display the Bank details
     */
    public void show(){
        if (accountName!=null)
            System.out.println("Account name "+accountName);
        if (bankName!=null)
            System.out.println("Bank name "+bankName);
        if (ifscCode!=null)
            System.out.println("IFSC CODE "+ifscCode);
        if (branch!=null)
            System.out.println("Branch "+branch);
    }

    public static class BankBuilder{
        private int accountNumber;
        private String accountName;
        private String bankName;
        private String ifscCode;
        private String branch;

        public BankBuilder(int accountNumber) {
            this.accountNumber = accountNumber;
        }

        public BankBuilder setAccountName(String pAccountName){
            accountName = pAccountName;
            return this;
        }
        public BankBuilder setBank(String pSetBank){
            bankName = pSetBank;
            return this;
        }
        public BankBuilder setIfscCode(String pSetIfscCode){
            ifscCode = pSetIfscCode;
            return this;
        }
        public BankBuilder setBranch(String pSetBranch){
            branch = pSetBranch;
            return this;
        }
        public Bank build(){
            return new Bank(this);
        }
    }

}

class Demo {

    public static void main(String[] args) {

        Bank.BankBuilder bankBuilder = new Bank.BankBuilder(1912983);
        bankBuilder.setAccountName("Divyanathan");
        bankBuilder.setBank("ICICI");
        bankBuilder.setBranch("Chennai");
        bankBuilder.setIfscCode("ICC00034ND");

        Bank lBank = bankBuilder.build();
        lBank.show();
    }
}
