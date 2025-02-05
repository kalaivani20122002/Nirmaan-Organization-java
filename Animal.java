package InterfaceTask;



public interface Animal {
	String CATEGORY ="living Being";
	
	
	static boolean isMammal( String Name) {
		if((Name.equalsIgnoreCase("Dog"))||(Name.equalsIgnoreCase("Cat"))||(Name.equalsIgnoreCase("Human"))) {
			return true;
		}
		return false;
	}
	default void speak() {
		System.out.println("Animal is making a sound");
	}
	void move();

}
