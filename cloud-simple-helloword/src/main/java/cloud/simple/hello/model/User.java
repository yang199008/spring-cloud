package cloud.simple.hello.model;

import cloud.simple.hello.annotations.IdType;
import cloud.simple.hello.annotations.TableField;
import cloud.simple.hello.annotations.TableId;
import cloud.simple.hello.annotations.TableName;

import java.io.Serializable;
import java.util.Date;


/**
 *
 * 
 *
 */
@TableName("bd_user")
public class User implements Serializable {

	@TableField(exist = false)
	private static final long serialVersionUID = 1L;

	/** 客户编号 */
	@TableId(type = IdType.INPUT)
	private Long userId;

	/** 客户名称 */
	private String userName;

	/** 用户类型(owner :业主,merchant:商家,property:物业,admin:管理员 owner:业主,merchant商家,agency:代理商) */
	private String userType;

	/** 昵称 */
	private String nickName;

	/** 密码加盐 */
	private String salt;

	/** 密码 */
	private String password;

	/** 真实姓名 */
	private String realName;

	/** 性别(1:男，2女) */
	private Integer sex;

	/** 车牌号(多个逗号分开) */
	private String carNum;

	/** 身份证号 */
	private String cardNo;

	/** 出生日期 */
	private Date birthday;

	/** 住址 */
	private String address;

	/** 个人说明 */
	private String introduce;

	/** 用户图片缩略图 */
	private String smallImgPath;

	/** 用户图片 */
	private String image;

	/** vos状态(1:成功,2:vos账户创建不成功,3:电话卡创建不成功) */
	private Integer vosStatus;

	/** 手机号 */
	private String telephone;

	/** 座机号 */
	private String phone;

	/** 邮箱 */
	private String email;

	/** 公司编号 */
	private Long companyId;

	/** 审核状态(1:待审核,2:已通过,3:已拒绝) */
	private Integer checkStatus;

	/**  */
	private Long vosId;

	/** 是否启用(1:启用，2:禁用) */
	private Integer status;

	/** 是否私有(1:可见,2:不可见) */
	private Integer privates;

	/** 最后登录日期 */
	private Date lastLoginTime;

	/** 最后登录ip */
	private String lastLoginIp;

	/** 微信openId */
	private String openId;

	/** 等级编号 */
	private Long levelId;

	/** 等级名称 */
	private String levelName;

	/** 会员积分 */
	private Integer score;

	/** 操作ip */
	private String operateIp;

	/** 创建人 */
	private Long creator;

	/** 创建时间 */
	private Date createTime;

	/** 修改人 */
	private Long updator;

	/** 修改时间 */
	private Date updateTime;


	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserType() {
		return this.userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getNickName() {
		return this.nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getSalt() {
		return this.salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRealName() {
		return this.realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public Integer getSex() {
		return this.sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getCarNum() {
		return this.carNum;
	}

	public void setCarNum(String carNum) {
		this.carNum = carNum;
	}

	public String getCardNo() {
		return this.cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getIntroduce() {
		return this.introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public String getSmallImgPath() {
		return this.smallImgPath;
	}

	public void setSmallImgPath(String smallImgPath) {
		this.smallImgPath = smallImgPath;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Integer getVosStatus() {
		return this.vosStatus;
	}

	public void setVosStatus(Integer vosStatus) {
		this.vosStatus = vosStatus;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public Integer getCheckStatus() {
		return this.checkStatus;
	}

	public void setCheckStatus(Integer checkStatus) {
		this.checkStatus = checkStatus;
	}

	public Long getVosId() {
		return this.vosId;
	}

	public void setVosId(Long vosId) {
		this.vosId = vosId;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getPrivates() {
		return this.privates;
	}

	public void setPrivates(Integer privates) {
		this.privates = privates;
	}

	public Date getLastLoginTime() {
		return this.lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public String getLastLoginIp() {
		return this.lastLoginIp;
	}

	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}

	public String getOpenId() {
		return this.openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Long getLevelId() {
		return this.levelId;
	}

	public void setLevelId(Long levelId) {
		this.levelId = levelId;
	}

	public String getLevelName() {
		return this.levelName;
	}

	public void setLevelName(String levelName) {
		this.levelName = levelName;
	}

	public Integer getScore() {
		return this.score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public String getOperateIp() {
		return this.operateIp;
	}

	public void setOperateIp(String operateIp) {
		this.operateIp = operateIp;
	}

	public Long getCreator() {
		return this.creator;
	}

	public void setCreator(Long creator) {
		this.creator = creator;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Long getUpdator() {
		return this.updator;
	}

	public void setUpdator(Long updator) {
		this.updator = updator;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
