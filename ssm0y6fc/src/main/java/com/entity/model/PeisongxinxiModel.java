package com.entity.model;

import com.entity.PeisongxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 配送信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-15 09:29:12
 */
public class PeisongxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
