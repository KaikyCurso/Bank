import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter account number: ");
        String account_number = input.next();
        /* O next() consome apenas a próxima palavra
        e deixa o caractere de nova linha (\n) no buffer.
        que será lido na proxima leitura */
        input.nextLine(); // Clean buffer

        System.out.print("Enter account holder: ");
        String account_holder = input.nextLine();

        char hasInitialDeposit;
        do {
            System.out.print("Is there na initial deposit (y/n)? ");
            hasInitialDeposit = input.nextLine().charAt(0);
        } while (hasInitialDeposit != 'y' && hasInitialDeposit != 'n');
        double initialDeposit = 0;

        if (hasInitialDeposit == 'y'){
            System.out.print("Enter initial deposit value: ");
            initialDeposit = input.nextDouble();
        }

        Account account1 = new Account(account_number, account_holder, initialDeposit);

        System.out.println(account1);

        System.out.print("Enter a deposit value: ");
        double depositValue = input.nextDouble();
        account1.deposit(depositValue);
        System.out.println(account1);

        System.out.print("Enter a withdraw value: ");
        double withdrawValue = input.nextDouble();
        account1.withdrawMoney(withdrawValue);
        System.out.println(account1);

        input.close();
    }
}