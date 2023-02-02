import java.time.LocalDate;

public class AnnualLeave extends Leave {

    public AnnualLeave() {
        super();
    }

    public AnnualLeave(int days) {
        super();
    }

    /**
     * This method is used to set the annual leave days
     * 
     * @param joinDate
     */
    public void setAnnualLeave(LocalDate joinDate, int maxDays) {
        this.setDays(CalculateDays(joinDate, maxDays));
    }

    private int CalculateDays(LocalDate joinDate, int maxDays) {
        final int totalMonths = 12;
        final int remainMonths = (totalMonths + 1) - joinDate.getMonthValue();
        return (int) Math.ceil((maxDays * remainMonths) / totalMonths);
    }
}
