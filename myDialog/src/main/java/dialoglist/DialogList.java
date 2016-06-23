package dialoglist;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;

import com.example.administrator.myapplication.R;
import com.flyco.animation.BaseAnimatorSet;
import com.flyco.dialog.entity.DialogMenuItem;
import com.flyco.dialog.listener.OnBtnClickL;
import com.flyco.dialog.listener.OnOperItemClickL;
import com.flyco.dialog.widget.ActionSheetDialog;
import com.flyco.dialog.widget.MaterialDialog;
import com.flyco.dialog.widget.NormalDialog;
import com.flyco.dialog.widget.NormalListDialog;

import java.util.ArrayList;

import adapter.TestAdapter;
import utils.T;

/**
 *
 * Created by Administrator on 2016/6/16.
 */
public class DialogList {

    /**
     * normalDialogStyleOne
     *
     * @param context  con
     * @param base_in  in
     * @param base_out out
     */
    public void normalDialogStyleOne(final Context context, BaseAnimatorSet base_in, BaseAnimatorSet base_out) {
        final NormalDialog dialog = new NormalDialog(context);
        dialog.content("一般的dialog--样式1 --是否退出程序")
                .showAnim(base_in)
                .dismissAnim(base_out)
                .show();
        dialog.setOnBtnClickL(new OnBtnClickL() {
            @Override
            public void onBtnClick() {
                T.showShort(context, "左边");
                dialog.dismiss();
            }
        }, new OnBtnClickL() {
            @Override
            public void onBtnClick() {
                T.showShort(context, "右边");
                dialog.dismiss();
            }
        });


    }


    /**
     * normalDialogStyleTwo
     *
     * @param context  con
     * @param base_in  in
     * @param base_out out
     */
    public void normalDialogStyleTwo(final Context context, BaseAnimatorSet base_in, BaseAnimatorSet base_out) {
        final NormalDialog dialog = new NormalDialog(context);
        dialog.content("一般的dialog--样式2 --是否退出程序")
                .style(NormalDialog.STYLE_TWO)
                .titleTextSize(23)
                .showAnim(base_in)
                .dismissAnim(base_out)
                .show();
        dialog.setOnBtnClickL(new OnBtnClickL() {
            @Override
            public void onBtnClick() {
                T.showShort(context, "左边");
                dialog.dismiss();
            }
        }, new OnBtnClickL() {
            @Override
            public void onBtnClick() {
                T.showShort(context, "右边");
                dialog.dismiss();
            }
        });


    }

    /**
     * 黑色dialog
     *
     * @param context  con
     * @param base_in  oin
     * @param base_out out
     */

    public void normalDialogThemeBlack(final Context context, BaseAnimatorSet base_in, BaseAnimatorSet base_out) {
        final NormalDialog dialog = new NormalDialog(context);
        dialog.isTitleShow(false)
                .content("是否确定退出程序")
                .bgColor(Color.parseColor("#383838"))
                .cornerRadius(5)
                .contentGravity(Gravity.CENTER)
                .contentTextColor(Color.parseColor("#ffffff"))
                .dividerColor(Color.parseColor("#222222"))
                .btnTextSize(15.5f, 15.5f)
                .btnTextColor(Color.parseColor("#ffffff"), Color.parseColor("#ffffff"))
                .btnPressColor(Color.parseColor("#2B2B2B"))
                .widthScale(0.85f)//
                .showAnim(base_in)//
                .dismissAnim(base_out)//
                .show();

        dialog.setOnBtnClickL(new OnBtnClickL() {
            @Override
            public void onBtnClick() {
                T.showShort(context, "左边");
                dialog.dismiss();
            }
        }, new OnBtnClickL() {
            @Override
            public void onBtnClick() {
                T.showShort(context, "右边");
                dialog.dismiss();
            }
        });


    }


