# オブジェクト
オブジェクト指向プログラミング (OOP) は、ソフトウェア設計とプログラミングの方法論の1つで、リアルワールドの事物や概念をオブジェクトとしてモデル化し、それらのオブジェクト間の相互作用を通じてプログラムを構築します。以下、OOPの主要なコンセプトと具体例を紹介します。

1. **クラスとオブジェクト**
   - **クラス**：オブジェクトの設計図やテンプレートのようなもの。属性（変数）と動作（メソッド）を定義します。
   - **オブジェクト**：クラスに基づいて生成されるインスタンス。

   **例**：`Dog`というクラスを考えてみましょう。
   ```java
   class Dog {
       // 属性
       String breed;
       String color;

       // メソッド
       void bark() {
           System.out.println("Woof!");
       }
   }

   Dog myDog = new Dog(); // Dog クラスのオブジェクトを生成
   ```
- クラスを分けることで、開発効率、保守性、メモリ効率、システム化が向上する
- 実行用クラスと設計図用クラスがある

2. **継承**
   - 既存のクラスから新しいクラスを派生させる機能。再利用性を高め、コードを簡潔にします。

   **例**：`Animal`クラスから継承した`Dog`クラス。
   ```java
   class Animal {
       void eat() {
           System.out.println("This animal eats food.");
       }
   }

   class Dog extends Animal {
       void bark() {
           System.out.println("Woof!");
       }
   }
   ```

3. **ポリモーフィズム**
   - オブジェクトが複数の型を取る能力。主にメソッドのオーバーライドを通じて実現されます。

   **例**：異なる動物の音を出力する。
   ```java
   class Animal {
       void sound() {
           System.out.println("Animal makes a sound");
       }
   }

   class Dog extends Animal {
       void sound() {
           System.out.println("Woof!");
       }
   }

   class Cat extends Animal {
       void sound() {
           System.out.println("Meow!");
       }
   }

   Animal myDog = new Dog();
   Animal myCat = new Cat();
   myDog.sound();  // Woof!
   myCat.sound();  // Meow!
   ```

4. **カプセル化**
   - オブジェクトの内部の詳細を隠蔽し、外部からアクセスできるインターフェースだけを公開すること。

   **例**：犬の年齢を設定・取得する。
   ```java
   class Dog {
       private int age;  // プライベート変数

       // age の値を設定する
       public void setAge(int age) {
           if (age > 0) {
               this.age = age;
           }
       }

       // age の値を取得する
       public int getAge() {
           return age;
       }
   }
   ```

以上の4つの主要なコンセプトを使うことで、OOPはリアルワールドの構造を反映したソフトウェアを設計・実装する手法を提供します。これにより、コードは再利用性が高く、可読性があり、保守が容易になります。