package com.entity.vo;

import com.entity.QuerenwanchengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 确认完成
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-15 09:29:13
 */
public class QuerenwanchengVO  implements Serializable {
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
	 * 配送账号
	 */
	
	private String peisongzhanghao;
		
	/**
	 * 完成时间
	 */
	
	private String wanchengshijian;
		
	/**
	 * 确认时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date querenshijian;
		
	/**
	 * 配送评分
	 */
	
	private String peisongpingfen;
		
	/**
	 * 配送评价
	 */
	
	private String peisongpingjia;
		
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
	 * 设置：完成时间
	 */
	 
	public void setWanchengshijian(String wanchengshijian) {
		this.wanchengshijian = wanchengshijian;
	}
	
	/**
	 * 获取：完成时间
	 */
	public String getWanchengshijian() {
		return wanchengshijian;
	}
				
	
	/**
	 * 设置：确认时间
	 */
	 
	public void setQuerenshijian(Date querenshijian) {
		this.querenshijian = querenshijian;
	}
	
	/**
	 * 获取：确认时间
	 */
	public Date getQuerenshijian() {
		return querenshijian;
	}
				
	
	/**
	 * 设置：配送评分
	 */
	 
	public void setPeisongpingfen(String peisongpingfen) {
		this.peisongpingfen = peisongpingfen;
	}
	
	/**
	 * 获取：配送评分
	 */
	public String getPeisongpingfen() {
		return peisongpingfen;
	}
				
	
	/**
	 * 设置：配送评价
	 */
	 
	public void setPeisongpingjia(String peisongpingjia) {
		this.peisongpingjia = peisongpingjia;
	}
	
	/**
	 * 获取：配送评价
	 */
	public String getPeisongpingjia() {
		return peisongpingjia;
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
