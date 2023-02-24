public class Student {
    //properties
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private int yearLevel;
    private static int studentCount = 0;
    public static int createID()
    {
        return studentCount++;
    }

    //constructor
    public Student(String firstName, String lastName, int age, int yearLevel){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.yearLevel = yearLevel;
        this.id = createID();
    }

    //methods
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getYearLevel() {
        return yearLevel;
    }
    public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }
    public static int getStudentCount() {
        return studentCount;
    }

    public boolean equals(Student other){
        if (other.firstName.equals(this.firstName) && other.lastName.equals(this.lastName)){
            if (other.age == this.age && other.yearLevel == this.yearLevel){
                return true;
            }
        }
        return false;
    }
    public String toString(){
        return "Student{id=" + this.id + ", firstName='" + this.firstName + "', lastName='" + this.lastName + "', age=" + this.age + "}";
    }
}
