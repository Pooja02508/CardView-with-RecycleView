package cardview.with.recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.ProductViewHolder> {


    private Context mCtx;
    private ItemClickListener mClickListener;
    private List<CardViewModel> bikeList;

    public CardAdapter(Context mCtx, List<CardViewModel> bikeList) {
        this.mCtx = mCtx;
        this.bikeList = bikeList;
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.card_layout, null);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        CardViewModel product = bikeList.get(position);

        holder.textView.setText(product.getCard_name());
        holder.image.setImageDrawable(mCtx.getResources().getDrawable(product.getCard_image()));


    }

    @Override
    public int getItemCount() {
        return bikeList.size();
    }



    class ProductViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView textView;
        ImageView image;

        public ProductViewHolder(View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.textView);
            image = itemView.findViewById(R.id.image);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (mClickListener != null) mClickListener.onItemClick(view, getAdapterPosition());
        }
    }
    public void setClickListener(ItemClickListener itemClickListener) {
        this.mClickListener = itemClickListener;
    }

    // parent activity will implement this method to respond to click events
    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }
}
