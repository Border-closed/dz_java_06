// Задача накормить котиков
// 1. Создать массив котиков (имя, аппетит от 1 до 10). Котики по очереди едят из одной тарелки. 
// 2. Если в тарелке недостаточно еды - котик пропукает. По умолчанию кот голодный {yes}
// 3. После одного кормления всех котиков тарелка с едой наполняется. Для досыпания еды сделать метод increaseFood в классе Plate.
// 4. Усложняем: Каждую секунду сытость котика уменьшается на 1. Доработать поток thread в классе Cat
// 5. Поменять поле satiety у кота с boolean на int.
// 6. Если у кота сытость 3, а аппетит 10, то накормить его нужно на 7
// while (true) -> while (!plate.isEmpty())

public class cats {

	public static void main(String[] args) throws InterruptedException {
		// кот (имя, аппетит, сытость)
        // тарелка (количество еды сейчас)
        cat murzick = new cat("Murzick", 5);
        cat barsick = new cat("barsick");
        cat chunay = new cat("chunay", 50);
        plate plate = new plate(150);
        System.out.println(plate);
        
        while (true) {
            murzick.makeHungry();
            barsick.makeHungry();
            chunay.makeHungry();
            murzick.eat(plate);
            barsick.eat(plate);
            chunay.eat(plate);
            System.out.println(plate);
            plate.increaseFood(30);
            System.out.println(murzick);
            System.out.println(barsick);
            System.out.println(chunay);
            System.out.println(plate);
            Thread.sleep(1000); // Текущий потомк засыпает на 1000 мсекунд
        }

	}
}