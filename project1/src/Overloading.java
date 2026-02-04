public class Overloading {
    void addition(int a,int b){
        System.out.println("addition is "+(a+b));
    }
    void addition(int a,int b,int c){
        System.out.println("addition is "+(a+b));
    }
    void addition(float a,float b){
        System.out.println("addition is "+(a+b));
    }
    void addition(String a,String b){
        System.out.println("addition is "+(a+b));
    }
    public static void main(String[] args){
        Overloading overloading=new overloading();
        overloading.addition(a: 11,b: 12,c: 13);
    }
}
