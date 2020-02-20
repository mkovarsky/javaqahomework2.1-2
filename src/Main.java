public class Main {
    public static void main(String[] args) {
        // Текущий баланс в копейках
        int balance = 100_00;
        // Пополнение баланса в копейках
        int added_credits = 1100_00;
        // Расчет бонуса в копейках
        int bonus;
        if (added_credits > 1000_00) {
            bonus = (int) (added_credits * 0.01);
        } else {
            bonus = 0;
        }
        // Итоговая сумма на счету в рублях
        int current_balance = (balance + added_credits + bonus)/100;
        System.out.println(current_balance);

    }
}