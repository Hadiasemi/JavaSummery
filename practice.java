import java.util.*;
import java.util.Map;
class practice{


  public static void main(String[]args){
    Map<String,Trainer> train=new HashMap<>();
    train.put("red",new Trainer("40","Hadi"));
    train.put("blue",new Trainer("401","Had"));
    train.put("Yellow",new Trainer("402","Ha"));
    train.put("black",new Trainer("403","H"));
    for(Map.Entry<String,Trainer>data:train.entrySet()){
      System.out.println("Color: "+(String)data.getKey()+" id: "+(String)data.getValue().getID());
    }

  }
}
