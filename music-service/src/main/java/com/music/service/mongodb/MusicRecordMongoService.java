package com.music.service.mongodb;

import java.util.List;

import com.music.dao.Page;
import com.music.dao.Searcher;
import com.music.entity.MusicRecord;

public interface MusicRecordMongoService {
	public List<MusicRecord> selectMusicRecord();
	public Page<MusicRecord> selectMusicRecord(Searcher searcher,Page<MusicRecord> page);
}
