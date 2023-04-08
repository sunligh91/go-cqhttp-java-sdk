package com.github.sunligh91.sdk.gocqhttp.gateway.constant.url;

/**
 * @author : sunligh91
 * @date : 2023/4/9 5:09
 * 文件
 * 接口请求枚举
 */
public interface FileURIConstant {

    /**
     * 上传群文件
     */
    String UPLOAD_GROUP_FILE = "upload_group_file";

    /**
     * 删除群文件
     */
    String DELETE_GROUP_FILE = "delete_group_file";

    /**
     * 创建群文件文件夹
     */
    String CREATE_GROUP_FILE_FOLDER = "create_group_file_folder";

    /**
     * 删除群文件文件夹
     */
    String DELETE_GROUP_FOLDER = "delete_group_folder";

    /**
     * 获取群文件系统信息
     */
    String GET_GROUP_FILE_SYSTEM_INFO = "get_group_file_system_info";

    /**
     * 获取群根目录文件列表
     */
    String GET_GROUP_ROOT_FILES = "get_group_root_files";

    /**
     * 获取群子目录文件列表
     */
    String GET_GROUP_FILES_BY_FOLDER = "get_group_files_by_folder";

    /**
     * 获取群文件资源链接
     */
    String GET_GROUP_FILE_URL = "get_group_file_url";

    /**
     * 上传私聊文件
     */
    String UPLOAD_PRIVATE_FILE = "upload_private_file";



}
