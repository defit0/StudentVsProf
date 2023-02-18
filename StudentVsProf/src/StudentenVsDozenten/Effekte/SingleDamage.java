package StudentenVsDozenten.Effekte;

import Student.Student;

public class SingleDamage implements Effect {
	int Damage = 0;
	
	public SingleDamage(int d){
		setDamage(d);
	}
	public void setDamage(int d) {
		this.Damage = d;
	}
	 public void influence(Student S) {
		S.AllEffects.remove(this);
	}
	@Override
	public void influenceFirst(Student S) {
		S.getDamage(Damage);
		S.AllEffects.remove(this);
	}
}
