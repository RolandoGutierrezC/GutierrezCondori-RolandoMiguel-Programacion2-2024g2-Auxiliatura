import java.util.*;

public class BorderlandsLootSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Map<String, Object>> lootList = new ArrayList<>();
        boolean continueFighting = true;

        System.out.println("¡Bienvenido al sistema de botín de Borderlands!");

        while (continueFighting) {
            Map<String, Object> loot = generarBotin();
            lootList.add(loot);
            imprimirBotin(loot);

            System.out.print("¿Quieres seguir enfrentándote a enemigos? (s/n): ");
            String respuesta = scanner.nextLine().trim().toLowerCase();
            if (respuesta.equals("n")) {
                continueFighting = false;
            }
        }

        imprimirResumen(lootList);
        scanner.close();
    }

    public static Map<String, Object> generarBotin() {
        Random random = new Random();
        Map<String, Object> botin = new HashMap<>();

        // Definir los tipos de botín
        String[] tipos = {"Arma", "Escudo", "Modificador"};
        String tipo = tipos[random.nextInt(tipos.length)];

        // Definir los niveles de rareza
        String[] rarezas = {"Común", "Poco Común", "Raro", "Épico", "Legendario"};
        String rareza = rarezas[random.nextInt(rarezas.length)];

        // Generar atributos específicos según el tipo de botín
        botin.put("tipo", tipo);
        botin.put("rareza", rareza);

        switch (tipo) {
            case "Arma":
                botin.put("daño", random.nextInt(100) + 1);
                botin.put("precision", random.nextInt(100) + 1);
                botin.put("cadencia", random.nextInt(100) + 1);
                break;
            case "Escudo":
                botin.put("capacidad", random.nextInt(500) + 1);
                botin.put("recarga", random.nextInt(100) + 1);
                botin.put("resistencia", random.nextInt(100) + 1);
                break;
            case "Modificador":
                botin.put("mejora", random.nextInt(50) + 1);
                botin.put("duracion", random.nextInt(300) + 1);
                botin.put("efecto", "Mejora de habilidad aleatoria");
                break;
        }

        return botin;
    }

    public static void imprimirBotin(Map<String, Object> botin) {
        String tipo = (String) botin.get("tipo");
        String rareza = (String) botin.get("rareza");

        System.out.println("\n¡Has encontrado un botín!");
        System.out.println("Tipo: " + tipo);
        System.out.println("Rareza: " + rareza);

        switch (tipo) {
            case "Arma":
                System.out.println("Daño: " + botin.get("daño"));
                System.out.println("Precisión: " + botin.get("precision"));
                System.out.println("Cadencia: " + botin.get("cadencia"));
                break;
            case "Escudo":
                System.out.println("Capacidad de absorción: " + botin.get("capacidad"));
                System.out.println("Tiempo de recarga: " + botin.get("recarga"));
                System.out.println("Resistencia: " + botin.get("resistencia"));
                break;
            case "Modificador":
                System.out.println("Mejora: " + botin.get("mejora"));
                System.out.println("Duración: " + botin.get("duracion"));
                System.out.println("Efecto: " + botin.get("efecto"));
                break;
        }
    }

    public static void imprimirResumen(List<Map<String, Object>> lootList) {
        System.out.println("\nResumen del botín obtenido:");
        for (Map<String, Object> botin : lootList) {
            imprimirBotin(botin);
            System.out.println("----------------------------");
        }
    }
}

