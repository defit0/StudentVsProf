package DozentenVsStudenten.Map;



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

		@Override
		public String toString() {
			
			String S = "";
			for(Series s : Series) {
				S += s.toString()+"\n";
			}
			return S ;
		}
		
		
	}

