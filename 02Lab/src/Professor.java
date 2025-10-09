// Subclass for Staff
// Changes from Staff include
// getSalary(), getVacationDays(), toString()
// Added publish void function
class Professor extends Staff {
    public Professor(int years) {
        setYears(years);
    }

    public Professor(){

    }
    // increase Staff salary by 20000
    public double getSalary() {
        return super.getSalary() + 20000;
    }
    // increases Staff Vacation Days by 5
    public int getVacationDays() {
        return super.getVacationDays() + 5;
    }
    // prints publishing research
    public static void publish() {
        System.out.println("Publishing research");
    }

    // returns Professor + years
    @Override
    public String toString() {
        return "Professor(" + getYears() + "y)";
    }
}
