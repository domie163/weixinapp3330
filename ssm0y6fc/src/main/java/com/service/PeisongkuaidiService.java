package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PeisongkuaidiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PeisongkuaidiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PeisongkuaidiView;


/**
 * 配送快递
 *
 * @author 
 * @email 
 * @date 2022-03-15 09:29:12
 */
public interface PeisongkuaidiService extends IService<PeisongkuaidiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PeisongkuaidiVO> selectListVO(Wrapper<PeisongkuaidiEntity> wrapper);
   	
   	PeisongkuaidiVO selectVO(@Param("ew") Wrapper<PeisongkuaidiEntity> wrapper);
   	
   	List<PeisongkuaidiView> selectListView(Wrapper<PeisongkuaidiEntity> wrapper);
   	
   	PeisongkuaidiView selectView(@Param("ew") Wrapper<PeisongkuaidiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PeisongkuaidiEntity> wrapper);
   	

}

