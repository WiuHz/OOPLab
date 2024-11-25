package hust.soict.dsai.garbage;

public class CreateGarbage{
    public static void main(String[] args){
        String gb = "";
        long start = System.CurrentTimeMillis();

        try{
            for(int i = 0; i < Interger.MAX_VALUE; i++){
                gb += i;
            }
        }
        catch(OutOfMemoryError e){
            System.err.println("Outofmemory encounter.");
        }
        long end = System.CurrentTimeMillis();
        System.out.println("Execution time: " + (end - start) + " ms.");
    }
}