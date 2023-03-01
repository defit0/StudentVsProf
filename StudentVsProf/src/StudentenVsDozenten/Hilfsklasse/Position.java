package StudentenVsDozenten.Hilfsklasse;

public class Position {
	float xPosition;
	float yPosition;
	float lange;
	
	public Position(float xP, float yP, float l){
		xPosition = xP;
		yPosition = yP;
		lange = l;
	}
	
	static  public boolean ColiedVerifier(Position p1,Position p2) {
		float p1x = p1.getxPosition();
		float p1xende =p1.getxPosition()+p1.getLange();
		float p2x = p1.getxPosition();
		float p2xende =p1.getxPosition()+p1.getLange();
		
		if(p1.getyPosition()!= p2.getyPosition())
			return false;
		if(p1x <= p2x && p1xende >= p2x)
			return true;
		if(p1x <= p2xende && p1xende >= p2xende)
			return true;
		return false;
	}
	public Position subX(float x) {
		return new Position(xPosition-x,yPosition,lange);
	}
	public Position addX(float x) {
		return new Position(xPosition+x,yPosition,lange);
	}
	public Position addX(int x) {
		return new Position(xPosition+x,yPosition,lange);
	}
	public Position addY(float y) {
		return new Position(xPosition,yPosition + y,lange);
	}
	public Position addY(int y) {
		return new Position(xPosition,yPosition + y,lange);
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

	public float getLange() {
		return lange;
	}

	public void setLange(float lange) {
		this.lange = lange;
	}

	@Override
	public String toString() {
		return "Position [" + xPosition + "/" + yPosition + ", " + lange + "]";
	}
	
}
