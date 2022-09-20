public class Main {

    public static void main(String[] args) {
        int costOfBonusMile = 20;
        int costOfTicket = 10_000;
        int bonusMiles;

        bonusMiles = costOfTicket / costOfBonusMile;

        System.out.println(bonusMiles + " bonus miles will be accrued for a ticket worth " + costOfTicket + " ₽");

        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        System.out.println("При покупке билета на сумму: " + price);
        int miles = service.calculate(price);
        System.out.println("Расчет бонусных миль дает: " + miles);

        String prefix = "Было: " + bonusMiles + " стало: " + miles + ". Результаты вычислений ";
        String suffix = "совпадают" + "\u001B[0m";
        if (bonusMiles == miles) {
            System.out.println("\u001B[32m" + prefix + suffix);
        } else {
            System.out.println("\u001B[31m" + prefix + "не " + suffix);
        }
    }

}
