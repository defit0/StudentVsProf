package StudentenVsDozenten.Effekte;

import StudentenVsDozenten.Student.Student;

public class Poisoned implements Effect {

	int Damage = 0;
	int duration;
	
	public Poisoned(int d, int duration){
		setDamage(d);
		setDuration(duration);
	}
	
	@Override
	public void influence(Student S) {
		if(duration == 0) {
			S.AllEffects.remove(this);
		}else {
			S.getDamage(Damage);
			duration--;
		}
		
		
	}

	@Override
	public void influenceFirst(Student S) {
		// TODO Auto-generated method stub
		
	}
	
	public void setDamage(int d) {
		this.Damage = d;
		
	}
	public void setDuration(int Duration) {
		this.duration = Duration;
	}
}
