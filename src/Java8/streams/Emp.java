package Java8.streams;

public class Emp {
    int id;
    String name;
    int salary;

    public Emp(int id, String name, int salary) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Hashcode, equals and toString methods defined
    @Override
    public int hashCode() {
        return this.id;
    }

    @Override
    public boolean equals(Object obj) {
        Emp e = (Emp) obj;
        return this.name.equals(e.name);
    }

    @Override
    public String toString() {
        return this.name + " - " + this.salary;
    }

    // Getter & Setter methods
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
