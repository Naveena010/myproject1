public class Welcome {
    void hello(String s){
        System.out.println("hello "+s);
    }
}
class Greeting extends Welcome{
    @Override
    public void hello(String s){
        System.out.println("greeting "+ s);

    }
    public static void main(String[] args){
        Greeting greeting=new Greeting();
        greeting.hello( s:"mohan kumar");
    }
}
/*
public
protected
default

 */
