package com.imageverify.model;

import java.util.List;

//���ɵ�ͼƬ��
public class GenerateImageGroup {
	private ImageGroup keyGroup;//�ؼ�ͼƬ��
	private List<ImageGroup> unkeyGroups;//����ͼƬ��
	
	public GenerateImageGroup(ImageGroup keyGroup,List<ImageGroup> unkeyGroups){
		this.keyGroup=keyGroup;
		this.unkeyGroups=unkeyGroups;
	}
	
	public ImageGroup getKeyGroup() {
		return keyGroup;
	}
	public void setKeyGroup(ImageGroup keyGroup) {
		this.keyGroup = keyGroup;
	}
	public List<ImageGroup> getUnkeyGroups() {
		return unkeyGroups;
	}
	public void setUnkeyGroups(List<ImageGroup> unkeyGroups) {
		this.unkeyGroups = unkeyGroups;
	}
}
