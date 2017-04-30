package testDll;

import net.sf.jni4net.Bridge;

import jcarddll.JcardInterface;

//test aeon dll
public class Test {
	
	public static void main(String[] args) throws Exception {

		Bridge.init();
        Bridge.LoadAndRegisterAssemblyFrom(new java.io.File("dll/JcardDLL.j4n.dll"));
		
        JcardInterface jcard = new JcardInterface();
        
        jcard.setenqmembercode("ddd");
        String ret = jcard.enquire_member();
        
		System.out.println(ret);
		System.out.println(jcard.getenqmemberstatus());
		System.out.println(jcard.getenqbpexpired());
		System.out.println(jcard.getenqbpexpirydate());
		System.out.println(jcard.getenqbplastday());
		System.out.println(jcard.getenqbpused());
		System.out.println(jcard.getenqmessage());
				
		System.exit(0);
	}
}
