//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       double Prise = 13676; // стоимости билета, другую для хранения количества
        int Miles = (int)(Prise / 20); // рублей для одной бонусной мили

        System.out.println("Начисленные мили: " + Miles);
    }
}