public class Deposit {
    private double persent=6.75;
    public int calculate(int amount,int period){
        int result=(int)((amount/100.0)*(1+this.persent*period/36500.0)*100);
        return result;
    }
}
