package builder;

import java.util.ArrayList;
import java.util.List;

public class Product {
    List<String> list = new ArrayList<>();

    public void add(String string){
        list.add(string);
    }

    public void show(){
        for (String s : list) {
            System.out.println(s);
        }
    }

}
