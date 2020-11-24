
class Vertice{
	String nombre;
	int numVertice;

	public Vertice(String x){
		nombre = x;
		numVertice = -1;
		}
	public String nomVertice(){
		return nombre;
		}
	public boolean equals(Vertice n){
		return nombre.equals(n.nombre);
		}
	public void asigVert(int n){
		numVertice = n;
		}
	public String toString(){
		return nombre + " (" + numVertice + ")";
		}
} 
 
class GrafoMatriz{
	int numVerts;
	static int maxVerts = 20;
	Vertice [] verts;
	int [][] matAd;
	
	public GrafoMatriz(){
		this(maxVerts);
		}
	public GrafoMatriz(int mx){
		matAd = new int [mx][mx];
		verts = new Vertice[mx];
		for (int i = 0; i < mx; i++)
			for (int j = 0; i < mx; i++)
				matAd[i][j] = 0;
		numVerts = 0;
		}
	
	public void nuevoVertice (String nom){
		boolean esta = numVertice(nom) >= 0;
		if (!esta){
			Vertice v = new Vertice(nom);
			v.asigVert(numVerts);
			verts[numVerts++] = v;
			}
		} 
	public int numVertice(String vs){
		Vertice v = new Vertice(vs);
		boolean encontrado = false;
		int i = 0;
		for (; (i < numVerts) && !encontrado;){
			encontrado = verts[i].equals(v);
			if (!encontrado) i++ ;
			}
		return (i < numVerts) ? i : -1 ;
		}
	
	public void nuevoArco(String a, String b)throws Exception{
	int va, vb;
	va = numVertice(a);
	vb = numVertice(b);
	if (va < 0 || vb < 0) throw new Exception ("Vértice no existe");
	matAd[va][vb] = 1;
	}
	public void nuevoArco(int va, int vb)throws Exception{
		if (va < 0 || vb < 0) throw new Exception ("Vértice no existe");
		matAd[va][vb] = 1;
	}
	public boolean adyacente(String a, String b)throws Exception{
	int va, vb;
	va = numVertice(a);
	vb = numVertice(b);
	if (va < 0 || vb < 0) throw new Exception ("Vértice no existe");
	return matAd[va][vb] == 1;
	}
	public boolean adyacente(int va, int vb)throws Exception{
	if (va < 0 || vb < 0) throw new Exception ("Vértice no existe");
	return matAd[va][vb] == 1;
	}
	
}

public class PruebaGrafos {

	public static void main(String[] args) {
		
		

	}

}
