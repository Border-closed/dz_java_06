import javax.swing.text.StyledEditorKit.BoldAction;

// тарелка (количество еды сейчас)

public class plate {
    private int food;

    public plate (int food) { // Инсерт аппетита 10
        this.food = food;
    }

    public Boolean decreaseFood (int foodToDecrease) {
        if (food>=foodToDecrease) {
            food = food - foodToDecrease;
            return true; // если вычитание случилось
        } else {
            return false;
        }
    }

    public Boolean increaseFood (int foodToIncrease) {
        if (foodToIncrease>0) {
            food = food + foodToIncrease;
            return true;
        } else {
            return false;
        }
    }

    public Boolean isEmpty (int food) {
        if (food>0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Plate ["+food+"]";
    }

}
