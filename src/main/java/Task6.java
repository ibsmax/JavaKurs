import java.io.*;
import java.util.*;

public class Task6 {
    public static void main(String[] args) throws IOException {
        /** Задание 6
         Есть входной файл с набором слов, написанных через пробел.
         Необходимо:
         Прочитать слова из файла.
         Отсортировать в алфавитном порядке.
         Посчитать сколько раз каждое слово встречается в файле. Вывести статистику на консоль.
         Найти слово с максимальным количеством повторений. Вывести на консоль это слово и сколько раз оно встречается в файле.
         @author Pystogov Maxim
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        File f = new File("..//JavaKurs/File_for_task6.txt");
        BufferedReader fin = new BufferedReader(new FileReader(f));
        String line;
        String[] subStr;
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("\n" + "Содержимое файла:");
        ArrayList<String> words = new ArrayList<String>();
        if (f.getName().equals("File_for_task6.txt"))
            while ((line = fin.readLine()) != null)
                System.out.println(line);
        File f2 = new File("..//JavaKurs/File_for_task6.txt");
        BufferedReader fin2 = new BufferedReader(new FileReader(f2));
        if (f2.getName().equals("File_for_task6.txt"))
            while ((line = fin2.readLine()) != null) {

                stringBuilder.append(line);
                String delimeter = " ";
                subStr = line.split(delimeter);
                for (int i = 0; i < subStr.length; i++) {
                    words.add(subStr[i]);
                }
            }
        System.out.println("\n" + "Содержимое файла после сортировки:");
        Collections.sort(words);
        System.out.print(words);
        ArrayList<Integer> max_repeat = new ArrayList<Integer>();
        System.out.println("\n" + "\n" + "Количество повторений слова в файле:");
        Set<String> uniqewords = new HashSet<String>(words);
        for (String r : uniqewords) {
            System.out.println(r + ": " + Collections.frequency(words, r));
            max_repeat.add(Collections.frequency(words, r));
        }
        int max_repeat_word = Collections.max(max_repeat);
        for (String r : uniqewords) {
            if (Collections.frequency(words, r) == max_repeat_word) {
                System.out.println("\n" + "Максимальное количество повторений в файле:");
                System.out.println(r + ": " + Collections.frequency(words, r));
            }
        }
    }
}
