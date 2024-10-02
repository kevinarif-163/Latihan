public class FullTime extends Teacher {
    private String unit;
    int anualSalary;

    public FullTime(String name, int age, String subject, String unit, int anualSalary) {
        super(name, age , subject);
        this.unit = unit;
        this.anualSalary = anualSalary;
    }

    public String getUnit() {
        return this.unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getAnualSalary() {
        return this.anualSalary;
    }

    public void setAnualSalary(int anualSalary) {
        this.anualSalary = anualSalary;
    }

    public void print() {
        System.out.println("--Full Time Teacher--");
        super.print();
        System.out.println("Unit\t:" + getUnit());
        System.out.println("Annual Salary\t:" + getAnualSalary());
    }



    
}