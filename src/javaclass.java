class student {
    int rollno = 10;
    String name = "sumit";
    int studentid ;
}


public class javaclass {
    public static void main(String[] args) {
        student st = new student();
        System.out.println(st.name);
        System.out.println(st.rollno);
        st.studentid = 234;
        System.out.println(st.studentid);
    }
}
