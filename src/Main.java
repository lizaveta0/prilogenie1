//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        // Объявляете переменные для входных данных и
        // параметров программы: одну для хранения
        double prise = 13676; // стоимости билета, другую для хранения количествa
        int miles = (int) (prise / 20);          // рублей для одной бонусной мили

        // Рассчитываете количество бонусных миль, используя
        // значения заведённых переменных. Ответ сохраняете в
        // новую переменную и выводите на экран

        System.out.println("Начисленные мили: " + miles);
    }
}