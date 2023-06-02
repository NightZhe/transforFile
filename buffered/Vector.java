public class Vector {
    private int x ;
    private int y ;

    public Vector(){
        this(10);
    }

    public  Vector(int initValue){
        x =initValue;
        y =initValue+1;

        System.out.println("x:"+x+","+"y:"+y);

  
    }
}
