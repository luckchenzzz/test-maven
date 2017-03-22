package org.maven.bean;

/**
 * @Description: TODO
 *
 * @author luck
 *
 * @date 2017年3月22日 上午11:25:08
 */
public class TestMavenBean {
	private int id;
	
	private String name;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TestMavenBean [id=" + id + ", name=" + name + "]";
	}
	
	

}
