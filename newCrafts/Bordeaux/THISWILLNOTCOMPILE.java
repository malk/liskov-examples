package newCrafts.Bordeaux;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class THISWILLNOTCOMPILE {



    public interface OBJECT {}
    public interface FromEarth extends OBJECT {}
    public interface Being extends FromEarth {}
    public interface LivingBeing extends Being {}

    public interface Animal extends LivingBeing {}
    public interface Plant extends LivingBeing {}
    public interface Fungi extends LivingBeing {}
    public interface Protista extends LivingBeing {}
    public interface Monera extends LivingBeing {}

    public interface Vertrebrate extends Animal {}
    public interface Invertrebrate extends Animal {}

    public interface Equidae extends Vertrebrate {}
    public interface Feline extends Vertrebrate {}
    public interface Canidae extends Vertrebrate {}


    public interface Horse extends Equidae {}
    public interface Zebra extends Equidae {}

    public interface Lion extends Feline {}
    public interface Cat extends Feline {}
    public interface Tabby extends Cat {}

    public interface Wolf extends Canidae {}
    public interface Dog extends Canidae {}


















    public Boolean isVaccinated(List<? extends Animal> betes) {
        return null;
    }

    public void TEST_THE_TESTS() {
        List<LivingBeing> livingBeings = new ArrayList<>();
        List<Animal> animals = new ArrayList<>();
        List<Cat> cats = new ArrayList<>();

        //isVaccinated(livingBeings);
        isVaccinated(animals);
        isVaccinated(cats);
    }







































    public void addAnimalDuMois(List<? super Animal> betes) {
        betes.add(new Zebra() {});
    }

    public void TEST_THE_TESTS2() {
        List<LivingBeing> livingBeings = new ArrayList<>();
        List<Animal> animals = new ArrayList<>();
        List<Cat> cats = new ArrayList<>();

        addAnimalDuMois(livingBeings);
        addAnimalDuMois(animals);
        //addAnimalDuMois(cats);
    }







































    public <A extends Animal> List<A> trierLesBetes(Comparator<? super A> comparator,
                                      Collection<? extends A> betes) {
        return null;
    }
    public void TEST_THE_TESTS3() {
        List<LivingBeing> livingBeings = new ArrayList<>();
        List<Animal> animals = new ArrayList<>();
        List<Cat> cats = new ArrayList<>();
        List<Dog> dawgs = new ArrayList<>();

        Comparator<LivingBeing> livingBeingComparator = new Comparator<LivingBeing>() {
            @Override
            public int compare(LivingBeing o1, LivingBeing o2) {
                return 0;
            }
        };
        Comparator<Animal> animalComparator = new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return 0;
            }
        };
        Comparator<Cat> catComparator = new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                return 0;
            }
        };
        Comparator<Dog> dogComparator = new Comparator<Dog>() {
            @Override
            public int compare(Dog o1, Dog o2) {
                return 0;
            }
        };


        trierLesBetes(livingBeingComparator, cats);
        trierLesBetes(animalComparator, cats);
        trierLesBetes(catComparator, cats);
        //trierLesBetes(dogComparator, cats);


    }
}