    /**
     * 一个按钮的dialog
     * @param context  con
     * @param base_in  oin
     * @param base_out out
     */
    public void normalDialogOneBtn(final Context context, BaseAnimatorSet base_in, BaseAnimatorSet base_out) {
        final NormalDialog dialog = new NormalDialog(context);
        dialog.btnNum(1)
                .content("抢票次数已用完")
                .btnText("继续逛逛")
                .showAnim(base_in)//
                .dismissAnim(base_out)//
                .show();

        dialog.setOnBtnClickL(new OnBtnClickL() {
            @Override
            public void onBtnClick() {
                T.showShort(context, "middle");
                dialog.dismiss();
            }
        });

    }


    /**
     * 三个按钮的dialog
     * @param context  con
     * @param base_in  oin
     * @param base_out out
     */
    public void NormalDialoThreeBtn(final Context context, BaseAnimatorSet base_in, BaseAnimatorSet base_out) {
        final NormalDialog dialog = new NormalDialog(context);
        dialog.content("你今天的抢购名额已用完~")//
                .style(NormalDialog.STYLE_TWO)//
                .btnNum(3)
                .btnText("取消", "确定", "继续逛逛")//
                .showAnim(base_in)//
                .dismissAnim(base_out)//
                .show();

        dialog.setOnBtnClickL(
                new OnBtnClickL() {
                    @Override
                    public void onBtnClick() {
                        T.showShort(context, "left");
                        dialog.dismiss();
                    }
                },
                new OnBtnClickL() {
                    @Override
                    public void onBtnClick() {
                        T.showShort(context, "right");
                        dialog.dismiss();
                    }
                },
                new OnBtnClickL() {
                    @Override
                    public void onBtnClick() {
                        T.showShort(context, "middle");
                        dialog.dismiss();
                    }
                });
    }


    /**
     *  Material风格的dialog
     * @param context  con
     * @param base_in  oin
     * @param base_out out
     */
    public void MaterialDialogDefault(final Context context, BaseAnimatorSet base_in, BaseAnimatorSet base_out) {
        final MaterialDialog dialog = new MaterialDialog(context);
        dialog.content(
                "嗨！这是一个 MaterialDialogDefault. 它非常方便使用，你只需将它实例化，这个美观的对话框便会自动地显示出来。"
                        + "它简洁小巧，完全遵照 Google 2014 年发布的 Material Design 风格，希望你能喜欢它！^ ^")//
                .btnText("取消", "确定")//
                .showAnim(base_in)//
                .dismissAnim(base_out)//
                .show();

        dialog.setOnBtnClickL(
                new OnBtnClickL() {//left btn click listener
                    @Override
                    public void onBtnClick() {
                        T.showShort(context, "left");
                        dialog.dismiss();
                    }
                },
                new OnBtnClickL() {//right btn click listener
                    @Override
                    public void onBtnClick() {
                        T.showShort(context, "right");
                        dialog.dismiss();
                    }
                }
        );
    }

    /**
     *  Material风格的三个按钮的dialog
     * @param context  con
     * @param base_in  oin
     * @param base_out out
     */
    public void MaterialDialogThreeBtns(final Context context, BaseAnimatorSet base_in, BaseAnimatorSet base_out) {
        final MaterialDialog dialog = new MaterialDialog(context);
        dialog.isTitleShow(false)//
                .btnNum(3)
                .content("为保证咖啡豆的新鲜度和咖啡的香味，并配以特有的传统烘焙和手工冲。")//
                .btnText("确定", "取消", "知道了")//
                .showAnim(base_in)//
                .dismissAnim(base_out)//
                .show();

        dialog.setOnBtnClickL(
                new OnBtnClickL() {//left btn click listener
                    @Override
                    public void onBtnClick() {
                        T.showShort(context, "left");
                        dialog.dismiss();
                    }
                },
                new OnBtnClickL() {//right btn click listener
                    @Override
                    public void onBtnClick() {
                        T.showShort(context, "right");
                        dialog.dismiss();
                    }
                }
                ,
                new OnBtnClickL() {//middle btn click listener
                    @Override
                    public void onBtnClick() {
                        T.showShort(context, "middle");
                        dialog.dismiss();
                    }
                }
        );
    }

