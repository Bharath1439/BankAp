import java.util.UUID;

public class SbiUser implements BankApplication {


    //Attributes should bankAccount have
    public String Name;

    private String AccountNum;

    private int balance;


    private static Double InterestRate=2.0;

    private String password;


    public void Createpass(String password){
        this.password=password;
    }

    public SbiUser(String name, int balance) {
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
        return "Amonut added succesfully";
    }

    @Override
    public String WithDrawMoney(int Money,String enterpass) {
        if(password==enterpass) {

            if (Money > balance) {
                return "please enter amount less than balance";
            } else {
                balance = balance - Money;
                return "Money is Debited  ";
            }
        }else{
            return"please enter correct passord";
        }

    }

    @Override
    public double CalculateInterest(int years) {
        Double Interest=balance*years*InterestRate;
        return Interest;
    }
}
