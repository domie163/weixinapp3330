package com.entity.view;

import com.entity.PeisongkuaidiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 配送快递
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-15 09:29:12
 */
@TableName("peisongkuaidi")
public class PeisongkuaidiView  extends PeisongkuaidiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public PeisongkuaidiView(){
	}
 
 	public PeisongkuaidiView(PeisongkuaidiEntity peisongkuaidiEntity){
 	try {
			BeanUtils.copyProperties(this, peisongkuaidiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
