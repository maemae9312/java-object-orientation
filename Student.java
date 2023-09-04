public class Student {
    // メンバ変数(属性)
    String name;
    int engScore;
    int mathScore;

    //メソッド(操作)
    void display() {
        System.out.println(name);
        System.out.println("English" + engScore + "Math" + mathScore);
    }

    void setScore(int eng, int math) {
        engScore = eng;
        mathScore = math;
    }
    double getAvg() {
        double avg = (engScore + mathScore) / 2.0;
        return avg;
    }
}
