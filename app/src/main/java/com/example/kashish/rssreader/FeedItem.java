package com.example.kashish.rssreader;


public class FeedItem {
    String title;
    String Link;
    String Description;
    String pubDate;
    String thumbNailUri;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return Link;
    }

    public void setLink(String link) {
        Link = link;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    public String getThumbNailUri() {
        return thumbNailUri;
    }

    public void setThumbNailUri(String thumbNailUri) {
        this.thumbNailUri = thumbNailUri;
    }
}
