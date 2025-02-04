public class ej7 {


    /**
     * Indica se a segunda cadea (subCadea) é unha subcadea da primeira (cadeaPrincipal).
     * Por exemplo, "cadea" é unha subcadea de "subcadea".
     *
     * @param cadeaPrincipal a cadea principal na que se busca
     * @param subCadea a cadea que se quere comprobar se está contida na principal
     * @return true se subCadea é unha subcadea de cadeaPrincipal, false en caso contrario
     */
    public static boolean isSubstring(String cadeaPrincipal, String subCadea) {
        return cadeaPrincipal.contains(subCadea);
    }


    /**
     * Devolve a cadea que sexa anterior en orde alfabética.
     * Se as dúas cadeas son iguais, devolve calquera delas.
     * Por exemplo, se se reciben "kde" e "gnome", devolverá "gnome" (xa que "gnome" ve antes que "kde").
     *
     * @param cadea1 a primeira cadea
     * @param cadea2 a segunda cadea
     * @return a cadea que aparece primeiro en orde alfabética
     */
    public static String getEarlierAlphabetically(String cadea1, String cadea2) {
        if (cadea1.compareTo(cadea2) <= 0) {
            return cadea1;
        } else {
            return cadea2;
        }
    }


    public static void main(String[] args) {
        String cadeaPrincipal = "subcadea";
        String subCadea = "cadea";
        boolean isSub = isSubstring(cadeaPrincipal, subCadea);
        System.out.println("\"" + subCadea + "\" é unha subcadea de \"" + cadeaPrincipal + "\"? " + isSub);

        String cadea1 = "kde";
        String cadea2 = "gnome";
        String earlier = getEarlierAlphabetically(cadea1, cadea2);
        System.out.println("Entre \"" + cadea1 + "\" e \"" + cadea2 + "\", a que ve primeiro en orde alfabética é: " + earlier);
    }
}

