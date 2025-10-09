//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Professor Check
        System.out.println("Professor");
        Professor Steve = new Professor(3);
        System.out.println(Steve.toString());
        System.out.println(Steve.getHours());
        System.out.println(Steve.getSalary());
        System.out.println(Steve.getVacationDays());
        System.out.println(Steve.getVacationForm());
        Steve.publish();
        // AdminAssistant check
        System.out.println();
        System.out.println("AdminAssistant");
        AdminAssitant Mable = new AdminAssitant(5);
        System.out.println(Mable.toString());
        System.out.println(Mable.getHours());
        System.out.println(Mable.getSalary());
        System.out.println(Mable.getVacationDays());
        System.out.println(Mable.getVacationForm());
        Mable.schedule();

        // Janitor Check
        System.out.println();
        System.out.println("Janitor");
        Janitor J = new Janitor(2);
        System.out.println(J.toString());
        System.out.println(J.getHours());
        System.out.println(J.getSalary());
        System.out.println(J.getVacationDays());
        System.out.println(J.getVacationForm());
        J.maintain();
        System.out.println(J.motto());

        // Lawyer check
        System.out.println();
        System.out.println("Lawyer");
        Lawyer L = new Lawyer(4);
        System.out.println(L.toString());
        System.out.println(L.getHours());
        System.out.println(L.getSalary());
        System.out.println(L.getVacationDays());
        System.out.println(L.getVacationForm());
        L.sue();


        // Standford Lawyer check
        System.out.println();
        System.out.println("Stanford Lawyer");
        StanfordLawyer SL = new StanfordLawyer(1);
        System.out.println(SL.toString());
        System.out.println(SL.getHours());
        System.out.println(SL.getSalary());
        System.out.println(SL.getVacationDays());
        System.out.println(SL.getVacationForm());
        SL.sue();



    }
}