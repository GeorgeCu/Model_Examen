package View;

import Controller.Controller;

import java.io.File;
import java.util.Scanner;

public class View {
    Controller c;
    public View(Controller c)
    {
        this.c=c;
    }
    private void printMenu(){
        System.out.println("Menu\n");
        System.out.println("1.Give me the text file");
        System.out.println("2.Exit\n");
    }

    public void run(){
        boolean run1=true;
        Scanner in=new Scanner(System.in);

        while(run1){
            this.printMenu();
            String cmd  = in.nextLine();
            if(cmd.equals("1"))
                { String file  = in.nextLine();
                    System.out.println(this.c.getCountriesFromFile(file));
                }
            if(cmd.equals("2"))
            {
                run1 = false;
            }
           }
        }
    }



