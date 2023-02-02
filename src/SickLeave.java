import java.time.LocalDate;

public class SickLeave extends Leave {

    public SickLeave() {
        super();
    }

    public SickLeave(int days) {
        super();
    }

    /**
     * This method is used to set the sick leave days
     * 
     * @param joinDate
     */
    public void setSickLeave(LocalDate joinDate, int maxDays) {
        this.setDays(CalculateDays(joinDate, maxDays));
    }

    private int CalculateDays(LocalDate joinDate, int maxDays) {
        final int totalMonths = 12;
        final int remainMonths = (totalMonths + 1) - joinDate.getMonthValue();
        return (maxDays * remainMonths) / totalMonths;
    }
}