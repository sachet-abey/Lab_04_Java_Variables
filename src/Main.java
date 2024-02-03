public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int intOperandA = 27;
        int intOperandB = 4;
        int intSum = intOperandA + intOperandB;
        System.out.println("The sum using ints of "+intOperandA+" "+intOperandB+" is "+intSum);
        int intProduct = intOperandA * intOperandB;
        System.out.println("The product using ints of "+intOperandA+" "+intOperandB+" is "+intProduct);
        int intDifference = intOperandA - intOperandB;
        System.out.println("The difference using ints of "+intOperandA+" "+intOperandB+" is "+intDifference);
        int intQuotient = intOperandA / intOperandB;
        System.out.println("The quotient using ints of "+intOperandA+" "+intOperandB+" is "+intQuotient);
        int intModulo = intOperandA % intOperandB;
        System.out.println("The modulo/remainder using ints of "+intOperandA+" "+intOperandB+" is "+intModulo);
        double doubleOperandA = 200.121212;
        double doubleOperandB = 87.33333;
        double doubleSum = doubleOperandA + doubleOperandB;
        System.out.println("The sum using doubles of "+doubleOperandA+" "+doubleOperandB+" is "+doubleSum);
        double doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println("The product using doubles of "+doubleOperandA+" "+doubleOperandB+" is "+doubleProduct);
        double doubleDifference = doubleOperandA - doubleOperandB;
        System.out.println("The difference using doubles of "+doubleOperandA+" "+doubleOperandB+" is "+doubleDifference);
        double doubleQuotient = doubleOperandA / doubleOperandB;
        System.out.println("The quotient using doubles of "+doubleOperandA+" "+doubleOperandB+" is "+doubleQuotient);

        int numKids = 3;
        System.out.println("The number of kids in my family is "+numKids);
        boolean raining = false;
        System.out.println("The answer to is it raining is "+raining);
        double gasPrice = 10.00;
        System.out.println("The price of a gallon of gas is "+gasPrice);
        int favoriteNum = 8;
        System.out.println("My favorite number is "+favoriteNum);
        int shoeSize = 9;
        System.out.println("My shoe size is "+shoeSize);
        int birthMonth = 4;
        System.out.println("My birth month is "+birthMonth);
        String fullName = "Sachet Abeysinghe";
        System.out.println("My full name is "+fullName);
    }
}