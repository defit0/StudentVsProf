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
	
	static  public boolean ColiedVerifier(Position p1,Position p2) {
		float p1x = p1.getxPosition();
		float p1xende =p1.getxPosition()+p1.getLength();
		float p2x = p1.getxPosition();
		float p2xende =p1.getxPosition()+p1.getLength();
		
		if(p1.getyPosition()!= p2.getyPosition())
			return false;
		if(p1x <= p2x && p1xende >= p2x)
			return true;
		if(p1x <= p2xende && p1xende >= p2xende)
			return true;
		return false;
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
