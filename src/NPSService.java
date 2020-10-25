public class NPSService {
    public double nps(int[] votes) {
        int sum = 0;
        int promoters = 0;
        int detractors = 0;
        for (int vote : votes) {
            sum = sum + vote;

            if (vote > 9) {
                promoters = promoters + vote;
            }

            if (vote < 6) {
                detractors = detractors + vote;

            }
        }
        double nps = promoters * 100. / sum - detractors * 100. / sum;
        return nps;
    }
}
