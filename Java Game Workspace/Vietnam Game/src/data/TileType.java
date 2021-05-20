package data;

public enum TileType {

	Floor("texture",true);
	
	String textureName;
	boolean buildable;
	
	
		TileType(String textureName, boolean buildable){
			this.textureName = textureName;
			this.buildable = buildable; 
		}
}
