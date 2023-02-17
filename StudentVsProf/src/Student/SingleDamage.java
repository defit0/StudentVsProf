package Student;

public class SingleDamage implements Effect {
	int Damage = 0;
	
	public SingleDamage(int d){
		setDamage(d);
	}
	public void setDamage(int d) {
		this.Damage = d;
	}
	 public void influence(Student S) {
		S.getDamage(0);
		S.AllEffects.remove(this);
	}
}
