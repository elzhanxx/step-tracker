import java.util.Scanner;

public class StepTracker {
    int goalByStepsPerDay = 10_000;
    Scanner scanner;
    MonthData[] monthToData = new MonthData[12];

    StepTracker(Scanner s){
        scanner = s;
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }
    void addNewNumberStepsPerDay(){
        System.out.println("Введите месяц");

        int month = scanner.nextInt();

        if (month < 1 || month > 12){
            System.out.println("Некорректный месяц");
        }

        System.out.println("Введите день");

        int day = scanner.nextInt();

        if(day < 1 || day > 30){
            System.out.println("Некорректный день");
        }

        int steps = scanner.nextInt();
        if(steps < 0){
            System.out.println("Шаги не могут быть отрицательными)");
        }

        MonthData monthData = monthToData[month-1];
        monthData.days[day - 1] = steps;
        System.out.println("Шаги успешно добавлены");
    }
    void changeStepGoal(){
        System.out.println("Введите вашу новую цель");
        int userGoal = scanner.nextInt();
        if (userGoal >=0){
            goalByStepsPerDay = userGoal;
            System.out.println("Новая цель: " + userGoal);
        }else {
            System.out.println("Введите положительное число, тюфяк");
        }
    }
    void printStatistic(){

    }
}
