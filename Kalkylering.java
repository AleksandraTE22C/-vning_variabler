public class Kalkylering{
    public static void main(String[] args){
        System.out.println("Uppg A");
        int tal1 = 23;
        int tal2 = 45;
        int summa;

        summa = tal1+tal2;
        System.out.println(tal1+"+"+tal2+"="+summa);
        summa = tal1-tal2;
        System.out.println(tal1+"-"+tal2+"="+summa);
        
        System.out.println("Uppg B");
        int tal3 = 234232;
        int tal4 = 3424;
        int produkt;

        produkt=tal3*tal4;
        System.out.println(tal3+"*"+tal4+"="+produkt);
        produkt=tal2*tal3*tal4;
        System.out.println(tal2+"*"+tal3+"*"+tal4+"="+produkt);

        System.out.println("Uppg C");
        int kvot;
        int tal5 = 10;
        int tal6 = 6;

        kvot = tal1/tal2;
        System.out.println(tal1+"/"+tal2+"="+kvot);
        kvot= tal6/tal3;
        System.out.println(tal6+"/"+tal3+"="+kvot);

        System.out.println("Uppg D");
        int modulo;
        modulo = tal5%tal6;
        System.out.println(tal5+"%"+tal6+"="+modulo);
        modulo = 12%4;
        System.out.println(+12+"%"+4+"="+modulo);
    }
}