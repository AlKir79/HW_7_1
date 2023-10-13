package Task01;

public class Task01 {
    protected String strIn;
    protected String strOut;
    protected String[] strInArr = null;
    public Task01(){
        this.strIn = new String("");
        strOut = new String();
    }
    public String generateOutStr(String strIn){
        strInArr = strIn.split(",");
        intersect(strInArr);
        for (int i=0;i< strInArr.length;i++){
            int a = Integer.parseInt(strInArr[i].substring(0,strInArr[i].indexOf(" ")));
            int b = Integer.parseInt(strInArr[i].substring(strInArr[i].indexOf(" ")+1, strInArr[i].length()));
            if (a>b) {
                strOut+="Invalid Data";
            };
            if (a<=b){
                strOut+=Integer.toString(b-a)+" ";
            }
        }
        return strOut;
     }
     public void intersect(String[] strArr){
        for(int i=0;i<strArr.length;i++){
            int a = Integer.parseInt(strArr[i].substring(0,strArr[i].indexOf(" ")));
            int b = Integer.parseInt(strArr[i].substring(strInArr[i].indexOf(" ")+1, strArr[i].length()));
            for (int j=i+1;j<strArr.length;j++){
                int a1 = Integer.parseInt(strArr[j].substring(0,strArr[j].indexOf(" ")));
                int b1 = Integer.parseInt(strArr[j].substring(strArr[j].indexOf(" ")+1, strArr[j].length()));
                if ((a>a1) && (a<b1) || (((b>a1) && (b<b1))) || ((a<a1) && (b>b1))) {
                    System.out.println("set "+a+"-"+b+" intersected set "+a1+"-"+b1);
                }
            }
        }
     }
}
