package com.music.mapper;

import com.music.entity.MusicRecord;

public interface MusicRecordMapper {
    int deleteByPrimaryKey(String uuid);

    int insert(MusicRecord musicRecord);

    int insertSelective(MusicRecord musicRecord);

    MusicRecord selectByPrimaryKey(String uuid);

    int updateByPrimaryKeySelective(MusicRecord musicRecord);

    int updateByPrimaryKey(MusicRecord musicRecord);
}