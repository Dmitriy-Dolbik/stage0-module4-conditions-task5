package school.mjc.stage0.conditions.task5;

public class SwitchDaysInMonthPrinter {
    public static void main(String[] args) {
        SwitchDaysInMonthPrinter daysInMonthPrinter = new SwitchDaysInMonthPrinter();
        daysInMonthPrinter.amountOfDays(99);
    }

    public void amountOfDays(int month) {
        switch (month) {
            case 1:
                System.out.println("31");
                break;
            case 2:
                System.out.println("28");
                break;
            case 3:
                System.out.println("31");
                break;
            case 4:
                System.out.println("30");
                break;
            case 5:
                System.out.println("31");
                break;
            case 6:
                System.out.println("30");
                break;
            case 7:
                System.out.println("31");
                break;
            case 8:
                System.out.println("31");
                break;
            case 9:
                System.out.println("30");
                break;
            case 10:
                System.out.println("31");
                break;
            case 11:
                System.out.println("30");
                break;
            case 12:
                System.out.println("31");
                break;
            default:
                System.out.println("wrong number!");
                break;
        }
    }
}
