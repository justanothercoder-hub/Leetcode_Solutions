class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int rows = maze.length;
        int cols = maze[0].length;

        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[rows][cols];

        queue.offer(new int[]{entrance[0],entrance[1]});
        visited[entrance[0]][entrance[1]] = false;

        int steps = 0;
        int[][] directions = {{0,1},{0,-1},{1,0},{-1,0}};

        while(!queue.isEmpty()){
            int size = queue.size();

            for(int i=0 ; i<size ; i++){
                int[] current = queue.poll();
                int r = current[0];
                int c = current[1];

                if ((r == 0 || r == rows - 1 || c == 0 || c == cols - 1) && 
                    !(r == entrance[0] && c == entrance[1])) {
                    return steps;
                }

                for(int[] dir : directions){
                    int newR = r+dir[0];
                    int newC = c+dir[1];

                    if (newR >= 0 && newR < rows && 
                        newC >= 0 && newC < cols && 
                        !visited[newR][newC] && maze[newR][newC] == '.'){
                        queue.offer(new int[]{newR, newC});
                        visited[newR][newC] = true;
                    }
                }
            }
            steps++;
        }

        return -1;

    }
}
