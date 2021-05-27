public class Fraccion {

    private int numerador;
    private int denominador;

    public Fraccion(int n,int d)
    {
        setDenominador(n);
        setDenominador(d);
    }

    public Fraccion multiplicar(Fraccion a , Fraccion b)
    {
      Fraccion x = new Fraccion(a.numerador * b.numerador,a.denominador * b.denominador);
      return x;
    }

    public int multiplicar(int a , int b)
    {
        return a*b;
    }

    public Fraccion dividir(Fraccion a , Fraccion b)
    {
      Fraccion x = new Fraccion(a.numerador * b.denominador,b.denominador * a.numerador);
      return x;
    }

    public int dividir(int a , int b){
            return a / b;
    }

    public void simplificar()
    {
        int i=2;
        while( i<=numerador && i<=denominador )
        {
            if( numerador%i==0 && denominador%i==0 )
            {
                numerador = numerador/i;
                denominador = denominador/i;
            }
            else
            {
                i++;
            }
        }
    }

    public static Fraccion sumar(Fraccion a,Fraccion b)
    {
        Fraccion x = new Fraccion(a.numerador,a.denominador);
        x.sumar(b);
        return x;
    }

    public static int  sumar(int a , int b){
        return a+b;
    }

    public Fraccion sumar(Fraccion x)
    {
        int nd = denominador*x.denominador;
        int nn = numerador*x.denominador+x.numerador*denominador;

        numerador = nn;
        denominador = nd;
        return this;
    }

    public Fraccion restar(Fraccion a , Fraccion b){
        Fraccion x;
        int mcm=1;
        int i=2;

        if (a.denominador  == b.denominador) {
                   x = new Fraccion(a.numerador + b.numerador, a.denominador);
        }
        else{

            while(i <= a.denominador || i <= b.denominador)
            {
                if(a.denominador%i==0 || b.denominador%i==0)
                {
                    mcm=mcm*i;
                    if(a.denominador%i==0) a.denominador=a.denominador/i;
                    if(b.denominador%i==0) b.denominador=b.denominador/i;
                }
                else
                    i=i+1;
            }

            x = new Fraccion(a.numerador + b.numerador, a.denominador);            
        }

        return x;
    }

    public void imprimir()
    {
        System.out.println(numerador+"/"+denominador);
    }

    public int getNumerador()
    {
        return numerador;
    }

    public void setNumerador(int x)
    {
        numerador=x;
    }

    public int getDenominador()
    {
        return denominador;
    }

    public void setDenominador(int d)
    {
        if(d==0)
        {
            throw new RuntimeException("El denominador no puede ser cero");
        }

        this.denominador=d;
    }

}
