public GrillePlaces{
	private List<Emplacement> places;
	public GrillePlaces(Grille grille){
	//jsi pas di tou
		for (int i=0; i<grille.nbLig(); i++){
			for(int j=0; j<grille.nbCol(); j++){
				if (grille.getCase().getChar()!='*')
	}
	public List<Emplacement> getPlaces(){ return places; }
	public int getNbHorizontal(){
		int n=0;
		for(int i=0; i<places.size(); i++){
			if (places.get(i).isHorizontal())
				s++;
		}
		return s;
	}
}
