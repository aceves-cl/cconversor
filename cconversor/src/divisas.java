/**
    @(#)divisas.java
    @author Aceves Clemente Carlos Arturo,
    @version 0.1.3 17/02/2023
*/
public class divisas extends datos{

    protected double valorEntrada, valorSalida;
    protected String convertirDe, convertirA;
    protected double usdToMxn, mxnToUsd, arsToMxn, mxnToArs;

    public divisas(){

        super();
        valorEntrada = 0;
        valorSalida = 0;
        convertirDe = "";
        convertirA = "";
        usdToMxn = 18.36;
        mxnToUsd = 0.054;
        arsToMxn = 0.095;
        mxnToArs = 10.49;

    }

    public void convertirDivisas(){

        if (convertirDe == "s" && convertirA == "s") {
            
        } else if (convertirDe == "s" && convertirA == "s") {
            
        }

    }
}
