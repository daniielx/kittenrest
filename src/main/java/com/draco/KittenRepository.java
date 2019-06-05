package com.draco;

import java.util.ArrayList;
import java.util.List;

class KittenRepository {
    private List<Kitten> kittens;

    KittenRepository() {
        kittens = new ArrayList<>();

        Kitten kt1 = new Kitten();
        kt1.setType("Munchkin");
        kt1.setCuteness(10);

        Kitten kt2 = new Kitten();
        kt2.setType("Tuxedo");
        kt2.setCuteness(9);

        kittens.add(kt1);
        kittens.add(kt2);
    }

     List<Kitten> getKittens(){
        return kittens;
    }

    void create(Kitten kt){
        kittens.add(kt);
    }
}
