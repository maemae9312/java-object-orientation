class StuSample3 {
    public static void main(String[] args){
        Student3 stu1 = new Student3("月野");
        Student3 stu2 = new Student3("剣持",90,80);

        stu1.setScore(95,70);
        stu1.display();
        stu2.display();
    }
}
