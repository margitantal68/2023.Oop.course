package ro.sapientia.oop.course6;

public class Director extends Manager{
    private String institution;

    public Director(String name, int birtYear, int salary, String department, String institution) {
        super(name, birtYear, salary, department);
        this.institution = institution;
    }

    @Override
    public String toString() {
        return "Director{" +
                super.toString() +
                " institution='" + institution + '\'' +

                '}';
    }
}
