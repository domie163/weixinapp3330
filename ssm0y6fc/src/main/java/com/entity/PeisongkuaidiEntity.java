package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 配送快递
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-15 09:29:12
 */
@TableName("peisongkuaidi")
public class PeisongkuaidiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public PeisongkuaidiEntity() {
		
	}
	
	public PeisongkuaidiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 快递单号
	 */
					
	private String kuaididanhao;
	
	/**
	 * 快递名称
	 */
					
	private String kuaidimingcheng;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 用户账号
	 */
					
	private String yonghuzhanghao;
	
	/**
	 * 用户姓名
	 */
					
	private String yonghuxingming;
	
	/**
	 * 用户手机
	 */
					
	private String yonghushouji;
	
	/**
	 * 快递位置
	 */
					
	private String kuaidiweizhi;
	
	/**
	 * 配送类型
	 */
					
	private String peisongleixing;
	
	/**
	 * 指定位置
	 */
					
	private String zhidingweizhi;
	
	/**
	 * 配送费
	 */
					
	private Integer peisongfei;
	
	/**
	 * 发布时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date fabushijian;
	
	/**
	 * 要求时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date yaoqiushijian;
	
	/**
	 * 用户备注
	 */
					
	private String yonghubeizhu;
	
	/**
	 * 配送状态
	 */
					
	private String peisongzhuangtai;
	
	/**
	 * 跨表用户id
	 */
					
	private Long crossuserid;
	
	/**
	 * 跨表主键id
	 */
					
	private Long crossrefid;
	
	/**
	 * 用户id
	 */
					
	private Long userid;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：快递单号
	 */
	public void setKuaididanhao(String kuaididanhao) {
		this.kuaididanhao = kuaididanhao;
	}
	/**
	 * 获取：快递单号
	 */
	public String getKuaididanhao() {
		return kuaididanhao;
	}
	/**
	 * 设置：快递名称
	 */
	public void setKuaidimingcheng(String kuaidimingcheng) {
		this.kuaidimingcheng = kuaidimingcheng;
	}
	/**
	 * 获取：快递名称
	 */
	public String getKuaidimingcheng() {
		return kuaidimingcheng;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：用户账号
	 */
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
	/**
	 * 设置：用户姓名
	 */
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
	/**
	 * 设置：用户手机
	 */
	public void setYonghushouji(String yonghushouji) {
		this.yonghushouji = yonghushouji;
	}
	/**
	 * 获取：用户手机
	 */
	public String getYonghushouji() {
		return yonghushouji;
	}
	/**
	 * 设置：快递位置
	 */
	public void setKuaidiweizhi(String kuaidiweizhi) {
		this.kuaidiweizhi = kuaidiweizhi;
	}
	/**
	 * 获取：快递位置
	 */
	public String getKuaidiweizhi() {
		return kuaidiweizhi;
	}
	/**
	 * 设置：配送类型
	 */
	public void setPeisongleixing(String peisongleixing) {
		this.peisongleixing = peisongleixing;
	}
	/**
	 * 获取：配送类型
	 */
	public String getPeisongleixing() {
		return peisongleixing;
	}
	/**
	 * 设置：指定位置
	 */
	public void setZhidingweizhi(String zhidingweizhi) {
		this.zhidingweizhi = zhidingweizhi;
	}
	/**
	 * 获取：指定位置
	 */
	public String getZhidingweizhi() {
		return zhidingweizhi;
	}
	/**
	 * 设置：配送费
	 */
	public void setPeisongfei(Integer peisongfei) {
		this.peisongfei = peisongfei;
	}
	/**
	 * 获取：配送费
	 */
	public Integer getPeisongfei() {
		return peisongfei;
	}
	/**
	 * 设置：发布时间
	 */
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
	/**
	 * 设置：要求时间
	 */
	public void setYaoqiushijian(Date yaoqiushijian) {
		this.yaoqiushijian = yaoqiushijian;
	}
	/**
	 * 获取：要求时间
	 */
	public Date getYaoqiushijian() {
		return yaoqiushijian;
	}
	/**
	 * 设置：用户备注
	 */
	public void setYonghubeizhu(String yonghubeizhu) {
		this.yonghubeizhu = yonghubeizhu;
	}
	/**
	 * 获取：用户备注
	 */
	public String getYonghubeizhu() {
		return yonghubeizhu;
	}
	/**
	 * 设置：配送状态
	 */
	public void setPeisongzhuangtai(String peisongzhuangtai) {
		this.peisongzhuangtai = peisongzhuangtai;
	}
	/**
	 * 获取：配送状态
	 */
	public String getPeisongzhuangtai() {
		return peisongzhuangtai;
	}
	/**
	 * 设置：跨表用户id
	 */
	public void setCrossuserid(Long crossuserid) {
		this.crossuserid = crossuserid;
	}
	/**
	 * 获取：跨表用户id
	 */
	public Long getCrossuserid() {
		return crossuserid;
	}
	/**
	 * 设置：跨表主键id
	 */
	public void setCrossrefid(Long crossrefid) {
		this.crossrefid = crossrefid;
	}
	/**
	 * 获取：跨表主键id
	 */
	public Long getCrossrefid() {
		return crossrefid;
	}
	/**
	 * 设置：用户id
	 */
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}

}
