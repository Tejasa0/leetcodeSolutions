class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        int xClose=Math.max(x1,Math.min(x2,xCenter));
        int yCLose=Math.max(y1,Math.min(y2,yCenter));
        int eclDist=(int)Math.sqrt((xClose-xCenter)*(xClose-xCenter)+(yCLose-yCenter)*(yCLose-yCenter));
        return eclDist<=radius;
    }
}