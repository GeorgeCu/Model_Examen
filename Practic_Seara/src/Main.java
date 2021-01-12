import Controller.Controller;
import Repository.Repository;
import View.View;

public class Main {

    public static void main(String[] args) {
        Repository r = new Repository();
        Controller c= new Controller(r);
        View v=new View(c);
        v.run();
    }
}
