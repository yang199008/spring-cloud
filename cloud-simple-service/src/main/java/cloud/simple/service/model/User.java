package cloud.simple.service.model;

import java.io.Serializable;
import java.util.Date;

/**
 * User 
 * create by 杨洋
 */

public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long userId; //客户编号
    private String userName; //客户名称
    private String userType; //用户类型(owner :业主,merchant:商家,property:物业,admin:管理员 owner:业主,merchant商家,agency:代理商)
    private String nickName; //昵称
    private String salt; //密码加盐
    private String password; //密码
    private String realName; //真实姓名
    private Integer sex; //性别(1:男，2女)
    private String carNum; //车牌号(多个逗号分开)
    private String cardNo; //身份证号
    private Date birthday; //出生日期
    private String address; //住址
    private String introduce; //个人说明
    private String preferential;//优惠信息
    private String smallImgPath; //用户图片缩略图
    private String image; //用户图片
    private Integer vosStatus; //vos状态(1:成功,2:vos账户创建不成功,3:电话卡创建不成功)
    private String telephone; //手机号
    private String phone; //座机号
    private String email; //邮箱
    private Long companyId; //公司编号
    private Integer checkStatus; //审核状态(1:待审核,2:已通过,3:已拒绝)
    private Long vosId; //
    private Integer status; //是否启用(1:启用，2:禁用)
    private Integer privates; //是否私有(1:可见,2:不可见)
    private Date lastLoginTime; //最后登录日期
    private String lastLoginIp; //最后登录ip
    private String openId; //微信openId
    private Long levelId; //等级编号
    private String levelName; //等级名称
    private Integer score; //会员积分
    private String operateIp; //操作ip
    private String backgroundImg;//背景墙
    private Long creator; //创建人
    private Date createTime; //创建时间
    private Long updator; //修改人
    private Date updateTime; //修改时间

    private  String remark;//备注

    public void setUserId(Long userId) {
        this.userId = userId;
    }
    
    public Long getUserId() {
        return this.userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public String getUserName() {
        return this.userName;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
    
    public String getUserType() {
        return this.userType;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    
    public String getNickName() {
        return this.nickName;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }
    
    public String getSalt() {
        return this.salt;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getPassword() {
        return this.password;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }
    
    public String getRealName() {
        return this.realName;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }
    
    public Integer getSex() {
        return this.sex;
    }

    public void setCarNum(String carNum) {
        this.carNum = carNum;
    }
    
    public String getCarNum() {
        return this.carNum;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }
    
    public String getCardNo() {
        return this.cardNo;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    
    public Date getBirthday() {
        return this.birthday;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getAddress() {
        return this.address;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }
    
    public String getIntroduce() {
        return this.introduce;
    }

    public void setSmallImgPath(String smallImgPath) {
        this.smallImgPath = smallImgPath;
    }
    
    public String getSmallImgPath() {
        return this.smallImgPath;
    }

    public void setImage(String image) {
        this.image = image;
    }
    
    public String getImage() {
        return this.image;
    }

    public void setVosStatus(Integer vosStatus) {
        this.vosStatus = vosStatus;
    }
    
    public Integer getVosStatus() {
        return this.vosStatus;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    
    public String getTelephone() {
        return this.telephone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getPhone() {
        return this.phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getEmail() {
        return this.email;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }
    
    public Long getCompanyId() {
        return this.companyId;
    }

    public void setCheckStatus(Integer checkStatus) {
        this.checkStatus = checkStatus;
    }
    
    public Integer getCheckStatus() {
        return this.checkStatus;
    }

    public void setVosId(Long vosId) {
        this.vosId = vosId;
    }
    
    public Long getVosId() {
        return this.vosId;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
    
    public Integer getStatus() {
        return this.status;
    }

    public void setPrivates(Integer privates) {
        this.privates = privates;
    }
    
    public Integer getPrivates() {
        return this.privates;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }
    
    public Date getLastLoginTime() {
        return this.lastLoginTime;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }
    
    public String getLastLoginIp() {
        return this.lastLoginIp;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }
    
    public String getOpenId() {
        return this.openId;
    }

    public void setLevelId(Long levelId) {
        this.levelId = levelId;
    }
    
    public Long getLevelId() {
        return this.levelId;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }
    
    public String getLevelName() {
        return this.levelName;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
    
    public Integer getScore() {
        return this.score;
    }

    public void setOperateIp(String operateIp) {
        this.operateIp = operateIp;
    }
    
    public String getOperateIp() {
        return this.operateIp;
    }

    public void setCreator(Long creator) {
        this.creator = creator;
    }
    
    public Long getCreator() {
        return this.creator;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    
    public Date getCreateTime() {
        return this.createTime;
    }

    public void setUpdator(Long updator) {
        this.updator = updator;
    }
    
    public Long getUpdator() {
        return this.updator;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    
    public Date getUpdateTime() {
        return this.updateTime;
    }

    public String getBackgroundImg() {
        return backgroundImg;
    }

    public void setBackgroundImg(String backgroundImg) {
        this.backgroundImg = backgroundImg;
    }

    public String getPreferential() {
        return preferential;
    }

    public void setPreferential(String preferential) {
        this.preferential = preferential;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "User [userId=" + userId + ",userName=" + userName + ",userType=" + userType + ",nickName=" + nickName + ",salt=" + salt + ",password=" + password + ",realName=" + realName + ",sex=" + sex + ",carNum=" + carNum + ",cardNo=" + cardNo + ",birthday=" + birthday + ",address=" + address + ",introduce=" + introduce + ",smallImgPath=" + smallImgPath + ",image=" + image + ",vosStatus=" + vosStatus + ",telephone=" + telephone + ",phone=" + phone + ",email=" + email + ",companyId=" + companyId + ",checkStatus=" + checkStatus + ",vosId=" + vosId + ",status=" + status + ",privates=" + privates + ",lastLoginTime=" + lastLoginTime + ",lastLoginIp=" + lastLoginIp + ",openId=" + openId + ",levelId=" + levelId + ",levelName=" + levelName + ",score=" + score + ",operateIp=" + operateIp + ",creator=" + creator + ",createTime=" + createTime + ",updator=" + updator + ",updateTime=" + updateTime + ",]";
    }
}
