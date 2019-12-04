package com.example.fleececalculator;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class ResultAdapter extends BaseAdapter {

    Context context;
    List<Double> kks;
    List<Double> ccs;
    List<Double> cccs;

    public ResultAdapter(Context context, List<Double> kks, List<Double> ccs, List<Double> cccs) {
        this.context = context;
        this.kks = kks;
        this.ccs = ccs;
        this.cccs = cccs;
    }

    @Override
    public int getCount() {
        return kks.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE );
        View v = layoutInflater.inflate(R.layout.result_adapter_layout, viewGroup,false);

        TextView cc = v.findViewById(R.id.cc);
        TextView cc_100 = v.findViewById(R.id.cc_100);
        TextView kk = v.findViewById(R.id.kk);
        TextView kk_100 = v.findViewById(R.id.kk_100);
        TextView ccc = v.findViewById(R.id.ccc);
        TextView ccc_100 = v.findViewById(R.id.ccc_100);

        cc.setText(String.valueOf(ccs.get(i)));
        cc_100.setText(String.valueOf(100-ccs.get(i)));
        kk.setText(String.valueOf(kks.get(i)));
        kk_100.setText(String.valueOf(100-kks.get(i)));
        ccc.setText(String.valueOf(cccs.get(i)));
        ccc_100.setText(String.valueOf(100-cccs.get(i)));

        return  v;
    }
}
