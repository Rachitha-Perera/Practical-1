object Vol{
    def Vol(r:Double):Double=(r*r*r)*4*22/(3*7);
    def main(args: Array[String]):Unit={
        printf("%f",Vol(5));
    }
}