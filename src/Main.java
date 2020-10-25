public class Main {
    public static void main(String[] args) {
        NPSService npsService = new NPSService();
        int[] votes = {9, 3, 8, 7, 2, 8, 10};
        System.out.println(npsService.nps(votes));
    }
}
