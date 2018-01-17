package cn.qu.dp.part2.cpt24.special2;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class BeanUtils {
	
	public static Map<String,Object> backupProp(Object bean){
		Map<String,Object> map=new HashMap<String,Object>();
		try {
			BeanInfo binfo=Introspector.getBeanInfo(bean.getClass());
			PropertyDescriptor[] descriptors=binfo.getPropertyDescriptors();
			for(PropertyDescriptor des:descriptors) {
				String fieldName=des.getName();
				if(!fieldName.equalsIgnoreCase("class")) {
					Method getter=des.getReadMethod();
					getter.setAccessible(true);
					Object fieldValue=getter.invoke(bean, new Object[] {});
					map.put(fieldName, fieldValue);
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return map;
	}
	
	public static void restoreProp(Object bean,Map<String,Object> prop) {
		try {
			BeanInfo binfo=Introspector.getBeanInfo(bean.getClass());
			PropertyDescriptor[] descriptors = binfo.getPropertyDescriptors();
			for(PropertyDescriptor des:descriptors) {
				String fieldName=des.getName();
				if(prop.containsKey(fieldName)) {
					Method setter=des.getWriteMethod();
					setter.setAccessible(true);
					setter.invoke(bean, prop.get(fieldName));
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
