package src;

public class Token {
    public static int wait=1;
    public static int servering=2;
    public static int served=3;
    public int status;
    public int tokenno;
    public Token(int tokenno)
    {
        this.tokenno=tokenno;
        this.status=wait;
    }
    public int gettoken_number()
    {
        return this.tokenno;
    }
    public int gettoken_status()
    {
        return this.status;
    }
    public void set_status(int status)
    {
        switch(status)
        {
            case 1:this.status=wait;
            break;
            case 2:this.status=servering;
            break;
            case 3:this.status=served;
            break;
            
        }
    }
}
