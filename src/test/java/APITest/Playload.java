package APITest;

public class Playload {

    public static String addPlace() {
        return "{\n" +
                "    \"location\": {\n" +
                "        \"lat\": -38.383483,\n" +
                "        \"lng\": 33.427326\n" +
                "    },\n" +
                "    \"accuracy\": 50,\n" +
                "    \"name\": \"Giribabu house\",\n" +
                "    \"phone_number\": \"(+91) 983 143 143\",\n" +
                "    \"address\": \"No 1, Sai Shree layout, Hosa Road Banglore\",\n" +
                "    \"types\": [\n" +
                "        \"shoe park\",\n" +
                "        \"shop\",\n" +
                "        \"Electronic\"\n" +
                "    ],\n" +
                "    \"website\": \"https://rahulshettyacademy.com\",\n" +
                "    \"language\": \"English-IN\"\n" +
                "}";
    }

    public static String coursePrice() {
        return "{\n" +
                "\"dashboard\": {\n" +
                "\"purchaseAmount\": 3285,\n" +
                "\"website\": \"rahulshettyacademy.com\"\n" +
                "},\n" +
                "\"courses\": [\n" +
                "{\n" +
                "\"title\": \"Selenium Python\",\n" +
                "\"price\": 50,\n" +
                "\"copies\": 6\n" +
                "},\n" +
                "  {\n" +
                "\"title\": \"JAVA\",\n" +
                "\"price\": 55,\n" +
                "\"copies\": 25\n" +
                "},\n" +
                "{\n" +
                "\"title\": \"Cypress\",\n" +
                "\"price\": 40,\n" +
                "\"copies\": 4\n" +
                "},\n" +
                "{\n" +
                "\"title\": \"RPA\",\n" +
                "\"price\": 45,\n" +
                "\"copies\": 10\n" +
                "},\n" +
                "  {\n" +
                "\"title\": \"Appium\",\n" +
                "\"price\": 100,\n" +
                "\"copies\": 10\n" +
                "}\n" +
                "]\n" +
                "}\n";
    }

    public static String addBook(String isbn, String aisle) {
        String payLoad = "{\n" +
                "    \"name\": \"Learn Appium Automation with Java\",\n" +
                "    \"isbn\": \"" + isbn + "\",\n" +
                "    \"aisle\": \"" + aisle + "\",\n" +
                "    \"author\": \"Jhon foe\"\n" +
                "}";
        return payLoad;
    }

}
