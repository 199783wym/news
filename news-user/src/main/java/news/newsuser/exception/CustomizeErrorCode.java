package news.newsuser.exception;

public enum CustomizeErrorCode implements ICustomizeErrorCode {

    QUESTION_NOT_FOUNT(2001, "你找的问题不存在了，真的"),
    COMMENT_PARAM_NOT_FOUNT(2001, "未选中任何问题或评论"),
    NO_LOGIN(2003, "当前操作需要登录，请登录后重试"),
    SYS_ERROR(2004, "服务器错误"),
    TYPE_PARAM_WRONG(2005, "评论类型错误，或不存在"),
    COMMENT_NOT_FOUND(2006, "评论不存在"),
    CONTENT_IS_EMPTY(2007, "回复的内容不能为空");


    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    private String message;
    private Integer code;

    CustomizeErrorCode(Integer code, String message) {
        this.message = message;
        this.code = code;
    }

}
