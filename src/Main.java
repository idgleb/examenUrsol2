import javax.swing.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //examen2

        AnyClase newProj = null;

        int seleccion = 0;
        do {
            String[] opciones = {"Registrar projecto", "evaluar etapas", "Leer informe", "Salir"};
            seleccion = JOptionPane.showOptionDialog(
                    null,
                    "Seleccione una opción:",
                    "Ursol",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]
            );
            switch (seleccion) {
                case 0:

                    String newCliente = JOptionPane.showInputDialog("Client?");

                    String nombreProj = JOptionPane.showInputDialog("Nombre de projecto?");
                    String ubicacionProj = JOptionPane.showInputDialog("Ubicacion?");
                    LocalDate fechaInicioProj = LocalDate.now();
                    newProj = new AnyClase(nombreProj, ubicacionProj, newCliente, fechaInicioProj);

                    break;
                case 1:
                    if (newProj != null) {
                        newProj.evaluarEtapas();
                    } else
                        JOptionPane.showMessageDialog(null, "No hay projecto, de primero pulsa <Registrar projecto>");
                    break;
                case 2:
                    if (newProj != null) {
                        JOptionPane.showMessageDialog(null, newProj.getInforme());
                    } else
                        JOptionPane.showMessageDialog(null, "No hay projecto, de primero pulsa <Registrar projecto>");
                    break;
                case 3:
                    break;
                default:
                    break;
            }
        } while (seleccion != 3);


    }
}