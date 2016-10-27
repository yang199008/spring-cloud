package cloud.simple.hello.common;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @param <T>
 * @author LC
 * @version 1.0.0  2014-3-30
 * @describe 使用前端分页插件
 */
public class PageBean<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return "PageBean [pageNum=" + pageNum + ", pageSize=" + pageSize
                + ", pageCount=" + pageCount + ", STARTPAGE=" + STARTPAGE
                + ", ENDPAGE=" + ENDPAGE + ", MAXPAGE=" + MAXPAGE
                + ", recordCount=" + recordCount + ", recordList=" + recordList
                + ", startIndex=" + startIndex + ", endIndex=" + endIndex + "]";
    }

    private int pageNum;//当前页
    private int recordCount;//总记录数
    private List<T> recordList;//当前页的数据
    private int pageCount;//总页数

    @JSONField(serialize = false)
    private int pageSize;//每一显示条数
    @JSONField(serialize = false)
    private final int STARTPAGE = 2;//显示前几个页面
    @JSONField(serialize = false)
    private final int ENDPAGE = 2;//显示后几个页面
    @JSONField(serialize = false)
    private final int MAXPAGE = 5;//允许显示最多页数
    @JSONField(serialize = false)
    private int startIndex;//页码条起始位置
    @JSONField(serialize = false)
    private int endIndex; //页码条结束位置
    public PageBean() {

    }
    public PageBean(int pageNum, int pageSize, int recordCount, List<T> recordList) {

        this.pageNum = pageNum;
        this.recordCount = recordCount;
        this.recordList = recordList;
        this.pageSize = pageSize;
        if (pageSize != 0) {
            this.pageCount = recordCount % pageSize == 0 ? recordCount / pageSize : recordCount / pageSize + 1;
        }

        //调整pageNum
        if (pageNum < 1)
            pageNum = 1;
        if (pageNum > pageCount)
            pageNum = pageCount;
        //约定，默认显示的页码条长度为10
        //尝试显示当前页的前面4个页码和后面5个页码
        if (pageCount < MAXPAGE) {//总页数小于10则不用计算，直接全部显示
            startIndex = 1;
            endIndex = pageCount;
        } else {
            startIndex = pageNum - STARTPAGE;
            endIndex = pageNum + ENDPAGE;
            if (startIndex < 1) {
                startIndex = 1;
                endIndex = MAXPAGE;
            }
            if (endIndex > pageCount) {
                startIndex = endIndex - MAXPAGE + 1;
                endIndex = pageCount;
            }
        }
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
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

    public List<T> getRecordList() {
        return recordList;
    }

    public void setRecordList(List<T> recordList) {
        this.recordList = recordList;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    /**
     * 向结果集中添加一天记录
     *
     * @param obj
     */
    public void addRecord(T obj) {
        if (this.getRecordList() == null) {
            this.setRecordList(new ArrayList<T>());
        }
        this.getRecordList().add(obj);
    }
}
