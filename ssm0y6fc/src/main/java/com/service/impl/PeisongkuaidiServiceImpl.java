package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.PeisongkuaidiDao;
import com.entity.PeisongkuaidiEntity;
import com.service.PeisongkuaidiService;
import com.entity.vo.PeisongkuaidiVO;
import com.entity.view.PeisongkuaidiView;

@Service("peisongkuaidiService")
public class PeisongkuaidiServiceImpl extends ServiceImpl<PeisongkuaidiDao, PeisongkuaidiEntity> implements PeisongkuaidiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PeisongkuaidiEntity> page = this.selectPage(
                new Query<PeisongkuaidiEntity>(params).getPage(),
                new EntityWrapper<PeisongkuaidiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PeisongkuaidiEntity> wrapper) {
		  Page<PeisongkuaidiView> page =new Query<PeisongkuaidiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PeisongkuaidiVO> selectListVO(Wrapper<PeisongkuaidiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PeisongkuaidiVO selectVO(Wrapper<PeisongkuaidiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PeisongkuaidiView> selectListView(Wrapper<PeisongkuaidiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PeisongkuaidiView selectView(Wrapper<PeisongkuaidiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
