object wCost{
    def wCost(n:Int): Double=if(n<=50) 3+(24.95*n*40/100) else 3+((n-50)*0.75)+(24.95*n*40/100);
    def main(args: Array[String]):Unit={
        printf("%f",wCost(60));
    }
}