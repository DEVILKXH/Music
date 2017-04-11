package com.music.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "music_record")
public class MusicRecord{

	@Id
	@Column(name = "UUID")
    private String uuid;

	@Column(name = "MUSIC_NAME")
    private String musicName;

	@Column(name = "MUSIC_SINGER")
    private String musicSinger;

	@Column(name = "MUSIC_ALBUM")
    private String musicAlbum;

	@Column(name = "MUSIC_URL_ONLINE")
    private String musicUrlOnline;

	@Column(name = "MUSIC_URL_DOWNLOAD")
    private String musicUrlDownload;

	@Column(name = "MUSIC_CREATETIME")
    private Date musicCreatetime;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    public String getMusicName() {
        return musicName;
    }

    public void setMusicName(String musicName) {
        this.musicName = musicName == null ? null : musicName.trim();
    }

    public String getMusicSinger() {
        return musicSinger;
    }

    public void setMusicSinger(String musicSinger) {
        this.musicSinger = musicSinger == null ? null : musicSinger.trim();
    }

    public String getMusicAlbum() {
        return musicAlbum;
    }

    public void setMusicAlbum(String musicAlbum) {
        this.musicAlbum = musicAlbum == null ? null : musicAlbum.trim();
    }

    public String getMusicUrlOnline() {
        return musicUrlOnline;
    }

    public void setMusicUrlOnline(String musicUrlOnline) {
        this.musicUrlOnline = musicUrlOnline == null ? null : musicUrlOnline.trim();
    }

    public String getMusicUrlDownload() {
        return musicUrlDownload;
    }

    public void setMusicUrlDownload(String musicUrlDownload) {
        this.musicUrlDownload = musicUrlDownload == null ? null : musicUrlDownload.trim();
    }

    public Date getMusicCreatetime() {
        return musicCreatetime;
    }

    public void setMusicCreatetime(Date musicCreatetime) {
        this.musicCreatetime = musicCreatetime;
    }
}