package SansaStone;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CreaMazo {
    private List<Carta> mazo1 = new ArrayList<Carta>();

    private int mat=1, fis=4, lp=2, ed=3, edd=4, pro=6;
    private int ce =1, im = 1, sesa =1, saf=1, bl=1,fo =1;
    private int ci =1, ba=1, mr =1, ma =1;
    private int cont1 = 6, cont2 = 4;

    public void CrearMazo(Sansano c1) {
        while (c1.TamanoMazo() < 30) {
            Random rand = new Random();
            int i = rand.nextInt(8);

            if (mat > 0 && i == 0) {
                Curso c = new Curso(i);
                mazo1.add(c);
                mat--;
            }
            if (fis > 0 && i == 1) {
                Curso c = new Curso(i);
                mazo1.add(c);
                fis--;
            }
            if (lp > 0 && i == 2) {
                Curso c = new Curso(i);
                mazo1.add(c);
                lp--;
            }
            if (pro > 0 && i == 3) {
                Curso c = new Curso(i);
                mazo1.add(c);
                pro--;
            }
            if (ed > 0 && i == 4) {
                Curso c = new Curso(i);
                mazo1.add(c);
                ed--;
            }
            if (edd > 0 && i == 5) {
                Curso c = new Curso(i);
                mazo1.add(c);
                edd--;
            }
            if (cont1 > 0 && i == 6) {
                int b = 0;
                while (b == 0) {
                    Random rand2 = new Random();
                    int j = rand2.nextInt(6);

                    if (ce > 0 && j == 0) {
                        Carrete c = new Carrete(j);
                        mazo1.add(c);
                        cont1--;
                        ce--;
                        b = 1;
                    }
                    if (im > 0 && j == 1) {
                        Carrete c = new Carrete(j);
                        mazo1.add(c);
                        cont1--;
                        im--;
                        b = 1;
                    }
                    if (saf > 0 && j == 2) {
                        Carrete c = new Carrete(j);
                        mazo1.add(c);
                        cont1--;
                        saf--;
                        b = 1;
                    }
                    if (sesa > 0 && j == 3) {
                        Carrete c = new Carrete(j);
                        mazo1.add(c);
                        cont1--;
                        sesa--;
                        b = 1;
                    }
                    if (bl > 0 && j == 4) {
                        Carrete c = new Carrete(j);
                        mazo1.add(c);
                        cont1--;
                        bl--;
                        b = 1;
                    }
                    if (fo > 0 && j == 5) {
                        Carrete c = new Carrete(j);
                        mazo1.add(c);
                        cont1--;
                        fo--;
                        b = 1;
                    }
                }

            }
            if (cont2 > 0 && i == 7) {
                int b = 0;
                while (b == 0) {
                    Random rand2 = new Random();
                    int j = rand2.nextInt(4);

                    if (ba > 0 && j == 0) {
                        Profesor c = new Profesor(j);
                        mazo1.add(c);
                        cont2--;
                        ba--;
                        b = 1;
                    }
                    if (ma > 0 && j == 1) {
                        Profesor c = new Profesor(j);
                        mazo1.add(c);
                        cont2--;
                        ma--;
                        b = 1;
                    }
                    if (ci > 0 && j == 2) {
                        Profesor c = new Profesor(j);
                        mazo1.add(c);
                        cont2--;
                        ci--;
                        b = 1;
                    }
                    if (mr > 0 && j == 3) {
                        Profesor c = new Profesor(j);
                        mazo1.add(c);
                        cont2--;
                        mr--;
                        b = 1;
                    }
                }

            }
            c1.setMazo(mazo1);

        }
    }
}
