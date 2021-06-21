package fr.epsi.junit;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class StringTransform {
    public String concat(String... c){
        String ret = "";
        for(var item:c){
           // if(item != null){
              //  ret += item;
            //}
            if(item != null) {
                ret = ret.concat(item);
            }
        }
        return ret;
    }
}






