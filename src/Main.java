public class Main {
    public static void main(String[] args) {

        int initialAmount = 100;
        int depositAmount = 1170;
        int bonus;
        int amount;
        if (depositAmount > 1000) {
            bonus = depositAmount / 100;
            amount = initialAmount + depositAmount;
            System.out.println("Вам начислено " + bonus + " бонусных рублей");
            System.out.println("Баланс вашего счета " + amount + " руб.");
        } else {
            System.out.println("Для получения бонусных рублей пополните баланс на сумму больше 1000");
        }

    }
}
