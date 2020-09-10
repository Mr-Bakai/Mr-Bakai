public class Main {

    public static void main(String[] args) {
        System.out.println(ageAndTemp(20, 45));
        System.out.println(ageAndTemp(10, 85));
        System.out.println(ageAndTemp(34, 10));
        System.out.println(ageAndTemp(28, 98));
        System.out.println(ageAndTemp(10, 56));


    }

    public static String ageAndTemp(int age, int temperature) {

        String result = age + " " + temperature;


        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
            return "You can go for a walk";

        } else if (age < 20 && temperature > 0 && temperature < 28) {

            return "You can go for a walk";

        } else if (age > 45 && temperature > -10 && temperature < 25) {
            return "You can go for a walk";
        } else {


            return "You gotta stay at home";
        }


    }


}
