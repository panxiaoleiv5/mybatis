package com.pxl.demo.entity;


import java.util.Date;

/**
 * Created by Chou on 2018/2/1.
 */
public class User {

    /**逻辑主键ID**/
    private Long id;
    /**user_ID**/
    private Long userId;
    /**UMC号码**/
    private Long personId;
    /**手机号码**/
    private String phoneNo;
    /**用户名**/
    private String userName;
    /**工号**/
    private String jobNum;
    /**customerId**/
    private String customerId;
    /**rankOrder**/
    private Long rankOrder;
    /**短号**/
    private String telephone2;
    /**座机**/
    private String telephone1;
    /**QQ**/
    private String qq;
    /**WEIXIN**/
    private String weixin;
    /**邮件地址**/
    private String email;
    /**性别**/
    private String sex;
    /**照片地址**/
    private String photoUrl;
    /**照片更新时间**/
    private Long photoLastUpdateTime;
    /**联系方式是否公开**/
    private Long contactInfoPrivate;
    /**发送短信权限**/
    private Long sendSmsAuthority;
    /**是否可用**/
    private Long deleteFlag;
    /**创建时间**/
    private Long createTime;
    /**修改时间**/
    private Long lastUpdateTime;
    /**pinyin**/
    private String pinyin;
    /**简介**/
    private String description;
    /**accountId**/
    private Long accountId;
    /**该帐号曾经登录过的设备类型 by stq 数值代表意义： 0:默认 1:PC端 2:安卓端 4:iOS端**/
    private Long loginType;
    /**籍贯**/
    private String nativePlace;
    /**入职时间**/
    private Date employmentDate;

    private String education;

    private String salary;

    private String promotion;

    private String training;

    private String reward;

    private String signUrl;

    private String qrcodeUrl;

    /**
     * 个人简介
     */
    private String personalIntro;

    private String positionName;
    private String departmentName;
    private Long departmentId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getJobNum() {
        return jobNum;
    }

    public void setJobNum(String jobNum) {
        this.jobNum = jobNum;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Long getRankOrder() {
        return rankOrder;
    }

    public void setRankOrder(Long rankOrder) {
        this.rankOrder = rankOrder;
    }

    public String getTelephone2() {
        return telephone2;
    }

    public void setTelephone2(String telephone2) {
        this.telephone2 = telephone2;
    }

    public String getTelephone1() {
        return telephone1;
    }

    public void setTelephone1(String telephone1) {
        this.telephone1 = telephone1;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getWeixin() {
        return weixin;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public Long getPhotoLastUpdateTime() {
        return photoLastUpdateTime;
    }

    public void setPhotoLastUpdateTime(Long photoLastUpdateTime) {
        this.photoLastUpdateTime = photoLastUpdateTime;
    }

    public Long getContactInfoPrivate() {
        return contactInfoPrivate;
    }

    public void setContactInfoPrivate(Long contactInfoPrivate) {
        this.contactInfoPrivate = contactInfoPrivate;
    }

    public Long getSendSmsAuthority() {
        return sendSmsAuthority;
    }

    public void setSendSmsAuthority(Long sendSmsAuthority) {
        this.sendSmsAuthority = sendSmsAuthority;
    }

    public Long getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Long deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Long getLoginType() {
        return loginType;
    }

    public void setLoginType(Long loginType) {
        this.loginType = loginType;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    public Date getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(Date employmentDate) {
        this.employmentDate = employmentDate;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getPromotion() {
        return promotion;
    }

    public void setPromotion(String promotion) {
        this.promotion = promotion;
    }

    public String getTraining() {
        return training;
    }

    public void setTraining(String training) {
        this.training = training;
    }

    public String getReward() {
        return reward;
    }

    public void setReward(String reward) {
        this.reward = reward;
    }

    public String getSignUrl() {
        return signUrl;
    }

    public void setSignUrl(String signUrl) {
        this.signUrl = signUrl;
    }

    public String getQrcodeUrl() {
        return qrcodeUrl;
    }

    public void setQrcodeUrl(String qrcodeUrl) {
        this.qrcodeUrl = qrcodeUrl;
    }

    public String getPersonalIntro() {
        return personalIntro;
    }

    public void setPersonalIntro(String personalIntro) {
        this.personalIntro = personalIntro;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userId=" + userId +
                ", personId=" + personId +
                ", phoneNo='" + phoneNo + '\'' +
                ", userName='" + userName + '\'' +
                ", jobNum='" + jobNum + '\'' +
                ", customerId='" + customerId + '\'' +
                ", rankOrder=" + rankOrder +
                ", telephone2='" + telephone2 + '\'' +
                ", telephone1='" + telephone1 + '\'' +
                ", qq='" + qq + '\'' +
                ", weixin='" + weixin + '\'' +
                ", email='" + email + '\'' +
                ", sex='" + sex + '\'' +
                ", photoUrl='" + photoUrl + '\'' +
                ", photoLastUpdateTime=" + photoLastUpdateTime +
                ", contactInfoPrivate=" + contactInfoPrivate +
                ", sendSmsAuthority=" + sendSmsAuthority +
                ", deleteFlag=" + deleteFlag +
                ", createTime=" + createTime +
                ", lastUpdateTime=" + lastUpdateTime +
                ", pinyin='" + pinyin + '\'' +
                ", description='" + description + '\'' +
                ", accountId=" + accountId +
                ", loginType=" + loginType +
                ", nativePlace='" + nativePlace + '\'' +
                ", employmentDate=" + employmentDate +
                ", education='" + education + '\'' +
                ", salary='" + salary + '\'' +
                ", promotion='" + promotion + '\'' +
                ", training='" + training + '\'' +
                ", reward='" + reward + '\'' +
                ", signUrl='" + signUrl + '\'' +
                ", qrcodeUrl='" + qrcodeUrl + '\'' +
                ", personalIntro='" + personalIntro + '\'' +
                ", positionName='" + positionName + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", departmentId=" + departmentId +
                '}';
    }
}
