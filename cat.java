// кот (имя, аппетит, сытость)

public class cat {
    private String name; //private чтобы нельзя было менять
    private int appetit;
    private volatile boolean satiety; //сытость

    public cat (String catName, int catAppetit) { //publick чтобы можно было кота создавать
        name = catName;
        appetit = catAppetit;
    
        // new Thread(() -> {
        // while (true) {
        //     satiety = false;
        //     try {
        //         Thread.sleep(5*1000L);
        //     } catch (InterruptedException e) {
        //         throw new RuntimeException(e);
        //     }
        // }
        // }).start();
    }

    public void makeHungry(){
        satiety=false;
    }

    public cat (String name) { // Инсерт аппетита 10
        this(name, 10);
    }

    public void eat (plate plate){
        if (!satiety) {
            satiety = plate.decreaseFood(appetit);
        }
    }

    @Override
    public String toString() {
    return name + " {appetit= " + appetit + ", satiety= " + satiety+"}";
}

}
