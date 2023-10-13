package Task03;

public class Money {
    private long rub;
    private byte kop;

    public Money(long rub,byte kop){
        this.rub = rub;
        this.kop = kop;
    }

    public void addSum(long rub,byte kop){
        this.rub+=rub;
        this.kop+=kop;
        if(this.kop>=100) {
            this.rub++;
            this.kop-=100;
        }
    }

    public void minusSum(long rub,byte kop){
        if (this.rub<rub){
            System.out.println("Сумма меньше вычитаемой!!!");
            return;
        }
        else{
            this.rub-=rub;
            this.kop-=kop;
            if (this.kop<0){
                this.rub--;
                this.kop+=100;
            }
        }
    }

   public void delSum(long rub,byte kop){
        double a=this.rub+(double)this.kop/100;
        double b=rub+(double)kop/100;
        double c=a/b;
        this.rub=(int)c;
        this.kop= (byte) ((c-this.rub)*100);
       if(this.kop>=100) {
           this.rub++;
           this.kop-=100;
       }
   }

   public void multy(double val){
       double a=this.rub+(double)this.kop/100;
        a*=val;
       this.rub=(int)a;
       this.kop= (byte) ((a-this.rub)*100);
       if(this.kop>=100) {
           this.rub++;
           this.kop-=100;
       }
   }

   public void div(double val){
       double a=this.rub+(double)this.kop/100;
       a/=val;
       this.rub=(int)a;
       this.kop= (byte) ((a-this.rub)*100);
       if(this.kop>=100) {
           this.rub++;
           this.kop-=100;
       }

   }

    public void compSum(long rub, byte kop){
        double a=this.rub+(double)this.kop/100;
        double b=rub+(double)kop/100;
        if (a>b){
            System.out.println("first");
        }
        else {
            System.out.println("second");
        }
    }


    @Override
    public String toString() {
        String temp = "Money = " +
                rub +",";
        if (kop<10){
            temp+="0";
        }
        temp+=   + kop + " rub";
        return temp;

    }
}
