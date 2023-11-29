package StreamTest;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

abstract class Pokemon{
    protected int level;
    protected String name;

    public Pokemon(int level, String name) {
        this.level = level;
        this.name = name;
    }
    public abstract void evolve();
}

class Pickachu extends Pokemon{
    public Pickachu(int level, String name) {
        super(level, name);
    }

    @Override
    public void evolve() {
        if(this.level >= 16){
            this.name = "Raichu";
            System.out.println("축하합니다. 당신의 피카츄가 라이츄로 진화합니다");
        } else {
            System.out.println("피카츄의 레벨이 부족합니다.");
        }
    }
}


public class PokemonDemo {
    public static void main(String[] args) {
        List<Pickachu> pokemons = Stream.of(
                new Pickachu(15, "피카1"),
                new Pickachu(16, "피카2"),
                new Pickachu(17, "피카3")
        ).collect(Collectors.toList());

        //pokemons.forEach(Pickachu::evolve);
        pokemons.forEach(l -> l.evolve());
    }
}
