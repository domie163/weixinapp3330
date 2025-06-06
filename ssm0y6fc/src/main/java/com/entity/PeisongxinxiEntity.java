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
 * 配送信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-15 09:29:12
 */
@TableName("peisongxinxi")
public class PeisongxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public PeisongxinxiEntity() {
		
	}
	
	public PeisongxinxiEntity(T t) {
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
	 * 指定位置
	 */
					
	private String zhidingweizhi;
	
	/**
	 * 配送费
	 */
					
	private String peisongfei;
	
	/**
	 * 接取时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date jiequshijian;
	
	/**
	 * 配送账号
	 */
					
	private String peisongzhanghao;
	
	/**
	 * 配送员
	 */
					
	private String peisongyuan;
	
	/**
	 * 配送员手机
	 */
					
	private String peisongyuanshouji;
	
	/**
	 * 配送物流
	 */
					
	private String peisongwuliu;
	
	/**
	 * 订单状态
	 */
					
	private String dingdanzhuangtai;
	
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
	public void setPeisongfei(String peisongfei) {
		this.peisongfei = peisongfei;
	}
	/**
	 * 获取：配送费
	 */
	public String getPeisongfei() {
		return peisongfei;
	}
	/**
	 * 设置：接取时间
	 */
	public void setJiequshijian(Date jiequshijian) {
		this.jiequshijian = jiequshijian;
	}
	/**
	 * 获取：接取时间
	 */
	public Date getJiequshijian() {
		return jiequshijian;
	}
	/**
	 * 设置：配送账号
	 */
	public void setPeisongzhanghao(String peisongzhanghao) {
		this.peisongzhanghao = peisongzhanghao;
	}
	/**
	 * 获取：配送账号
	 */
	public String getPeisongzhanghao() {
		return peisongzhanghao;
	}
	/**
	 * 设置：配送员
	 */
	public void setPeisongyuan(String peisongyuan) {
		this.peisongyuan = peisongyuan;
	}
	/**
	 * 获取：配送员
	 */
	public String getPeisongyuan() {
		return peisongyuan;
	}
	/**
	 * 设置：配送员手机
	 */
	public void setPeisongyuanshouji(String peisongyuanshouji) {
		this.peisongyuanshouji = peisongyuanshouji;
	}
	/**
	 * 获取：配送员手机
	 */
	public String getPeisongyuanshouji() {
		return peisongyuanshouji;
	}
	/**
	 * 设置：配送物流
	 */
	public void setPeisongwuliu(String peisongwuliu) {
		this.peisongwuliu = peisongwuliu;
	}
	/**
	 * 获取：配送物流
	 */
	public String getPeisongwuliu() {
		return peisongwuliu;
	}
	/**
	 * 设置：订单状态
	 */
	public void setDingdanzhuangtai(String dingdanzhuangtai) {
		this.dingdanzhuangtai = dingdanzhuangtai;
	}
	/**
	 * 获取：订单状态
	 */
	public String getDingdanzhuangtai() {
		return dingdanzhuangtai;
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
