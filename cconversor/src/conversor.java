/**
    @(#)Main.java
    @author Aceves Clemente Carlos Arturo,
    @version 0.1 17/02/2023
*/
import javax.swing.*;
public class conversor{



    public void menu(){

        String opcion;

		Object[] opciones = {"Conversion de divisas","Conversion de temperaturas","Conversion de medidas"};

		JOptionPane.showMessageDialog(null, "Conversor");

		opcion = (String)JOptionPane.showInputDialog (null, "Que tipo de conversion desea hacer?", "Conversor",JOptionPane.PLAIN_MESSAGE,null,opciones, 1);

    }

    public static void main(String[] args){

        conversor cc = new conversor();

        cc.menu();

    }

}