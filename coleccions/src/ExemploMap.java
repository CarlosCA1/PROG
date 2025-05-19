import java.util.*;

public class ExemploMap {
    public static void main (String []args){
        Map<String,Integer> mapa = new HashMap<>();
        mapa.put("Ana",23);
        mapa.put("Jose",32);
        mapa.put("Ramón",13);
        mapa.put("Ramón",33);
        System.out.println(mapa);
        System.out.println(mapa.get("Ramón"));
        mapa.remove("Ramón");
        mapa.clear();
        System.out.println(mapa);
        if(mapa.containsKey("Ramón")) System.out.println("Existe Ramón");
        else System.out.println("Non existe Ramón");
        if(mapa.containsKey(33)) System.out.println("Existe");
        else System.out.println("Non existe");

        Set <String> claves = mapa.keySet();
        System.out.println(claves);
        Iterator<String> itClaves;
        for (itClaves = claves.iterator(); itClaves.hasNext();){
            String clave = itClaves.next();
            System.out.println("Clave: " + clave);
            System.out.println("Valor: " + mapa.get(clave));
        }
        Collection <Integer> valores = mapa.values();
        System.out.println(valores);
        Set<Map.Entry<String,Integer>> entradas = mapa.entrySet();
        System.out.println(entradas);
        Iterator<Map.Entry<String,Integer>> it;
        for(it=entradas.iterator();it.hasNext();){
            Map.Entry<String,Integer> elemento = it.next();
            System.out.println("Valor: " + elemento.getValue());
            System.out.println("Clave: " + elemento.getKey());
            if(elemento.getValue()>40) it.remove();
        }
        System.out.println(mapa);
    }
}
