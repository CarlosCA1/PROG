import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class XestorTarefas {
    private static final String FILE_NAME = "tarefas.dat";
    private static List<Tarefa> tarefas = new ArrayList<>();

    public static void main(String[] args) {
        cargarTarefas();

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENÚ DE TAREFAS ---");
            System.out.println("1. Engadir nova tarefa");
            System.out.println("2. Modificar tarefa");
            System.out.println("3. Borrar tarefa");
            System.out.println("4. Listar tarefas");
            System.out.println("0. Saír");
            System.out.print("Escolle unha opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcion) {
                case 1 -> engadirTarefa(sc);
                case 2 -> modificarTarefa(sc);
                case 3 -> borrarTarefa(sc);
                case 4 -> listarTarefas();
                case 0 -> System.out.println("Gardando e saíndo...");
                default -> System.out.println("Opción non válida.");
            }
        } while (opcion != 0);

        gardarTarefas();
        sc.close();
    }

    private static void engadirTarefa(Scanner sc) {
        try {
            System.out.print("Nome da tarefa: ");
            String nome = sc.nextLine();
            System.out.print("Descrición: ");
            String desc = sc.nextLine();
            System.out.print("Data (AAAA-MM-DD): ");
            LocalDate data = LocalDate.parse(sc.nextLine());
            System.out.print("Hora (HH:MM): ");
            LocalTime hora = LocalTime.parse(sc.nextLine());
            System.out.print("Duración (en minutos): ");
            int duracion = sc.nextInt();
            sc.nextLine();
            System.out.print("Está feita? (s/n): ");
            boolean feita = sc.nextLine().equalsIgnoreCase("s");

            tarefas.add(new Tarefa(data, hora, duracion, nome, desc, feita));
            System.out.println("Tarefa engadida.");
        } catch (Exception e) {
            System.out.println("Erro ao introducir a tarefa: " + e.getMessage());
        }
    }

    private static void modificarTarefa(Scanner sc) {
        listarTarefas();
        System.out.print("Número da tarefa a modificar: ");
        int i = sc.nextInt() - 1;
        sc.nextLine();
        if (i >= 0 && i < tarefas.size()) {
            Tarefa t = tarefas.get(i);
            System.out.println("Modificando tarefa: " + t.getNome());

            System.out.print("Novo nome (" + t.getNome() + "): ");
            String nome = sc.nextLine();
            if (!nome.isEmpty()) t.setNome(nome);

            System.out.print("Nova descrición (" + t.getDescripcion() + "): ");
            String desc = sc.nextLine();
            if (!desc.isEmpty()) t.setDescripcion(desc);

            System.out.print("Nova data (" + t.getData() + "): ");
            String novaData = sc.nextLine();
            if (!novaData.isEmpty()) t.setData(LocalDate.parse(novaData));

            System.out.print("Nova hora (" + t.getHora() + "): ");
            String novaHora = sc.nextLine();
            if (!novaHora.isEmpty()) t.setHora(LocalTime.parse(novaHora));

            System.out.print("Nova duración (" + t.getDuracion() + "): ");
            String duracion = sc.nextLine();
            if (!duracion.isEmpty()) t.setDuracion(Integer.parseInt(duracion));

            System.out.print("Está feita? (s/n): ");
            String feita = sc.nextLine();
            if (!feita.isEmpty()) t.setFeita(feita.equalsIgnoreCase("s"));

            System.out.println("Tarefa modificada.");
        } else {
            System.out.println("Número incorrecto.");
        }
    }

    private static void borrarTarefa(Scanner sc) {
        listarTarefas();
        System.out.print("Número da tarefa a borrar: ");
        int i = sc.nextInt() - 1;
        sc.nextLine();
        if (i >= 0 && i < tarefas.size()) {
            tarefas.remove(i);
            System.out.println("Tarefa borrada.");
        } else {
            System.out.println("Número incorrecto.");
        }
    }

    private static void listarTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Non hai tarefas.");
        } else {
            int i = 1;
            for (Tarefa t : tarefas) {
                System.out.println(i++ + ".\n" + t);
            }
        }
    }

    @SuppressWarnings("unchecked")
    private static void cargarTarefas() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            tarefas = (List<Tarefa>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            tarefas = new ArrayList<>(); // se non hai ficheiro, comezamos baleiro
        }
    }

    private static void gardarTarefas() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(tarefas);
        } catch (IOException e) {
            System.out.println("Erro ao gardar tarefas: " + e.getMessage());
        }
    }
}
