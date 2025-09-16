public class Account {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public Account(String accountNumber, String accountHoolderName, double initialBalance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHoolderName;
        this.balance = initialBalance;

    }

    public void deposit (double amount){
        if (amount>0){
            balance += amount;
            System.out.println("setor uang sebesar Rp"+amount+" berhasil");
        }else{
            System.out.println("jumlah setoran haarus lebih dari nol.");
        }
    }

    public boolean withDraw(double amount){
        if(amount <= 0){
            System.out.println("jumlah penaarikan harus lebih dari nol.");
            return false;
        }
        if(balance >= amount){
            balance -= amount;
            System.out.println("penarikaan uang sebesar Rp"+amount+" berhasil.");
            return true;
        }else{
            System.out.println("saldo tidak mencukupi untuk penarikaan.");
            return false;
        }

    }

    public double getBalance(){
        return balance;
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public String getAcoountHolderName(){
        return accountHolderName;
    }






}
