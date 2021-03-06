package com.strandls.pages.pojo.request;

import com.strandls.pages.pojo.PageType;

public class PageUpdate {

	private String id;
	private String title;
	private String content;
	private String description;
	private PageType pageType;
	private String url;
	private Boolean sticky;
	private Boolean showInFooter;

	public PageUpdate() {
		super();
	}

	public PageUpdate(String id, String title, String content, String description, PageType pageType, String url,
			Boolean sticky, Boolean showInFooter) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.description = description;
		this.pageType = pageType;
		this.url = url;
		this.sticky = sticky;
		this.showInFooter = showInFooter;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public PageType getPageType() {
		return pageType;
	}

	public void setPageType(PageType pageType) {
		this.pageType = pageType;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Boolean getSticky() {
		return sticky;
	}

	public void setSticky(Boolean sticky) {
		this.sticky = sticky;
	}

	public Boolean getShowInFooter() {
		return showInFooter;
	}

	public void setShowInFooter(Boolean showInFooter) {
		this.showInFooter = showInFooter;
	}
}
