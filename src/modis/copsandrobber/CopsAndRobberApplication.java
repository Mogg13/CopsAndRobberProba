package modis.copsandrobber;

import android.app.Application;
import android.content.Context;

public class CopsAndRobberApplication extends Application{

	private static CopsAndRobberApplication instance;
	private int mladenGit;
	
	public CopsAndRobberApplication() {
		instance = this;
	}
	
	public static Context getContext(){
		return instance;
	}
}
