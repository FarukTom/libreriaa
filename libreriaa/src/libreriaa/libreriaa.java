/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreriaa;

/**
 *
 * @author FARUK TOM
 */import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

public class libreriaa {

   

    public void leerArchivo() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\FARUK TOM\\Desktop\\programaciones\\capeta de visual\\Prueba2//Prueba.txt"));
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void escribirArchivo() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("prueba2.txt"));

            writer.write("hola mundo");

            writer.close();
        } catch (IOException e) {
            Logger.getLogger(libreria.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void crearArchivo() {
        try {
            Path archivo = Paths.get("nuevo.txt");
            Files.createDirectories(archivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void copiarArchivo() {
        try {
            Path archivoOrigen = Paths.get("archivo.txt");
            Path archivoDestino = Paths.get("copia.txt");
            Files.copy(archivoOrigen, archivoDestino);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void borrarArchivo(Path archivo) {
        try {
            Files.deleteIfExists(archivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void moverArchivo(String archivoOrigen, String archivoDestino) {
        try {
            File origen = new File(archivoOrigen);
            File destino =new File(archivoDestino);
            
            
            
            
            
            
            origen.renameTo(destino);
        } catch (Exception e) {
            e.printStackTrace();
        }
    } 
    
    public static void main(String[] args) {
        moverArchivo("Prueba//Prueba.txt", "Prueba2//Prueba.txt");
    
    }

}