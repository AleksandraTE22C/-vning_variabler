public class övning_heltal{
    public static void main(String[] args) throws Exception {
        int tal1 =2;
        int tal2 =30;

        int summa_addition = tal1+tal2;
        int summa_subtraktion = tal1-tal2;

        System.out.println("summan av tal1 + tal2 är "+summa_addition);
        System.out.println("summan av tal1 - tal2 är "+summa_subtraktion);

        int produkt = tal1*tal2;
        int kvot = tal1/tal2;

        System.out.println("produkten av tal1*tal2 är " +produkt);
        System.out.println("kvoten av tal1/tal2 är " +kvot);
    }
}
