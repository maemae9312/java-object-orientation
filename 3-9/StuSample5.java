class StuSample5 {
    public static void main(String[] args) {
        Student5 stu1 = new Student5("月野");
        stu1.setScore(100);
        stu1.display();
        
        Student5 stu2 = new Student5("佐々木");
        stu2.setScore(-20);
        // private指定にはアクセスできない
        // stu2.score = -20;
        stu2.display();
    }
    
}
