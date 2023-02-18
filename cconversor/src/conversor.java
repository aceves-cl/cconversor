/**
    @(#)conversor.java
    @author Aceves Clemente Carlos Arturo,
    @version 0.1 17/02/2023
*/
import javax.swing.*;
public class conversor{

    Divisas divisas;
    Temperaturas temperatura;
    UnidadesMedidas umedidas;

    public conversor(){

        divisas = new Divisas();
        temperatura = new Temperaturas();
        umedidas = new UnidadesMedidas();

    }

    public void menu(){

        String opcion;

		Object[] opciones = {"Conversion de divisas","Conversion de temperaturas","Conversion de medidas"};

		JOptionPane.showMessageDialog(null, "Conversor");

		opcion = (String)JOptionPane.showInputDialog (null, "Que tipo de conversion desea hacer?", "Conversor",JOptionPane.PLAIN_MESSAGE,null,opciones, 1);

        if(opcion.equals("Conversion de divisas")){



        }else if(opcion.equals("Conversion de temperaturas")){

            

        }else{



        }

    }

    public static void main(String[] args){

        conversor cc = new conversor();

        cc.menu();

    }

}