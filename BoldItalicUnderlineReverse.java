
public class BoldItalicUnderlineReverse {

public static void main(String[] args) {
		
		
		String s1="<b><i>A</i></b><i><u>B</u></i><u><b>C</b></u><i><u><b>D</b></u></i>";
		
		String s2="<bi>A<ib><iu>B</ui><ub>C</bu><iub>D<bui>";
		
		String s3=s1.replaceAll("<b><i><u>", "<biu>").replaceAll("</b></i></u>", "</biu>")
				   .replaceAll("<b><u><i>", "<bui>").replaceAll("</b></u></i>", "</bui>")
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
		
		String s4=s2.replaceAll("<biu>", "<b><i><u>").replaceAll("</biu>", "</b></i></u>")
				   .replaceAll("<bui>", "<b><u><i>").replaceAll("</bui>", "</b></u></i>")
				   .replaceAll("<ibu>", "<i><b><u>").replaceAll("</ibu>", "</i></b></u>")
				   .replaceAll("<iub>", "<i><u><b>").replaceAll("</iub>", "</i></u></b>")
				   .replaceAll("<ubi>", "<u><b><i>").replaceAll("</ubi>", "</u></b></i>")
				   .replaceAll("<uib>", "<u><i><b>").replaceAll("</uib>", "</u></i></b>")
				   .replaceAll("<bi>", "<b><i>").replaceAll("</bi>", "</b></i>")
				   .replaceAll("<ib>", "<i><b>").replaceAll("</ib>", "</i></b>")
				   .replaceAll("<bu>", "<b><u>").replaceAll("</bu>", "</b></u>")
				   .replaceAll("<ub>", "<u><b>").replaceAll("</ub>", "</u></b>")
				   .replaceAll("<ui>", "<u><i>").replaceAll("</ui>", "</u></i>")
				   .replaceAll("<iu>", "<i><u>").replaceAll("</iu>", "</i></u>")
				   ;
		System.out.println("Input string is "+s1);
		System.out.println("Output String is "+s3);
		
		System.out.println("Input string is "+s2);
		System.out.println("Output String is "+s4);
	}
}
