package TestDay07;

public class TestAccount {
    public static void main(String[] args) {

    }
}

//银行账户
class Accout{
    //ID 余额 密码
    private long id;
    private double balance;
    private String password;

    //构造方法
    public Accout(){

    }
    public Accout(long id,double balance,String password){
        this.id=id;
        this.balance=balance;
        this.password=password;
    }

    //get set方法
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return null;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

//储蓄用户
class SavingAccount extends Accout{
    //存款利率
    private double interestRate;

    //构造方法
    public SavingAccount(double interestRate){
        this.interestRate=interestRate;
    }

    //get set方法
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        if(interestRate>0&&interestRate<0.1){
            this.interestRate = interestRate;
        }
    }
}

//信用账户
class CreditAccount extends Accout{
    //信用额度
    private double creditLine;

    //构造方法
    public CreditAccount(double creditLine){
        this.creditLine=creditLine;
    }

    //get set方法
    public double getCreditLine() {
        return creditLine;
    }

    public void setCreditLine(double creditLine) {
        this.creditLine = creditLine;
    }
}
