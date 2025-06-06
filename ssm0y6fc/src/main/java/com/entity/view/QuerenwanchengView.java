package com.entity.view;

import com.entity.QuerenwanchengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 确认完成
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-15 09:29:13
 */
@TableName("querenwancheng")
public class QuerenwanchengView  extends QuerenwanchengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QuerenwanchengView(){
	}
 
 	public QuerenwanchengView(QuerenwanchengEntity querenwanchengEntity){
 	try {
			BeanUtils.copyProperties(this, querenwanchengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
