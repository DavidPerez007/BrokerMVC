package Controlador;

import Bitacora.Registro;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Manejador_asignar {
    private String[] nombres = new String[3];
    private String[] registros = new String[3];
    private String archivo_nombres = "";
    private String directorio = "";
    private Registro bitacora = new Registro();
    
    public Manejador_asignar(){}
    
    
    public String[] Nombrar_productos(File Productos_file) {
        archivo_nombres = Productos_file.getAbsolutePath();
        try (BufferedReader br = new BufferedReader(new FileReader(Productos_file.getAbsolutePath()))) {
            // nombrar en productos
            bitacora.Escribir(this.getClass().getName(), "Se asigna los nombres de los objetos");
            nombres[0] = br.readLine();
            nombres[1] = br.readLine();
            nombres[2] = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return nombres;
    }
    
    public String[] Registros(File Carpeta){
        bitacora.Escribir(this.getClass().getName(), "Se obtiene el directorio de la carpeta");
        directorio = Carpeta.getAbsolutePath();
        bitacora.Escribir(this.getClass().getName(), "Se asigna sus directorios");
        
        // Listar archivos en el archivo_nombres
        File[] archivos = Carpeta.listFiles();
        if (archivos != null) {
            for (File archivo : archivos) {
                if (archivo.isFile()) {
                    if(!archivo_de_productos(archivo)){
                    }
                    if(archivo.getName().equals(nombres[0] + ".txt")){
                        registros[0] =archivo.getName();
                    }
                    if(archivo.getName().equals(nombres[1] + ".txt")){
                        registros[1] =archivo.getName();
                    }
                    if(archivo.getName().equals(nombres[2] + ".txt")){
                        registros[2] =archivo.getName();
                    }
                }
            }
        } else {
            System.out.println("El directorio está vacío o no se pudo acceder.");
        }
        return registros;
    }
    
    private boolean archivo_de_productos(File archivo) {
        if(archivo.getName().equals(nombres[0])){
            return true;
        } else if(archivo.getName().equals(nombres[1])){
            return true;
        } else if (archivo.getName().equals(nombres[2])){
            return true;
        }
        return false;
    }
    
    public void registrar_historial() {
        bitacora.Escribir(this.getClass().getName(), "Se Asigna el nuevo historial que se utilizara");
        
        try (BufferedWriter writer = new BufferedWriter (new FileWriter("src\\main\\java\\Modelo\\Url_anterior\\Url_productos_anteriores"))) {
            writer.write(archivo_nombres);
            writer.newLine();
            writer.write(directorio + "\\" + registros[0]);
            writer.newLine();
            writer.write(directorio + "\\" + registros[1]);
            writer.newLine();
            writer.write(directorio + "\\" + registros[2]);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Archivo sobrescrito con éxito.");
    }
    
}
