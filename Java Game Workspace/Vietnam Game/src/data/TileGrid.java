package data;

import static helpers.help.*;


public class TileGrid {
	public tile[][] map;
	
	
	

		
	public TileGrid() {
		map = new tile[20][15];
		for (int i = 0; i < map[i].length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				map[i][j] = new tile(i * 64, j * 64, 64, 64, TileType.Floor);
		}	
	}
}
	

	
	
	public void Draw() {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				tile t = map[i][j];
				System.out.print(t);
				DrawQuadTex(t.getTexture(), t.getX(), t.getY(), t.getWidth(), t.getHeight());
			}
		}
	}
	}
