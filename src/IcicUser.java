public class IcicUser implements BankApplication{

    public String name;

    private String  AccountNum;

    private int Balance;

    public int InterestRate;


    public IcicUser(String name, int balance) {
        this.name = name;
        Balance = balance;
        //this
    }

    public String getAccountNumber() {
        return AccountNum;
    }


    public int getBalance() {
        return Balance;
    }



    @Override
    public int CheckBalance() {
        return 0;
    }

    @Override
    public String AddMoney(int Money) {
        return null;
    }

    @Override
    public String WithDrawMoney(int Money,String password) {
        return null;
    }

    @Override
    public double CalculateInterest(int years) {
        return 0;
    }
}