    /**
     *  Material风格的一个按钮的dialog
     * @param context  con
     * @param base_in  oin
     * @param base_out out
     */
    public void MaterialDialogOneBtn(final Context context, BaseAnimatorSet base_in, BaseAnimatorSet base_out) {
        final MaterialDialog dialog = new MaterialDialog(context);
        dialog//
                .btnNum(1)
                .content("为保证咖啡豆的新鲜度和咖啡的香味，并配以特有的传统烘焙和手工冲。")//
                .btnText("确定")//
                .showAnim(base_in)//
                .dismissAnim(base_out)//
                .show();

        dialog.setOnBtnClickL(new OnBtnClickL() {
            @Override
            public void onBtnClick() {
                T.showShort(context, "middle");
                dialog.dismiss();
            }
        });
    }


    public void normalListDialog(final Context context, BaseAnimatorSet base_in, BaseAnimatorSet base_out){
        final ArrayList<DialogMenuItem> testItems = new ArrayList<>();
        testItems.add(new DialogMenuItem("收藏", R.mipmap.ic_winstyle_favor));
        testItems.add(new DialogMenuItem("下载", R.mipmap.ic_winstyle_download));
        testItems.add(new DialogMenuItem("分享", R.mipmap.ic_winstyle_share));
        testItems.add(new DialogMenuItem("删除", R.mipmap.ic_winstyle_delete));
        testItems.add(new DialogMenuItem("歌手", R.mipmap.ic_winstyle_artist));
        testItems.add(new DialogMenuItem("专辑", R.mipmap.ic_winstyle_album));

        final NormalListDialog dialog = new NormalListDialog(context, testItems);
        dialog.title("请选择")//
                .showAnim(base_in)//
                .dismissAnim(base_out)//
                .show();
        dialog.setOnOperItemClickL(new OnOperItemClickL() {
            @Override
            public void onOperItemClick(AdapterView<?> parent, View view, int position, long id) {
                T.showShort(context, testItems.get(position).operName);
                dialog.dismiss();
            }
        });
    }


    public void normalListDialogCustomAttr(final Context context){
        final ArrayList<DialogMenuItem> testItems = new ArrayList<>();
        testItems.add(new DialogMenuItem("收藏", R.mipmap.ic_winstyle_favor));
        testItems.add(new DialogMenuItem("下载", R.mipmap.ic_winstyle_download));
        testItems.add(new DialogMenuItem("分享", R.mipmap.ic_winstyle_share));
        testItems.add(new DialogMenuItem("删除", R.mipmap.ic_winstyle_delete));
        testItems.add(new DialogMenuItem("歌手", R.mipmap.ic_winstyle_artist));
        testItems.add(new DialogMenuItem("专辑", R.mipmap.ic_winstyle_album));
        final NormalListDialog dialog = new NormalListDialog(context, testItems);
        dialog.title("请选择")//
                .titleTextSize_SP(18)//
                .titleBgColor(Color.parseColor("#409ED7"))//
                .itemPressColor(Color.parseColor("#85D3EF"))//
                .itemTextColor(Color.parseColor("#303030"))//
                .itemTextSize(14)//
                .cornerRadius(0)//
                .widthScale(0.8f)//
                .show(R.style.myDialogAnim);

        dialog.setOnOperItemClickL(new OnOperItemClickL() {
            @Override
            public void onOperItemClick(AdapterView<?> parent, View view, int position, long id) {
                T.showShort(context, testItems.get(position).operName);
                dialog.dismiss();
            }
        });
    }

