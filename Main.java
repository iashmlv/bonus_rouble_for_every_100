public class Main {
    public static void main(String[] args)
    {
        // сумма пополнения 1200 рублей
        int deposit = 1200;
        int bonus;
        boolean replenishment = true;
        if (replenishment){
            bonus = deposit / 100;
        }
        else {
            bonus = 0;
        }
        // на счету на данный момент 100 рублей
        int current_account = 100;
        // на счету после пополнения с учетом бонуса
        int replenished_account = current_account + deposit + bonus;
        System.out.println(replenished_account);


    }
}
