public class Student {

    int id;
    String name;
    double cgpa;

    void setId(int id) {
        this.id = id;
    }

    int getId() {
        return this.id;
    }

    void setName(String name) {
        this.name = name;
    } 

    String getName() {
        return this.name;
    }


    void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    } 

    double getCgpa() {
        return this.cgpa;
    }

    public static void main(String args[]) {
        Student S1 = new Student();
        S1.setId(50);
        S1.setName("Shafayet Hossain");
        S1.setCgpa(3.77);

        System.out.println("Student id is: "+ " "+ S1.getId());
        System.out.println("Student Name is: "+ " "+ S1.getName());
        System.out.println("Student CGPA is: "+ " "+ S1.getCgpa());
    }

}


