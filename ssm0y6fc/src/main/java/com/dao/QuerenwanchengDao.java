package com.dao;

import com.entity.QuerenwanchengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QuerenwanchengVO;
import com.entity.view.QuerenwanchengView;


/**
 * 确认完成
 * 
 * @author 
 * @email 
 * @date 2022-03-15 09:29:13
 */
public interface QuerenwanchengDao extends BaseMapper<QuerenwanchengEntity> {
	
	List<QuerenwanchengVO> selectListVO(@Param("ew") Wrapper<QuerenwanchengEntity> wrapper);
	
	QuerenwanchengVO selectVO(@Param("ew") Wrapper<QuerenwanchengEntity> wrapper);
	
	List<QuerenwanchengView> selectListView(@Param("ew") Wrapper<QuerenwanchengEntity> wrapper);

	List<QuerenwanchengView> selectListView(Pagination page,@Param("ew") Wrapper<QuerenwanchengEntity> wrapper);
	
	QuerenwanchengView selectView(@Param("ew") Wrapper<QuerenwanchengEntity> wrapper);
	

}
