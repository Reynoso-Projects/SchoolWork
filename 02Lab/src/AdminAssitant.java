// Subclass for Staff
// Changes from Staff include
// getSeniorityBonus(), toString()
// Added schedule() void function
public class AdminAssitant extends Staff{
    public AdminAssitant(int years) {
        setYears(years);
    }
    public AdminAssitant() {

    }
    // changes seniority bonus to 0
    @Override
    public int getSeniorityBonus() {
        return 0;
    }
    // prints Scheduling meetings
    public static void schedule() {
        System.out.println("Scheduling meetings");
    }
    // returns AdminAssistant + years
    @Override
    public String toString() {
        return "AdminAssistant(" + getYears() + "y)";
    }
}
