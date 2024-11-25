package hust.soict.dsai.garbage;

public class NoGarbage{
    public static void main(String[] args){
        StringBuilder Build_Garbage = new StringBuilder();
        long start = System.CurrentTimeMillis();
        for(int i = 0; i < Interger.MAX_VALUE; i++){
            Build_Garbage.append(i);
            if(i%100000 == 0){
                Build_Garbage.length(0);
            }
        }
        long end = System.CurrentTimeMillis();
        System.out.println("Execution time: " + (end - start) + " ms.");
    }
}