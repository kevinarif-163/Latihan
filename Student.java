public class Student extends Person {
    private String major;
    private int score;
    private int studentNumber;
    
    public Student(String name, int age, String major, int score, int studentNumber) {
        super(name, age);
        this.major = major;
        this.score = score;
        this.studentNumber = studentNumber;
    }

    public String getMajor() {
        return this.major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getStudentNumber() {
        return this.studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }
    public void print() {
        System.out.println(" --Student-- ");
        super.print();
        System.out.println("Major: " + major);
        System.out.println("Score: " + score);
        System.out.println("Student Number: " + studentNumber);
    }



    




}