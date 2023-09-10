# オブジェクト
オブジェクト指向プログラミング (OOP) は、ソフトウェア設計とプログラミングの方法論の1つで、リアルワールドの事物や概念をオブジェクトとしてモデル化し、それらのオブジェクト間の相互作用を通じてプログラムを構築します。以下、OOPの主要なコンセプトと具体例を紹介します。

1. **クラスとオブジェクト**
   - **クラス**：オブジェクトの設計図やテンプレートのようなもの。属性（変数）と動作（メソッド）を定義します。
    - 実行用クラス: mainメソッドを記述
    - 設計図クラス: 属性と操作を記述
        - 属性: 何のデータを持っているか
        - 操作: 何の操作ができるか
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

# メソッドの定義
メソッドとは、特定の動作やタスクを実行するためのコードのブロックのことを指します。メソッドは特定のタスクを実行するために何度も呼び出すことができ、一度定義すると何度でも再利用可能です。

- 引数: 呼び出し元から受け取る値
- 戻り値: メソッドの処理の後に呼び出し元に戻す値。returnで指定する。何も返さない場合は戻りの型にvoidと記述する

Javaにおけるメソッドの基本的な構造は以下のとおりです：

```
[アクセス修飾子] [戻り値の型] メソッド名(引数) {
    // メソッドの内容
    return 戻り値;  // 戻り値の型がvoid以外の場合
}
```

具体例を見てみましょう。

### 例1: 引数と戻り値のないメソッド

```java
public void greet() {
    System.out.println("Hello, World!");
}
```

この`greet`メソッドは引数も戻り値もありませんが、呼び出されると"Hello, World!"と表示します。

### 例2: 引数を持ち戻り値のないメソッド

```java
public void greetPerson(String name) {
    System.out.println("Hello, " + name + "!");
}
```

この`greetPerson`メソッドは、文字列`name`を引数として受け取り、それを使って挨拶のメッセージを表示します。

### 例3: 引数と戻り値を持つメソッド

```java
public int add(int a, int b) {
    return a + b;
}
```

この`add`メソッドは、2つの整数を引数として受け取り、その和を戻り値として返します。

### メソッドを使用する利点：

1. **再利用性**：一度定義したメソッドは、プログラム内で何度でも呼び出すことができます。
2. **モジュール性**：メソッドは特定のタスクを担当するので、コードのブロックは独立しており、他の部分と分離されています。
3. **可読性**：適切に命名されたメソッドを使用することで、コードが自己説明的になり、他の人が読んでも理解しやすくなります。
4. **メンテナンス**：変更やデバッグが必要な場合、関連するコードはメソッド内に局所化されているため、変更が容易です。

メソッドを効果的に使用することで、プログラムは整理され、拡張性が高まり、保守が容易になります。

# オブジェクトの使い方
- ①生成
クラス名　オブジェクト名 = new クラス名();
    Student stu1 = new Student();

②変数・メソッドを利用
    オブジェクト名.変数名
    オブジェクト名.メソッド名(引数)
    stu1.name = "月野";
    stu.getScore(80,90);

オブジェクト指向プログラミングの中心的な要素は「オブジェクト」です。そして、オブジェクトは「変数（属性やフィールド）」と「メソッド（動作や関数）」を持っています。これらの概念を簡単に理解するために、日常生活からの例を使って説明します。

### 1. オブジェクトの使い方

**オブジェクトとは**：実世界のものや概念をコード内で表現したもの。例えば、車や人、銀行のアカウントなど。

**具体例**：`Car` というオブジェクトを考えます。実際の車のように、このオブジェクトも属性（色、ブランド、速度など）と動作（加速、ブレーキ、ホーンなど）を持ちます。

### 2. 変数（属性やフィールド）の使い方

**変数とは**：オブジェクトの状態や特性を保存するためのもの。オブジェクトの属性や特徴を表します。

**具体例**：`Car` オブジェクトにおける変数。
```java
class Car {
    String brand;  // ブランド（例：Toyota）
    String color;  // 色（例：Red）
    int speed;     // 現在の速度（例：60）
}
```

### 3. メソッドの使い方

**メソッドとは**：オブジェクトが行うことのできる動作や活動。特定のタスクを実行するコードのブロック。

**具体例**：`Car` オブジェクトにおけるメソッド。
```java
class Car {
    // 変数（属性）
    String brand;
    String color;
    int speed;

    // 加速メソッド
    void accelerate(int amount) {
        speed += amount;
        System.out.println("Accelerating. Current speed: " + speed + "km/h");
    }

    // ブレーキメソッド
    void brake(int amount) {
        speed -= amount;
        System.out.println("Decelerating. Current speed: " + speed + "km/h");
    }

    // ホーンメソッド
    void honk() {
        System.out.println("Beep! Beep!");
    }
}
```

