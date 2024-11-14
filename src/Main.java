import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker(scanner);

        while (true){
            printMenu();
            int userCommand = scanner.nextInt();
            switch (userCommand){
                case 1 -> stepTracker.addNewNumberStepsPerDay();
                case 2 -> stepTracker.changeStepGoal();
                case 3 -> stepTracker.printStatistic();
                case 4 -> {
                    return;
                }
                default -> System.out.println("Такой команды нет");
            }
        }
    }

    static void printMenu(){
        System.out.println("""
                    1) Ввести количество шагов за определённый день
                    2) Изменить цель по количеству шагов в день
                    3) Напечатать статистику за определённый месяц
                    4) Выйти из приложения
                    """);
    }
}
