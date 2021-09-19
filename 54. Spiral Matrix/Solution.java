class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiralOrderedList = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        int rightEnd = cols-1;
        int bottomEnd = rows-1;
        int leftEnd = 0;
        int topEnd = 1;
        
        int i = 0, j = 0;
        int maxSize = rows*cols;
        
        while(spiralOrderedList.size() < maxSize && i < rows && j < cols && i >= 0 && j >= 0) {
            while(j <= rightEnd && j >= 0 && i >= 0 && spiralOrderedList.size() < maxSize) {
                spiralOrderedList.add(matrix[i][j]);
                j++;
            }
            j--;
            i++;
            rightEnd--;
            while(i <= bottomEnd && i >= 0 && j >= 0 && spiralOrderedList.size() < maxSize) {
                spiralOrderedList.add(matrix[i][j]);
                i++;
            }
            i--;
            j--;
            bottomEnd--;
            while(j >= leftEnd && j < cols && i < rows && spiralOrderedList.size() < maxSize) {
                spiralOrderedList.add(matrix[i][j]);
                j--;
            }
            j++;
            i--;
            leftEnd++;
            while(i >= topEnd && i < rows && j < cols && spiralOrderedList.size() < maxSize) {
                spiralOrderedList.add(matrix[i][j]);
                i--;
            }
            i++;
            j++;
            topEnd++;            
        }
        
        return spiralOrderedList;
    }
}
