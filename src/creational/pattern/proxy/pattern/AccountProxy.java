package creational.pattern.proxy.pattern;

public class AccountProxy implements Operation{


    private String mUserName;
    private String mPassword;
    private boolean mIsAdmin;
    private boolean mIsValidUser;
    private Account mAccount;

    public AccountProxy(String pUserName, String pPassword) {
        mUserName           = pUserName;
        mPassword           = pPassword;
        if (mUserName.equals("Divy")&& mPassword.equals("1234")){
            mAccount        = new Account();
            mIsValidUser    = true;
        }else if (mUserName.equals("Simon")&& mPassword.equals("5678")){
            mAccount        = new Account();
            mIsValidUser    = true;
            mIsAdmin        = true;
        }
    }

    @Override
    public void create() {
        if(mIsAdmin){
            mAccount.create();
        }else {
            System.out.println("Sorry you are not authorized to create and account");
        }
    }

    @Override
    public void modify() {
        if(mIsAdmin){
            mAccount.modify();
        }else {
            System.out.println("Sorry you are not authorized to modify the account");
        }
    }

    @Override
    public void deposit() {
        if(mIsAdmin|| mIsValidUser){
            mAccount.deposit();
        }else {
            System.out.println("Sorry you are not authorized to deposit");
        }
    }

    @Override
    public void withdraw() {
        if(mIsAdmin|| mIsValidUser){
            mAccount.withdraw();
        }else {
            System.out.println("Sorry you are not authorized to withdraw");
        }
    }

    @Override
    public void transfer() {
        if(mIsAdmin|| mIsValidUser){
            mAccount.transfer();
        }else {
            System.out.println("Sorry you are not authorized to transfer");
        }
    }

    @Override
    public void delete() {
        if(mIsAdmin){
            mAccount.delete();
        }else {
            System.out.println("Sorry you are not authorized to Delete");
        }
    }
}
