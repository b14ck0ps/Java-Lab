public class Leave {
    private int days;

    public Leave(int days) {
        this.days = days;
    }

    public Leave() {
        days = 0;
    }

    protected int getDays() {
        return this.days;
    }

    protected void setDays(int days) {
        this.days = days;
    }

    @Override
    public String toString() {
        return "\n{" +
                "Annual Leave days='" + getDays() + "'" +
                "}";
    }

}
