package sanskriti;

public class Main {
    private static int DepositedMoney;
	private static String Email;
	private static String PhoneNumber;
	private static String Number;
	private static double Balance;
	private static String Name;
	private static int WithdrawalMoney;

	public static void main(String args[]){

        Account SanskritisAccount = new Account(Number="12323", Balance=0.0, Name="xyz",
                Email="sanskriti@xyz.com", PhoneNumber="12121");

       SanskritisAccount.DepositMoney(DepositedMoney=100);
       SanskritisAccount.DepositMoney(DepositedMoney=150);
       SanskritisAccount.WithDrawMoney(WithdrawalMoney=200);
    }
}