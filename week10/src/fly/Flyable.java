package fly;

public interface Flyable {
//    public fly.Flyable(){
//
//    }

    //Pokemonster.Pokemon pokemon;

    //void fly();
    default void fly(){
        System.out.println("날아 갑니다!");
    }
}
