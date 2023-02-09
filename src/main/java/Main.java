import java.util.Scanner;

// dev branch for Y.Practicum
public class Main {

    public static void main(String[] args) {
        // ваш код начнется здесь
        // вы не должны ограничиваться только классом Main и можете создавать свои классы по необходимости
        //System.out.println("Привет Мир");
        Scanner scanner = new Scanner(System.in);
        int countUser;
        System.out.println("На скольких человек необходимо разделить счёт?");
        while (true) {
            if (scanner.hasNextInt()) {
                countUser = scanner.nextInt();
                if (countUser == 1) {
                    System.out.println("В этом случае нет смысла ничего считать и делить, введите корректное количество гостей");
                } else if (countUser < 1) {
                    System.out.println("Это некорректное значение для подсчёта, введите корректное количество гостей");
                } else {
                    NameProd.nameProde(countUser);
                    break;
                }
            } else {
                System.out.println("Это не число, введите корректное количество гостей");
                scanner.next();
            }
        }
    }

}
 class NameProd {
     public static void nameProde(int countUser) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Введите название товара");
         double sum = 0;
         String list = "Список товаров: \n";
         String line = null;

         double sale = 0;
         while ((line = scanner.next()) != null) {
             if (line.equalsIgnoreCase("Завершить")) {
                 System.out.println(list);
                 int num = (int) (sum / countUser);


                String rubl = rubb(num);;


                 String str2 = String.format("Каждый должен заплатить: %.2f" + " " + rubl, sum / countUser);
                 System.out.println(str2);
                 break;
             }

             System.out.println("Введите стоимость товара");
             while (true) {
                 if (scanner.hasNextDouble()) {
                     sale = scanner.nextDouble();
                     if (sale < 0) {
                         System.out.println("Это некорректное значение для подсчёта");
                     } else if (sale >= 0) {
                         // sale = scanner.nextDouble();
                         list = list + line + "\n";
                         sum = sum + sale;
                         System.out.println("Товар " + line + " за " + sale + " успешно добавлен. Введите следующий товар. Если необходимо закончить ввод данных, то введите \"Завершить\"");
                         break;
                     }
                 } else {
                     System.out.println("Это не число, введите ещё");
                     scanner.next();
                 }
             }
         }
     }

     public static String rubb(int num) {
         String rubl = null;
         if(  num % 100 > 4 && num % 100 < 21)     {
             rubl =  "рублей";
    }       else   if(num %10==1)    {
              rubl =  "рубль";
     }
          else if(num % 10 > 1 && num % 10 < 5)
               {
              rubl =  "рубля";
     }
          else {//if(  num % 100 > 25 && num % 100 < 21)     {
              rubl =  "рублей";
          }
return rubl;
     }
}
//System.out.println(String.format("%s,%d"a, b))ррр