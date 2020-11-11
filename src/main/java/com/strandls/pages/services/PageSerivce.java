/**
 * 
 */
package com.strandls.pages.services;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.strandls.pages.pojo.Page;
import com.strandls.pages.pojo.request.PageCreate;
import com.strandls.pages.pojo.request.PageTreeUpdate;
import com.strandls.pages.pojo.response.PageTree;

/**
 * 
 * @author vilay
 *
 */
public interface PageSerivce {
	
	public Page updateParent(Long pageId, Long parentId);

	public Page findById(Long pageId);

	public Page update(Page page);

	public List<PageTree> getTreeStructure(Long userGroupId, Long languageId, Boolean sticky);

	public Boolean getCheckForStickyPermission(HttpServletRequest request);

	public Page savePage(HttpServletRequest request, PageCreate page);

	public List<PageTree> updateTreeStructure(HttpServletRequest request, List<PageTreeUpdate> pageTreeUpdates, Boolean sticky);

}
