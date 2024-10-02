

public class PartTime extends Teacher {
    private int hoursworked;
    private int setSalary;

    public PartTime(String name,int age,String Subject, int hoursworked, int setSalary) {
        super(name, age, Subject);
        this.hoursworked = 0;
        this.setSalary = 0;
    }

    public int getHoursworked() {
        return this.hoursworked;
    }

    public void setHoursworked(int hoursworked) {
        this.hoursworked = hoursworked;
    }

    public int getSetSalary() {
        return this.setSalary;
    }

    public void setSetSalary(int setSalary) {
        this.setSalary = setSalary;
    }

    public void print() {
        System.out.println("--PartTime teacher--");
        super.print();
        System.out.println("Jam Kerja: " + hoursworked);
        System.out.println("Gaji: " + setSalary);
    }

    
}