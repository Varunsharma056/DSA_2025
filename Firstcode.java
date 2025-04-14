package practicee;
import java.util.*;


class Rectangele{
    int length;
    int breadth;

    Rectangele(){
        length=breadth=1;

    }
    Rectangele(int l,int b){
        length=l;
        breadth=b;
    }
}

class Cuboid extends Rectangele{
    int height;
    Cuboid()
    {
        height=1;
    }
    Cuboid(int h){
        height=h;

    }
    Cuboid(int l,int b,int h){
        super(l,b);
        height=h;
    }
    int volume(){
        return length*breadth*height;
    }
}

public class Firstcode {

    
    public static void main(String arg[])
    {
        Cuboid c=new Cuboid(5,3,10);
        System.out.println(c.volume());


    }
}

//added the new comment here 
