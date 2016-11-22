package proyecto.poo;

public class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return getSalary() * 12;
    }
    public String getName(){
    
    return firstName+lastName;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", firstName=" + firstName
                + ", lastName=" + lastName + ", salary=" + salary + '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public int raiseSalary(int percent) {
        return salary += ((salary * percent) / 100);
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee empresario = new Employee(0, "Raul", "Dominguez", 500);

        System.out.println(empresario + " " + empresario.getAnnualSalary());

        //raise salary is
        empresario.raiseSalary(25);
        System.out.println(empresario + " " + empresario.getAnnualSalary());
    }
}
