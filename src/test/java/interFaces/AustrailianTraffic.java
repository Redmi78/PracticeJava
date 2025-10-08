package interFaces;

public class AustrailianTraffic implements CentralTraffic,ContinentialTraffic{

    public static void main(String[] args) {
        CentralTraffic at = new AustrailianTraffic();
        at.redGo();
        at.greenGo();
        at.yellowGo();
        ContinentialTraffic ct = new AustrailianTraffic();
        ct.TrainSymbol();
    }
    @Override
    public void redGo() {
        System.out.println("Red Stop");

    }

    @Override
    public void greenGo() {
        System.out.println("Green Go");

    }

    @Override
    public void yellowGo() {
System.out.println("Yellow Slow Down");
    }

    @Override
    public void TrainSymbol() {
        System.out.println("Train Symbol");
    }
}
