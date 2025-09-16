
import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<String, Account> accounts;

    public Bank(){
        this.accounts = new HashMap<>();
    }

    public void createAccount(String accountNumber, String accountHolderName,double initialDeposit ){
        if (accounts.containsKey(accountNumber)){
            System.out.println("Nomor rekening "+ accountNumber + " sudah terdaftar.");
            return;
        }
        if(initialDeposit<0){
            System.out.println("deposit awal tidak boleh negatif. Pembuatan akun gagal. ");
            return;
        }

        Account newAccount = new Account(accountNumber, accountHolderName, initialDeposit);
        accounts.put(accountNumber, newAccount);
        System.out.println("Akun untuk "+ accountHolderName + " berhasil dibuat dengan nomor rekening "+ accountNumber+".");

    }

    public void deposit (String accountNumber, double amount){
        Account account = accounts.get(accountNumber);
        if (account== null){
            System.out.println("rekening tidak ditemukan");
            return;
        }
        account.deposit(amount);
    }

    public void withDraw(String accountNumber, double amount){
        Account account = accounts.get(accountNumber);
        if (account == null){
            System.out.println("Nomor rekening tidak ditemukan.");
            return;
        }
        account.withDraw(amount);
    }

    public void checkBalance (String accountNumber){
        Account account = accounts.get(accountNumber);
        if(account==null){
            System.out.println("nomor akun tidaak ditemukan.");
            return;
        }
        System.out.println("Saldo saat ini untuk rekening "+accountNumber+" Rp"+account.getBalance());
    }

}
