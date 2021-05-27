public class Contador {
    int contador ;

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public Contador() {
    }

    public Contador(int contador) {
        this.contador = contador;
    }
    public  Contador(Contador c){
        contador = c.contador;
    }

    public void incrementar(int i){
        contador += i;
    }
    public void decrementar(int i){
        contador -= i;
    }
}
