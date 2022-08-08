package com.toocol.plugin.tooltip.search;

/**
 * @author ：JoeZane (joezane.cn@gmail.com)
 * @date: 2022/8/7 22:23
 * @version: 0.0.1
 */
public enum EscapeCommonPrivateMode implements IEscapeMode {
    CURSOR_INVISIBLE("25l", "Make cursor invisible."),
    CURSOR_VISIBLE("25h", "Make cursor visible."),
    RESTORE_SCREEN("47l", "Restore screen."),
    SAVE_SCREEN("47h", "Save screen."),
    ENABLE_ALTERNATIVE_BUFFER("1049h", "Enables the alternative buffer."),
    DISABLE_ALTERNATIVE_BUFFER("1049l", "Disables the alternative buffer."),
    ;
    public final String code;
    public final String desc;

    EscapeCommonPrivateMode(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public EscapeCommonPrivateMode codeOf(String code) {
        for (EscapeCommonPrivateMode mode : values()) {
            if (mode.code.equals(code)) {
                return mode;
            }
        }
        return null;
    }

    @Override
    public String desc() {
        return desc;
    }
}