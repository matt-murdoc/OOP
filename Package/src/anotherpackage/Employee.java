package anotherpackage;

public class Employee {
    
    private String name;
    private int id;
    private float salary;


    public String getName() {
        return name;
    }

    public void setName(String name) throws TooShort{

        if (name.length() < 3) {

            throw new TooShort();
        }
        else this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) throws idZero{
        
        if (id == 0) {

            throw new idZero();
        }
        else this.id = id;

    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) throws salaryZero{

        if (salary < 0) {

            throw new salaryZero();
        }
        else this.salary = salary;
    }


}
