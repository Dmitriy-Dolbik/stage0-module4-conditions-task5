package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public static void main(String[] args) {
        LeapYearPrinter leapYearPrinter = new LeapYearPrinter();
        leapYearPrinter.isLeapYear(2000);
    }

    public void isLeapYear(int year) {
               if (year > 1584 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            System.out.println("leap");
        } else{
            System.out.println("not leap");
        }
    }
}
