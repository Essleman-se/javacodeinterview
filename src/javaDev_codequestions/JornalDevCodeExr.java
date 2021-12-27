package javaDev_codequestions;

public class JornalDevCodeExr {
	
	public static void main(String[] args) {
		System.out.println(revers("Abebe"));
	}
	
    public static String revers(String str){

    	StringBuilder sb = new StringBuilder();
    	
    	char[] chrs = str.toCharArray();
    	
    	for(int i=chrs.length-1; i <= 0; i--) {
    		sb.append(chrs[i]);
    	}
    	
    	return sb.toString();
    	
    }

}
