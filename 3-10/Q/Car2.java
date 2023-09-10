class Car2 {
    int no;
    int speed;

    Car2(){
        no = 0;
    }

    Car2(int n){
        no = n;
    }
  
    void setNo(int n){
      no = n;
    }
    void run(int s){
      speed = s;
    }
    // brakeメソッドを定義する
    void brake(int s) {
      speed = 0;
    }
    void display(){
      System.out.println("ナンバー" + no + "の速度は" + speed + "です");
    }
}
