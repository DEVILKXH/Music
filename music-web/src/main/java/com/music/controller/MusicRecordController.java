package com.music.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.music.entity.MusicRecord;
import com.music.service.MusicRecordService;

@Controller
@RequestMapping(value = "")
public class MusicRecordController {

	@Autowired
	private MusicRecordService musicRecordService;
	
	@RequestMapping(value = "/insert.do")
	public int insert(MusicRecord musicRecord){
		musicRecordService.insert(musicRecord);
		return 0;
	}
	
	@RequestMapping(value = "/insertSelective.do")
	public int insertSelective(MusicRecord musicRecord){
		return musicRecordService.insertSelective(musicRecord);
	}

	@RequestMapping(value = "/selectByPrimaryKey.do")
	@ResponseBody
	public MusicRecord selectByPrimaryKey(String uuid){
    	return musicRecordService.selectByPrimaryKey(uuid);
    }

	@RequestMapping(value = "/updateByPrimaryKeySelective.do")
	public int updateByPrimaryKeySelective(MusicRecord musicRecord){
    	return musicRecordService.updateByPrimaryKeySelective(musicRecord);
    }

	@RequestMapping(value = "/updateByPrimaryKey.do")
	public int updateByPrimaryKey(MusicRecord musicRecord){
    	return musicRecordService.updateByPrimaryKey(musicRecord);
    }
}
