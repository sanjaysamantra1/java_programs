class Student implements Comparable<Student> {

    private int roll;
    private String name;
    private int mark;

    public int getroll() {
        return roll;
    }
    public String getName() {
        return name;
    }
    public int getmark() {
        return mark;
    }
    public Student(int roll, String name, int mark) {
        this.roll = roll;
        this.name = name;
        this.mark = mark;
    }

    public int compareTo(Student std) {
        //let's sort the Student based on roll in ascending order
        //returns a negative integer, zero, or a positive integer as this Student roll
        //is less than, equal to, or greater than the specified object.
        return (this.roll - std.roll);
    }


    //this is required to print the user friendly information about the Student
    public String toString() {
        return "[roll=" + this.roll + ", name=" + this.name + ", mark=" +
                this.mark + "]";
    }

}