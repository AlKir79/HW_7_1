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
}
