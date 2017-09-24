package com.imooc.pattern.proxy;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

import org.apache.commons.io.FileUtils;

public class Proxy {
	
	public static Object newProxyInstance(Class infce,InvocationHandler h) throws IOException, ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		String methodStr="";
		for(Method m:infce.getMethods()) {
			methodStr +="\r\n"+
					"	@Override\r\n" + 
					"	public void "+m.getName()+"() {\r\n" + 
					"	try{\r\n"+
					"		Method md= "+infce.getName()+".class.getMethod(\""+
							m.getName()+"\");\r\n"+
					"		h.invoke(this,md);\r\n"+
					"	}catch(Exception e){\r\n"+ 
					"		e.printStackTrace();\r\n}\r\n"+
					"    }\r\n";
		}
		
		String str="package com.imooc.pattern.proxy;\r\n" + 
				"import java.lang.reflect.Method;" + 
				"\r\n" +
				"import com.imooc.pattern.proxy.InvocationHandler;" + 
				"\r\n" + 
				"public class $Proxy0 implements "+infce.getName()+" {\r\n" + 
				"\r\n" + 
				"	private InvocationHandler h;\r\n" + 
				"\r\n" + 
				"	public $Proxy0(InvocationHandler h) {\r\n" + 
				"		this.h = h; \r\n"+ 
				"	}\r\n" + 
				methodStr+
				"}";
		//  /WebRoot/classes/com/imooc/pattern/proxy/Car.class
		String filename=System.getProperty("user.dir")+"\\target\\classes\\com\\imooc\\pattern\\proxy\\$Proxy0.java";
		File file=new File(filename);
		FileUtils.writeStringToFile(file, str, "UTF-8");
		
		//编译
		//拿到编译器
		JavaCompiler compiler=ToolProvider.getSystemJavaCompiler();
		//文件管理者
		StandardJavaFileManager fileMgr=compiler.getStandardFileManager(null, null, null);
		//获取文件
		Iterable units=fileMgr.getJavaFileObjects(filename);
		//编译任务
		CompilationTask t = compiler.getTask(null, fileMgr, null, null, null, units);
		//进行编译
		t.call();
		fileMgr.close();
		
		//load 到内存
		ClassLoader cl=ClassLoader.getSystemClassLoader();
		Class c=cl.loadClass("com.imooc.pattern.proxy.$Proxy0");
		
		Constructor ctr=c.getConstructor(InvocationHandler.class);
		return ctr.newInstance(h);
	}
}
