// Subclass for Staff
// Changes from Staff include
// getSalary(), getVacationDays(), toString(), getHours(),
// Added maintain function and motto  function
public class Janitor extends Staff{


    public Janitor(int years) {
        setYears(years);
    }

    public Janitor() {
    }
    // hours are double staff hours
    public int getHours() {
        return super.getHours() * 2;
    }
    // salary is 10000 less than staff
    public double getSalary() {
        return super.getSalary() - 10000;
    }
    // vacation days are half of staff
    public int getVacationDays() {
        return super.getVacationDays()/2;
    }
    // returns Janitor + years
    @Override
    public String toString() {
        return "Janitor(" + getYears() + "y)";
    }
    // returns Workin' for hte campus
    public String motto() {
        return "Workin' for the campus.";
    }
    // prints Mopping floors
    public void maintain() {
        System.out.println("Mopping floors");
    }
}
