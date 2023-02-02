import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class NonStuff extends Employee {
    private List<Leave> leaves = new ArrayList<Leave>();

    public NonStuff() {
        super();
    }

    public NonStuff(String name, LocalDate joinDate, int number) {
        super(name, joinDate, number);
        AnnualLeave();
        SickLeave();
    }

    // Annual Leave
    private void AnnualLeave() {
        AnnualLeave annualLeave = new AnnualLeave();
        annualLeave.setAnnualLeave(getJoinDate(), LeaveDays.NON_STUFF_MAX_ANNUAL_LEAVE);
        leaves.add(annualLeave);
    }

    public int getAnnualLeaveDays() {
        return leaves.get(0).getDays();
    }

    // Sick Leave
    private void SickLeave() {
        SickLeave sickLeave = new SickLeave();
        sickLeave.setSickLeave(getJoinDate(), LeaveDays.NON_STUFF_MAX_SICK_LEAVE);
        leaves.add(sickLeave);
    }

    public int getSickLeaveDays() {
        return leaves.get(1).getDays();
    }
}
