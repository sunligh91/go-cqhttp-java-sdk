package com.github.sunligh91.sdk.gocqhttp.gateway.constant.url;

/**
 * @author : sunligh91
 * @date : 2023/4/9 5:09
 * Go-CqHttp 相关
 * 接口请求枚举
 */
public interface GoCqHttpURIConstant {

    /**
     * 获取 Cookies
     */
    String GET_COOKIES = "get_cookies";

    /**
     * 获取 CSRF Token
     */
    String GET_CSRF_TOKEN = "get_csrf_token";

    /**
     * 获取 QQ 相关接口凭证
     */
    String GET_CREDENTIALS = "get_credentials";

    /**
     * 获取版本信息
     */
    String GET_VERSION_INFO = "get_version_info";

    /**
     * 获取状态
     */
    String GET_STATUS = "get_status";

    /**
     * 重启 Go-CqHttp
     */
    String SET_RESTART = "set_restart";

    /**
     * 清理缓存
     */
    String CLEAN_CACHE = "clean_cache";

    /**
     * 重载事件过滤器
     */
    String RELOAD_EVENT_FILTER = "reload_event_filter";

    /**
     * 下载文件到缓存目录
     */
    String DOWNLOAD_FILE = "download_file";

    /**
     * 检查链接安全性
     */
    String CHECK_URL_SAFELY = "check_url_safely";

    /**
     * 获取中文分词 ( 隐藏 API )
     */
    String GET_WORD_SLICES = ".get_word_slices";

    /**
     * 对事件执行快速操作 ( 隐藏 API )
     */
    String HANDLE_QUICK_OPERATION = ".handle_quick_operation";


}
