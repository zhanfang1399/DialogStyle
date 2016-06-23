package com.example.administrator.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ExpandableListView;

import com.flyco.animation.BaseAnimatorSet;
import com.flyco.animation.BounceEnter.BounceTopEnter;
import com.flyco.animation.SlideExit.SlideBottomExit;

import adapter.HomeAdapter;
import dialoglist.DialogList;
import extra.CustomBaseDialog;
import extra.IOSTaoBaoDialog;
import extra.ShareBottomDialog;
import extra.ShareTopDialog;
import utils.DiaogAnimChoose;

public class MainActivity extends AppCompatActivity {


    public  String[] groups = {"Default Inner Dialog", "Custom Dialog", "Default Inner Anim", "Custom Anim"};
    public  String[][] childs = {
            /**Default Inner Dialog*/
            {
                    "NormalDialog Default(two btns)",                    //0
                    "NormalDialog StyleTwo",                    //1
                    "NormalDialog Custom Attr",                 //2
                    "NormalDialog(one btn)",                 //3
                    "NormalDialog(three btns)",                 //4
                    "MaterialDialogDefault Default(two btns)",  //5
                    "MaterialDialogDefault(one btn)",           //6
                    "MaterialDialogDefault(three btns)",        //7
                    "NormalListDialog",                         //8
                    "NormalListDialog Custom Attr",             //10
                    "NormalListDialog No Title",                //11
                    "NormalListDialog DataSource String[]",     //12
                    "NormalListDialog DataSource Adapter",      //13
                    "ActionSheetDialog",                        //14
                    "ActionSheetDialog NoTitle"                 //15
            },
            /**Custom Dialog*/
            {
                    "Custome Dialog extends BaseDialog", "Custome Dialog extends BottomBaseDialog", "Custome Dialog extends TopBaseDialog"
            },
            /**Default Inner Animation*/
            {
                    "Show Anim", "Dismiss Anim"
            },
            /**Custom Anim*/
            {
                    "Custom Anim like ios taobao"
            }
    };


    private BaseAnimatorSet base_in;
    private BaseAnimatorSet base_out;
    private ExpandableListView elv;


    public BaseAnimatorSet getBase_in() {
        return base_in;
    }

    public void setBase_in(BaseAnimatorSet base_in) {
        this.base_in = base_in;
    }

    public BaseAnimatorSet getBase_out() {
        return base_out;
    }

    public void setBase_out(BaseAnimatorSet base_out) {
        this.base_out = base_out;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        //hello
        HomeAdapter homeAdapter=new HomeAdapter(this,groups,childs);
        elv.setAdapter(homeAdapter);
        elv.setOnChildClickListener(myChildClickLisenter);


    }

    public ExpandableListView.OnChildClickListener myChildClickLisenter=new ExpandableListView.OnChildClickListener() {
        @Override
        public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
            DialogList dialogList=new DialogList();
            if(groupPosition==0){
                switch (childPosition){
                    case 0:
                        dialogList.normalDialogStyleOne(MainActivity.this,base_in,base_out);
                        break;
                    case 1:
                        dialogList.normalDialogStyleTwo(MainActivity.this,base_in,base_out);
                        break;
                    case 2:
                        dialogList.normalDialogThemeBlack(MainActivity.this,base_in,base_out);
                        break;
                    case 3:
                        dialogList.normalDialogOneBtn(MainActivity.this,base_in,base_out);
                        break;
                    case 4:
                        dialogList.NormalDialoThreeBtn(MainActivity.this,base_in,base_out);
                        break;
                    case 5:
                        dialogList.MaterialDialogDefault(MainActivity.this,base_in,base_out);
                        break;
                    case 6:
                        dialogList.MaterialDialogOneBtn(MainActivity.this,base_in,base_out);
                        break;
                    case 7:
                        dialogList.MaterialDialogThreeBtns(MainActivity.this,base_in,base_out);
                        break;
                    case 8:
                        dialogList.normalListDialog(MainActivity.this,base_in,base_out);
                        break;
                    case 9:
                        dialogList.normalListDialogCustomAttr(MainActivity.this);
                        break;
                    case 10:
                        dialogList.normalListDialogNoTitle(MainActivity.this);
                        break;
                    case 11:
                        dialogList.NormalListDialogStringArr(MainActivity.this);
                        break;
                    case 12:
                        dialogList.NormalListDialogAdapter(MainActivity.this);
                        break;
                    case 13:
                        dialogList.ActionSheetDialog(MainActivity.this);
                        break;
                    case 14:
                        dialogList.ActionSheetDialogNoTitle(MainActivity.this,elv);
                        break;

                }

            }else if(groupPosition==1){
                switch (childPosition)
                {
                    case 0:
                        CustomBaseDialog dialog=new CustomBaseDialog(MainActivity.this);
                        dialog.show();
                        break;
                    case 1:
                        ShareBottomDialog dialog1=new ShareBottomDialog(MainActivity.this);
                        dialog1.show();
                        break;
                    case 2:
                        ShareTopDialog dialog2=new ShareTopDialog(MainActivity.this);
                        dialog2.show();
                        break;
                }

            }else if (groupPosition==2){

                switch (childPosition){
                    case 0:
                        DiaogAnimChoose.showAnim(MainActivity.this);
                        break;
                    case 1:
                        DiaogAnimChoose.dissmissAnim(MainActivity.this);
                        break;
                }

            }else if(groupPosition==3){
                switch (childPosition){
                    case 0:
                        IOSTaoBaoDialog dialog=new IOSTaoBaoDialog(MainActivity.this);
                        dialog.show();
                        break;
                }
            }


            return false;
        }
    };


    public void init() {
        elv = (ExpandableListView) findViewById(R.id.elv);
        base_in = new BounceTopEnter();
        base_out = new SlideBottomExit();
    }
}
