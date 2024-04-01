// Clase Bicicleta (TODO)
public class Bicicleta {
    private String modelo;
    private String color;
    private int tamaño;

    // Clase Rueda (Componente)
    public class Rueda {
        private int tamaño;
        private String tipo;
        private int presión;

        // Getters y setters
        public int getTamaño() {
            return tamaño;
        }

        public void setTamaño(int tamaño) {
            this.tamaño = tamaño;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public int getPresión() {
            return presión;
        }

        public void setPresión(int presión) {
            this.presión = presión;
        }
    }

    // Clase Cuadro (Componente)
    public class Cuadro {
        private String material;
        private int peso;
        private int altura;

        // Getters y setters
        public String getMaterial() {
            return material;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        public int getPeso() {
            return peso;
        }

        public void setPeso(int peso) {
            this.peso = peso;
        }

        public int getAltura() {
            return altura;
        }

        public void setAltura(int altura) {
            this.altura = altura;
        }
    }

    // Métodos de la clase Bicicleta
    public Bicicleta(String modelo, String color, int tamaño) {
        this.modelo = modelo;
        this.color = color;
        this.tamaño = tamaño;
    }

    // Getters y setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
}

// Clase Principal para la Prueba
public class Main {
    public static void main(String[] args) {
        Bicicleta bicicleta = new Bicicleta("Mountain Bike", "Negro", 26);

        Bicicleta.Rueda ruedaDelantera = bicicleta.new Rueda();
        ruedaDelantera.setTamaño(26);

        Bicicleta.Rueda ruedaTrasera = bicicleta.new Rueda();
        ruedaTrasera.setTamaño(26);

        Bicicleta.Cuadro cuadro = bicicleta.new Cuadro();
        cuadro.setMaterial("Aluminio");

        System.out.println("Modelo de la bicicleta: " + bicicleta.getModelo());
        System.out.println("Tamaño de la rueda delantera: " + ruedaDelantera.getTamaño());
        System.out.println("Material del cuadro: " + cuadro.getMaterial());
    }
}
