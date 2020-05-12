package chapter2.section2;

public class OrthoLine {
	public Mypoint2 u;
	public Mypoint2 v;
	
	public OrthoLine(Mypoint2 u, Mypoint2 v) {
		this.u = u;
		this.v = v;
	}
	public void swap() {
		Mypoint2 temp=u;
		u=v;
		v=temp;
	}
	
	public OrthoLine(int x1, int y1, int x2, int y2) {
		u= new Mypoint2(x1, y1);
		v= new Mypoint2(x2, y2);
	}
	
	public boolean isVerticla() {
		return (u.x==v.x);
	}
	
	public boolean intersects(OrthoLine other) {
		if(isVerticla() && !other.isVerticla()) {
			return(other.u.x<u.x && other.v.x>u.x && u.y<other.u.y && v.y>other.u.y);
		}else if(!isVerticla() && other.isVerticla()) {
			return(other.u.x>u.x && other.v.x<u.x && u.y>other.u.y && v.y<other.u.y);
		}else {
			return false;
		}
	}
	
	
	
}
