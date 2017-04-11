package com.music.service.impl.mongodb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.music.dao.Page;
import com.music.dao.Searcher;
import com.music.entity.MusicRecord;
import com.music.mapper.mongodb.MusicRecordMongoMapper;
import com.music.service.mongodb.MusicRecordMongoService;

@Service
public class MusicRecordMongoServiceImpl implements MusicRecordMongoService{
	
	@Autowired
	private MusicRecordMongoMapper musicRecordMapper;

	@Override
	public List<MusicRecord> selectMusicRecord() {
		return musicRecordMapper.selectMusicRecord();
	}

	@Override
	public Page<MusicRecord> selectMusicRecord(Searcher searcher, Page<MusicRecord> page) {
		return musicRecordMapper.selectMusicRecord(searcher, page);
	}

}
