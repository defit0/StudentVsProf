package DozentenVsStudenten.Map;

import StudentenVsDozenten.Hilfsklasse.Position;

public class Map {
	final int wide = 5;
	Series [] Series = new Series[wide];

		public Map() {
			for( int size = 0; size < wide;size++) {
				Series[size] = new Series(size,this);
			}
		}

		public Series[] getSeries() {
			return Series;
		}

		public Field getFieldIn(int x , int y) {
			return Series[y].Fields[x];
		}
		
		public Series getSeriesBy(int y) {
			return Series[y];
		}
		public Series getSeriesBy(Position P) {
			return Series[P.getyPosition()];
		}

		@Override
		public String toString() {
			
			String S = "";
			for(Series s : Series) {
				S += s.toString()+"\n";
			}
			return S ;
		}
		
		
	}

