import java.time.LocalDate;

public class Employee {
    private String name;
    private LocalDate JoinDate;
    private int number;

    public Employee() {

    }

    public Employee(String name, LocalDate joinDate, int number) {
        this.name = name;
        this.JoinDate = joinDate;
        this.number = number;
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                ", JoinDate='" + getJoinDate() + "'" +
                ", number='" + getNumber() + "'" +
                "}";
    }

    public String getName() {
        return name;
    }

    public LocalDate getJoinDate() {
        return JoinDate;
    }

    public void setJoinDate(LocalDate joinDate) {
        JoinDate = joinDate;
    }

    public int getNumber() {
        return number;
    }
}
