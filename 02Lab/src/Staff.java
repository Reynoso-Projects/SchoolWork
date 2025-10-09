
/**
 * CSC 20 - University Campus System
 * Base class for all staff. DO NOT MODIFY THIS CLASS.
 */
public class Staff {
    private int years;
    public Staff(int years) {
         setYears(years);
    }

    public Staff() {
    }

    public int getYears() {
        return years;
    }
    public int getHours() {
        return 40;
    }
    public double getSalary() {
        return 40000.0;
    }
    public int getVacationDays() {
        return 10 + getSeniorityBonus();
    }
    public int getSeniorityBonus() {
        return 2 * years;
    }
    public String getVacationForm() {
        return "yellow";
    }

    public String toString() {
        return "Staff(" + years + "y)";
    }

    void setYears(int num){
         this.years = num;
    }
}
