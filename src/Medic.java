public class Medic extends Hero{

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность Healing");
    }
    public int healPoint = 10;
    public void increaseExperience(){
        healPoint *= 1.1;
    }

}
