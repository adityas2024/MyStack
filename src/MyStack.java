import java.util.LinkedList;
public class MyStack {
 private LinkedList list;

 public MyStack(){
     list = new LinkedList();
 }
 public boolean isEmpty(){
     return (list.size() ==0 );
 }
 public void push (Object item){
     list.add(item);
 }
public Object pop(){
     Object item = list.get(list.size()-1);
     list.remove(list.size()-1);
     return item;
}


}
