package StudentenVsDozenten.Effekte;

import DozentenVsStudenten.Student.Student;

public interface Effect {
	
	 void influence(Student S);
	 void influenceFirst(Student S);
	 //S.AllEffects.remove(this);
}
