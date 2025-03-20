package julioapm.demoSpringDataJpa3.persistencia.entidades;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
//@Table(name = "FT_EMP")
@DiscriminatorValue("FTEmp")
public class FullTimeEmployee extends Employee {
    private int salary;

    public FullTimeEmployee() {
    }

    public FullTimeEmployee(int id, String name, int salary) {
        super(id, name);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}
