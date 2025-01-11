package Abstraction.models;

public class Employee {

    private int id;
    private String name;
    private int salary;

    public Employee(){
        super();
    }

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    /**
     * Hashcode, equals and toString methods defined
     * @return
     */
    @Override
    public int hashCode() {
        return this.id;
    }

    @Override
    public boolean equals(Object obj) {
        Employee e = (Employee) obj;
        return this.name.equals(e.name);
    }

    @Override
    public String toString() {
        return this.name + " - " + this.salary;
    }

    /**
     * Getter & Setter methods
     * @return
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}
