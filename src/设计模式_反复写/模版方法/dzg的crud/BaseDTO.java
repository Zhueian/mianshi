package 设计模式_反复写.模版方法.dzg的crud;

/**
 * Created by qiucy on 2020/11/30.
 */

public class BaseDTO{
    private Integer pageNum = 1;
    private Integer curPage;
    private String id;
    private String status;

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getCurPage() {
        return curPage;
    }

    public void setCurPage(Integer curPage) {
        this.curPage = curPage;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        //数据状态
        StatusEnum.to4(status);
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static enum StatusEnum{
        //0，待审核
        pending("待审核","0"),
        //1，正常
        normal("正常","1"),
        //2，无效
        invalid("无效","2"),
        //3，删除
        delete("删除","3"),
        //4，暂停
        stop("暂停","4");
        private String num;
        private String statusStr;
        public static String to4(String num){
            for(StatusEnum s:StatusEnum.values()){
                if (s.statusStr.equals(num)){
                    return s.statusStr;
                }
            }
            return "";
        }

        StatusEnum(String num, String statusStr) {
            this.num = num;
            this.statusStr = statusStr;
        }
    }

    public static void main(String[] args) throws Exception {
        Sss normal = (Sss) Sss.class.getField("normal").get(Sss.class);
        System.out.println(normal);
    }

}
