class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        if (drones == null || drones.length == 0) 
            return -1;

        int min = Integer.MAX_VALUE;
        int near = -1;

        for (int i = 0; i < drones.length; i++) {
            int sum = Math.abs(drones[i][0] - target[0]) + Math.abs(drones[i][1] - target[1]);
           
            if (sum <= drones[i][2] && sum < min) {
                min = sum;
                near = i;
            }
        }
        
        return near; 
    }
}