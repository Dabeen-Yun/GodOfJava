package Chap06;

public class InterestManager {
    public static void main(String args[]) {
        InterestManager interest = new InterestManager();
        int sum = 1000000;
        for(int i = 1; i <= 365; i += 10) {
            // sum += 1000000;
            double rate = interest.getInterestRate(i);
            sum += (sum * rate);
            double ans = interest.calculateAmount(i, sum);
            System.out.println(ans);
        }
    }
        public double getInterestRate(int day){
            double rate = 0;
            if (day <= 90){
                rate = 0.005;
            }
            else if (day <= 180){
                rate = 0.01;
            }
            else if(day <= 364){
                rate = 0.02;
            }
            else {
                rate = 5.006;
            }
            return rate;
        }

        public double calculateAmount(int day, long amount){
            double ans;
            double rate = getInterestRate(day);
            ans = amount + rate;
            return ans;
        }
}
