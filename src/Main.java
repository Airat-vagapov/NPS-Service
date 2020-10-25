public class Main {
    public static void main(String[] args) {
        NPSService npsService = new NPSService();
        int[] votes = {9, 3, 1, 7, 2, 9, 10, 10, 9, 4};
        System.out.println(npsService.nps(votes));
    }
}
