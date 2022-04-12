package abstraction;

import com.sun.corba.se.spi.orbutil.threadpool.Work;

public class YoungerBrother {
    WorkFormMom work;

    YoungerBrother(WorkFormMom object){
        this.work = object;
    }

    void doIt(){
        work.homeWork();
    }

}
