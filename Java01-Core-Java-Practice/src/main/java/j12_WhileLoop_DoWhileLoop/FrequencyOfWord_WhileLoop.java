package j12_WhileLoop_DoWhileLoop;

public class FrequencyOfWord_WhileLoop {

    public static void main(String[] args) {

        String str = "Java Java Python Python";

        int frequency = 0;

        while (str.contains("Java")){
            str = str.replaceFirst("Java","");
            frequency++;
        }

        System.out.println("frequency = " + frequency);

        System.out.println("---------------------1---------------------");

        String sentence = "Cat cat cat cat dog dog dog cat cat CAT CAT CAT";

        int countCat = 0;

        while (sentence.contains("cat")){
            sentence = sentence.toLowerCase().replaceFirst("cat","");
            countCat++;
        }

        System.out.println("countCat = " + countCat);

        System.out.println("---------------------2---------------------");

        String s = "java java java python python python";

        int countJava = 0,
            countPython = 0;

        while (s.contains("java") || s.contains("python")){
            if (s.contains("java")){
                s=s.replaceFirst("java","");
                countJava++;
            }
            if (s.contains("python")){
                s=s.replaceFirst("python","");
                countPython++;
            }
        }

        System.out.println("countJava = " + countJava);
        System.out.println("countPython = " + countPython);


    }

}
