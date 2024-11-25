package hust.soict.dsai.garbage;

import java.util.Random;
public class LoopsConcatenation{
    public static void main(String[] args){
        Random rd = new Random();
        long start = System.CurrentTimeMillis();
        String str = "";
        for(int i = 0; i < 65536; i++){
            str += rd.nextInt(2);
        }
        System.out.println("Using operator: " + (System.CurrentTimeMillis() - start) + " ms.");
        StringBuffer buff = new StringBuffer();
        for(int i = 0; i < 65536; i++){
            buff.append(rd.nextInt(2));
        }
        str = buff.toString();
        System.out.println("Using StringBuffer: " + (System.CurrentTimeMillis() - start) + " ms.");
        StringBuilder build = new StringBuilder();
        for(int i = 0; i < 65536; i++){
            build.append(rd.nextInt(2));
        }
        str = build.toString();
        System.out.println("Using StringBuilder: " + (System.CurrentTimeMillis() - start) + " ms.");
    }
}