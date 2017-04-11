package com.music.mapper.mongodb;

import java.util.List;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSONObject;
import com.mongodb.client.FindIterable;
import com.music.dao.Page;
import com.music.dao.Searcher;
import com.music.entity.MusicRecord;
import com.music.inner.MongoClientManager;
import com.music.mapper.util.ConvertToList;

@Component
public class MusicRecordMongoMapper{
	
	@Autowired
	private MongoClientManager mongoClientManager;
		
	public List<MusicRecord> selectMusicRecord(){
		FindIterable<Document> documents = mongoClientManager.find().skip(10).limit(10);
		List<MusicRecord> musicRecordList = ConvertToList.documentToList(documents, MusicRecord.class);
		return musicRecordList;
	}
	
	public Page<MusicRecord> selectMusicRecord(Searcher searcher,Page<MusicRecord> page){
		JSONObject query = new JSONObject();
		FindIterable<Document> documents = mongoClientManager.find().skip((int)page.getStart()*page.getPageNum()).limit((int)page.getLimit());
		long count = mongoClientManager.count();
		Page<MusicRecord> musicRecordPage = ConvertToList.documentToPage(documents, MusicRecord.class);
		musicRecordPage.setCount(count);
		return musicRecordPage;
	}
}
