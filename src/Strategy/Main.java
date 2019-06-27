package Strategy;

public class Main {

    public static void main(String[] args) {

      StrategyClient<Double> strategyClientBubble = new StrategyClient<>();
      strategyClientBubble.setStrategy(new ArrayBubble<>());
      Double[] integers = {1.2,1.3,1.5,1.1};
      strategyClientBubble.execute(integers);

      StrategyClient<Integer> strategyClientSelection = new StrategyClient<>();
      strategyClientSelection.setStrategy(new SelectionSort<>());
      Integer[] integers2 = {1,3,2,5,4};
       strategyClientSelection.execute(integers2);
    }
}
