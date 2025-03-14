public class Personaxe {
    private String nome;
    private int vida;
    private int resistencia;
    private int forza;
    private int velocidade;
    private int experiencia;
    private String apariencia;
    private String[] habilidades;
    private String[] equipamento;

    public Personaxe() {
        nome = "Invitado";
        vida = 3;
        resistencia = 3;
        forza = 3;
        velocidade = 3;
        experiencia = 1;
        apariencia = "Soldado raso";
        habilidades = new String[5];
        equipamento = new String[5];
    }

    public Personaxe(String nom, int vida, int res, int forza, int vel, int exp, String apariencia, String[] habilidades, String[] equipamento) {
        nome = nom;
        setVida(vida);
        setResistencia(res);
        setForza (forza);
        setVelocidade (vel);
        setExperiencia(exp);
        this.apariencia = apariencia;
        setHabilidades(habilidades);
        setEquipamento(equipamento);
    }

    public void setNome (String nome){
        this.nome = nome;
    }
    
    public String getNome (){
        return nome;
    }

    public void setVida (int vida){
        if (vida>=0&&vida<=5) this.vida = vida;
        else this.vida=3;
    }

    public int getVida (){
        return vida;
    }

    public void setResistencia (int resistencia){
        if (resistencia>=0&&resistencia<=5) this.resistencia = resistencia;
        else this.resistencia=0;
    }

    public int getResistencia (){
        return resistencia;
    }

    public void setForza (int forza){
        if (forza >= 0 && forza <= 5) this.forza = forza;
        else this.forza = 0;
    }

    public int getForza (){
        return forza;
    }

    public void setVelocidade (int velocidade){
        if (velocidade >= 0 && velocidade <= 5) this.velocidade = velocidade;
        else this.velocidade = 3;
    }

    public int getVelocidade (){
        return velocidade;
    }

    public void setExperiencia(int experiencia){
        if (experiencia >= 0 && experiencia <= 5) this.experiencia = experiencia;
        else this.experiencia = 0;
    }

    public int getExperiencia (){
        return experiencia;
    }

    public void setApariencia (String apariencia){
        this.apariencia = apariencia;
    }

    public String getApariencia (){
        return apariencia;
    }

    public String[] getHabilidades (){
        return habilidades;
    }

    public String[] getEquipamento (){
        return equipamento;
    }

    public void setHabilidades(String[] habilidades) {
        this.habilidades= new String [5];
        int numHabilidades = habilidades.length;
        if (numHabilidades > 5) numHabilidades = 5;
        for (int i = 0; i < numHabilidades; i++) {
            this.habilidades[i] = habilidades[i];
        }
    }

    public void setEquipamento(String[] equipamento) {
        this.equipamento= new String [5];
        int numEquipamento = equipamento.length;
        if (numEquipamento > 5) numEquipamento = 5;
        for (int i = 0; i < numEquipamento; i++) {
            this.equipamento[i] = equipamento[i];
        }
    }

    public static void main(String[] args) {
        String[] hab = {"Saltar", "X-ray", "Transformar"};
        String[] equip = {"Pistola", "Katana", "Lanzachamas", "Ballesta", "Pedra"};
        Personaxe mario = new Personaxe("Mario Bros", 5, 6, 9, 10, 1, "normal", hab, equip);
    }
}