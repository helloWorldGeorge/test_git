package cn.hero.util;

import java.util.ArrayList;
import java.util.List;
/*
 * ҳ��=  ��¼����%ÿҳ����0     ��¼����/ÿҳ����
    ����          ��¼����/ÿҳ����+1
    ��Nҳ��ʾ�ڼ�����¼(��¼��0��ʼ��)? (N-1)*ÿҳ����=<���< N*ÿҳ����
 * */
public class Pager {
    @SuppressWarnings("rawtypes")
	private List bigList;//�󼯺ϣ���紫��
    private int curentPageIndex = 1;//��ǰҳ��
    private int countPerpage = 5;//ÿҳ����
    @SuppressWarnings("rawtypes")
	private List smallList;//С�ļ��ϣ����� 
    private int pageCount;//ҳ��
    private int recordCount;//��¼����
    private int prePageIndex;//��һҳ���
    private int nextPageIndex;//��һҳ���
    private boolean firstPage;//�Ƿ��һҳ
    private boolean lastPage;//�Ƿ����һҳ
	@SuppressWarnings("rawtypes")
	public List getBigList() {
		return bigList;
	}
	@SuppressWarnings("rawtypes")
	public void setBigList(List bigList) {
		this.bigList = bigList;
		//��������
    	recordCount = bigList.size();
    	//����ҳ��
    	if(recordCount % countPerpage ==0){
    		pageCount = recordCount/countPerpage;
    	}else{
    		pageCount = recordCount/countPerpage + 1;
    	}
	}	
	public int getCurentPageIndex() {
		return curentPageIndex;
	}
	public void setCurentPageIndex(int curentPageIndex) {
		this.curentPageIndex = curentPageIndex;
		//��һҳ����һҳȷ��
			
		    	prePageIndex = curentPageIndex - 1;
		    	nextPageIndex = curentPageIndex + 1;
		    	//�Ƿ��һҳ�����һҳ
		    	if(curentPageIndex == 1){
		    		firstPage = true;
		    	}else{
		    		firstPage = false;
		    	}
		    	if(curentPageIndex == pageCount){
		    		lastPage = true;
		    	}else{
		    		lastPage = false;
		    	}
		    	//ɸѡ����
		    	 smallList = new ArrayList();
		         for(int i=(curentPageIndex-1)*countPerpage; i<curentPageIndex*countPerpage&&i<recordCount; i++){
		                smallList.add(bigList.get(i));
		         }    
				
	}
	public int getCountPerpage() {
		return countPerpage;
	}
	public void setCountPerpage(int countPerpage) {
		this.countPerpage = countPerpage;
	}
	public List getSmallList() {
		
		return smallList;
		
	}
	public void setSmallList(List smallList) {
	
		this.smallList = smallList;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public int getRecordCount() {
		return recordCount;
	}
	public void setRecordCount(int recordCount) {
		this.recordCount = recordCount;
	}
	public int getPrePageIndex() {
		return prePageIndex;
	}
	public void setPrePageIndex(int prePageIndex) {
		this.prePageIndex = prePageIndex;
	}
	public int getNextPageIndex() {
		return nextPageIndex;
	}
	public void setNextPageIndex(int nextPageIndex) {
		this.nextPageIndex = nextPageIndex;
	}
	public boolean isFirstPage() {
		return firstPage;
	}
	public void setFirstPage(boolean firstPage) {
		this.firstPage = firstPage;
	}
	public boolean isLastPage() {
		return lastPage;
	}
	public void setLastPage(boolean lastPage) {
		this.lastPage = lastPage;
	}
    
}
