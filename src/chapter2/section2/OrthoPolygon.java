package chapter2.section2;

public class OrthoPolygon {
	public int n;
	public Mypoint2 [] vertices;
	
	public OrthoPolygon(int n) {
		this.n=0;
		vertices=new Mypoint2[n];
	}
	
	public void addVertex(int x, int y) {
		vertices[n++]=new Mypoint2(x, y);
	}
	
	public int maxX() {
		int max=vertices[0].x;
		for(int i=0; i<n; i++) {
			if(vertices[i].x>max) {
				max=vertices[i].x;
			}
		}
		return max;
	}
	
	public boolean contains(Mypoint2 p) {
		OrthoLine arrow = new OrthoLine(p, new Mypoint2(maxX()+1, p.y));
		int count =0; 
		for(int i=0; i<n; i++) {
			OrthoLine edge= new OrthoLine(vertices[i], vertices[(i+1)%n]);
			if(arrow.intersects(edge)) {
				count++;
			}
		}
		return (count%2==1);
		
	}
}
