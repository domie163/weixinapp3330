package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QuerenwanchengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QuerenwanchengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QuerenwanchengView;


/**
 * 确认完成
 *
 * @author 
 * @email 
 * @date 2022-03-15 09:29:13
 */
public interface QuerenwanchengService extends IService<QuerenwanchengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QuerenwanchengVO> selectListVO(Wrapper<QuerenwanchengEntity> wrapper);
   	
   	QuerenwanchengVO selectVO(@Param("ew") Wrapper<QuerenwanchengEntity> wrapper);
   	
   	List<QuerenwanchengView> selectListView(Wrapper<QuerenwanchengEntity> wrapper);
   	
   	QuerenwanchengView selectView(@Param("ew") Wrapper<QuerenwanchengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QuerenwanchengEntity> wrapper);
   	

}

