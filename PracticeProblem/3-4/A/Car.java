class Car{
  //�����o�ϐ�
  int no;
  int speed;

  //���\�b�h
  void setNo(int n){
    no = n;
  }
  void run(int s){
    speed = s;
  }
  void stop(){
    speed = 0;
  }
  void display(){
    System.out.println("�i���o�[" + no + "�̑��x��" + speed + "�ł�");
  }
}
