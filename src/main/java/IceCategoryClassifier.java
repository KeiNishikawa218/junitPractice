/***
 * URL:
 * https://atcoder.jp/contests/abc194/tasks/abc194_a
 */

public class IceCategoryClassifier {
    //int型
    public String ClassifyProductCategory(int nonfatMilkSolidsRate, int milkfatRate){
        String productCategory = "";

        if (nonfatMilkSolidsRate + milkfatRate >= 15 && milkfatRate >= 8){
            productCategory = "アイスクリーム";
        } else if (nonfatMilkSolidsRate + milkfatRate >= 10 && milkfatRate >= 3){
            productCategory = "アイスミルク";
        } else if (nonfatMilkSolidsRate + milkfatRate >= 3) {
            productCategory = "ラクトアイス";
        } else {
            productCategory = "氷菓";
        }

        return productCategory;
    }
}