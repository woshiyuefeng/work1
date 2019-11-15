public class ErrorCatchDIV extends Exception  {
    //
    public ErrorCatchDIV(){
        super();
    }
    public ErrorCatchDIV(String mgr ){

        super("Exception "+mgr+" arises");

    }
}
