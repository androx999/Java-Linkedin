import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

//import static java.nio.file.StandardOpenOption.READ;

public class InputOutputStreamUse {
    public static void main(String[] args) {
        Path inputPath = Paths.get("C:\\Users\\Coty Zepeda\\Documents\\Java(segundaP)\\ejemploJava.txt");
        Path outputPath = Paths.get("C:\\Users\\Coty Zepeda\\Documents\\Java(segundaP)\\ejemplo2Java.txt");;
        try {
            InputStream inputStream = Files.newInputStream(inputPath, StandardOpenOption.READ);

            Files.newOutputStream(outputPath, StandardOpenOption.CREATE);

            OutputStream outputStream = Files.newOutputStream(outputPath, StandardOpenOption.WRITE);

            int i;

            byte[] data= new byte[1024];
            while((i = inputStream.read(data)) != -1){
                outputStream.write(data);//Escribimos los datos leídos del fichero de entrada en el fichero
            }
            inputStream.close();
            outputStream.close();
        } catch (IOException e) {
           e.printStackTrace();
        }
    }
}

/*
Un stream es un flujo continuo de datos y en particular un input stream es un flujo continuo de datos de entrada

 Un output stream, que es un flujo de datos de salida. Un ejemplo de uso de streams de salida es cuando escribimos por pantalla con system.out.println

Un stream es un flujo continuo de datos y en particular un input stream es un flujo continuo de datos de entrada. Del mismo modo, existe un output stream, que es un flujo de datos de salida. Un ejemplo de uso de streams de salida es cuando escribimos por pantalla con system.out.println. Y un ejemplo de uso de streams de entrada es cuando leemos lo que introducimos por teclado con la clase scanner, que creamos con system.in. system.out es el stream de salida estándar y system.in es el stream de entrada estándar.
* InputStream
*
*  Path inputPath = Paths.get("C:\\Users\\Coty Zepeda\\Documents\\Java(segundaP)\\ejemploJava.txt");
        InputStream input;
        try {
            input = Files.newInputStream(inputPath, READ);
            int i;
            while((i = input.read()) != -1){
                System.out.println((char)i);
            }
            input.close();
        } catch (IOException e) {
           e.printStackTrace();
        }
*
* */