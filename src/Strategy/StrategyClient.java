package Strategy;

public class StrategyClient<T> {
    private Sorting<T> strategy;

    public void setStrategy(Sorting<T> strategy) {
        this.strategy = strategy;
    }
    public void execute(T[] arr){
        strategy.sort(arr);
    }
}
