package multilevel;

public class MMainClass {
    public static void main(String[] args) {
        Department d = new Department();
        System.out.println(d.UniversityName);
        d.ConductExams();
        System.out.println("-------");
        System.out.println(d.CollegeName);
        d.conductInternals();
        System.out.println("--------");
        System.out.println(d.DepartmentName);
        d.giveAssignments();
    }

}
