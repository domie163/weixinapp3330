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


import com.dao.QuerenwanchengDao;
import com.entity.QuerenwanchengEntity;
import com.service.QuerenwanchengService;
import com.entity.vo.QuerenwanchengVO;
import com.entity.view.QuerenwanchengView;

@Service("querenwanchengService")
public class QuerenwanchengServiceImpl extends ServiceImpl<QuerenwanchengDao, QuerenwanchengEntity> implements QuerenwanchengService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QuerenwanchengEntity> page = this.selectPage(
                new Query<QuerenwanchengEntity>(params).getPage(),
                new EntityWrapper<QuerenwanchengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QuerenwanchengEntity> wrapper) {
		  Page<QuerenwanchengView> page =new Query<QuerenwanchengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QuerenwanchengVO> selectListVO(Wrapper<QuerenwanchengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QuerenwanchengVO selectVO(Wrapper<QuerenwanchengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QuerenwanchengView> selectListView(Wrapper<QuerenwanchengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QuerenwanchengView selectView(Wrapper<QuerenwanchengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
