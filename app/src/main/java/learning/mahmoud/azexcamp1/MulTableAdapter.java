package learning.mahmoud.azexcamp1;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class MulTableAdapter extends RecyclerView.Adapter<MulTableAdapter.Holder> {

    private static final String TAG = "MulTableAdapter";
    int mulNum;
    final int SIZE = 50 ; // count of items as MulTable from 1-10
    String numString ;

    public MulTableAdapter(int num) {
        mulNum = num;
        numString = String.valueOf(num);
    }

    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mul_item, viewGroup, false);
        Holder holder = new Holder(view);
        Log.d(TAG, "onCreateViewHolder: ");
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int i) {
        String res = String.valueOf((i + 1) * mulNum);
        holder.tvMulNum.setText(numString);
        holder.tvMulIteration.setText(String.valueOf(i + 1));
        holder.tvMulResult.setText(res);

        Log.d(TAG, "onBindViewHolder: " + i );
    }

    @Override
    public int getItemCount() {
        return SIZE;
    }

    class Holder extends RecyclerView.ViewHolder {

        TextView tvMulNum ;
        TextView tvMulIteration ;
        TextView tvMulResult ;

        public Holder(@NonNull View itemView) {
            super(itemView);

            tvMulNum = itemView.findViewById(R.id.tvMulNum);
            tvMulIteration = itemView.findViewById(R.id.tvMulIteration);
            tvMulResult = itemView.findViewById(R.id.tvMulResult);
        }
    }

}