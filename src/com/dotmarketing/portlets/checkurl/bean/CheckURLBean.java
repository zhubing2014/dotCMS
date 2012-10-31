package com.dotmarketing.portlets.checkurl.bean;

public class CheckURLBean {
	
    private String inode;
    private String url;
	private String title;
	private int statusCode;

    public String getInode() {
        return inode;
    }
    public void setInode(String inode) {
        this.inode = inode;
    }
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public boolean isInternalLink() {
		return url.startsWith("http://") || url.startsWith("https://"); 
	}
	
	@Override
	public int hashCode() {
		return url.hashCode()+title.hashCode()+statusCode;
	}
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof CheckURLBean))
			return false;
		else{
			CheckURLBean c = (CheckURLBean)obj;
			return (c.getStatusCode()==this.getStatusCode())
					&& (c.getTitle().equals(this.getTitle()))
					&& (c.getUrl().equals(this.getUrl()))
					&& (c.isInternalLink()==this.isInternalLink());
		}
		
	}	
	
	
}
