public class NumberToWords {
    public static void numberToWords(int number){
        if(number < 0){
            System.out.println("Invalid Value");
        }
        int reverseNumber = reverse(number);
        int originalNumberDigit = getDigitCount(number);
        int reverseNumberDigit = getDigitCount(reverseNumber);
        while(reverseNumber > 0){
            switch(reverseNumber % 10){
                case 0 -> System.out.print("Zero ");
                case 1 -> System.out.print("One ");
                case 2 -> System.out.print("Two ");
                case 3 -> System.out.print("Three ");
                case 4 -> System.out.print("Four ");
                case 5 -> System.out.print("Five ");
                case 6 -> System.out.print("Six ");
                case 7 -> System.out.print("Seven ");
                case 8 -> System.out.print("Eight ");
                case 9 -> System.out.print("Nine ");
            }
            reverseNumber /= 10;
        }
                if(originalNumberDigit != reverseNumberDigit || number == 0){
                    System.out.print("Zero ");
            for(int i = 1; i < originalNumberDigit - reverseNumberDigit; i++){
                System.out.print("Zero ");
            }
        }
    }
    public static int reverse(int number){
        if(number < 10 && number > -10){
            return number;
        }
        int reverse = 0;
        while(number >= 10 || number <= -10){
            reverse *= 10;
            reverse += number % 10;
            number /= 10;
        }
        reverse *= 10;
        reverse += number;
        return reverse;
    }
    public static int getDigitCount(int number){
        if(number < 0){
            return -1;
        }
        if(number == 0){
            return 1;
        }else{
        int result = 0;
        while(number > 0){
            number /= 10;
            result++;
        }
            return result;
        }
    }
}
