package cn.itcast.garbageclassification.adapter;

import androidx.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

import cn.itcast.garbageclassification.R;
import cn.itcast.garbageclassification.model.TrashNewsResponse;

/**
 * 垃圾分类新闻列表适配器
 *
 * @author llw
 * @date 2021/4/16 10:36
 */
public class TrashNewsAdapter extends BaseQuickAdapter<TrashNewsResponse.NewslistBean, BaseViewHolder> {

    public TrashNewsAdapter(int layoutResId, @Nullable List<TrashNewsResponse.NewslistBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, TrashNewsResponse.NewslistBean item) {
        helper.setText(R.id.tv_title, item.getTitle())
                .setText(R.id.tv_description, item.getDescription())
                .addOnClickListener(R.id.item_trash_news);
    }
}