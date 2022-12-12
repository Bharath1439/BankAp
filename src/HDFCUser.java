import java.util.UUID;

public class HDFCUser implements BankApplication{

    public String Name;

    private String AccountNum;

    private int balance;

    private static  double InterestRate=1.5;

    public String password;


    public void Createpass(String password){
        this.password=password;
    }

    public HDFCUser(String name, int balance){
        this.Name = name;
        this.balance = balance;
        this.AccountNum= String.valueOf(UUID.randomUUID());
    }

    public String getAccountNum() {
        return AccountNum;
    }



    public int getBalance() {
        return balance;
    }



    @Override
    public int CheckBalance() {

        return balance;
    }

    @Override
    public String AddMoney(int Money) {
        balance=balance+Money;
        return "money added sucessfully";
    }



    @Override
    public String WithDrawMoney(int Money, String enterpass) {
        if(password.equals(enterpass)) {
            if (Money > balance) {
                return "please enter money leass than balance";
            } else {
                balance = balance - Money;
                return "Money debitted sucessfully";
            }
        }
        else{
            return"please enter correct password";
        }

    }

    @Override
    public double CalculateInterest(int years) {
        double Interest=years*balance*InterestRate;
        return Interest;
    }
}
