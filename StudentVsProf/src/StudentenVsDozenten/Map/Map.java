package StudentenVsDozenten.Map;

import StudentenVsDozenten.Hilfsklasse.Position;

public class Map {
	final int wide = PlayingField.Edgey;
	Series [] Series = new Series[wide];

		public Map() {
			for( int size = 0; size < wide;size++) {
				Series[size] = new Series(size*PlayingField.fieldSize,this);
			}
		}

		public Series[] getSeries() {
			return Series;
		}

		public  Field getFieldIn(int x , int y) {
			return Series[(int)(y/PlayingField.fieldSize)].Fields[(int)(x/PlayingField.fieldSize)];
		}
		
		public Series getSeriesBy(int y) {
			return Series[y];
		}
		public Series getSeriesBy(Position P) {
			return Series[Math.round(P.getyPosition()/PlayingField.fieldSize)];
		}

		@Override
		public String toString() {
			
			String S = "";
			for(Series s : Series) {
				S += s.toString()+"\n";
			}
			return S ;
		}
		public boolean isPositionInMap(int x, int y) {
			return (x < (PlayingField.Edgex)*PlayingField.fieldSize && x >= 0 )&& (y < (PlayingField.Edgey)*PlayingField.fieldSize && y >= 0 );
		}
		public static boolean isPositionInMap(Position P) {
			float x = P.getxPosition();
			float y = P.getyPosition();
			return (x < (PlayingField.Edgex)*PlayingField.fieldSize && x >= 0 )&& (y < (PlayingField.Edgey)*PlayingField.fieldSize && y >= 0 );
		}
	}