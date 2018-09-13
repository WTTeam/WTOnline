package DevPlus;
import java.util.List;
import com.tcs.mc.bs.vo.rplan.Activity;

public class DevPlusEnov{
	public static void main(String[] args){
		String URL="https://devplus-in1.mastercraft.tcs.com/MasterCraftALM/wow_pos.domain";
		String un="nonprodsupport";
		String pwd="Mind@321";
	try {		
		com.tcs.mc.bs.ReleaseManager ReleasetoDev= new com.tcs.mc.bs.ReleaseManager(URL,un,pwd);
		List<Activity> Releases=ReleasetoDev.retrieveActivities("H.1861 - 1POS", "NONPRODSupport", "BR2", "Drop9", true, false);
		int S=Releases.size();
		System.out.println(S);
	}catch(Exception e) {
			e.printStackTrace();
		}
}

}