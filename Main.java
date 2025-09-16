public class Main {
    public static void main(String[] args) {
        Bank myBank = new Bank();

        //1. Membuat beberapa rekening
        myBank.createAccount("123456", "toni", 1000000);
        myBank.createAccount("789012", "dwi", 700000);
        myBank.createAccount("135791", "utomo", 5000000);

        // Mencoba membuat akun yang sudah ada
        myBank.createAccount("123456", "inot", 2000000);
        System.out.println("--------------------------------");

        // 2. Melakukan operasi setoran
        myBank.deposit("123456", 1000000);
        myBank.deposit("678906", 200000);
        System.out.println("------------------");


        // 3. Mengecek saldo
        myBank.checkBalance("123456");
        myBank.checkBalance("789012");
        System.out.println("----------------------------");

        // 4, penarikan
        myBank.withDraw("123456", 500000);
        myBank.withDraw("123456", 500000000);
        myBank.withDraw("147934", 400000);
        System.out.println("-----------------------------------");

        //  5. cek saldo lagi
        myBank.checkBalance("123456");
        


    }
}
