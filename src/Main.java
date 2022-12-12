import java.util.*;

public class Main {
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.print("For SBI Account press-0,For HDFC Account press-1");

        String name=sc.nextLine();
        int amount=sc.nextInt();
        int press=sc.nextInt();
        if(press==0){
            SbiUser obj1=new SbiUser(name,amount);
            double Interest=obj1.CalculateInterest(5);
            int money=sc.nextInt();
            String m=obj1.AddMoney(money);
            String password=sc.next();
            obj1.Createpass(password);
            
            System.out.print(m);
            int x=obj1.getBalance();
            System.out.println(x);
            System.out.println(Interest);
        }
        else if(press==1) {
            HDFCUser obj1 = new HDFCUser(name, amount);
            double Interest=obj1.CalculateInterest(3);
            int money=sc.nextInt();
            String m=obj1.AddMoney(money);
            System.out.print(m);
            int x=obj1.getBalance();
            System.out.println(x);
            System.out.println(Interest);
        }


    }
}