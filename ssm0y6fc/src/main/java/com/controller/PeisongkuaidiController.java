package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.PeisongkuaidiEntity;
import com.entity.view.PeisongkuaidiView;

import com.service.PeisongkuaidiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 配送快递
 * 后端接口
 * @author 
 * @email 
 * @date 2022-03-15 09:29:12
 */
@RestController
@RequestMapping("/peisongkuaidi")
public class PeisongkuaidiController {
    @Autowired
    private PeisongkuaidiService peisongkuaidiService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,PeisongkuaidiEntity peisongkuaidi, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			peisongkuaidi.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<PeisongkuaidiEntity> ew = new EntityWrapper<PeisongkuaidiEntity>();
		PageUtils page = peisongkuaidiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, peisongkuaidi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,PeisongkuaidiEntity peisongkuaidi, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			peisongkuaidi.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<PeisongkuaidiEntity> ew = new EntityWrapper<PeisongkuaidiEntity>();
		PageUtils page = peisongkuaidiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, peisongkuaidi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( PeisongkuaidiEntity peisongkuaidi){
       	EntityWrapper<PeisongkuaidiEntity> ew = new EntityWrapper<PeisongkuaidiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( peisongkuaidi, "peisongkuaidi")); 
        return R.ok().put("data", peisongkuaidiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(PeisongkuaidiEntity peisongkuaidi){
        EntityWrapper< PeisongkuaidiEntity> ew = new EntityWrapper< PeisongkuaidiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( peisongkuaidi, "peisongkuaidi")); 
		PeisongkuaidiView peisongkuaidiView =  peisongkuaidiService.selectView(ew);
		return R.ok("查询配送快递成功").put("data", peisongkuaidiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        PeisongkuaidiEntity peisongkuaidi = peisongkuaidiService.selectById(id);
        return R.ok().put("data", peisongkuaidi);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        PeisongkuaidiEntity peisongkuaidi = peisongkuaidiService.selectById(id);
        return R.ok().put("data", peisongkuaidi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody PeisongkuaidiEntity peisongkuaidi, HttpServletRequest request){
    	peisongkuaidi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(peisongkuaidi);

        peisongkuaidiService.insert(peisongkuaidi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody PeisongkuaidiEntity peisongkuaidi, HttpServletRequest request){
    	peisongkuaidi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(peisongkuaidi);
    	peisongkuaidi.setUserid((Long)request.getSession().getAttribute("userId"));

        peisongkuaidiService.insert(peisongkuaidi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody PeisongkuaidiEntity peisongkuaidi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(peisongkuaidi);
        peisongkuaidiService.updateById(peisongkuaidi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        peisongkuaidiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<PeisongkuaidiEntity> wrapper = new EntityWrapper<PeisongkuaidiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuzhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = peisongkuaidiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
