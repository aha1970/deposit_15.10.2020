public class Main {

    public static void main(String[] args) {
	   Deposit nonameBank=new Deposit() ;
	   int res=nonameBank.calculate(1000_00,365);
        System.out.println(res);
    }
}
