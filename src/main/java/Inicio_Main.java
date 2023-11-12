


import Controlador.*;
import Vista.Votaciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author usuario
 */
public class Inicio_Main {

    public static void main(String[] args) {
        if(Revisar_historial()){
            Manejador_productos listado = new Manejador_productos();
            listado.historial();
            Votaciones inicio = new Votaciones(listado);
            inicio.setVisible(true);
        }else{
            Votaciones inicio = new Votaciones();
            inicio.setVisible(true);
        }
//        Votaciones inicio = new Votaciones();
//        inicio.setVisible(true);
    }

    private static boolean Revisar_historial() {
        String archivoTexto = "src\\main\\java\\Modelo\\Url_anterior\\Url_productos_anteriores"; 
        List<String> directorios = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(archivoTexto))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                directorios.add(linea);
                System.out.println(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        int contar_directorios = 0;
        // Verificar la existencia de cada directorio
        for (String directorio : directorios) {
            Path path = FileSystems.getDefault().getPath(directorio);
            if (Files.exists(path)) {
                contar_directorios++;
                System.out.println("El directorio existe: " + directorio);
            } else {
                System.out.println("El directorio no existe: " + directorio);
            }
        }
        
        if(contar_directorios == 4){
            System.out.println("paso");
            return true;
        }
        return false;
    }
}
