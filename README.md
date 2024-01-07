## static修飾子  
「static」とは「静的」という意味で、メソッドとフィールドにつけることができる。クラス自体に関連付けられ、インスタンス化することなく、直接クラス名を使って呼び出すことができる。　　
（！＝インスタンスメソッド＝インスタンス化されたオブジェクトに関連づけられる）

## 例  
クラス① 
```
public class StaticTest {
  public static int number = 1;
}
```
クラス②　（インスタンス生成なしでクラス①から直接staticフィールドを呼び出せる）
```
public class Test {
  public static void main(String[] args) {
    System.out.println(StaticTest.number)  //１を表示
  }
}
```

## 例２　　
親クラス
```
public class StaticTest {
  public static int number = 1;
}
```
子クラス　（継承関係にあるクラス内では、クラス名を書かずに親クラスのstaticフィールドを呼び出せる）
```
public class StaticTest2 extends StaticTest {
  public static void method() {
    System.out.println(number);
  }
}
```
実行クラス（インスタンス生成なしで子クラスのstaticメソッドを呼び出せる）
```
public class Test {
  public static void main(String[] args) {
    StaticTest2.method();  //1を表示　　
  }
}
```

## 注意点　　
# アクセス　
static メソッドから 非static フィールドへアクセス不可の例(逆はOK)
```
public class StaticTest {
  public int number = 0;
  ｐublic static void method() {
		System.out.println(number); 　  //number でエラーとなる
　　　　}
}
```
