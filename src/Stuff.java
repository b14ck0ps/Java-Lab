import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Stuff extends Employee {
    private List<Leave> leaves = new ArrayList<Leave>();

    public Stuff() {
        super();
    }

    public Stuff(String name, LocalDate joinDate, int number) {
        super(name, joinDate, number);
        AnnualLeave();
        SickLeave();
    }

    // Annual Leave
    private void AnnualLeave() {
        AnnualLeave annualLeave = new AnnualLeave();
        annualLeave.setAnnualLeave(getJoinDate(), LeaveDays.STUFF_MAX_ANNUAL_LEAVE);
        leaves.add(annualLeave);
    }

    public int getAnnualLeaveDays() {
        return leaves.get(0).getDays();
    }

    // Sick Leave
    private void SickLeave() {
        SickLeave sickLeave = new SickLeave();
        sickLeave.setSickLeave(getJoinDate(), LeaveDays.STUFF_MAX_SICK_LEAVE);
        leaves.add(sickLeave);
    }

    public int getSickLeaveDays() {
        return leaves.get(1).getDays();
    }
}