上記の例では、`Car` オブジェクトは3つの変数（`brand`、`color`、`speed`）と3つのメソッド（`accelerate()`、`brake()`、`honk()`）を持っています。この`Car` オブジェクトを使って、実際の車のような振る舞いを模倣することができます。

オブジェクト指向プログラミングの強力な点は、実世界の概念をコード内で再現する能力にあります。これにより、コードは直感的で読みやすく、実世界の問題を効果的に解決することができます。

# オーバーロード
- クラス内に同じ名前で引数の方や数が違うメソッドを複数定義することをオーバーロードという
- 呼び出すメソッドは名前と引数の組み合わせで決めている

```java
// 設計
setData(String){......}
setData(String,int,int){......}

// 実行
Student stu = new Student();
stu.setData("月野");
stu.setData("月野",17,151)
```

# コンストラクト
- オブジェクトの初期化のために使われる特殊なメソッドをコンストラクタと呼ぶ
    - ルール① 名前がクラス名と同じ
    - ルール② 戻り値を持たない
    - ルール③ new クラス名(コンストラクトへの引数)
- コンストラクタを定義していない場合は、自動でデフォルトコンストラクタ(引数・処理なし)が生成
```java
//　設計
class Student {
    Student(String n) {
        ........
    }
    Student(String n, int e, int m){

    }
}
// 実行
main(~) {
    Student stu1 = new Student("月野");
    Student stu2 = new Student("樋口",60,55);
}
```

# static変数、staticメソッド
- 全インスタンス変数が使えるメンバ変数やメソッドを定義するにはstaticを指定する
- オブジェクトを生成しなくても利用できる
```java
class Student {
    String name;                // 通常のインスタンス変数
    static int totalStudents;  // static変数

    Student(String name) {
        this.name = name;
        totalStudents++;       // 新しいStudentオブジェクトが生成されるたびに、totalStudentsの値が増加する
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        System.out.println(Student.totalStudents);  // 出力: 2
    }
}
```
```java
class MathUtility {
    static int square(int x) {  // staticメソッド
        return x * x;
    }
}

public class Main {
    public static void main(String[] args) {
        int result = MathUtility.square(5);  // インスタンスを生成せずに直接メソッドを呼び出す
        System.out.println(result);          // 出力: 25
    }
}

```

# カプセル化
カプセル化とは、オブジェクト指向プログラミングの基本的な概念の一つで、クラスの内部の実装詳細を隠蔽し、外部からの不正なアクセスや変更を防ぐ機能のことを指します。具体的には、クラスの変数やメソッドの可視性を制限することで実現します。

- アクセス修飾子でクラス・メンバ変数・メソッドの公開範囲を指定できる
    - public
        - 全てに公開
    - protected
        - 同クラス、同パッケージ、サブクラスに公開
    - private
        - 同クラスのみに公開
- メンバ変数は隠蔽(private)して、クラスとメソッドは公開(public)する設計方針をカプセル化と呼ぶ。

### メリット：

1. **安全性**: クラスの内部状態を適切に保護し、不正な値の設定や予期しない方法でのアクセスを防ぐことができます。
2. **柔軟性**: クラスの内部実装を変更しても、外部のコードに影響を与えることなく変更を加えることができます。
3. **簡潔さ**: 必要最小限の情報だけを外部に公開することで、クラスの利用方法が明確になり、誤解を避けることができます。

### 具体例：

以下は、銀行の口座を模したシンプルな例です。

```java
public class BankAccount {
    private double balance;  // private変数

    public BankAccount(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
            System.out.println("Initial balance cannot be negative.");
        }
    }

    public double getBalance() {  // balanceの値を取得するためのpublicメソッド
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Cannot deposit negative amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}
```

この例で、`balance` は `private` として定義されているので、`BankAccount` クラスの外部から直接アクセスすることはできません。その代わり、`getBalance()`, `deposit()`, `withdraw()` といったメソッドを提供して、適切な操作を行うようにしています。

このようなカプセル化のアプローチをとることで、口座の残高が不正な値になることを防ぐことができます。例えば、直接のアクセスが許されていれば、誤って負の預金を設定するリスクがありますが、この方法ではそのような事態を防ぐことができます。

未経験のエンジニアに例えるなら、カプセル化は「家の鍵」のようなものです。家の中の貴重品やプライバシーを守るために、家の扉を施錠します。同様に、カプセル化を利用して、プログラムの特定の部分を守ることができます。