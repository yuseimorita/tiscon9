package com.tiscon.code;

/**
 * コード値を定義したEnumが実装するインタフェース。
 */
public interface CodeEnum {
    /**
     * ラベルを返却する。
     *
     * @return ラベル
     */
    String getLabel();

    /**
     * コード値を返却する。
     *
     * @return コード値
     */
    int getCode();
}
