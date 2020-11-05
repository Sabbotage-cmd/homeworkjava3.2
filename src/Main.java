public class Main {
    public static void main(String[] args) {
        int balanceAfter;
        int balanceBefore = 100; // Сумма на балансе до пополнения
        int rechargeBalance = 1000; // Сумма пополнения

        balanceAfter = balanceBefore + rechargeBalance + totalBonus(rechargeBalance);

        System.out.printf("Баланс после пополнения - %d, из них бонусов - %d%n",
                balanceAfter, totalBonus(rechargeBalance));
    }

    public static int totalBonus(int rechargeSum) {
        int bonusStep = 100; // шаг зачисления бонуса
        int minSum = 1000; // минимальная сумма пополнения
        if (rechargeSum < minSum) {
            return 0;
        } else {
            return rechargeSum / bonusStep;
        }
    }
}