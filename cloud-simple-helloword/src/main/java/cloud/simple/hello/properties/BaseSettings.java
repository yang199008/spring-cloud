package cloud.simple.hello.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by Administrator on 2016/10/18.
 */
@ConfigurationProperties(prefix = "base",locations = "classpath:config/base.properties")
public class BaseSettings {
    private String urlPath;
    private String imageUrl;
    private String uploadUrl;

    public String getUploadUrl() {
        return uploadUrl;
    }

    public void setUploadUrl(String uploadUrl) {
        this.uploadUrl = uploadUrl;
    }

    public String getUrlPath() {
        return urlPath;
    }

    public void setUrlPath(String urlPath) {
        this.urlPath = urlPath;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
