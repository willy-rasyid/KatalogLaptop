package com.willy.kataloglaptop;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {
    private static List<Laptop> laptops = new ArrayList<>();

    private static List<Dell> initDataAcer(Context ctx) {
        List<Dell> dells = new ArrayList<>();
        dells.add(new Dell("Dell Vostro 14-3468", "prosesor Intel Core i5-7200U yang memiliki kecepatan hingga 3.1 GHz",
                R.drawable.dell1));
        dells.add(new Dell(" Dell Inspiron 15-3567", "prosesor Intel Core i5-7200U yang mempunyai kecepatan 2.5 GHz dan dapat meningkat hingga 3.1 GHz berkat teknologi Turbo-Boost",
                R.drawable.dell2));
        dells.add(new Dell("Dell Inspiron 14-5468", "prosesor Intel Core i5-7200U yang dipadukan dengan VGA AMD Radeon R7 M440 2GB",
                R.drawable.dell3));
        dells.add(new Dell("Dell Inspiron 15-5567", "prosesor Intel Core i5-7200U (3M Cache, Up To 3.10 GHz) ini memiliki performa yang handal berkat dukungan RAM DDR4 berukuran 8GB",
                R.drawable.dell4));
        dells.add(new Dell("Dell Inspiron 14-7460", "prosesor Intel terbaru generasi ke-7, yaitu Inter Core i5-7200U",
                R.drawable.dell5));
        return dells;
    }
    private static List<Asus> initDataAsus(Context ctx) {
        List<Asus> asuss = new ArrayList<>();
        asuss.add(new Asus("ExpertBook B9450FA", "Procesor Intel® Core™ i7-10510 processor\n" +
                "1.8GHz quad-core with Turbo Boost (up to 4.9GHz) and 8MB cache\n"+
                "Memory 8GB / 16GB 2133MHz LDDR3 onboard (dual channel support)",
                R.drawable.asus1));
        asuss.add(new Asus("Asus ROG G752", "Procesor 2.6GHz Intel Core i7-6700HQ \n"+
                "(quad-core, up to 3.5GHz with Turbo Boost) \n"+
                "RAM: 16GB DDR4",
                R.drawable.asus2));
        asuss.add(new Asus("ASUS TUF TUF505DU-KB71", "Procesor AMD® Ryzen 7-3750H \n"+
                "RAM Up to 32GB ",
                R.drawable.asus3));
        asuss.add(new Asus("VivoBook 15", "Processor 10th Gen Intel Core i7 \n"+
                "8GB of memory ",
                R.drawable.asus4));
        asuss.add(new Asus("ZenBook S UX391FA-XH74T", "Procesor Core i7 i7-8565U 1.80 GHz Quad-core (4 Core) \n"+
                "16 GB RAM",
                R.drawable.asus5));
        return asuss;
    }

    private static List<Lenovo> initDataHP(Context ctx) {
        List<Lenovo> lenovos = new ArrayList<>();
        lenovos.add(new Lenovo("Lenovo IdeaPad 310S", "prosesor Intel generasi terbaru, yakni Brawsell. Untuk tipenya sendiri yaitu Intel N3350 Dual-core 1.1 GHz dan dapat meningkat hingga 2.40 GHz berkat teknologi Turbo Boost",
                R.drawable.lenovo1));
        lenovos.add(new Lenovo("Lenovo IdeaPad 320", "prosesor AMD A9-9420 berkecepatan 2.9 GHz yang dapat meningkat hingga 3.5 GHz",
                R.drawable.lenovo2));
        lenovos.add(new Lenovo("Lenovo Yoga 310-11IAP-80U200-35ID", "prosesor Intel Celeron N3350 (1.10 GHz up to 2.40 GHz) yang ditemani oleh pengolah grafis Intel HD Graphics. Kemudian untuk mendukung kinerja prosesornya, ia membawa RAM sebesar 4GB",
                R.drawable.lenovo3));
        lenovos.add(new Lenovo("Lenovo V110-15ISK", "prosesor Intel Core i3-6100U berkecepatan 2.3 GHz yang dikolaborasikan dengan VGA Intel HD Graphics 520",
                R.drawable.lenovo4));
        lenovos.add(new Lenovo(" Lenovo G50-80", "prosesor Core i3 yang dijual dengan harga terjangkau. Bagaimana tidak, pasalnya laptop berlayar 15.6 inci beresolusi 1366 x 768 piksel ini hanya dijual seharga 4,6 jutaan saja. Padahal prosesor yang digunakannya adalah Intel Core i3-4030U 1.9 GHz",
                R.drawable.lenovo5));
        return lenovos;
    }

    private static void initAllLaptops(Context ctx) {
        laptops.addAll(initDataAcer(ctx));
        laptops.addAll(initDataAsus(ctx));
        laptops.addAll(initDataHP(ctx));

    }

    public static List<Laptop> getAllLaptop(Context ctx) {
        if (laptops.size() == 0) {
            initAllLaptops(ctx);
        }
        return laptops;
    }

    public static List<Laptop> getLaptopsbytipe(Context ctx, String type) {
        List<Laptop> laptopsByType = new ArrayList<>();
        if (laptops.size() == 0) {
            initAllLaptops(ctx);
        }
        for (Laptop h : laptops) {
            if (h.getMerk().equals(type)) {
                laptopsByType.add(h);
            }
        }
        return laptopsByType;
    }

}
