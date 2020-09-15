import java.io.*;

public class ManejoIO {
    
    public static void main(String[] args) {
        
        File file=new File("/home/fabians7/Documentos/datos.txt");
        
        //File file=new File("F:\\datos.txt");
        
        //para saber si el archivo si existe o no true false
        System.out.println(file.exists());
        //
        System.out.println(file.isDirectory());
        //para capturar el nombre del archivo
        System.out.println(file.getName());
        //capturamos la direccion
        System.out.println(file.getPath());
        //para saber el tamaño del archivo
        System.out.println(file.length());
        
        
    }
}
