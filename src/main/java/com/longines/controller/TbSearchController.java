package com.longines.controller;

import com.longines.service.TbSearchService;
import com.longines.service.TbThemeService;
import com.longines.vo.TbSearchGoodsInfo;
import com.longines.vo.TbThemeGoodsInfo;
import org.apdplat.word.WordSegmenter;
import org.apdplat.word.segmentation.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.ListIterator;

/**
 * @author weiyi
 * @since 2018-08-16 2:22
 * @version 1.0
 */
@Controller
@CrossOrigin
@RequestMapping("longInes")
public class TbSearchController {

    @Autowired
    private TbSearchService tbSearchService;

    /**
     * @return java.util.List<com.longInes.vo.TbSearchGoodsInfo>
     * @param watchesName 输入的商品名（原始查询）
     */
    @ResponseBody

//    @RequestMapping("searchController1")
    @PostMapping("searchController1")
    public List<TbSearchGoodsInfo> searchController1(@RequestBody TbSearchGoodsInfo watchesName) {
        List<Word> words = WordSegmenter.segWithStopWords(watchesName.getgName());
        ListIterator listIterator = words.listIterator();
        while (listIterator.hasNext()) {
            String watchName = listIterator.next().toString();
            List<TbSearchGoodsInfo> list = tbSearchService.search(watchName);
            return list;
        }
        return null;
    }

    /**
     * @return java.util.List<com.longInes.vo.TbSearchGoodsInfo>
     * @param watchesName 输入的商品名（按价格从高到低）
     */
    @ResponseBody
//    @RequestMapping("searchController2")
    @PostMapping("searchController2")
    public List<TbSearchGoodsInfo> searchController2(@RequestBody TbSearchGoodsInfo watchesName) {
        List<Word> words = WordSegmenter.segWithStopWords(watchesName.getgName());
        ListIterator listIterator = words.listIterator();
        while (listIterator.hasNext()) {
            String watchName = listIterator.next().toString();
            List<TbSearchGoodsInfo> list = tbSearchService.selectGoodsPUD(watchName);
                return list;
        }
        return null;
    }

    /**
     * @return java.util.List<com.longInes.vo.TbSearchGoodsInfo>
     * @param watchesName 输入的商品名（按价格从低到高）
     */
    @ResponseBody
//    @RequestMapping("searchController3")
    @PostMapping("searchController3")
    public List<TbSearchGoodsInfo> searchController3(@RequestBody TbSearchGoodsInfo watchesName) {
        List<Word> words = WordSegmenter.segWithStopWords(watchesName.getgName());
        ListIterator listIterator = words.listIterator();
        while (listIterator.hasNext()) {
            String watchName = listIterator.next().toString();
            List<TbSearchGoodsInfo> list = tbSearchService.selectGoodsPDU(watchName);
            return list;
        }
        return null;
    }

    /**
     * @return java.util.List<com.longInes.vo.TbSearchGoodsInfo>
     * @param watchesName 输入的商品名（按上架时间从晚到早）
     */
    @ResponseBody
//    @RequestMapping("searchController4")
    @PostMapping("searchController4")
    public List<TbSearchGoodsInfo> searchController4(@RequestBody TbSearchGoodsInfo watchesName) {
        List<Word> words = WordSegmenter.segWithStopWords(watchesName.getgName());
        ListIterator listIterator = words.listIterator();
        while (listIterator.hasNext()) {
            String watchName = listIterator.next().toString();
            List<TbSearchGoodsInfo> list = tbSearchService.selectGoodsTUD(watchName);
            return list;
        }
        return null;
    }

    /**
     * @return java.util.List<com.longInes.vo.TbSearchGoodsInfo>
     * @param watchesName 输入的商品名（按上架时间从早到晚）
     */
    @ResponseBody
//    @RequestMapping("searchController5")
    @PostMapping("searchController5")
    public List<TbSearchGoodsInfo> searchController5(@RequestBody TbSearchGoodsInfo watchesName) {
        List<Word> words = WordSegmenter.segWithStopWords(watchesName.getgName());
        ListIterator listIterator = words.listIterator();
        while (listIterator.hasNext()) {
            String watchName = listIterator.next().toString();
            List<TbSearchGoodsInfo> list = tbSearchService.selectGoodsTDU(watchName);
            return list;
        }
        return null;
    }


}
