class demo {
    public static void main(String args[]) {

        int num = 100;

        String ones[] = {
            "zero", "one", "two", "three", "four",
            "five", "six", "seven", "eight", "nine"
        };

        String teens[] = {
            "ten", "eleven", "twelve", "thirteen", "fourteen",
            "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
        };

        String tens[] = {
            "", "", "twenty", "thirty", "forty",
            "fifty", "sixty", "seventy", "eighty", "ninety"
        };

        if (num < 10) {
            System.out.print(ones[num]);
        }
        else if (num < 20) {
            System.out.print(teens[num - 10]);
        }
        else if (num < 100) {
            System.out.print(tens[num / 10]);

            if (num % 10 != 0) {
                System.out.print(" " + ones[num % 10]);
            }
        }
        else if (num < 1000) {
            System.out.print(ones[num / 100] + " hundred");

            int remaining = num % 100;

            if (remaining >= 10 && remaining < 20) {
                System.out.print(" " + teens[remaining - 10]);
            }
            else if (remaining >= 20) {
                System.out.print(" " + tens[remaining / 10]);

                if (remaining % 10 != 0) {
                    System.out.print(" " + ones[remaining % 10]);
                }
            }
            else if (remaining > 0) {
                System.out.print(" " + ones[remaining]);
            }
        }
    }
}