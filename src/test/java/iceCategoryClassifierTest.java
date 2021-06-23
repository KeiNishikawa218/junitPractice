import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class iceCategoryClassifierTest {
    IceCategoryClassifier sut;

    @BeforeEach
    public void beforeEach(){
        sut = new IceCategoryClassifier();
    }

//    *  1.種類別 アイスクリーム（乳固形分15.0％以上 うち乳脂肪分8.0％以上）
//    *  2.種類別 アイスミルク（乳固形分10.0％以上 うち乳脂肪分3.0％以上）
//    *  3.種類別 ラクトアイス（乳固形分3.0％以上）
//    *  4.種類別 氷菓（上記以外のもの）

    @Test
    @DisplayName("アイスクリーム")
    public void isIceCream() {
        String actual = sut.ClassifyProductCategory(16, 9);
        String expected = "アイスクリーム";
        assertThat(actual, is(expected));
    }

    @Test
    @DisplayName("アイスミルク")
    public void isIceMilk() {
        String actual = sut.ClassifyProductCategory(10, 4);
        String expected = "アイスミルク";
        assertThat(actual, is(expected));
    }

    @Test
    @DisplayName("ラクトアイス")
    public void isLactIce() {
        String actual = sut.ClassifyProductCategory(0, 9);
        String expected = "ラクトアイス";
        assertThat(actual, is(expected));
    }

    @Test
    @DisplayName("氷菓")
    public void isFrozenDessert() {
        String actual = sut.ClassifyProductCategory(0, 1);
        String expected = "氷菓";
        assertThat(actual, is(expected));
    }
}
