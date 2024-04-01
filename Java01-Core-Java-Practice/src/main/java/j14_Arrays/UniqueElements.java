package j14_Arrays;

public class UniqueElements {

    public static void main(String[] args) {

        String[] words = {"Java", "Java", "C#", "Python", "Python"};

        for (int i = 0; i < words.length; i++) {
            String element = words[i];
            int frequency = 0;
            for (int j = 0; j < words.length; j++) {
                if (words[j].equals(element)) frequency++;
            }
            if (frequency==1) System.out.println(element);
        }


    }
}
