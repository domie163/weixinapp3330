package com.dao;

import com.entity.KuaidixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KuaidixinxiVO;
import com.entity.view.KuaidixinxiView;


/**
 * 快递信息
 * 
 * @author 
 * @email 
 * @date 2022-03-15 09:29:12
 */
public interface KuaidixinxiDao extends BaseMapper<KuaidixinxiEntity> {
	
	List<KuaidixinxiVO> selectListVO(@Param("ew") Wrapper<KuaidixinxiEntity> wrapper);
	
	KuaidixinxiVO selectVO(@Param("ew") Wrapper<KuaidixinxiEntity> wrapper);
	
	List<KuaidixinxiView> selectListView(@Param("ew") Wrapper<KuaidixinxiEntity> wrapper);

	List<KuaidixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<KuaidixinxiEntity> wrapper);
	
	KuaidixinxiView selectView(@Param("ew") Wrapper<KuaidixinxiEntity> wrapper);
	

}
