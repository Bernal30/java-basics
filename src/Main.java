//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Hello world and welcome!\n");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

        int fechaDeLanzamiento = 1999;
        String sinopsis = """
                    Matrix es una paradoja
                    De las mejores peliculas del milenio
                    Fue lanzada en el año:
                    """ + fechaDeLanzamiento;
        System.out.println(sinopsis);

        //se aplica el casting de un double a un int y tambien los valores de placeholders para tipos de datos en un text block
        double celsiusDegrees = 29.3;
        int fahrenheitDegrees = (int) ((celsiusDegrees*1.8) + 32);
        System.out.println("""
                Grados celcius = %.2f°
                Grados fahrenheit = %d°
                """.formatted(celsiusDegrees, fahrenheitDegrees));
    }
}