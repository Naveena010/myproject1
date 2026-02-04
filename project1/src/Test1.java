public class Test1 {
    int x;
    public Test1(int x){
        this.x=x;

    }
}
class Test2 extends Test1{
    Test2(){
        super(x: 100);
    }
    public static void main (String[] args){
        Test2 t=new Test2();
        System.out.println();
    }

}

