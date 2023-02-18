package StudentenVsDozenten.Effekte;

import Student.Student;

public interface Effect {
	
	 void influence(Student S);
	 void influenceFirst(Student S);
	 //S.AllEffects.remove(this);
}
