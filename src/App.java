import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        String[] preguntas = {
            "¿Cuál es el animal más grande del mundo? (a) Elefante (b) Ballena (c) Hipopótamo",
            "¿Cuál es el río más largo del mundo? (a) Amazonas (b) Nilo (c) Mississippi",
            "¿En qué año se lanzó el primer iPhone? (a) 2005 (b) 2007 (c) 2010",
            "¿Cuál es la capital de Australia? (a) Sydney (b) Canberra (c) Melbourne",
            "¿Cuál es el color del caballo blanco de Napoleón? (a) Blanco (b) Negro (c) Gris",
            "¿Cuál es la montaña más alta del mundo? (a) Monte Everest (b) Montaña K2 (c) Montaña Kilimanjaro",
            "¿Cuál es el país más grande del mundo por superficie? (a) Rusia (b) Canadá (c) Estados Unidos",
            "¿Cuál es el metal más valioso del mundo? (a) Rodio (b) Oro (c) Platino",
            "¿Cuál es el número atómico del oxígeno? (a) 8 (b) 16 (c) 32",
            "¿Cuál es el inventor de la bombilla eléctrica? (a) Thomas Edison (b) Nikola Tesla (c) Isaac Newton"
        };

        String[] respuestas = {
            "b",
            "a",
            "b",
            "b",
            "a",
            "a",
            "a",
            "a",
            "a",
            "a"
        };
        int puntuacion = 0;


        Random rm = new Random();
        Scanner sc = new Scanner(System.in);


        // Conjunto para almacenar índices de preguntas ya utilizados
        Set<Integer> preguntasUtilizadas = new HashSet<>();


        while (preguntasUtilizadas.size() < preguntas.length) {
            int indiceAleatorio;
            do {
                indiceAleatorio = rm.nextInt(preguntas.length);
            } while (preguntasUtilizadas.contains(indiceAleatorio));


            preguntasUtilizadas.add(indiceAleatorio);


            System.out.println(preguntas[indiceAleatorio]);
            System.out.print("Respuesta: ");
            String respuestaUsuario = sc.nextLine().toLowerCase();


            if (respuestaUsuario.equals(respuestas[indiceAleatorio])) {
                System.out.println("¡Respuesta correcta!");
                puntuacion++;
            } else {
                System.out.println("Respuesta incorrecta");
            }


            System.out.println();
        }


        System.out.println("El juego ha terminado. Puntuacion final: " + puntuacion);
    }
}