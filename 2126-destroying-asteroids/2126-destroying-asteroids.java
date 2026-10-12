class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {

        long masss = mass;

        Arrays.sort(asteroids);

        int i = 0;
        while(i < asteroids.length) {
            if(masss >= asteroids[i]) {
                masss += asteroids[i];
                i++;
            } else {
                return false;
            }
        }
        return true;
    }
}