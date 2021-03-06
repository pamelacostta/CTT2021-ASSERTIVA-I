package programa.citacao;

public class NomePessoa {
    public static void main(String[] args) {


    String str = "wendeson,da,silva,oliveira";
    int count = 0;
    String substring;
    	while((count = str.indexOf(",")) != -1){
        substring = str.substring(0,count);
        System.out.println(substring);
        str = str.substring(count+1,str.length());
    }

    	System.out.println(str.substring(0,str.length()));
}
}
