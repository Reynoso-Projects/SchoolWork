// Subclass for Staff
// Changes from Staff include
// getVacationForm(), getVacationDays(), toString()
// Added sue void function
public class Lawyer extends Staff{
    public Lawyer(int years) {
        setYears(years);
    }

    public Lawyer() {
    }
    // lawyers have 5 more vacation days than staff
    public int getVacationDays() {
        return super.getVacationDays() + 5;
    }
    // changes vacation form to pink
    public String getVacationForm() {
        return "pink";
    }
    // prints See you in court!
    public void sue() {
        System.out.println("See you in court!");
    }
    // returns Lawyer + years
    @Override
    public String toString() {
        return "Lawyer(" + getYears() + "y)";
    }
}
