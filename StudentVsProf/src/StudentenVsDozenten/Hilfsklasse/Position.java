package StudentenVsDozenten.Hilfsklasse;

public class Position {
	float xPosition;
	float yPosition;
	float length;
	float height;
	
	public Position(float xP, float yP, float l, float h){
		xPosition = xP;
		yPosition = yP;
		length = l;
		height = h;
		
	}
	
	public Position(Position myPosition) {
		xPosition = myPosition.getxPosition();
		yPosition = myPosition.getyPosition();
		length = myPosition.length;
		height = myPosition.height;
	}
	
	public static boolean Colied(Position pos1, Position pos2) {
	    if (pos1.getxPosition() + pos1.getLength() < pos2.getxPosition() ||
	        pos2.getxPosition() + pos2.getLength() < pos1.getxPosition()) {
	        return false;
	    }
	    
	    if (pos1.getyPosition() + pos1.getHeight() < pos2.getyPosition() ||
	        pos2.getyPosition() + pos2.getHeight() < pos1.getyPosition()) {
	        return false;
	    }

	    return true;
	}
	public Position subX(float x) {
		return new Position(xPosition-x,yPosition,length, height);
	}
	public Position subY(float y) {
		return new Position(xPosition,yPosition-y,length, height);
	}
	public Position addX(float x) {
		return new Position(xPosition+x,yPosition,length, height);
	}
	public Position addX(int x) {
		return new Position(xPosition+x,yPosition,length, height);
	}
	public Position addY(float y) {
		return new Position(xPosition,yPosition + y,length, height);
	}
	public Position addY(int y) {
		return new Position(xPosition,yPosition + y,length, height);
	}

	public Position addXY(float x, float y) {
		return new Position(xPosition + x,yPosition + y,length, height);
	}
	
	public float getxPosition() {
		return xPosition;
	}

	public void setxPosition(float xPosition) {
		this.xPosition = xPosition;
	}

	public float getyPosition() {
		return yPosition;
	}

	public void setyPosition(float yPosition) {
		this.yPosition = yPosition;
	}


	
	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Position [" + xPosition + "/" + yPosition + ", " + length + "]";
	}
	
}
