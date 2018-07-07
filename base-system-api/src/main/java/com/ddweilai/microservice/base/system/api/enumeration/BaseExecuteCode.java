package com.ddweilai.microservice.base.system.api.enumeration;

/**
 * Created by liujp on 2017/12/12.
 */
public enum BaseExecuteCode {

    SUCCESS(0,"执行成功"),

    EXCUTE_EXCEPTION(-1, "执行异常"),
    UPDATE_ERROR(2,"更新失败"),
    DELETE_ERROR(3,"删除失败"),
    SAVE_ERROR(4,"新增失败"),
    COMMON_FASTDFS_CONN_FAIL(5,"连接fastdfs失败"),
    COMMON_FASTDFS_UPLOAD_FAIL(6,"上传文件到fastdfs失败"),
    FILE_UPLOAD_FAIL(7,"上传文件失败"),
    COPY_EXCEPTION(8,"对象属性拷贝失败"),



    /**
     * 业务异常码范围
     * 系统保留码：10000~10999
     * 商品：20000~20999
     * 库存：30000~30999
     * 订单：40000~40999
     * 支付：50000~50999
     * 用户：60000~60999
     * 营销：70000~70999
     *
     */


    PARAM_EMPTY(10001, "参数为空"),


    EXPERIMENT_NAME_REPAET(10002, "实验名称重复"),
    EXPERIMENT_ONLY_PART_REPEAT(10003, "独占份数重复"),
    EXPERIMENT_GROUP_NAME_REPEAT(10004, "实验分组名称重复"),
    EXPERIMENT_CONDITIONS_NOT_MATCH(10005, "参数和实验条件不符"),
    USER_EXIST_ONLY_EXPERIMENT(10006, "用户存在别的独占实验中"),
    EXPERIMENT_NOT_START(10007, "实验还未开始或已结束"),
    EXPERIMENT_PERSON_UN_ONLY_PART(10008, "用户份数不在独占份数中"),
    EXPERIMENT_PERSON_GUID_EXCEPTION(10009, "实验永久guid异常，guid：000000000000000"),

    NOT_EXIST_GOODS_STOCK(20000, "暂无商品库存记录"),

    PRODUCT_EMPTY(20000,"暂无商品记录");





    private Integer code;
    private String msg;

    BaseExecuteCode(Integer code, String msg){
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode(){
        return code;
    }

    public String getMsg(){
        return msg;
    }

    public void setMsg(String msg){
        this.msg = msg;
    }
}
