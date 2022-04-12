package abstraction;

abstract class Abs{
    abstract void sum();//abstract method
    abstract void sum(int a);
}
abstract class Ab extends Abs{

}

class Sample extends Ab{

    @Override
    void sum() {

    }

    @Override
    void sum(int a) {

    }
}

public class AbstractionEx extends Abs{

    @Override
    void sum(){

    }
    @Override
    void sum(int a){

    }
}

//abstract  //interface

//abstract method
//abstract class

