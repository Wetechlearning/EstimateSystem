package com.we.estimate.Tools;

import javax.servlet.http.HttpServletResponse;

public class UserTools {

    // キャッシュ禁用
    public void disableCache(HttpServletResponse response) {
        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Expires", "0");
    }

}
