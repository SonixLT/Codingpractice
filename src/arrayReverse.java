public class arrayReverse {
    public static void main(String[] args) {
        long n = 58912;
        int[] reverse = digitize(n);
        for (int value : reverse) {
            System.out.print(value);
        }
    }

    private static int[] digitize(long n) {
        return new StringBuilder().append(n)
                .reverse()
                .chars()
                .map(Character::getNumericValue)
                .toArray();
    }
}
