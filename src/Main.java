public class Main {

    public static void main(String[] args) {
        ageAndTemp(20, 33);
        ageAndTemp(20, 15);
        ageAndTemp(1, 43);
        ageAndTemp(50, 20);
        ageAndTemp(30, 32);



    }

    public static String ageAndTemp(int age, int temperature) {

        String result = age + " " + temperature;


        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
            System.out.println("You can go for a walk");

        } else if (age < 20 && temperature > 0 && temperature < 28) {
//            System.out.println("You can go for a walk");

            return "You can go for a walk";
        } else if (age > 45) {
            if (temperature > -10 && temperature < 25) {
                System.out.println("You can take a walk");
            }
        } else {
            System.out.println("You gotta stay at home");
        }
        
        return result;




    }


}
