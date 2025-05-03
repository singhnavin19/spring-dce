package com.nav.springRest;

import java.util.List;
class ABC{
    int id;
    public ABC(int id) {
        this.id = id;
    }
}
public class ListExample {

    public static void main(String[] args) {
        List<ABC> abcs=List.of(new ABC(10),new ABC(20));

        int id=20;
        for(ABC abc:abcs){
            if(abc.id==id){
                System.out.println(abc.id);
            }
        }
    }
}
