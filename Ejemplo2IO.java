
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejemplo2IO {
    public static void main(String[] args) {
        FileReader flreader=null;
        try{
            flreader=new FileReader("/home/fabians7/Documentos/datos2.txt");
            BufferedReader bfread=new BufferedReader(flreader);
            String da=bfread.readLine();
            System.out.println(da);
            da=bfread.readLine();
            System.out.println(da);
        }catch(IOException e){
            System.out.println("error");
        }finally{
            try {
                flreader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        System.out.println("fin de programa");
    }
}
