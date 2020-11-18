public class NPSService {
    public double nps(int[] votes) {
        int promoters = 0;
        int detractors = 0;
        for (int vote : votes) {

            if (vote > 8 && vote <= 10) {
                promoters++;
            }

            if (vote >=0 && vote < 7) {
                detractors++;

            }
        }
        double nps = promoters * 100. / votes.length - detractors * 100. / votes.length;
        return nps;
    }
}
