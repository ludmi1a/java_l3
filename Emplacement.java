public class Emplacement{
	private List<Case> lettres; 
	public Emplacement(){
		lettres = new ArrayList<>();
	}
	public void add(Case c){
		lettres.add(c);
	}
	public boolean isHorizontal(){
		return list.get(0).getLig()==list.get(1).getLig();
	}
	public boolean isVertical(){
		return list.get(0).getCol()==list.get(1).getCol();
	}
	public String toString(){
		String s = '';
		for(int i=0; i<lettre.size(); i++)
			s+= lettres.get(i).getChar();
		return s;
	}
	public int size(){ return lettres.size(); }
}
	
