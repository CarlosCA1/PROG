public class Ej11 {
    public static void main(String[] args) {
        String nombreApellido = "jaIMe roDRíguez";
        System.out.println(formatoNombre(nombreApellido));
    }
    public static String formatoNombre (String nombreApellido){
        String nombreSinEspacios = nombreApellido.replace(" ", ""); //.trim
            String cambiar = String.valueOf(nombreSinEspacios.charAt(0));
            String cambiar2 = cambiar.toUpperCase();
        String cambiar3 = String.valueOf(nombreSinEspacios.charAt(5));
        String cambiar4 = cambiar3.toUpperCase();
        String minusculas = nombreSinEspacios.substring(1,5).toLowerCase();
        String minusculas2 = nombreSinEspacios.substring(6).toLowerCase();
            nombreSinEspacios = cambiar2 + minusculas + cambiar4 + minusculas2;
        return nombreSinEspacios;
    }
}
