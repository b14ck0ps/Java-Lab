import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Stuff stuff = new Stuff("John", LocalDate.of(2019, 1, 1), 1);
        NonStuff nonStuff = new NonStuff("Ajran", LocalDate.of(2023, 1, 1), 2);

        System.out.println(stuff.toString());
        System.out.println("Annual Leave: " + stuff.getAnnualLeaveDays());
        System.out.println("Sick Leave: " + stuff.getSickLeaveDays());

        System.out.println(nonStuff.toString());
        System.out.println("Annual Leave: " + nonStuff.getAnnualLeaveDays());
        System.out.println("Sick Leave: " + nonStuff.getSickLeaveDays());
    }
}
