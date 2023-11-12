
package Controlador;

import Modelo.Producto;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import Bitacora.*;

/**
 *
 * @author usuario
 */
public class Manejador_productos {
    private Producto[] productos = new Producto[3];
    private Registro bitacora = new Registro();
    
    public Manejador_productos(){}
    
    //Procesos para validar la creacion del producto

    public void agregar_a_lista(String p_nombre, String url_registros) {
        bitacora.Escribir(this.getClass().getName(), "crea un nuevo producto");
        Producto nuevo = new Producto(p_nombre, url_registros);
        agregarlo(nuevo);
    }

    private void agregarlo(Producto nuevo) {
        boolean vacio = true;
        int espacio = 0;
        while(vacio && espacio < 3){
            if(productos[espacio] == null){
                productos[espacio] = nuevo;
                vacio = false;
            }
            espacio++;
        }
    }
    
    public Producto Producto_1(){
        bitacora.Escribir(this.getClass().getName(), "Se accede al producto_1");
        return productos[0];
    }
    
    public Producto Producto_2(){
        bitacora.Escribir(this.getClass().getName(), "Se accede al producto_2");
        return productos[1];
    }
        
    public Producto Producto_3(){
        bitacora.Escribir(this.getClass().getName(), "Se accede al producto_3");
        return productos[2];
    }

    public void historial() {
        bitacora.Escribir(this.getClass().getName(), "Se intenta acceder al historial");
        productos[0] = new Producto();
        productos[1] = new Producto();
        productos[2] = new Producto();
        String archivoTexto = "src\\main\\java\\Modelo\\Url_anterior\\Url_productos_anteriores"; // Ruta al archivo de texto que contiene los directorios

        // Leer el archivo de texto y almacenar los directorios en una lista
        try (BufferedReader br = new BufferedReader(new FileReader(archivoTexto))) {
            bitacora.Escribir(this.getClass().getName(), "Se accede al archivo y se crean los productos");
            String linea;
            linea = br.readLine();
            Nombrar_productos(linea);
            linea = br.readLine();
            productos[0].setUrl(linea);
            productos[0].setVotos(productos[0].contar_votos());
            linea = br.readLine();
            productos[1].setUrl(linea);
            productos[1].setVotos(productos[1].contar_votos());
            linea = br.readLine();
            productos[2].setUrl(linea);
            productos[2].setVotos(productos[2].contar_votos());
        } catch (IOException e) {
            bitacora.Escribir(this.getClass().getName(), "Archivo no encontrado - Error");
            e.printStackTrace();
        }
        
    }

    private void Nombrar_productos(String url) {
        // Listar archivos en el directorio
        File f = new File(url);
        try (BufferedReader br = new BufferedReader(new FileReader(f.getAbsolutePath()))) {
            String linea;
            // nombrar en productos
            linea = br.readLine();
            productos[0].setNombre(linea);
            linea = br.readLine();
            productos[1].setNombre(linea);
            linea = br.readLine();
            productos[2].setNombre(linea);
            bitacora.Escribir(this.getClass().getName(), "Se les dio su nombre a cada producto");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
