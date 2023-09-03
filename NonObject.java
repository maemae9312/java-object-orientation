//オブジェクト指向を使用していない
class NonObject{
    public static void main(String[] args) {
        // データの代入
        int[] score = {80, 100, 75};
        String[] name = {"tsukino", "higuchi","kuzuha"};

        //データの表示
        for (int i = 0; i < score.length; i++) {
            System.out.println(name[i] + ": " + score[i]);
        }
    }
}