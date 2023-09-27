
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int toadEyesCount;          //Жабьи глаза
        int ghoulTearsCount;        //Слезы вурдалака
        int ravenBonesCount;        //Кости ворона
        int dumplingsCount;         //Пельмени(а почему, собственно нет? xD )

        System.out.println("Введите количество имеющихся ингридиентов: ");
        System.out.println("Количество Жабьих глаз: ");
        toadEyesCount = new Scanner(System.in).nextInt();
        System.out.println("Количество Слез вурдалака: ");
        ghoulTearsCount = new Scanner(System.in).nextInt();
        System.out.println("Количество Костей ворона: ");
        ravenBonesCount = new Scanner(System.in).nextInt();
        System.out.println("Количество Пельменей: ");
        dumplingsCount = new Scanner(System.in).nextInt();


        //Рецепты Эликсиров:
        // 1. 3 Жабьих глаза + 1 кость ворона - Эликсир зоркости
        // 2. 2 кости ворона + 4 пельменя - Эликсир стойкости
        // 3. 7 слез вурдалака + 1 пельмень + 2 жабьих глаза - Эликсир скрытности
        // 4. 5 слез вурдалака + 10 пельменей + 4 жабьих глаза + 3 кости ворона - Запретный эликсир
        boolean elixirOfVigilance = toadEyesCount>=3 && ravenBonesCount>=1;
        boolean elixirOfEndurance = ravenBonesCount>=2 && dumplingsCount>=4;
        boolean elixirOfSecrecy = ghoulTearsCount>=7 && dumplingsCount>=1 && toadEyesCount>=2;
        boolean forbiddenElixir = ghoulTearsCount>=5 && dumplingsCount>=10 && toadEyesCount>=4
                && ravenBonesCount>=3;

        if(elixirOfVigilance){
            System.out.println("Вы можете приготовить Эликсир зоркости");
        }
        if(elixirOfEndurance){
            System.out.println("Вы можете приготовить Эликсир стойкости");
        }
        if(elixirOfSecrecy){
            System.out.println("Вы можете приготовить Эликсир скрытности");
        }
        if(forbiddenElixir){
            System.out.println("Вы можете приготовить Запретный эликсир");
        }
        if(!elixirOfVigilance && !elixirOfEndurance && !elixirOfSecrecy && !forbiddenElixir){
            System.out.println("У Вас не хватает ингридиентов ни на один эликсир");
        }

    }
}
