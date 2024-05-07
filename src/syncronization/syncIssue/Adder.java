package syncronization.syncIssue;

public class Adder implements Runnable{
    Number number ;
    Adder(Number number){
        this.number = number;
    }

    @Override
    public void run() {
        add();
    }
    public void add(){
        for(int i = 1; i <= 100000 ;i++ ){
            number.number += 1;
        }
    }
}
