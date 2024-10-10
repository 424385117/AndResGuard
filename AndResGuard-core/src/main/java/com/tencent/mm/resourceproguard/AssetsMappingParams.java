package com.tencent.mm.resourceproguard;

/**
 * @author pengguolong
 * created 2024/10/10 11:18
 */
public class AssetsMappingParams {
    public final Boolean enable;
    public final String password;
    public final String fileName;

    public AssetsMappingParams(String fileName, Boolean enable, String password) {
        this.fileName = fileName;
        this.enable = enable;
        this.password = password;
    }
}
