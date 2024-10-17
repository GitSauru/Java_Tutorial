public class Studentexam {
    private String name;
    private int rollno;
    String subject;

    void setname(String name){
        this.name = name;
    }

    void setrollno(int rollno){
        this.rollno = rollno;
    }

    int getrollno(){
        return rollno;
    }

    String getname(){
        return name;
    }

    public static void main(String[] args) {
        Studentexam se = new Studentexam();
        se.setname("Monica");
        System.out.println(se.getname());
        se.rollno = 10;
        System.out.println(se.rollno);
    }

}
