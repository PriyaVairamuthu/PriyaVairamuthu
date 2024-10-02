package factoryDP;

public class FactoryMethod {
	public INFORMATION infos(String source) {
		switch(source) {
		case "TV":
			return new TV();
		case "RADIO":
			return new RADIO();
		default :
		    return null;
		}
		
	}

}
