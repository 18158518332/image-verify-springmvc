package com.imageverify.model;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ImageGroup {
	private String name;	//ͼƬ������
	private int count;//ͼƬ������
	private Set<String> paths=new HashSet<String>();//ͼƬ��ͼƬ·��
	public ImageGroup(String name,int count,String...paths){
		this.name=name;
		this.count=count;
		this.paths.addAll(Arrays.asList(paths));
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public Set<String> getPaths() {
		return paths;
	}
	public void setPaths(Set<String> paths) {
		this.paths = paths;
	}
}
