package src;

import java.util.Scanner;

public class main {
    public static void main(String args[])
    {
        int choice=0;
        Token token;
        Scanner in=new Scanner(System.in);
        QueueManager qm=new QueueManager();
        while (true) { 
            System.out.println("\n\n1:Take Token");
            System.out.println("2:View Queue");
            System.out.println("3:Call next Token");
            System.out.println("4:Cancel Token");
            System.out.println("5:Exit");
            System.out.println("Enter choice:");
            choice=in.nextInt();
            switch(choice)
            {
                case 1: token=qm.generate_token();
                System.out.println("Toke No: "+token.tokenno);
                break;
                case 2:qm.viewQueue();
                break;
                case 3: token=qm.call_next();
                if(token==null)
                {
                    System.out.println("The Queue is empty");
                }
                else{
                    System.out.println("Next Token :"+token.tokenno);
                }
                break;
                case 4:System.out.println("Enter Token Number To Cancel");
                int tokeno=in.nextInt();
                boolean check=qm.canceltoken(tokeno);
                if(check)
                {
                    System.out.println("Token Cancelled");
                }
                else{
                    System.out.println("Token Not Found");
                }
                break;
                case 5:
                System.exit(1);

            }
        }
    }
}
