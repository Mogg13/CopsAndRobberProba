package modis.copsandrobber;

import android.app.Application;
import android.content.Context;

public class CopsAndRobberApplication extends Application{

	private static CopsAndRobberApplication instance;
	private static probaZaGit;
	
	public CopsAndRobberApplication() {
		instance = this;
	}
	
	public static Context getContext(){
		return instance;
	}
}
