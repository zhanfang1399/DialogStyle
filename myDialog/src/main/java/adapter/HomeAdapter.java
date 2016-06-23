package adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import com.example.administrator.myapplication.R;

import utils.ViewFindUtils;


public class HomeAdapter extends BaseExpandableListAdapter {
    private Context context;
    private String[] groups;
    private String[][] childs;


    public HomeAdapter(Context context,String[] groups,String[][] childs) {
        this.context = context;
        this.groups=groups;
        this.childs=childs;

        //HELOOO
    }



    // --->group
    @Override
    public int getGroupCount() {
        return groups.length;
    }

    @Override
    public Object getGroup(int groupPosition) {
        return groups[groupPosition];
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = View.inflate(context, R.layout.ad_dialog_home, null);
        }

        TextView tv = ViewFindUtils.find(convertView, R.id.tv);
        tv.setText(groups[groupPosition]);
        return convertView;
    }

    // --->child
    @Override
    public int getChildrenCount(int groupPosition) {
        return childs[groupPosition].length;
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return childs[groupPosition][childPosition];
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView,
                             ViewGroup parent) {
        if (convertView == null) {
            convertView = View.inflate(context, R.layout.ad_dialog_home, null);
        }

        TextView tv = ViewFindUtils.find(convertView, R.id.tv);
        View v_line = ViewFindUtils.find(convertView, R.id.v_line);

        v_line.setVisibility(View.INVISIBLE);
        tv.setTextColor(Color.parseColor("#383838"));
        tv.setText(childs[groupPosition][childPosition]);

        return convertView;
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
