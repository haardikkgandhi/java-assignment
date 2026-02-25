class Student {
    String name;
    int roll;
    
    Student() {
        name = "none";
        roll = 0;
    }
    
    Student(String s, int r) {
        name = s;
        roll = r;
    }
    
    void show() {
        System.out.println(name + " " + roll);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("amit", 101);
        s1.show();
        s2.show();
    }
}
