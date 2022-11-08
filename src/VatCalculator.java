import java.util.Scanner;

public class VatCalculator {
    public static void main(String[] args) {
        /* Java Java ile kullanıcıdan alınan para değerinin
        KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
        (Not : KDV tutarını 18% olarak alın)
        KDV'siz Fiyat = 10
        KDV'li Fiyat = 11.8;
        KDV tutarı = 1.8;
        Ödev
        Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
        tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
         */

        // Declare double variables

        double amount, vatRates = 0.18, VatAmount, AmountWithVat;
        boolean vat;

        //create a new object

        Scanner input = new Scanner (System.in);

        // prompt the user to input double for all variables respectively
        System.out.print(" Enter amount : ");
        amount = input.nextDouble();

        // Check amount
        vat = ( 0 < amount) && ( amount < 1000 );
        vatRates = vat ? 0.18 : 0.08;

        // Calculate VAT Amount and Amount with VAT
        VatAmount = amount * vatRates ;
        AmountWithVat = amount + VatAmount;

        // Display result
        System.out.println( " Amount : " + amount );
        System.out.println( " VAT Rates : " + vatRates );
        System.out.println( " VAT Amount : " + VatAmount);
        System.out.println( " Amount with VAT : " + AmountWithVat);

    }
}
