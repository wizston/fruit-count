import java.util.*;

public class CountFruits {

    private static Options response;

    public static void main(String[] args) {
        try {
            Scanner reader = new Scanner(System.in);
            System.out.println("Would you like to print item counts with result? (yes|no) ");
            response = Options.valueOf(reader.next().toUpperCase(Locale.ROOT));
            reader.close();
        } catch (Exception e) {
            System.out.println("Invalid response, Try again");
            CountFruits.main(null);
        }

        //List of defined fruits
        String[] fruits = {"Strawberry", "Mango", "Cherry", "Lime", "Guava",
                "Papaya", "Nectarine", "Pineapple", "Lemon", "Plum", "Tangerine", "Fig",
                "Blueberry", "Grape", "Jackfruit", "Pomegranate", "Apple", "Pear",
                "Orange", "Watermelon", "Raspberry", "Banana"};

        //Alphabets
        HashMap<String, List<String>> alphabets = getAlphabets();

        for (String fruit : fruits) {
            String chr = fruit.substring(0, 1);
            List<String> fruitItems = alphabets.get(chr);
            fruitItems.add(fruit);

            alphabets.replace(chr, fruitItems);
        }

        //Print
        print(alphabets);

    }

    private static HashMap<String, List<String>> getAlphabets() {
        return new HashMap<String, List<String>>() {
            {
                for (char ch = 'A'; ch <= 'Z'; ++ch) {
                    List<String> fruits = new ArrayList<>();
                    put(String.valueOf(ch), fruits);
                }
            }
        };
    }

    private static void print(HashMap<String, List<String>> alphabets) {
        for (String name: alphabets.keySet()) {
            List<String> value = alphabets.get(name);
            System.out.println(name + ": " + value.size());

            if (Options.YES.equals(response)) {
                Set<String> temp = new HashSet<>();
                value.forEach(item -> {
                    if (temp.add(item)) {
                        System.out.println(Collections.frequency(value, item) + ": " + item);
                    }
                });
            }
        }
    }

    public enum Options
    {
        YES,
        NO
    }

}