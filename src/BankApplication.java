public interface BankApplication {
      int CheckBalance();

      String AddMoney(int Money);

      String WithDrawMoney(int Money, String enterpass);

      double CalculateInterest(int years);
}
