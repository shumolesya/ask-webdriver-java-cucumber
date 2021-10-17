package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class JavaStepDefs {
    @Given("I write Java step")
    public void iWriteJavaStep() {

        System.out.println("Hello, World!");

        String firstName = "Olesya";
        String lastName = "Shum";
        String favoriteColor = "blue";

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(favoriteColor);
        System.out.println("Hi, my name is " + firstName + " " + lastName
                + ", my favorite color is " + favoriteColor + "");

        System.out.println(firstName.toUpperCase() + " " + lastName.toUpperCase());
    }


    @Given("I print {string} argument")
    public void iPrintArgument(String var) {
        System.out.println(var);
        System.out.println(var.toLowerCase());
        System.out.println(var.length());
        System.out.println(var.equals("Olesya"));
    }

    @Given("I perform actions with {string} and {string}")
    public void iPerformActionsWithAnd(String var1, String var2) {
        System.out.println(var1 + " " + var2);
        System.out.println(var1.toUpperCase() + " " + var2.toUpperCase());
        System.out.println(var1.length() + " " + var2.length());
        System.out.println(var1.equals(var2));
        System.out.println(var1.equalsIgnoreCase(var2));
        System.out.println(var1.contains(var2));


    }

    @Given("I print Hello world!")
    public void iPrintHelloWorld() {
        System.out.println("Hello World!");
    }

    @When("I print {string}")
    public void iPrint(String text) {
        System.out.println(text);
    }

    @Given("I print strings")
    public void iPrintStrings() {
        String firstName = "Olesya";
        String lastName = "Shum";
        String occupation = "QA Engineer";
        firstName = "Lev";

        System.out.println("Hello, I am " + " " + firstName + " " + lastName + ".");
        System.out.println("I work as a" + " " + occupation + ".");
    }

    @Given("I learn Java Data Types")
    public void iLearnJavaDataTypes() {
        String xpath = "//input[@id='q']";
        char a = 'A';
        int x = 3;
        double y = 3.0;
        boolean b = true;
    }

    @When("I print {string} and {string}")
    public void iPrintAnd(String var1, String var2) {
        System.out.println(var1 + " " + var2);
        System.out.println(var1.length() + " " + var2.length());
        System.out.println(var1.charAt(0));
        System.out.println(var2.charAt(0));
        System.out.println(var2.charAt(var2.length() - 1));
        System.out.println(var1.equals(var2));
        System.out.println(var1.equals(var2.toLowerCase()));
        System.out.println(var1.equalsIgnoreCase(var2));


    }

    @And("I work with boolean")
    public void iWorkWithBoolean() {
        boolean x = true;
        System.out.println("x == " + x);
        int a = 3;
        System.out.println(a == 3);
        System.out.println(a != 5);
        System.out.println(a == 5);
    }

    @And("I work with numbers")
    public void iWorkWithNumbers() {
        int num1 = 15;
        int num2 = 3;

        int sum = num1 + num2;
        int diff = num1 - num2;
        int product = num1 * num2;
        int quot = num1 / num2;
        int mod = num1 % num2;

        System.out.println("The sum = " + sum);
        System.out.println("The diff = " + diff);
        System.out.println("The product = " + product);
        System.out.println("The quot = " + quot);
        System.out.println("The mod = " + mod);
    }

    @When("I compare {int} and {int}")
    public void iCompareAnd(int num1, int num2) {
        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else if (num1 < num2) {
            System.out.println(num1 + " is less than " + num2);
        } else {
            System.out.println(num1 + " is equal to " + num2);
        }
    }

    @Given("I check if number {int} is odd or even")
    public void iCheckIfNumberIsOddOrEven(int num) {
        if (num != 0) {
            if (num % 2 == 0) {
                System.out.println("is even");
            } else {
                System.out.println("is odd");
            }
        }

    }

    @Given("I run operators with {int} and {int}")
    public void iRunOperatorsWithAnd(int num3, int num4) {


        int sum = num3 + num4;
        int diff = num4 - num3;
        int prod = num3 * num4;
        int quot = num4 / num3;
        System.out.println(sum);
        System.out.println(diff);
        System.out.println(prod);
        System.out.println(quot);

        if (num3 < num4) {
            System.out.println("first number less than second number");
        } else {
            System.out.println("first number is greater than second number");
        }
    }

    @Given("I compare {string} and {string}")
    public void iCompareAnd(String arg0, String arg1) {
        if (arg0.equalsIgnoreCase(arg1)) {
            System.out.println("Strings are equal!");
        } else {
            System.out.println("Strings are not equal!");
        }
    }

    @Given("I check if year {int} is odd or even")
    public void iCheckIfYearIsOddOrEven(int year) {
        if (year != 0) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + " is a leap year");
            } else {
                System.out.println(year + " is not a leap year");
            }
        }
    }

    @Given("I convert {int} foot to centimeters")
    public void iConvertFootToCentimeters(int ft) {
        double cm = ft * 30.48;
        System.out.println(ft + " foot equals to " + cm + "  centimeters");
    }

    @And("I convert {int} US gallon to liters")
    public void iConvertUSGallonToLiters(int gallon) {
        double l = gallon * 4.54;
        System.out.println(gallon + "  equals to " + l + "liters");
    }

    @And("I convert {int} Celsius to Fahrenheit")
    public void iConvertCelsiusToFahrenheit(int C) {
        System.out.println(C + " Celsius equals 32F");
    }

    @Given("I got {int} percent on my test")
    public void iGotPercentOnMyTest(int grade) {
        if (grade >= 90 && grade <= 100) {
            System.out.println("You passed with Grade A");
        } else if (grade >= 80 && grade <= 89) {
            System.out.println("You passed with Grade B");
        } else if (grade >= 70 && grade <= 79) {
            System.out.println("You passed with Grade C");
        } else if (grade >= 60 && grade <= 69) {
            System.out.println("You passed with Grade F");
        } else {
            System.out.println("Grade is out of range");
        }
    }

    @Given("I print {string} url")
    public void iPrintUrl(String url) {
        switch (url) {
            case "google":
                System.out.println("https://www.google.com/");
                break;
            case "yahoo":
                System.out.println("https://www.google.com/");
                break;
            case "wiki":
                System.out.println("https://www.wiki.com/");
                break;
            default:
                System.out.println("This site " + url + " is not supported");
        }
    }

    @Given("I operate on arrays")
    public void iOperateOnArrays() {
        int[] numbers = {4, 8, 10, 45, 89, 23};
        String[] cars = {"Subaru", "Ford", "Mercedes", "Jeep", "Mustang"};
        System.out.println("Element with index 0 " + cars[0]);
        cars[1] = "Mazda";
        System.out.println("Element with index 1 " + cars[1]);
        System.out.println("The number of elements in the array " + cars.length);
        System.out.println("The last element in the array: " + (cars.length - 1));
        System.out.println("The last element in the array: " + (cars[4]));
        System.out.println(cars);


        for (String car : cars) {
            //System.out.println(car);
            System.out.print(car + " ");

            for (int count = 0; count <= cars.length - 1; count++) {
                System.out.println(cars[count]);
            }

        }
    }

    @Given("I find the cost of {int} pounds of {string}")
    public void iFindTheCostOfPoundsOf(int lbs, String product) {
        switch (product) {
            case "grapefruit":
                double price = 2.00;
                System.out.println("Cost of product " + lbs * price);
                break;
            case "apples":
                price = 3.00;
                System.out.println("Cost of product " + lbs * price);
                break;
            case "cherries":
                price = 1.50;
                System.out.println("Cost of product " + lbs * price);
                break;
            case "plums":
                price = 1.22;
                System.out.println("Cost of product " + lbs * price);
                break;
            default:
                System.out.println("Product is not available");

        }
    }

    @Given("I print arrays")
    public void iPrintArrays() {
        String[] groceryList = {"milk", "apple", "pear", "bread", "cheese"};
        for (int i = 0; i < groceryList.length; i++) {
            System.out.println(groceryList[i]);
        }

        for (String element : groceryList) {
            System.out.println(element);
        }
    }

    @Given("I work with arrays")
    public void iWorkWithArrays() {
        String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        for (int i = 0; i < weekdays.length; i++) {
            System.out.println(weekdays[i]);
        }
        for (int  i = weekdays.length - 1 ; i >= 0; i--) {
            System.out.println(weekdays[i]);
        }
    }

    @Given("I print sum of arrays")
    public void iPrintSumOfArrays() {
        int[] numbers = {1, 8, 7, 6, 4, 2, 12, 13, 5, 4, 2, 10, 22};
        int container = 0;

        for (int i = 0; i < numbers.length; i++) {
            container = container + numbers[i];
        }

        System.out.println(container);


    }
}

