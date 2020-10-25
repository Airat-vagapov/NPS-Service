public class NPSService {
    public double nps(int[] votes) {
        int sum = 0;
        int promoters = 0;
        int detractors = 0;
        for (int vote : votes) {
            sum++;

            if (vote > 8 && vote <= 10) {
                promoters++;
            }

            if (vote >=0 && vote < 7) {
                detractors++;

            }
        }
        double nps = promoters * 100. / sum - detractors * 100. / sum;
        return nps;
    }
}
