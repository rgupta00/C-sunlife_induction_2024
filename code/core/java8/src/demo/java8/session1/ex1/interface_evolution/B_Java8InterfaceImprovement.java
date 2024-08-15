package demo.java8.session1.ex1.interface_evolution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//me java 7
interface Stack{
    public void push(int x);
    public int pop();
}

//navneet
class StackImpl1 implements Stack{

    @Override
    public void push(int x) {

    }
    @Override
    public int pop() {
        return 0;
    }
}


//rashim
class StackImpl2 implements Stack{

    @Override
    public void push(int x) {

    }

    @Override
    public int pop() {
        return 0;
    }

}


public class B_Java8InterfaceImprovement{
    public static void main(String[] args) {
        
        Stack s=new StackImpl2();

    }
}
