package src;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
public class QueueManager {
    private Queue<Token> queue;
    private int tokencounter=0;
    public QueueManager(){
        queue=new LinkedList<>();
    }
    public Token generate_token()
    {
        tokencounter++;
        Token token=new Token(tokencounter);
        queue.add(token);
        return token;
    }
    public Token call_next()
    {
        if(queue.isEmpty())
        {
            return null;
        }
        Token token=queue.poll();
        return token;
    }
    public void viewQueue()
    {
        System.out.println("QUEUE:\n");
        for(Token token:queue)
        {
            System.out.println("TOKEN NO "+token.tokenno);
        }
    }
    

    public boolean canceltoken(int tokennumber)
    {
        Iterator<Token> it = queue.iterator();
        while(it.hasNext())
        {
            Token token = it.next();
            if(token.tokenno == tokennumber)
            {
                it.remove(); 
                return true;
            }
        }
    return false;
    }

    public boolean isEmpty()
    {
        if(queue.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
