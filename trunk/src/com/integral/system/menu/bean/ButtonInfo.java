package com.integral.system.menu.bean;

/**
 * <p>
 * Description: [菜单按钮信息管理]
 * </p>
 * 
 * @author <a href="mailto: swpigris81@126.com">Chao Dai</a>
 * @createDate 2011-6-5
 */
public class ButtonInfo {
    /** 按钮Id **/
    private String buttonId;

    /** 按钮名称 **/
    private String buttonName;
    
    /** 按钮显示的文字 **/
    private String buttonText;

    /** 所属菜单ID **/
    private String menuId;

    /** 按钮的路径 **/
    private String buttonUrl;
    
    
    /**
     * <p>Discription:[方法功能描述]</p>
     * @return String buttonText.
     */
    public String getButtonText() {
        return buttonText;
    }

    /**
     * <p>Discription:[方法功能描述]</p>
     * @param buttonText The buttonText to set.
     */
    public void setButtonText(String buttonText) {
        this.buttonText = buttonText;
    }

    /**
     * <p>Discription:[方法功能描述]</p>
     * @return String buttonId.
     */
    public String getButtonId() {
        return buttonId;
    }

    /**
     * <p>Discription:[方法功能描述]</p>
     * @param buttonId The buttonId to set.
     */
    public void setButtonId(String buttonId) {
        this.buttonId = buttonId;
    }

    /**
     * <p>Discription:[方法功能描述]</p>
     * @return String buttonName.
     */
    public String getButtonName() {
        return buttonName;
    }

    /**
     * <p>Discription:[方法功能描述]</p>
     * @param buttonName The buttonName to set.
     */
    public void setButtonName(String buttonName) {
        this.buttonName = buttonName;
    }

    /**
     * <p>Discription:[方法功能描述]</p>
     * @return String menuId.
     */
    public String getMenuId() {
        return menuId;
    }

    /**
     * <p>Discription:[方法功能描述]</p>
     * @param menuId The menuId to set.
     */
    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    /**
     * <p>Discription:[方法功能描述]</p>
     * @return String buttonUrl.
     */
    public String getButtonUrl() {
        return buttonUrl;
    }

    /**
     * <p>Discription:[方法功能描述]</p>
     * @param buttonUrl The buttonUrl to set.
     */
    public void setButtonUrl(String buttonUrl) {
        this.buttonUrl = buttonUrl;
    }
}
