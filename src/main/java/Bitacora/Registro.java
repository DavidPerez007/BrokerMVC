
package Bitacora;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author usuario
 */
public class Registro {
    private final String bitacora_txt = "src\\\\main\\\\java\\\\Bitacora\\\\Bitacora.txt";

    public Registro() {}
    
    private String dia_hora() {
        LocalDateTime actualidad = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:ss");
        String fecha_voto = actualidad.format(formato);
        return fecha_voto;
    }

    public void Escribir(String clase, String mensaje) {
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader(bitacora_txt));
            BufferedWriter writer = new BufferedWriter(new FileWriter(bitacora_txt, true));
            
            String linea;
            while ((linea = reader.readLine()) != null) {
            }
            if((linea == null || linea.trim().isEmpty())){
                writer.write(clase + " "+mensaje + " " + dia_hora());
                writer.newLine();
            }
         
            reader.close();
            writer.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Registro a bitacora con éxito.");
    }

    
}

