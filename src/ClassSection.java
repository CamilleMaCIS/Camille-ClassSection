import java.util.ArrayList;

public class ClassSection {
    //properties
    private String subject;
    private int capacity;
    private int yearLevel;
    private ArrayList<Student> students;

    //constructor
    public ClassSection(String subject, int capacity, int yearLevel){
        this.subject = subject;
        this.capacity = capacity;
        this.yearLevel = yearLevel;
        this.students = new ArrayList<>();
    }

    //methods
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public int getYearLevel() {
        return yearLevel;
    }
    public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }
    public ArrayList<Student> getStudents() {
        return students;
    }

    private boolean sameYearLevel(Student addStudent){
        if (addStudent.getYearLevel() != this.yearLevel){
            return false;
        }
        return true;
    }
    public void addStudent(Student student){
        int count = 0;
        for (Student existStudent : students){
            if (existStudent.getId() != student.getId()){
                count++;
            }
        }
        //will not add conflicting ID, or students not in this year level
        if (count == students.size() && sameYearLevel(student)){
            this.students.add(student);
        }
    }
    public void removeStudent(Student student){
        this.students.remove(student);
    }
    public boolean isStudentEnrolled(Student student){
        if (students.contains(student)){
            return true;
        }
        return false;
    }

    public String toString(){
        return "ClassSection{subject='" + this.subject + "', capacity=" + this.capacity + ", students=" + this.students + "}";
    }
}
