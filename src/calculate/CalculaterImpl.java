package calculate;

public class CalculaterImpl implements Calculater {
    @Override
    public int sun(int a, int b) {
        return a+b;
    }

    @Override
    public int substract(int a, int b) {
        return a-b;
    }
}
