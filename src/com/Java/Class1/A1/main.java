package com.Java.Class1.A1;

import java.text.Collator;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;

public class main {
    public static void main(String[] args) {
//        String[] names={"末松、猿喰","朝稲　様 ","啓太 朝稲 1","久冨","坂巻","a","z","b","jp"};
        String[] names={ "システム","画面","Windows ファイウォール",
      "インターネット オプション",  "キーボード", "メール", "音声認識", "管理ツール",
      "自動更新", "日付と時刻", "タスク", "プログラムの追加と削除", "フォント",
      "電源オプション", "マウス", "地域と言語オプション", "電話とモデムのオプション",
      "Java", "NVIDIA","末松、猿喰","あ"};
        System.out.println(Arrays.asList(names));
        // b c a
        // a b c
        String s="朝稲　様 ";

        for (char c : s.toCharArray())
            if ((c & 0xff00) == 0xff00){

            }
            else{
                s=s.replace("　"," ");

            }
       // System.out.println(s);

            ///////////////////////////////////
        Collator c=Collator.getInstance(Locale.JAPAN);
        Collections.sort(Arrays.asList(names),c);
        System.out.println(Arrays.asList(names));

    }
}
