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

    public int sumAndSub(int a, int b){
        return sun(a,b) + substract(a,b);
    }

    public int getZero(){
        return 0;
    }
}
