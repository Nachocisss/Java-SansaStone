package SansaStone;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class UnJugador implements ModoJuego{

    private List<Carta> mazo2 = new ArrayList<Carta>();
    private int mat=1, fis=4, lp=2, ed=3, edd=4, pro=6;
    private int ce =1, im = 1, sesa =1, saf=1, bl=1,fo =1;
    private int ci =1, ba=1, mr =1, ma =1;

    public void iniciar(Sansano c1, Sansano c2) {
        System.out.println("ingrese su alias: ");
        Scanner n = new Scanner (System.in);
        c1.setNombre(n.nextLine());
        c2.setNombre("Oponente");
        asignarCartas(c1,c2);
    }

    public void asignarCartas(Sansano c1, Sansano c2) {
        CreaMazo aux = new CreaMazo();
        aux.CrearMazo(c1);

        System.out.println("agresivo o defensivo??");
        Scanner n = new Scanner (System.in);
        int k =(n.nextInt());

        if (k == 1) {
            while (c2.TamanoMazo() < 30) {
                Random rand = new Random();
                int i = rand.nextInt(3);
                if (i == 0) {
                    if (mat > 0) {
                        Curso c = new Curso(0);
                        mazo2.add(c);
                        mat--;
                    } else if (lp > 0) {
                        Curso c = new Curso(2);
                        mazo2.add(c);
                        lp--;
                    } else if (ed > 0) {
                        Curso c = new Curso(4);
                        mazo2.add(c);
                        ed--;
                    } else if (fis > 0) {
                        Curso c = new Curso(1);
                        mazo2.add(c);
                        fis--;
                    } else if (edd > 0) {
                        Curso c = new Curso(5);
                        mazo2.add(c);
                        edd--;
                    } else if (pro > 0) {
                        Curso c = new Curso(3);
                        mazo2.add(c);
                        pro--;
                    }
                }
                c2.setMazo(mazo2);
                if (i == 1) {
                    int b = 0;
                    while (b == 0) {
                        Random rand2 = new Random();
                        int j = rand2.nextInt(4);

                        if (ba > 0 && j == 0) {
                            Profesor c = new Profesor(j);
                            mazo2.add(c);
                            ba--;
                        }
                        if (ma > 0 && j == 1) {
                            Profesor c = new Profesor(j);
                            mazo2.add(c);
                            ma--;
                        }
                        if (ci > 0 && j == 2) {
                            Profesor c = new Profesor(j);
                            mazo2.add(c);
                            ci--;
                        }
                        if (mr > 0 && j == 3) {
                            Profesor c = new Profesor(j);
                            mazo2.add(c);
                            mr--;
                        }
                        b=1;
                    }
                    c2.setMazo(mazo2);
                }
                if (i == 2) {
                    int b = 0;
                    while (b == 0) {
                        Random rand2 = new Random();
                        int j = rand2.nextInt(6);

                        if (ce > 0 && j == 0) {
                            Carrete c = new Carrete(j);
                            mazo2.add(c);
                            ce--;

                        }
                        if (im > 0 && j == 1) {
                            Carrete c = new Carrete(j);
                            mazo2.add(c);
                            im--;

                        }
                        if (saf > 0 && j == 2) {
                            Carrete c = new Carrete(j);
                            mazo2.add(c);
                            saf--;

                        }
                        if (sesa > 0 && j == 3) {
                            Carrete c = new Carrete(j);
                            mazo2.add(c);
                            sesa--;

                        }
                        if (bl > 0 && j == 4) {
                            Carrete c = new Carrete(j);
                            mazo2.add(c);
                            bl--;

                        }
                        if (fo > 0 && j == 5) {
                            Carrete c = new Carrete(j);
                            mazo2.add(c);
                            fo--;

                        }
                        b=1;
                    }
                    c2.setMazo(mazo2);
                }

                c2.setMazo(mazo2);
            }
        }

        if (k== 2) {

            while (c2.TamanoMazo() < 30) {

                Random rand = new Random();
                int i = rand.nextInt(3);

                if (i == 0) {
                    if (pro > 0) {
                        Curso c = new Curso(3);
                        mazo2.add(c);
                         pro--;
                    }
                    else if (mat > 0) {
                        Curso c = new Curso(0);
                        mazo2.add(c);
                        mat--;
                    }
                    else if (lp > 0) {
                        Curso c = new Curso(2);
                        mazo2.add(c);
                        lp--;
                    }
                    else if (ed > 0) {
                        Curso c = new Curso(4);
                        mazo2.add(c);
                        ed--;
                    }
                    else if (fis > 0) {
                        Curso c = new Curso(1);
                        mazo2.add(c);
                        fis--;
                    }
                    else if (edd > 0) {
                        Curso c = new Curso(5);
                        mazo2.add(c);
                        edd--;
                    }

                }
                if (i == 1) {
                    int b = 0;
                    while (b == 0) {
                        Random rand2 = new Random();
                        int j = rand2.nextInt(4);

                        if (ba > 0 && j == 0) {
                            Profesor c = new Profesor(j);
                            mazo2.add(c);
                            ba--;

                        }
                        if (ma > 0 && j == 1) {
                            Profesor c = new Profesor(j);
                            mazo2.add(c);
                            ma--;

                        }
                        if (ci > 0 && j == 2) {
                            Profesor c = new Profesor(j);
                            mazo2.add(c);
                            ci--;

                        }
                        if (mr > 0 && j == 3) {
                            Profesor c = new Profesor(j);
                            mazo2.add(c);
                            mr--;
                        }
                        b=1;
                    }

                }
                if (i == 2) {
                    int b = 0;
                    while (b == 0) {
                        Random rand2 = new Random();
                        int j = rand2.nextInt(6);

                        if (ce > 0 && j == 0) {
                            Carrete c = new Carrete(j);
                            mazo2.add(c);
                            ce--;

                        }
                        if (im > 0 && j == 1) {
                            Carrete c = new Carrete(j);
                            mazo2.add(c);
                            im--;

                        }
                        if (saf > 0 && j == 2) {
                            Carrete c = new Carrete(j);
                            mazo2.add(c);
                            saf--;

                        }
                        if (sesa > 0 && j == 3) {
                            Carrete c = new Carrete(j);
                            mazo2.add(c);
                            sesa--;

                        }
                        if (bl > 0 && j == 4) {
                            Carrete c = new Carrete(j);
                            mazo2.add(c);
                            bl--;

                        }
                        if (fo > 0 && j == 5) {
                            Carrete c = new Carrete(j);
                            mazo2.add(c);
                            fo--;

                        }
                        b=1;
                    }

                }
                c2.setMazo(mazo2);
            }
        }
    }
}
