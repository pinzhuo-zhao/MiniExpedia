package com.unimelb.swen30006.miniexpedia;

/**
 * @program: MiniExpedia
 * @description:
 * @author: Pinzhuo Zhao, StudentID:1043915
 * @create: 2021-04-26 01:01
 **/
public class SearchFactory {
    private static SearchFactory instance;

    public static synchronized SearchFactory getInstance() {
        if (instance == null) {
            instance = new SearchFactory();
        }
        return instance;
    }

    public SearchAdapter getAdapter(int type) {
        SearchAdapter adapter = null;
        if (type == 2){
             adapter = new QantasSearchAdapter();
        }else if (type == 3){
             adapter = new VirginSearchAdapter();
        }
        return adapter;
    }
}
