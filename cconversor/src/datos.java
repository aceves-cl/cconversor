/**
    @(#)datos.java
    @author Aceves Clemente Carlos Arturo,
    @version 0.1.3 17/02/2023
*/
public class datos{

    /* Datos necesarios para realizar operaciones */

    protected double valorEntrada, valorSalida;
    protected String convertirDe, convertirA;

    public datos(){

        valorEntrada = 0;
        valorSalida = 0;
        convertirDe = "";
        convertirA = "";

    }

    /* Set */

    public void setDatos(String convertirDe, String convertirA, double valorEntrada){

        this.convertirDe = convertirDe;
        this.convertirA = convertirA;
        this.valorEntrada = valorEntrada;

    }

    /* Gets */

    public String getConvertirDe(){

        return convertirDe;

    }

    public String getConvertirA(){

        return convertirA;

    }

    public double getValorEntrada(){

        return valorEntrada;

    }

    public double getValorSalida(){

        return valorSalida;

    }


}