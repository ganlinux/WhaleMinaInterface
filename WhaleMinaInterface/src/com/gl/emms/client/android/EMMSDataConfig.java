package com.gl.emms.client.android;

import android.content.Context;
/**
 * 
 * @author ganlinux
 *
 */
   class EMMSDataConfig {

	
	public static String EMMS_CONFIG_INFO  = "userinfo";
	
	public static String KEY_ID = "KEY_ID";
//	public static String KEY_ACCOUNT = "KEY_ACCOUNT";
//	public static String KEY_PASSWORD = "KEY_PASSWORD";
//	
//	public static String KEY_MANUAL_STOP = "KEY_MANUAL_STOP";
//	
//	public static String KEY_CIM_DESTORYED = "KEY_CIM_DESTORYED";
	
	public static String KEY_CIM_SERVIER_HOST = "KEY_CIM_SERVIER_HOST";

	public static String KEY_CIM_SERVIER_PORT = "KEY_CIM_SERVIER_PORT";
	
	
	public static void putString(Context context,String key,String value)
	{
		context.getSharedPreferences(EMMS_CONFIG_INFO, Context.MODE_PRIVATE).edit().putString(key, value).commit();
	}
	
	public static String getString(Context context,String key)
	{
		return context.getSharedPreferences(EMMS_CONFIG_INFO, Context.MODE_PRIVATE).getString(key,null);
	}
	
	public static void putBoolean(Context context,String key,boolean value)
	{
		context.getSharedPreferences(EMMS_CONFIG_INFO, Context.MODE_PRIVATE).edit().putBoolean(key, value).commit();
	}
	
	public static boolean getBoolean(Context context,String key)
	{
		return context.getSharedPreferences(EMMS_CONFIG_INFO, Context.MODE_PRIVATE).getBoolean(key,false);
	}
	
	
	public static void putInt(Context context,String key,int value)
	{
		context.getSharedPreferences(EMMS_CONFIG_INFO, Context.MODE_PRIVATE).edit().putInt(key, value).commit();
	}
	
	public static int getInt(Context context,String key)
	{
		return context.getSharedPreferences(EMMS_CONFIG_INFO, Context.MODE_PRIVATE).getInt(key,0);
	}
	
}
