package org.maven.bean;

import java.io.Serializable;

/**
 * @Description: TODO
 *
 * @author luck
 *
 * @date 2017年3月22日 下午3:08:56
 */
public class BaseEntity implements Serializable{
	private static final long serialVersionUID = 1L;

	/**
	 * 实体编号（唯一标识）
	 */
	protected String id;
	
}
