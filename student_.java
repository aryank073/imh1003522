package Lab3;
class Stud {
    int student_roll;
    String student_name;
    int[] student_marks = new int[5];

    public Stud(int roll, String name, int[] marks) {
        this.student_roll = roll;
        this.student_name = name;
        this.student_marks = marks;
    }

    public void calculateAverage() {
        int sum = 0;
        for (int mark : student_marks) {
            sum += mark;
        }
        double average = sum / 5.0;
        System.out.println("Average marks for student " + student_name + " (Roll No. " + student_roll + "): " + average);
    }
}

public class student_ {
    public static void main(String[] args) {
        
        Stud student1 = new Stud(27, "omkar", new int[]{75, 60, 88, 75, 95});
        Stud student2 = new Stud(46, "jagtap", new int[]{68, 88, 82, 80, 95});
        Stud student3 = new Stud(35, "netaji", new int[]{80, 92, 75, 98, 90});

       
        student1.calculateAverage();
        student2.calculateAverage();
        student3.calculateAverage();
    }
}
