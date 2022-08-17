public class Main {
    //ここからmainメソッド
    public static void main(String[] args) {
        System.out.println("RPG:スッキリ魔王討伐");
        System.out.println("ver.0.1 by 雄斗");
        System.out.println("<ただいま学習・作成中>");
        System.out.println("プログラムを終了します。");

        int age; //年齢を入れる箱
        age = 28;
        System.out.println("私は" + age + "歳");
        /*サンプルプログラム　Main
        開発者：中川　作成日：　２０２２年８月
         */

        byte glasses; glasses = 2;
        short age1; age1 = 18;
        int salary; salary = 152000;
        long worldPeople; worldPeople = 6900000000L;

        float weight; weight = 67.5F;
        double height; height = 171.2;

        //真偽値
        boolean isError; isError = true;
        boolean result; result =  false;

        //１文字だけ代入できる
        char zodiac; zodiac = '辰';
        String name; name = "すがわら";

        String name1 = "中川";

        int age2 = 20;
        System.out.println(age2);
        age2 = 31;
        System.out.println("・・・いや、本当の年齢は" + age2);

        final double pi = 3.14; // 円周率を入れた変数
        int pie = 5;
        System.out.println("半径" + pie + "cmのぱいの面積は");
        System.out.println(pie * pie * pi);
        System.out.println("パイの半径を灰にします");
        pi = 10; // 誤り！代入すべき変数は『pie』
        System.out.println("半径" + pie + "cmのパイの面積は");
        System.out.println(pie * pie * pi);

        /*
        Javaでプログラムを開発するためには、（コンパイラ）と（インタプリタ）というソフトウェアが必要です。
        コンパイラには、私たちがJavaの文法に沿って記述した（ソースコード）を（バイオコード）に変換してくれます。
        インタプリタは内部に持っている（JVM)の仕組みを使ってこれを解釈し、マシン語に変換してCPUに送り、
        CPUは命令を実行します。
         */

        int a =3;
        int b =5;
        int c = a * b;
        System.out.println(c);

        boolean result1 =true;
        char favoriteCharacter = '駆';
        double pi1 = 3.14;
        long number = 314159265853979L;
        String msg = "ミナトの攻撃！敵に１５ポイントのダメージを与えた。";
    }
}
