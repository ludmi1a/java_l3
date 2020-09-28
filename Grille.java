public class Grille{
	private Case[][] Case;
	public Grille(int hauteur, int largeur){
		Case = new Case[hauteur][];
		for (int i=0; i<Case.length; i++)
			Case[i] = new Case[largeur];
			for(int j=0; j<Case[i].length; j++)
				Case[i][j] = new Case(i, j, ' ');
	}
	public Case getCase(int lig, int col){ return Case[lig][col]; }
	public String toString() {
	 //askip faut utiliser GrilleLoader
	}
	public int nbLig(){ return Case.length; }
	public int nbCol{ return Case[0].length; } //toute les lignes sont cencées avoir le meme nombre de colonne
	public Grille copy(){
		Grille g = new Grille( this.nbLig(), this.nbCol());
		for(int i=0; i<g.length; i++){
			for(int j=0; j<g[i].length; j++)
				g[i][j] = new Case(this.getCase(i,j).getLig(), this.getCase(i,j).getCol(), this.getCase(i,j).getChar());
		}
		return g;
	}
}
