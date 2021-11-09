package pacman;

import java.util.Scanner;

public class pacmen {

    public static void main(String[] args) {

        String a[][] = new String[30][99];

        //yıldız ve boşluklar tanımlandı
        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 98; j += 2) {
                a[i][j] = "*";
            }
            for (int t = 1; t < 99; t += 2) {
                a[i][t] = " ";
            }
            //a[i][98] = "#";
        }

        //kenar duvarlar tanımlandı
        for (int i = 0; i < 30; i++) {
            a[i][0] = "#";
        }
        for (int i = 0; i < 30; i++) {
            a[i][98] = "#";
        }
        for (int i = 0; i < 99; i++) {
            a[0][i] = "#";
        }
        for (int i = 0; i < 99; i++) {
            a[29][i] = "#";
        }

        //random duvarların başladığı yer
        for (int i = 10; i <= 20; i++) {
            for (int j = 1; j <= 3; j++) {
                a[j][i] = "#";
            }
        }

        for (int i = 4; i <= 6; i++) {
            for (int j = 2; j <= 6; j++) {
                a[j][i] = "#";
            }
        }

        for (int i = 10; i <= 26; i++) {
            for (int j = 5; j <= 7; j++) {
                a[j][i] = "#";
            }
        }

        for (int i = 24; i <= 32; i++) {
            for (int j = 1; j <= 3; j++) {
                a[j][i] = "#";
            }
        }

        for (int i = 1; i <= 6; i++) {
            for (int j = 8; j <= 10; j++) {
                a[j][i] = "#";
            }
        }

        for (int i = 10; i <= 16; i++) {
            for (int j = 9; j <= 16; j++) {
                a[j][i] = "#";
            }
        }

        for (int i = 4; i <= 6; i++) {
            for (int j = 12; j <= 20; j++) {
                a[j][i] = "#";
            }
        }

        for (int i = 4; i <= 18; i++) {
            for (int j = 22; j <= 23; j++) {
                a[j][i] = "#";
            }
        }

        for (int i = 4; i <= 8; i++) {
            for (int j = 25; j <= 27; j++) {
                a[j][i] = "#";
            }
        }

        for (int i = 12; i <= 18; i++) {
            for (int j = 25; j <= 27; j++) {
                a[j][i] = "#";
            }
        }

        for (int i = 22; i <= 26; i++) {
            for (int j = 22; j <= 27; j++) {
                a[j][i] = "#";
            }
        }

        for (int i = 10; i <= 20; i++) {
            for (int j = 18; j <= 20; j++) {
                a[j][i] = "#";
            }
        }

        for (int i = 24; i <= 30; i++) {
            for (int j = 16; j <= 20; j++) {
                a[j][i] = "#";
            }
        }

        for (int i = 20; i <= 30; i++) {
            for (int j = 12; j <= 16; j++) {
                a[j][i] = "#";
            }
        }

        for (int i = 20; i <= 38; i++) {
            for (int j = 9; j <= 10; j++) {
                a[j][i] = "#";
            }
        }

        for (int i = 30; i <= 40; i++) {
            for (int j = 5; j <= 7; j++) {
                a[j][i] = "#";
            }
        }

        for (int i = 36; i <= 40; i++) {
            for (int j = 2; j <= 4; j++) {
                a[j][i] = "#";
            }
        }

        for (int i = 44; i <= 56; i++) {
            for (int j = 2; j <= 4; j++) {
                a[j][i] = "#";
            }
        }

        for (int i = 60; i <= 66; i++) {
            for (int j = 1; j <= 4; j++) {
                a[j][i] = "#";
            }
        }

        //merkez kutucuğu
        for (int i = 40; i <= 42; i++) {
            for (int j = 12; j <= 17; j++) {
                a[j][i] = "#";
            }
        }

        for (int i = 42; i <= 60; i++) {
            for (int j = 17; j <= 17; j++) {
                a[j][i] = "#";
            }
        }

        for (int i = 58; i <= 60; i++) {
            for (int j = 12; j <= 17; j++) {
                a[j][i] = "#";
            }
        }

        for (int i = 42; i <= 60; i++) {
            for (int j = 12; j <= 12; j++) {
                a[j][i] = "#";
            }
        }

        for (int i = 48; i <= 52; i++) {
            for (int j = 12; j <= 12; j++) {
                a[j][i] = " ";
            }
        }

        for (int i = 44; i <= 57; i++) {
            for (int j = 13; j <= 16; j++) {
                a[j][i] = " ";
            }
        }

        //alt boşluk
        //a[28][50] = " ";

        for (int i = 52; i <= 56; i++) {
            for (int j = 27; j <= 28; j++) {
                a[j][i] = "#";
            }
        }

        for (int i = 41; i <= 48; i++) {
            for (int j = 27; j <= 28; j++) {
                a[j][i] = "#";
            }
        }

        for (int i = 34; i <= 36; i++) {
            for (int j = 11; j <= 14; j++) {
                a[j][i] = "#";
            }
        }

        for (int i = 34; i <= 36; i++) {
            for (int j = 16; j <= 20; j++) {
                a[j][i] = "#";
            }
        }

        for (int i = 44; i <= 60; i++) {
            for (int j = 23; j <= 25; j++) {
                a[j][i] = "#";
            }
        }

        for (int i = 30; i <= 40; i++) {
            for (int j = 25; j <= 28; j++) {
                a[j][i] = "#";
            }
        }

        for (int i = 30; i <= 40; i++) {
            for (int j = 22; j <= 23; j++) {
                a[j][i] = "#";
            }
        }

        for (int i = 40; i <= 48; i++) {
            for (int j = 19; j <= 20; j++) {
                a[j][i] = "#";
            }
        }

        for (int i = 44; i <= 60; i++) {
            for (int j = 19; j <= 21; j++) {
                a[j][i] = "#";
            }
        }

        for (int i = 64; i <= 68; i++) {
            for (int j = 15; j <= 24; j++) {
                a[j][i] = "#";
            }
        }

        for (int i = 60; i <= 68; i++) {
            for (int j = 26; j <= 27; j++) {
                a[j][i] = "#";
            }
        }

        for (int i = 72; i <= 76; i++) {
            for (int j = 27; j <= 28; j++) {
                a[j][i] = "#";
            }
        }

        for (int i = 80; i <= 88; i++) {
            for (int j = 25; j <= 27; j++) {
                a[j][i] = "#";
            }
        }

        for (int i = 92; i <= 94; i++) {
            for (int j = 22; j <= 27; j++) {
                a[j][i] = "#";
            }
        }

        for (int i = 86; i <= 94; i++) {
            for (int j = 18; j <= 20; j++) {
                a[j][i] = "#";
            }
        }

        for (int i = 80; i <= 88; i++) {
            for (int j = 22; j <= 23; j++) {
                a[j][i] = "#";
            }
        }

        for (int i = 72; i <= 76; i++) {
            for (int j = 22; j <= 25; j++) {
                a[j][i] = "#";
            }
        }

        for (int i = 72; i <= 82; i++) {
            for (int j = 18; j <= 20; j++) {
                a[j][i] = "#";
            }
        }

        for (int i = 72; i <= 88; i++) {
            for (int j = 15; j <= 16; j++) {
                a[j][i] = "#";
            }
        }

        for (int i = 64; i <= 84; i++) {
            for (int j = 12; j <= 13; j++) {
                a[j][i] = "#";
            }
        }

        for (int i = 90; i <= 94; i++) {
            for (int j = 15; j <= 16; j++) {
                a[j][i] = "#";
            }
        }

        for (int i = 88; i <= 94; i++) {
            for (int j = 10; j <= 13; j++) {
                a[j][i] = "#";
            }
        }

        for (int i = 70; i <= 84; i++) {
            for (int j = 8; j <= 10; j++) {
                a[j][i] = "#";
            }
        }

        for (int i = 88; i <= 94; i++) {
            for (int j = 5; j <= 8; j++) {
                a[j][i] = "#";
            }
        }

        for (int i = 76; i <= 94; i++) {
            for (int j = 2; j <= 3; j++) {
                a[j][i] = "#";
            }
        }

        for (int i = 70; i <= 72; i++) {
            for (int j = 2; j <= 6; j++) {
                a[j][i] = "#";
            }
        }

        for (int i = 76; i <= 84; i++) {
            for (int j = 5; j <= 6; j++) {
                a[j][i] = "#";
            }
        }

        for (int i = 52; i <= 66; i++) {
            for (int j = 6; j <= 7; j++) {
                a[j][i] = "#";
            }
        }

        for (int i = 44; i <= 48; i++) {
            for (int j = 6; j <= 7; j++) {
                a[j][i] = "#";
            }
        }

        for (int i = 42; i <= 66; i++) {
            for (int j = 9; j <= 10; j++) {
                a[j][i] = "#";
            }
        }

        a[28][50] = "O";
        //HARİTA TAMAMDIR
        
        System.out.println("Pacman oyununa hoşgeldiniz\nOyunumuz 2-4-6-8 yön tuşlarıyla oynanmaktadır");
        
        Scanner k = new Scanner(System.in);
        int skor = 0;
        int x = 28, y = 50;
        int yon = 0;
        
        //oyunun hızının belirlenmesi
        int hiz = 400;
        String hizTanimi = "Orta";
        System.out.println(" Oyunu hangi hızda oynamak istersiniz?");
        System.out.println("  1: Yavaş \n  2: Orta \n  3: Hızlı");
        int hizDegeri = k.nextInt();
        switch (hizDegeri) {
            case 1:
                hiz = 700;
                hizTanimi = "Yavaş";
                break;
            case 2:
                hiz = 500;
                hizTanimi = "Orta";
                break;
            case 3:
                hiz = 200;
                hizTanimi = "Hızlı";
                break;
            default:
                System.out.println("Yanlış değer girdiniz");
        }
        
        System.out.println("Oyununuz " + hizTanimi + " modda başlatılıyor\nLütfen bekleyiniz...");        
        //harita yuklenmeden once bekletme
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
        }

        //tüm haritayı yazdırma aşaması
        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 99; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }

        //oyunun başlıyor...
        while (skor < 500) {
            yon = k.nextInt();

            if (yon == 2) {
                while (a[x + 1][y] != "#") {
                    if(a[x + 1][y]=="*"){skor++;}
                    x++;
                    a[x][y] = "O";
                    a[x - 1][y] = " ";
                    try {
                        Thread.sleep(hiz);
                    } catch (InterruptedException ex) {
                    }
                    for (int i = 0; i < 30; i++) {
                        for (int j = 0; j < 99; j++) {
                            System.out.print(a[i][j]);
                        }
                        System.out.println();
                    }
                    if (a[x][y + 2] != "#" || a[x][y - 2] != "#") {
                        break;
                    }
                }
            } else if (yon == 8) {
                while (a[x - 1][y] != "#") {
                    if(a[x-1][y]=="*"){skor++;}
                    x--;
                    a[x][y] = "O";
                    a[x + 1][y] = " ";
                    try {
                        Thread.sleep(hiz);
                    } catch (InterruptedException ex) {
                    }
                    for (int i = 0; i < 30; i++) {
                        for (int j = 0; j < 99; j++) {
                            System.out.print(a[i][j]);
                        }
                        System.out.println();
                    }
                    if (a[x][y + 2] != "#" || a[x][y - 2] != "#") {
                        break;
                    }
                }
            } else if (yon == 4) {
                while (a[x][y - 2] != "#") {
                    if(a[x][y - 2]=="*"){skor++;}
                    y -= 2;
                    a[x][y] = "O";
                    a[x][y + 2] = " ";
                    try {
                        Thread.sleep(hiz);
                    } catch (InterruptedException ex) {
                    }
                    for (int i = 0; i < 30; i++) {
                        for (int j = 0; j < 99; j++) {
                            System.out.print(a[i][j]);
                        }
                        System.out.println();
                    }
                    if (a[x + 1][y] != "#" || a[x - 1][y] != "#") {
                        break;
                    }
                }
            } else if (yon == 6) {
                while (a[x][y + 2] != "#") {
                    if(a[x][y + 2]=="*"){skor++;}
                    y += 2;
                    a[x][y] = "O";
                    a[x][y - 2] = " ";
                    try {
                        Thread.sleep(hiz);
                    } catch (InterruptedException ex) {
                    }
                    for (int i = 0; i < 30; i++) {
                        for (int j = 0; j < 99; j++) {
                            System.out.print(a[i][j]);
                        }
                        System.out.println();
                    }
                    if (a[x + 1][y] != "#" || a[x - 1][y] != "#") {
                        break;
                    }
                }
            } else {
                System.out.println("Geçersiz karakter girdiniz\nLütfen 2-4-6-8 Karakterleriyle oynayın");
            }

        }
        System.out.println("TEBRİKLER OYUNU TAMAMLADINIZ");
        System.out.println("Skorunuz: " + skor);
        System.out.println("Size havai fişek ekranı sunmak isterdim ama henüz o kadar iyi yazılım bilmiyorum...");

    }
}
