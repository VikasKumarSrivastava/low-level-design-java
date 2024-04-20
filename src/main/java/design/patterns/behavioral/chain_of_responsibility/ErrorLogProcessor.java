package design.patterns.behavioral.chain_of_responsibility;

public class ErrorLogProcessor extends LogProcessor{
    public ErrorLogProcessor(LogProcessor next) {
        super(next);
    }

    @Override
    public void log(String level, String msg) {
        if(Main.ERROR.equals(level)){
            System.out.println("Error: "+msg);
        }else{
            super.log(level, msg);
        }
    }
}
