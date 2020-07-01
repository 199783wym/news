public class Father {
 static {
 System.out.println("⽗类静态代码块");
 }
 public Father(){
 System.out.println("father ⽆参构造函数");
 }
 public Father(int age){
 System.out.println("father 有参构造函数");
 }
 public void sleep(){
 System.out.println("father sleep⽅法");
 }
}
public class Children extends Father{
 static {
 System.out.println("Child静态代码块");
 }
 public Children(){
 //super();
 System.out.println("Child⽆参构造函数");
 super.sleep();
 }
 public void sleep(){
 System.out.println("Child sleep⽅法");
 }
}
