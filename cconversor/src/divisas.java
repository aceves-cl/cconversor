/**
    @(#)divisas.java
    @author Aceves Clemente Carlos Arturo,
    @version 0.1.3 17/02/2023
*/
public class divisas extends datos{

    protected double valorEntrada, valorSalida;
    protected String convertirDe, convertirA;
    protected double usdToArs, usdToEur, usdToMxn, usdToJpy, usdToCny, usdToClp, usdToPen;
    protected double arsToUsd, arsToEur, arsToMxn, arsToJpy, arsToCny, arsToClp, arsToPen;
    protected double eurToUsd, eurToArs, eurToMxn, eurToJpy, eurToCny, eurToClp, eurToPen;
    protected double mxnToUsd, mxnToArs, mxnToEur, mxnToJpy, mxnToCny, mxnToClp, mxnToPen;

    public divisas(){

        super();
        valorEntrada = 0;
        valorSalida = 0;
        convertirDe = "";
        convertirA = "";

        /* Usd to another currency*/
        usdToArs = 192.99;
        usdToEur = 0.94;
        usdToMxn = 18.36;
        usdToJpy = 134.35;
        usdToCny = 6.87;
        usdToClp = 787.82;
        usdToPen = 3.83;

        /* Ars to another currency*/
        arsToUsd = 0.01;
        arsToEur = 0.0049;
        arsToMxn = 0.10;
        arsToJpy = 0.70;
        arsToCny = 0.04;
        arsToClp = 4.08;
        arsToPen = 0.02;

        /* Eur to another currency*/
        eurToUsd = 1.07;
        eurToArs = 206.13;
        eurToMxn = 19.61;
        eurToJpy = 143.5;
        eurToCny = 7.33;
        eurToClp = 841.47;
        eurToPen = 4.09;

        /* Mxn to another currency*/
        mxnToUsd = 0.05;
        mxnToArs = 10.50;
        mxnToEur = 0.05;
        mxnToJpy = 7.31;
        mxnToCny = 0.37;
        mxnToClp = 42.88;
        mxnToPen = 0.21;
        
        /* Jpy to another currency*/

        

    }

    public void convertirDivisas(){

        if (convertirDe == "s" && convertirA == "s") {
            
        } else if (convertirDe == "s" && convertirA == "s") {
            
        }

    }
}
