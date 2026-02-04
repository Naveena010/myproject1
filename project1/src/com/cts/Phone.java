package com.cts;

public abstract interface Phone {
    void call();
    void message();
    String country="india";

}
interface BudgetPhone extends Phone{
    void audioPlay();

}
interface SmartPhone extends Phone,BudgetPhone{
    void internetSurfing();
    void banking();
    void videoPlay();
    void gamePlay();
}
class MyPhone extends A implements phone,SmartPhone,BudgetPhone{

}
class A{

}
class B{

}
