package algo0102;

public class Code07_Maze {
	
	private static int N = 8;
	private static int [][] Maze = {
			{0, 0, 0, 0, 0, 0, 0, 1},
			{0, 1, 1, 0, 1, 1, 0, 1},
			{0, 0, 0, 1, 0, 0, 0, 1},
			{0, 1, 0, 0, 1, 1, 0, 0},
			{0, 1, 1, 1, 0, 0, 1, 1},
			{0, 1, 0, 0, 0, 1, 0, 1},
			{0, 0, 0, 1, 0, 0, 0, 1},
			{0, 1, 1, 1, 0, 1, 0, 0}
			};
	
	private static int PATHWAY_COLOR = 0;
	//private static int WALL_COLOR = 1;
	private static int BLOCKED_COLOR = 2;
	private static int PATH_COLOR = 3;
	

	public static void main(String[] args) {
		printMaze();
		findMaze(0,0);
		System.out.println();
		printMaze();

	}

	private static boolean findMaze(int x, int y) {
		if(x < 0 || y < 0 || x >= N || y >= N) {
			return false;
		} else if(Maze[x][y] != PATHWAY_COLOR) {
			return false;
		} else if(x == N-1 && y == N-1) {
			Maze[x][y] = PATH_COLOR;
			return true;
		} else {
			// 이미 지나쳤다는 것을 표시
			Maze[x][y] = PATH_COLOR;
			if(findMaze(x-1, y) || findMaze(x, y+1) || findMaze(x+1, y) || findMaze(x, y-1)) {
				return true;
			}
			Maze[x][y] =BLOCKED_COLOR;
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
		
	}

}
