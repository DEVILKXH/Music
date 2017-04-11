package com.music.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.music.entity.MusicRecord;
import com.music.mapper.MusicRecordMapper;
import com.music.service.MusicRecordService;

@Service
public class MusicRecordServiceImpl implements MusicRecordService {

	@Autowired
	private MusicRecordMapper musicRecordService;
	
	@Override
	public int deleteByPrimaryKey(String uuid) {
		return musicRecordService.deleteByPrimaryKey(uuid);
	}

	@Override
	public int insert(MusicRecord musicRecord) {
		return musicRecordService.insert(musicRecord);
	}

	@Override
	public int insertSelective(MusicRecord musicRecord) {
		return musicRecordService.insertSelective(musicRecord);
	}

	@Override
	public MusicRecord selectByPrimaryKey(String uuid) {
		return musicRecordService.selectByPrimaryKey(uuid);
	}

	@Override
	public int updateByPrimaryKeySelective(MusicRecord musicRecord) {
		return musicRecordService.updateByPrimaryKeySelective(musicRecord);
	}

	@Override
	public int updateByPrimaryKey(MusicRecord musicRecord) {
		return musicRecordService.updateByPrimaryKey(musicRecord);
	}

}
