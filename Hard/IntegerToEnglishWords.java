//273. Integer to English Words

class IntegerToEnglishWords {

    private static final String[] LESS_THAN_20 = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", 
                                                  "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", 
                                                  "Eighteen", "Nineteen"};
    
    private static final String[] TENS = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    
    private static final String[] THOUSANDS = {"", "Thousand", "Million", "Billion"};

    public String numberToWords(int num) {
        if (num == 0) return "Zero";  

        int index = 0;  
        String result = "";
 
        while (num > 0) {
            if (num % 1000 != 0) {
                result = helper(num % 1000) + THOUSANDS[index] + " " + result;
            }
            num /= 1000;   
            index++;
        }

        return result.trim();   
    }
 
    private String helper(int num) {
        if (num == 0) return "";
        else if (num < 20) return LESS_THAN_20[num] + " ";   
        else if (num < 100) return TENS[num / 10] + " " + helper(num % 10);   
        else return LESS_THAN_20[num / 100] + " Hundred " + helper(num % 100);  
    }
    public static void main(String[] args) {

    }
}
