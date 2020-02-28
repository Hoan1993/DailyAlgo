package algo0103;

public class Code01_Maze10 {

	
	private static int N = 10;
	private static int [][] Maze = {
			{0, 0, 0, 0, 0, 0, 0, 1, 0, 1},
			{0, 1, 1, 0, 1, 1, 0, 1, 0, 0},
			{0, 0, 0, 1, 0, 0, 0, 1, 1, 0},
			{0, 1, 0, 0, 1, 1, 0, 0, 0, 0},
			{0, 1, 1, 1, 0, 0, 1, 1, 1, 0},
			{0, 1, 0, 0, 0, 1, 0, 1, 1, 1},
			{0, 0, 0, 1, 0, 0, 0, 1, 0, 0},
			{0, 1, 1, 1, 0, 1, 0, 0, 1, 0},
			{0, 1, 1, 1, 0, 1, 0, 1, 1, 0},
			{0, 1, 1, 1, 0, 1, 0, 0, 0, 0}
			};
	
	private static int Path = 0;
	//private static int Wall = 1;
	private static int Block = 2;
	private static int Pathed = 3;
	
	
	public static void main(String[] args) {
		printMaze();
		System.out.println();
		findMaze(0,0);
		printMaze();

	}

	private static boolean findMaze(int x, int y) {
		if( x < 0 || y < 0 || x >= N || y >= N) {
			return false;
		} else if(Maze[x][y] != Path) {
			
			return false;
		} else if(x == N-1 && y == N-1) {
			Maze[x][y] = Pathed;
			return true;
		} else {
			Maze[x][y] = Pathed;
			if(findMaze(x-1, y) || findMaze(x, y+1) || findMaze(x+1, y) || findMaze(x, y-1)) {
				return true;
			}
			Maze[x][y] = Block;
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
