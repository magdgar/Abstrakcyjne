package com.magda;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Created by magdgar on 2016-01-18.
 */
public class Ork implements Dieable, Fightable {
    @Override
    public void die() {
        System.out.println("Greeeeee aghhhh");
    }

    @Override
    public List fight(List<Object> enemys) {

        List<Object> list = enemys.stream().filter(obj -> obj instanceof Elf).limit(1).collect(Collectors.toList());
        list.forEach(o -> ((Dieable) o).die());
        enemys.removeAll(list);

        list = enemys.stream().filter(obj -> obj instanceof Czlowiek).limit(1).collect(Collectors.toList());
        list.forEach(o -> ((Dieable) o).die());
        enemys.removeAll(list);
        return enemys;
    }
}
