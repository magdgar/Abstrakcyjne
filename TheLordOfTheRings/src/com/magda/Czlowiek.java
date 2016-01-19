package com.magda;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by magdgar on 2016-01-18.
 */
public class Czlowiek implements Dieable, Fightable {
    @Override
    public void die() {
        System.out.println("F*ck");
    }

    @Override
    public List fight(List<Object> enemys) {
        List<Object> list = enemys.stream().filter(obj -> obj instanceof Ork).limit(1).collect(Collectors.toList());
        list.forEach(o -> ((Dieable) o).die());
        enemys.removeAll(list);
        return enemys;
    }
}
