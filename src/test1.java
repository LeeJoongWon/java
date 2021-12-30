public class test1 extends Exception{
    private int port = 772;

    public test1(String msg){
        super(msg);
    }

    public test1(String msg, int port){
        super(msg);
        this.port = port;
    }

    public int getPort(){
        return port;
    }
}
