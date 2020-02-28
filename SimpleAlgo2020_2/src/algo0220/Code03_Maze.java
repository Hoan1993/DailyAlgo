package algo0220;

public class Code03_Maze {
	private static int N = 8;
	private static int [][] Maze = {
			{0, 0, 0, 0, 0, 0, 0, 1},
			{0, 1, 1, 0, 1, 1, 0, 1},
			{0, 0, 0, 1, 0, 0, 0, 1},
			{0, 1, 0, 0, 1, 1, 0, 0},
			{0, 1, 1, 1, 0, 0, 1, 1},
			{0, 1, 0, 0, 0, 1, 0, 1},
			{0, 0, 0, 1, 0, 0, 0, 1},
			{0, 1, 1, 1, 0, 1, 0, 1}
			};
	
	private static int PATHWAY_COLOR = 0;
	private static int BLOCKED_COLOR = 2;
	private static int PATH_COLOR = 3;
	
	public static void main(String[] args) {
		printMaze();
		findMaze(0,0);
		printMaze();
	}

	private static boolean findMaze(int x, int y) {
		// 일단, 유효성 검사부터
		if(x < 0 || y < 0 || x >= N || y >= N) {
			return false;
		} else if(Maze[x][y] != PATHWAY_COLOR) {
			return false;
		} else if(x == N-1 && y == N-1) {
			Maze[x][y] = PATH_COLOR;
			return true;
		} else {
			Maze[x][y] = PATH_COLOR;
			if(findMaze(x-1, y) || findMaze(x, y+1) || findMaze(x+1, y) || findMaze(x, y-1)) {
				return true;
			}
			Maze[x][y] = BLOCKED_COLOR;
			return false;
			
		}
		
	}

	private static void printMaze() {
		for(int i=0; i<Maze.length; i++) {
			for(int j=0; j<Maze[i].length; j++) {
				System.out.print(Maze[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
	}
	
}
