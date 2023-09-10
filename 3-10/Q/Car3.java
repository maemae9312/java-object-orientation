public class Car3 {
    private int no;
    private int speed;

    public Car3(){
        no = 0;
    }

    public Car3(int n){
        no = n;
    }
  
    public void setNo(int n){
      no = n;
    }
    public void run(int s){
      speed = s;
    }
    // brakeメソッドを定義する
    public void brake(int s) {
      speed = 0;
    }
    public void display(){
      System.out.println("ナンバー" + no + "の速度は" + speed + "です");
    }
}
