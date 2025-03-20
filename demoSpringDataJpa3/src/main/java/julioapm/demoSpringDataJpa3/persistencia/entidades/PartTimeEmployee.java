package julioapm.demoSpringDataJpa3.persistencia.entidades;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
//@Table(name = "PT_EMP")
@DiscriminatorValue("PTEmp")
public class PartTimeEmployee extends Employee {
    private int hourlyWage;

    public PartTimeEmployee() {
    }

    public PartTimeEmployee(int id, String name, int hourlyWage) {
        super(id, name);
        this.hourlyWage = hourlyWage;
    }

    public int getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(int hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

}
