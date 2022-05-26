public class HarmonicMean {
        public static void main(String[] args) {
            int[] numbers = {1, 3, 5, 7};
            double series = 0.0;
            double mean=0.0;
            for (int i = 0; i < numbers.length; i++) {

                series +=(double)1/numbers[i];

            }
            System.out.println("Sum Of Harmonic Series : "+series);
            mean=(double)numbers.length/series;
            System.out.println("Harmonic Mean :"+mean);
        }
}
