
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class EjemploIO {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String n1,n2,n3,n4;
        FileWriter flwrite=null;
        try{
            
            flwrite=new FileWriter("/home/fabians7/Documentos/datos2.txt");
            
            BufferedWriter bfwriter=new BufferedWriter(flwrite);
            n1=leer.nextLine();
            
            bfwriter.write(n1+"\n");
            n2=leer.nextLine();
            
            bfwriter.write(n2+"\n");
            bfwriter.write(n1+"\n");
            bfwriter.write(n1+"\n");
            
            
            bfwriter.close();
        }catch(IOException e){
            System.out.println("error no existe");
        }finally{
            if(flwrite!=null){
                try{
                    flwrite.close();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
            
        }
        
        
        System.out.println("fin del programa");
    }
}