    public void normalListDialogNoTitle(final Context context){
        final ArrayList<DialogMenuItem> testItems = new ArrayList<>();
        testItems.add(new DialogMenuItem("收藏", R.mipmap.ic_winstyle_favor));
        testItems.add(new DialogMenuItem("下载", R.mipmap.ic_winstyle_download));
        testItems.add(new DialogMenuItem("分享", R.mipmap.ic_winstyle_share));
        testItems.add(new DialogMenuItem("删除", R.mipmap.ic_winstyle_delete));
        testItems.add(new DialogMenuItem("歌手", R.mipmap.ic_winstyle_artist));
        testItems.add(new DialogMenuItem("专辑", R.mipmap.ic_winstyle_album));
        final NormalListDialog dialog = new NormalListDialog(context, testItems);
        dialog.title("请选择")//
                .isTitleShow(false)//
                .itemPressColor(Color.parseColor("#85D3EF"))//
                .itemTextColor(Color.parseColor("#303030"))//
                .itemTextSize(15)//
                .cornerRadius(2)//
                .widthScale(0.75f)//
                .show();

        dialog.setOnOperItemClickL(new OnOperItemClickL() {
            @Override
            public void onOperItemClick(AdapterView<?> parent, View view, int position, long id) {
                T.showShort(context, testItems.get(position).operName);
                dialog.dismiss();
            }
        });
    }


    public void NormalListDialogStringArr(final Context context){
        final String[] stringItems = {"收藏", "下载", "分享", "删除", "歌手", "专辑"};
        final NormalListDialog dialog = new NormalListDialog(context, stringItems);
        dialog.title("请选择")//
                .layoutAnimation(null)
                .show(R.style.myDialogAnim);
        dialog.setOnOperItemClickL(new OnOperItemClickL() {
            @Override
            public void onOperItemClick(AdapterView<?> parent, View view, int position, long id) {
                T.showShort(context, stringItems[position]);
                dialog.dismiss();
            }
        });
    }


    public void NormalListDialogAdapter(final Context context){
        final ArrayList<DialogMenuItem> testItems = new ArrayList<>();
        testItems.add(new DialogMenuItem("收藏", R.mipmap.ic_winstyle_favor));
        testItems.add(new DialogMenuItem("下载", R.mipmap.ic_winstyle_download));
        testItems.add(new DialogMenuItem("分享", R.mipmap.ic_winstyle_share));
        testItems.add(new DialogMenuItem("删除", R.mipmap.ic_winstyle_delete));
        testItems.add(new DialogMenuItem("歌手", R.mipmap.ic_winstyle_artist));
        testItems.add(new DialogMenuItem("专辑", R.mipmap.ic_winstyle_album));
        final NormalListDialog dialog = new NormalListDialog(context, new TestAdapter(context, testItems));
        dialog.title("请选择")//
                .show(R.style.myDialogAnim);
        dialog.setOnOperItemClickL(new OnOperItemClickL() {
            @Override
            public void onOperItemClick(AdapterView<?> parent, View view, int position, long id) {
                T.showShort(context, testItems.get(position).operName);
                dialog.dismiss();
            }
        });
    }


    public void ActionSheetDialog(final Context context){
        final String[] stringItems = {"接收消息并提醒", "接收消息但不提醒", "收进群助手且不提醒", "屏蔽群消息"};
        final ActionSheetDialog dialog = new ActionSheetDialog(context, stringItems, null);
        dialog.title("选择群消息提醒方式\r\n(该群在电脑的设置:接收消息并提醒)")//
                .titleTextSize_SP(14.5f)//
                .show();

        dialog.setOnOperItemClickL(new OnOperItemClickL() {
            @Override
            public void onOperItemClick(AdapterView<?> parent, View view, int position, long id) {
                T.showShort(context, stringItems[position]);
                dialog.dismiss();
            }
        });
    }

    public void ActionSheetDialogNoTitle(final Context context,View view){
        final String[] stringItems = {"版本更新", "帮助与反馈", "退出QQ"};
        final ActionSheetDialog dialog = new ActionSheetDialog(context, stringItems, view);
        dialog.isTitleShow(false).show();

        dialog.setOnOperItemClickL(new OnOperItemClickL() {
            @Override
            public void onOperItemClick(AdapterView<?> parent, View view, int position, long id) {
                T.showShort(context, stringItems[position]);
                dialog.dismiss();
            }
        });
    }

}
