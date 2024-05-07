package syncronization.syncIssue;

public class Subtractor implements Runnable{
    Number number ;
    Subtractor(Number number){
        this.number = number;
    }

    @Override
    public void run() {
        subtract();
    }
    public void subtract(){
        for(int i = 1; i <= 100000 ;i++ ){
            number.number -= 1;
        }
    }
}
