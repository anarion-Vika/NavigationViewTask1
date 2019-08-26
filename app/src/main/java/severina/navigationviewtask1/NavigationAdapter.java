package severina.navigationviewtask1;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NavigationAdapter extends RecyclerView.Adapter<NavigationAdapter.ViewHolder> {

    Context context;
    ArrayList<NavigationMenuModel> arrayList = new ArrayList<>();

    public NavigationAdapter(Context context, ArrayList<NavigationMenuModel> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.menu_model, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.bind(arrayList.get(i));
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView navIcon;
        TextView navTitle;
        LinearLayout rootView;

        public ViewHolder(View itemView) {
            super(itemView);
            //    rootView = itemView.findViewById(R.id.rootView);
            navIcon = itemView.findViewById(R.id.ivIcon);
            navTitle = itemView.findViewById(R.id.tvTitle);
        }

        public void bind(NavigationMenuModel item) {
            navIcon.setImageResource(item.getIcon());
            navTitle.setText(item.getText());
        }
    }

}
