package j15_ForEachLoop;

public class UniqueElements {

    public static void main(String[] args) {

        String[] words = {"Elif", "Elif", "Gunay", "Gunay", "David", "David", "David", "Selim", "Esra"};

        for (String each : words) { // each: "Elif", "Elif", "Gunay", "Cihad", "David", "David", "David", "Selim", "Selim", "Esra"

            int count = 0;

            for (String element : words) { // element: "Elif", "Elif", "Gunay", "Cihad", "David", "David", "David", "Selim", "Selim", "Esra"
                if (element.equals(each)){
                    count++;
                }
            }
            if (count==1){
                System.out.println(each);
            }
        }








    }




}
