package com.cjm.boot.demo.common.status;

public enum StatusInfo {
    /**
     * 成功
     */
    REQUEST_SUCCESS("200", "OK"),
    /**
     * 只有查看权限
     */
    REQUEST_SUCCESS_ONLY_READ("201", "只有查看权限"),
    /**
     * 请求的参数不对，比如修改用户名，没有传入用户id
     */
    REQUEST_ERROR("400", "请求参数异常，无法处理，请跟管理员联系"),
    /**
     * 权限拦截，无权限时的异常
     */
    REQUEST_UNAUTHORIZED("401", "无权限进行此操作，请跟管理员联系"),
    /**
     * 未登录异常
     */
    REQUEST_NOSESSION("402", "登录失效，请重新登录"),
    /**
     * 不合法的业务请求，比如直接删除管理有很多用户的用户组
     */
    REQUEST_FORBIDDEN("403", "异常业务操作，不予处理，请跟管理员联系"),
    /**
     * 鉴权失败
     */
    REQUEST_AUTHORIZE_FAILED("405", "鉴权失败"),
    /**
     * 操作的资源不存在，比如 /user/{id}的增删查改等操作请求
     */
    REQUEST_NORESOURCE("410", "请求的资源不存在"),
    /**
     * id不能为null
     */
    REQUEST_IDCANTBE_NULL_EXCEPTION("411", "ID错误"),
    /**
     * 状态码错误
     */
    REQUEST_STATUS_EXCEPTION("412", "状态码错误"),
    /**
     * 用户名 或密码错误
     */
    REQUEST_USERNAMEORPASSWORD_EXCEPTION("413", "用户名 或密码错误"),
    /**
     * 未登录
     */
    REQUEST_UNAUTHC_EXCEPTION("414", "未登录"),
    /**
     * 未授权
     */
    REQUEST_UNPERMS_EXCEPTION("415", "未授权"),
    /**
     * 创建Excel工作薄为空
     */
    REQUEST_CJEXCELGZBWK_EXCEPTION("416", "创建Excel工作薄为空!"),
    /**
     * 文件不存在
     */
    REQUEST_WJBCZ_EXCEPTION("417", "文件不存在!"),

    /**
     * 解析的文件格式有误
     */
    REQUEST_JXDWJGSYW_EXCEPTION("418", "解析的文件格式有误!"),

    /**
     * 空数组异常
     */
    REQUEST_NULLARRAY_EXCEPTION("430", "空数组异常"),
    /**
     * 数据插入异常
     */
    REQUEST_INSERT_EXCEPTION("431", "数据插入异常"),
    /**
     * 数据更新异常
     */
    REQUEST_UPDATE_EXCEPTION("432", "数据更新异常"),

    /**
     * 必传项不能为空
     */
    REQUEST_REQUEST_EXCEPTION("433", "必传项不能为空"),
    /**
     * 类型参数错误,没有此类型
     */
    REQUEST_VO_TYPE_EXCEPTION("434", "type错误,没有此类型"),
    /**
     * 类型参数错误,没有此类型
     */
    REQUEST_EXIT_EXCEPTION("435", "此条数据已存在"),

    /**
     * 没有此数据权限
     */
    SYSTEMDATA_DONT_EXCEPTION("436", "当前用户没有此数据权限"),


    /**
     * 所有内部异常，统一如此相应
     */
    BUSINESS_FAILURE("500", "服务器忙，请稍后再次尝试，或者跟管理员联系"),
    /**
     * XML转对象失败
     */
    XNLZDX_EXCEPYION("419", "XML解析失败"),
    /**
     * 发票作废失败
     */
    FPZFSB_EXCEPYION("600", "发票作废失败"),
    /**
     * 发票开具失败
     */
    FPKJSB_EXCEPYION("601", "发票开具失败"),
    /**
     * 开票类型传参错误
     */
    KPLXCCCW_EXCEPTION("602", "开票类型传参错误"),
    /**
     * 结算单状态传入的参数错误
     */
    JSDZTCW_EXCEPTION("603", "结算单状态传入的参数错误"),
    /**
     * 名称已存在
     */
    MCYCZ_EXCEPTION("604", "名称已存在"),
    /**
     * 发票查验失败请检查输入参数
     */
    FPCYSB_EXCEPTION("605", "发票查验失败请检查输入参数"),
    /**
     * 已超过最大查验量
     */
    YCGZDCXSL_EXCEPTION("606", "已超过最大查验量"),
    /**
     * 超过该张票当天查验次数
     */
    CGGZPDTCYCS_EXCEPTION("607", "超过该张票当天查验次数"),
    /**
     * 超过服务器最大请求数
     */
    CGFWQZDQQS_EXCEPTION("608", "超过服务器最大请求数"),
    /**
     * 请求不合法
     */
    QQBHF_EXCEPTION("609", "请求不合法"),
    /**
     * 查验成功发票不一致
     */
    CYCGFPBYZ_EXCEPTION("610", "查验成功发票不一致"),
    /**
     * 所查发票不存在
     */
    SCFPBCZ_EXCEPTION("611", "所查发票不存在"),
    /**
     * 已超过最大查验量
     */
    YCGZDCYL_EXCEPTION("612", "已超过最大查验量"),
    /**
     * 查询发票不规范
     */
    CXFPBGF_EXCEPTION("613", "查询发票不规范"),
    /**
     * 查验异常(参数错误或税局网络异常)
     */
    YZYC_EXCEPTION("614", "查验异常(参数错误或税局网络异常)"),
    /**
     * 请求不规范
     */
    QQBGF_EXCEPTION("615", "请求不规范"),
    /**
     * 认证系统处理失败
     */
    RZXTCLSB_EXCEPTION("616", "认证系统处理失败"),
    /**
     * 该时间无发票信息
     */
    GSJWFPXX_EXCEPTION("617", "该时间无发票信息"),
    /**
     * 查验失败
     */
    CYSB_EXCEPTION("618", "查验失败"),
    /**
     * 发票已存在
     */
    FPYCZ_EXCEPTION("619", "发票已查验"),
    /**
     * 发票已存在
     */
    WZYY_EXCEPTION("620", "未知原因，请联系管理员"),
    /**
     * 文件路径为空
     */
    FILE_PATH_ISNULL("701", "文件路径为空"),
    /**
     * 文件为空
     */
    FILE_ISNULL("702", "文件为空"),
    /**
     * 文件上传失败
     */
    FILE_UPLOAD_FAILED("703", "文件上传失败"),
    /**
     * 文件不存在
     */
    FILE_NOT_EXIST("704", "文件不存在"),
    /**
     * 文件下载失败
     */
    FILE_DOWNLOAD_FAILED("705", "文件下载失败"),
    /**
     * 删除文件失败
     */
    FILE_DELETE_FAILED("706", "删除文件失败"),
    /**
     * 文件服务器连接失败
     */
    FILE_SERVER_CONNECTION_FAILED("707", "文件服务器连接失败"),
    /**
     * 文件超过大小
     */
    FILE_OUT_SIZE("708", "文件超过大小"),
    /**
     * 图片类型错误
     */
    FILE_TYPE_ERROR_IMAGE("709", "图片类型错误"),
    /**
     * 文档类型错误
     */
    FILE_TYPE_ERROR_DOC("710", "文档类型错误"),
    /**
     * 音频类型错误
     */
    FILE_TYPE_ERROR_VIDEO("711", "音频类型错误"),
    /**
     * 压缩文件类型错误
     */
    FILE_TYPE_ERROR_COMPRESS("712", "压缩文件类型错误");

    private final String code;

    private final String message;

    StatusInfo(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}