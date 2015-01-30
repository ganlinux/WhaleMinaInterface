package com.gl.emms.client.android;

import android.content.Context;
/**
 * 
 * @author ganlinux
 *
 */
   class HeartBeatDataConfig {

	
	public static String EMMS_HEART_INFO  = "heartbeat";
	
	public static String KEY_ID = "KEY_ID";
	
	public static void putString(Context context,String key,String value)
	{
		context.getSharedPreferences(EMMS_HEART_INFO, Context.MODE_PRIVATE).edit().putString(key, value).commit();
	}
	
	public static String getString(Context context,String key)
	{
		return context.getSharedPreferences(EMMS_HEART_INFO, Context.MODE_PRIVATE).getString(key,null);
	}
	
	public static void putBoolean(Context context,String key,boolean value)
	{
		context.getSharedPreferences(EMMS_HEART_INFO, Context.MODE_PRIVATE).edit().putBoolean(key, value).commit();
	}
	
	public static boolean getBoolean(Context context,String key)
	{
		return context.getSharedPreferences(EMMS_HEART_INFO, Context.MODE_PRIVATE).getBoolean(key,false);
	}
	
	
}
