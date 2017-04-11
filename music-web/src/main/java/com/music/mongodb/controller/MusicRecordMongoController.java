package com.music.mongodb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.music.dao.Page;
import com.music.dao.Searcher;
import com.music.entity.MusicRecord;
import com.music.service.mongodb.MusicRecordMongoService;

@Controller
@RequestMapping(value = "/mongodb")
public class MusicRecordMongoController {

	@Autowired
	private MusicRecordMongoService musicRecordService;
	
	@RequestMapping(value = "/selectMusicRecord.do", method = RequestMethod.POST)
	@ResponseBody
	public Page<MusicRecord> selectMusicRecord(Searcher searcher,Page<MusicRecord> page){
		return musicRecordService.selectMusicRecord(searcher, page);
	}
}
