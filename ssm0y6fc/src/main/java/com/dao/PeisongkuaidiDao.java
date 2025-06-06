package com.dao;

import com.entity.PeisongkuaidiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PeisongkuaidiVO;
import com.entity.view.PeisongkuaidiView;


/**
 * 配送快递
 * 
 * @author 
 * @email 
 * @date 2022-03-15 09:29:12
 */
public interface PeisongkuaidiDao extends BaseMapper<PeisongkuaidiEntity> {
	
	List<PeisongkuaidiVO> selectListVO(@Param("ew") Wrapper<PeisongkuaidiEntity> wrapper);
	
	PeisongkuaidiVO selectVO(@Param("ew") Wrapper<PeisongkuaidiEntity> wrapper);
	
	List<PeisongkuaidiView> selectListView(@Param("ew") Wrapper<PeisongkuaidiEntity> wrapper);

	List<PeisongkuaidiView> selectListView(Pagination page,@Param("ew") Wrapper<PeisongkuaidiEntity> wrapper);
	
	PeisongkuaidiView selectView(@Param("ew") Wrapper<PeisongkuaidiEntity> wrapper);
	

}
