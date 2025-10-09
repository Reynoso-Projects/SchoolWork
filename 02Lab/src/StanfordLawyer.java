// Subclass for Lawyer
// Changes from Lawyer include
// getVacationForm(), getVacationDays(), toString(), getSalary()
// No new functions added here
public class StanfordLawyer extends Lawyer {
    public StanfordLawyer(int years) {
        setYears(years);
    }

    public StanfordLawyer() {
    }

    // salary is 1.2 times bigger than lawyer
    public double getSalary() {
        return super.getSalary()*1.2;
    }

    // get 3 more vacation days than lawyer
    public int getVacationDays() {
        return super.getVacationDays()+3;
    }

    // needs to fill pink form 4 times

    @Override
    public String getVacationForm() {
        return "pinkpinkpinkpink";
    }

    @Override
    public String toString() {
        return "StanfordLawyer("+ getYears() + "y)";
    }
}
