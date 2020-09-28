/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class OperacionArchivo {
    
//metodo para escribir datos en un archivo
    
    public void escribirArchivo(Estudiante estudiante) {
        
        File file=new File("/home/fabians7/Documentos/estudiantes.txt");
        //File file=new File("D:\\estudiantes.txt");
        
        FileWriter flwriter=null;
        
        try {
            if(file.exists()){
                flwriter=new FileWriter("/home/fabians7/Documentos/estudiantes.txt",true);
                //flwriter=new FileWriter("D:\\estudiantes.txt",true);
            }else{
                //para crear el archivo
                flwriter=new FileWriter("/home/fabians7/Documentos/estudiantes.txt");
            }
            
            BufferedWriter bfwriter=new BufferedWriter(flwriter);
            
            //insertar datos al archivo
            
            bfwriter.write(estudiante.getCi()+","+estudiante.getNombres()+","+estudiante.getApellidos()
                +","+estudiante.getTelefono()+","+estudiante.getDireccion());
            //para salto de linea
            bfwriter.write("\n");
            
            
    
            bfwriter.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if(flwriter!=null){
                try {
                    flwriter.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
        
    }
    //metodo para leer datos de un archivo
    
    public static ArrayList<Estudiante> leerArchivo(){
        
        File file=new File("/home/fabians7/Documentos/estudiantes.txt");
        //File file=new File("D:\\estudiantes.txt");
        
        ArrayList<Estudiante> listaEstudiantes=new ArrayList<>();
        
        Scanner scanner;
        
        try {
            
            scanner=new Scanner(file);
            //
            while(scanner.hasNextLine()){
                
                String linea=scanner.nextLine();
                //linea="123,fabian,sierra,1234132,llallagua";
                        
                Scanner delimitar=new Scanner(linea);
                
                delimitar.useDelimiter("\\s*,\\s*");
                
                Estudiante e=new Estudiante();
                
                e.setCi(delimitar.next());
                e.setNombres(delimitar.next());
                e.setApellidos(delimitar.next());
                e.setTelefono(delimitar.next());
                e.setDireccion(delimitar.next());
                
                listaEstudiantes.add(e);
                        
            }
            
            scanner.close();
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        return listaEstudiantes;
    }
}
