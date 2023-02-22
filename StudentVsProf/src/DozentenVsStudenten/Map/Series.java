package DozentenVsStudenten.Map;

import StudentenVsDozenten.Hilfsklasse.Position;

public class Series {
int length = PlayingField.EdgeY ;
Map map;
int yPosition;
Field [] Fields = new Field [length];

	public Series(int y,Map m) {
		map = m;
		Position p = new Position(0, y, 1f);
		for( int size = 0; size < length;size++) {
			Field F = new Field(p.addX(size),this);
			Fields[size] = F;
		}
	}
	
	public Field isIn(Position P) {
		return Fields[Math.round(P.getxPosition())];
	}

	@Override
	public String toString() {
		String S = " [";
		for(Field F : Fields) {
			S += F.toString();
		}
		return S +"]";
	}
	
}
