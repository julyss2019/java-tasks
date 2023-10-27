public class AccountBookTest {
    public static void main(String[] args) {
        AccountBook account = new AccountBook();
        
        account.setAccountName("张三");
        account.setIncome(30);
        account.setOutcome(10);

        System.out.println("账户名称: " + account.getAccountName());
        System.out.println("收入额: " + account.getIncome());
        System.out.println("支出额: " + account.getOutcome());
        System.out.println("余额: " + account.compute());
    }
}
