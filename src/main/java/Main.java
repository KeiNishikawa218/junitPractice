import java.util.Scanner;

/***
 * アイス鑑定士のウェストリバーさんは、アイスの種類を見分けることができる。
 *
 * アイスの種類は以下の様に定義される。
 *  1.種類別 アイスクリーム（乳固形分15.0％以上 うち乳脂肪分8.0％以上）
 *  2.種類別 アイスミルク（乳固形分10.0％以上 うち乳脂肪分3.0％以上）
 *  3.種類別 ラクトアイス（乳固形分3.0％以上）
 *  4.種類別 氷菓（上記以外のもの）
 *
 * ただし、ウェストリバーさんは面倒くさがり屋なので、
 * 乳固形分と乳脂肪分を入力するとアイスの種類を自動で判別してくれるプログラムを作成した。
 *
 * 作成されたプログラムの動作を保証するためには何をすれば良いだろうか。
 *
 * ーーー数年後ーーー
 *
 * アットウェア王国では、20歳以上の国民は日曜日しかアイスクリームを食べてはいけないという法律が施行された。
 * 曜日判定のプログラムを追記し、そのテストコードを書いてほしい。
 * */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        IceCategoryClassifier ice = new IceCategoryClassifier();

        System.out.println("乳固形分と乳脂肪分の割合を入力してください\n");
        System.out.print("乳固形分>");
        int nonfatMilkSolidsRate = scanner.nextInt();
        System.out.print("乳脂肪分>");
        int milkfatRate = scanner.nextInt();

        String currentIceCategory = ice.ClassifyProductCategory(nonfatMilkSolidsRate, milkfatRate);

        System.out.println("日付を入力してください\n");
        System.out.print("年");
        int year = scanner.nextInt();
        System.out.print("年");
        int month = scanner.nextInt();
        System.out.print("年");
        int date = scanner.nextInt();

        SevenDays day = new SevenDays();
        Boolean isSunday = day.isSunday(year, month, date);


        if(currentIceCategory == "アイスクリーム" && isSunday) {
            System.out.println("Good Bye...");
        } else {
            System.out.println(currentIceCategory + "は食べられます");
        }
    }
}