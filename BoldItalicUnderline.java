
public class BoldItalicUnderline {

	public static void main(String[] args) {
		
	
	String s="<b><i>A</b></i><i><u>B</i></u><u><b>C</u></b><i><u><b>D</i></u></b>";
	
	/*String s1=s.replaceAll("<b><i>", "<bi>").replaceAll("</b></i>", "</bi>")
			.replaceAll("<i><b>", "<ib>").replaceAll("</i></b>", "<ib>")
			.replaceAll("<b><u>", "<bu>").replaceAll("</b></u>", "</bu>")
			.replaceAll("<u><b>", "<ub>").replaceAll("</u></b>", "</ub>")
			.replaceAll("<u><i>", "<ui>").replaceAll("</u></i>", "</ui>")
			.replaceAll("<i><u>", "<iu>").replaceAll("</i></u>", "</iu>")
			;*/
	
	
	String s2=s.replaceAll("<b><i><u>", "<biu>").replaceAll("</b></i></u>", "</biu>")
			   .replaceAll("<b><u><i>", "<bui>").replaceAll("</b></u></i>", "<bui>")
			   .replaceAll("<i><b><u>", "<ibu>").replaceAll("</i></b></u>", "</ibu>")
			   .replaceAll("<i><u><b>", "<iub>").replaceAll("</i></u></b>", "</iub>")
			   .replaceAll("<u><b><i>", "<ubi>").replaceAll("</u></b></i>", "</ubi>")
			   .replaceAll("<u><i><b>", "<uib>").replaceAll("</u></i></b>", "</uib>")
			   .replaceAll("<b><i>", "<bi>").replaceAll("</b></i>", "</bi>")
			   .replaceAll("<i><b>", "<ib>").replaceAll("</i></b>", "<ib>")
			   .replaceAll("<b><u>", "<bu>").replaceAll("</b></u>", "</bu>")
			   .replaceAll("<u><b>", "<ub>").replaceAll("</u></b>", "</ub>")
			   .replaceAll("<u><i>", "<ui>").replaceAll("</u></i>", "</ui>")
			   .replaceAll("<i><u>", "<iu>").replaceAll("</i></u>", "</iu>")
			   ;
	System.out.println("Input string is "+s);
	System.out.println("Output String is "+s2);
}	
}
