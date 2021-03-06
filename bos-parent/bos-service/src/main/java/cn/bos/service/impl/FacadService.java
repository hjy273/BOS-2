package cn.bos.service.impl;

import org.hibernate.service.StandardServiceInitiators;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.bos.domain.base.Standard;
import cn.bos.service.CityService;
import cn.bos.service.DecidedZoneService;
import cn.bos.service.NoticebillService;
import cn.bos.service.RegionService;
import cn.bos.service.StaffService;
import cn.bos.service.StandardService;
import cn.bos.service.SubareaService;
import cn.bos.service.UserService;

@Service
public class FacadService {
	
	/**
	 * 用户业务层
	 */
	@Autowired
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}
	
	/**
	 * 派件员业务层
	 */
	@Autowired 
	private StaffService staffService;

	public StaffService getStaffService() {
		return staffService;
	}
	@Autowired
	private StandardService standardService;
	public StandardService getStandardService() {
		return standardService;
	}
	
	@Autowired
	private RegionService regionService;

	public RegionService getRegionService() {
		return regionService;
	}
	
	
	@Autowired
	private SubareaService subareaService;
	
	public SubareaService getSubareaService() {
		return subareaService;
	}
	
	@Autowired
	private DecidedZoneService decidedZoneService;

	public DecidedZoneService getDecidedZoneService() {
		return decidedZoneService;
	}
	@Autowired
	private CityService cityService;

	public CityService getCityService() {
		return cityService;
	}
	@Autowired
	private NoticebillService noticebillService;
	
	public NoticebillService getNoticebillService() {
		return noticebillService;
	}
	
	

	
	
}
