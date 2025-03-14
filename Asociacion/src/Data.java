public class Data {
    public class Fecha {
        private int dia;
        private int mes;
        private int año;

        public Fecha(int d, int m, int a) {
            setAño(a);
            setMes(m);
            setDia(d);
        }

        public int getDia() {
            return dia;
        }

        public void setDia(int dia) {
            if (dia > 0 && dia <= diasMes()) {
                this.dia = dia;
            } else {
                System.out.println("Día inválido");
                this.dia = 1;
            }
        }

        public int getMes() {
            return mes;
        }

        public void setMes(int mes) {
            if (mes >= 1 && mes <= 12) {
                this.mes = mes;
            } else {
                System.out.println("Mes inválido");
            }
        }

        public int getAño() {
            return año;
        }

        public void setAño(int año) {
            if (año >= 1) {
                this.año = año;
            } else {
                System.out.println("Año inválido");
            }
        }

        public boolean esBisiesto() {
            return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
        }

        public void incrementarDia() {
            if (dia == diasMes()) {
                dia = 1;
                incrementarMes();
            } else {
                dia++;
            }
        }

        public void incrementarMes() {
            if (mes == 12) {
                mes = 1;
                incrementarAño();
            } else {
                mes++;
            }
        }

        public void incrementarAño() {
            año++;
        }

        public void mostrarFecha() {
            System.out.println(dia + "/" + mes + "/" + año);
        }

        private int diasMes() {
            int[] diasMaxMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            if (esBisiesto() && mes == 2) {
                return 29;
            }
            return diasMaxMes[mes - 1];
        }
        public String toString (){
            return "La fecha es: " + dia + "/" + mes + "/" + año;
        }

        public boolean fechaIgual (Fecha otraFecha) {
            if ((dia==otraFecha.dia)&&(mes==otraFecha.mes)&&(año==otraFecha.año)) return true;
            else return false;
        }
        public boolean equals (Fecha otraFecha) {
            if ((dia == otraFecha.dia) && (mes == otraFecha.mes) && (año == otraFecha.año)) return true;
            else return false;
        }
    }
}
