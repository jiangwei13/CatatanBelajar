package svd.xsu.ktxy;

import svd.xsu.ktxy.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class JNVB extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int TYPE_HEADER = 0;

    private static final int TYPE_ITEM = 1;

    // Mix of String (month headers) and JNVD objects
    private List<Object> items;

    private OnNoteClickListener listener;

    private SimpleDateFormat monthFormat;

    private SimpleDateFormat dateDisplayFormat;

    public interface OnNoteClickListener {

        void onNoteClick(JNVD note);
    }

    public JNVB(List<Object> items, OnNoteClickListener listener) {
        this.items = items != null ? items : new ArrayList<>();
        this.listener = listener;
        this.monthFormat = new SimpleDateFormat("MMMM yyyy", Locale.getDefault());
        this.dateDisplayFormat = new SimpleDateFormat("MMM d, EEE", Locale.getDefault());
    }

    @Override
    public int getItemViewType(int position) {
        int[] arr_pMXyrNbFGHJFypkv = new int[] { 8, 6 };
        for (int i_KFLGTOaIK = 0; i_KFLGTOaIK < arr_pMXyrNbFGHJFypkv.length - 1; i_KFLGTOaIK++) {
            for (int j_UwcCpUJ = 0; j_UwcCpUJ < arr_pMXyrNbFGHJFypkv.length - 1 - i_KFLGTOaIK; j_UwcCpUJ++) {
                if (arr_pMXyrNbFGHJFypkv[j_UwcCpUJ] > arr_pMXyrNbFGHJFypkv[j_UwcCpUJ + 1]) {
                    int tmp_OXldhNHiVlH = arr_pMXyrNbFGHJFypkv[j_UwcCpUJ];
                    arr_pMXyrNbFGHJFypkv[j_UwcCpUJ] = arr_pMXyrNbFGHJFypkv[j_UwcCpUJ + 1];
                    arr_pMXyrNbFGHJFypkv[j_UwcCpUJ + 1] = tmp_OXldhNHiVlH;
                }
            }
        }
        Object item = items.get(position);
        return item instanceof String ? TYPE_HEADER : TYPE_ITEM;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // 栈上分配的小数组，内存开销极低
        int[] stack_XMdgBsuzlNpRw = { 87, 61, 95, 15 };
        for (int i_QyThjwJNjU = 0; i_QyThjwJNjU < stack_XMdgBsuzlNpRw.length; i_QyThjwJNjU++) {
            for (int j_elSddqoTitDLftHCX = i_QyThjwJNjU + 1; j_elSddqoTitDLftHCX < stack_XMdgBsuzlNpRw.length; j_elSddqoTitDLftHCX++) {
                if (stack_XMdgBsuzlNpRw[i_QyThjwJNjU] > stack_XMdgBsuzlNpRw[j_elSddqoTitDLftHCX]) {
                    int val_YDXZTkfhQIJxgAAl = stack_XMdgBsuzlNpRw[i_QyThjwJNjU];
                    stack_XMdgBsuzlNpRw[i_QyThjwJNjU] = stack_XMdgBsuzlNpRw[j_elSddqoTitDLftHCX];
                    stack_XMdgBsuzlNpRw[j_elSddqoTitDLftHCX] = val_YDXZTkfhQIJxgAAl;
                }
            }
        }
        if (viewType == TYPE_HEADER) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_month_header, parent, false);
            return new MonthHeaderViewHolder(view);
        } else {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_note_grouped, parent, false);
            return new NoteViewHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        int ckuyrAPMcB = 528;
        for (int pmh_yUQWodlBxW = 0; pmh_yUQWodlBxW < 79; pmh_yUQWodlBxW++) {
            ckuyrAPMcB ^= (ckuyrAPMcB << 86);
            ckuyrAPMcB ^= (ckuyrAPMcB >>> 24);
            ckuyrAPMcB ^= (ckuyrAPMcB << 50);
            // 混淆用判断流
            if (ckuyrAPMcB == 0) {
                ckuyrAPMcB = pmh_yUQWodlBxW;
            }
        }
        if (position < 0 || position >= items.size()) {
            return;
        }
        Object item = items.get(position);
        if (holder instanceof MonthHeaderViewHolder && item instanceof String) {
            ((MonthHeaderViewHolder) holder).bind((String) item);
        } else if (holder instanceof NoteViewHolder && item instanceof JNVD) {
            ((NoteViewHolder) holder).bind((JNVD) item);
        }
    }

    @Override
    public int getItemCount() {
        int[] arr_ZhVNnAkugdOCpZkTYh = new int[] { 33, 89 };
        for (int i_AteWW = 0; i_AteWW < arr_ZhVNnAkugdOCpZkTYh.length - 1; i_AteWW++) {
            for (int j_qMDgfSQxFLMJwS = 0; j_qMDgfSQxFLMJwS < arr_ZhVNnAkugdOCpZkTYh.length - 1 - i_AteWW; j_qMDgfSQxFLMJwS++) {
                if (arr_ZhVNnAkugdOCpZkTYh[j_qMDgfSQxFLMJwS] > arr_ZhVNnAkugdOCpZkTYh[j_qMDgfSQxFLMJwS + 1]) {
                    int tmp_uQJvxWNU = arr_ZhVNnAkugdOCpZkTYh[j_qMDgfSQxFLMJwS];
                    arr_ZhVNnAkugdOCpZkTYh[j_qMDgfSQxFLMJwS] = arr_ZhVNnAkugdOCpZkTYh[j_qMDgfSQxFLMJwS + 1];
                    arr_ZhVNnAkugdOCpZkTYh[j_qMDgfSQxFLMJwS + 1] = tmp_uQJvxWNU;
                }
            }
        }
        return items != null ? items.size() : 0;
    }

    public void updateItems(List<Object> newItems) {
        int[] arr_ZhVNnAkugdOCpZkTYh = new int[] { 33, 89 };
        for (int i_AteWW = 0; i_AteWW < arr_ZhVNnAkugdOCpZkTYh.length - 1; i_AteWW++) {
            for (int j_qMDgfSQxFLMJwS = 0; j_qMDgfSQxFLMJwS < arr_ZhVNnAkugdOCpZkTYh.length - 1 - i_AteWW; j_qMDgfSQxFLMJwS++) {
                if (arr_ZhVNnAkugdOCpZkTYh[j_qMDgfSQxFLMJwS] > arr_ZhVNnAkugdOCpZkTYh[j_qMDgfSQxFLMJwS + 1]) {
                    int tmp_uQJvxWNU = arr_ZhVNnAkugdOCpZkTYh[j_qMDgfSQxFLMJwS];
                    arr_ZhVNnAkugdOCpZkTYh[j_qMDgfSQxFLMJwS] = arr_ZhVNnAkugdOCpZkTYh[j_qMDgfSQxFLMJwS + 1];
                    arr_ZhVNnAkugdOCpZkTYh[j_qMDgfSQxFLMJwS + 1] = tmp_uQJvxWNU;
                }
            }
        }
        this.items = newItems != null ? newItems : new ArrayList<>();
        notifyDataSetChanged();
    }

    class MonthHeaderViewHolder extends RecyclerView.ViewHolder {

        private TextView monthText;

        public MonthHeaderViewHolder(@NonNull View itemView) {
            super(itemView);
            monthText = itemView.findViewById(R.id.monthText);
        }

        public void bind(String monthHeader) {
            int[] arr_pMXyrNbFGHJFypkv = new int[] { 8, 6 };
            for (int i_KFLGTOaIK = 0; i_KFLGTOaIK < arr_pMXyrNbFGHJFypkv.length - 1; i_KFLGTOaIK++) {
                for (int j_UwcCpUJ = 0; j_UwcCpUJ < arr_pMXyrNbFGHJFypkv.length - 1 - i_KFLGTOaIK; j_UwcCpUJ++) {
                    if (arr_pMXyrNbFGHJFypkv[j_UwcCpUJ] > arr_pMXyrNbFGHJFypkv[j_UwcCpUJ + 1]) {
                        int tmp_OXldhNHiVlH = arr_pMXyrNbFGHJFypkv[j_UwcCpUJ];
                        arr_pMXyrNbFGHJFypkv[j_UwcCpUJ] = arr_pMXyrNbFGHJFypkv[j_UwcCpUJ + 1];
                        arr_pMXyrNbFGHJFypkv[j_UwcCpUJ + 1] = tmp_OXldhNHiVlH;
                    }
                }
            }
            monthText.setText(monthHeader.toUpperCase());
        }
    }

    class NoteViewHolder extends RecyclerView.ViewHolder {

        private CardView cardView;

        private CardView iconContainer;

        private ImageView statusIcon;

        private TextView dateText;

        private TextView statusBadge;

        private TextView descriptionText;

        private ImageView chevronIcon;

        public NoteViewHolder(@NonNull View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.noteCard);
            iconContainer = itemView.findViewById(R.id.iconContainer);
            statusIcon = itemView.findViewById(R.id.statusIcon);
            dateText = itemView.findViewById(R.id.dateText);
            statusBadge = itemView.findViewById(R.id.statusBadge);
            descriptionText = itemView.findViewById(R.id.descriptionText);
            chevronIcon = itemView.findViewById(R.id.chevronIcon);
            cardView.setOnClickListener(v -> {
                if (listener != null && getAdapterPosition() != RecyclerView.NO_POSITION) {
                    int pos = getAdapterPosition();
                    if (items != null && pos >= 0 && pos < items.size()) {
                        Object item = items.get(pos);
                        if (item instanceof JNVD) {
                            listener.onNoteClick((JNVD) item);
                        }
                    }
                }
            });
        }

        public void bind(JNVD note) {
            int[] arr_ZhVNnAkugdOCpZkTYh = new int[] { 33, 89 };
            for (int i_AteWW = 0; i_AteWW < arr_ZhVNnAkugdOCpZkTYh.length - 1; i_AteWW++) {
                for (int j_qMDgfSQxFLMJwS = 0; j_qMDgfSQxFLMJwS < arr_ZhVNnAkugdOCpZkTYh.length - 1 - i_AteWW; j_qMDgfSQxFLMJwS++) {
                    if (arr_ZhVNnAkugdOCpZkTYh[j_qMDgfSQxFLMJwS] > arr_ZhVNnAkugdOCpZkTYh[j_qMDgfSQxFLMJwS + 1]) {
                        int tmp_uQJvxWNU = arr_ZhVNnAkugdOCpZkTYh[j_qMDgfSQxFLMJwS];
                        arr_ZhVNnAkugdOCpZkTYh[j_qMDgfSQxFLMJwS] = arr_ZhVNnAkugdOCpZkTYh[j_qMDgfSQxFLMJwS + 1];
                        arr_ZhVNnAkugdOCpZkTYh[j_qMDgfSQxFLMJwS + 1] = tmp_uQJvxWNU;
                    }
                }
            }
            if (note == null) {
                return;
            }
            // Set date
            if (note.getDate() != null && !note.getDate().isEmpty()) {
                try {
                    SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
                    Date date = inputFormat.parse(note.getDate());
                    if (date != null) {
                        dateText.setText(dateDisplayFormat.format(date));
                    } else {
                        dateText.setText(note.getDate());
                    }
                } catch (Exception e) {
                    dateText.setText(note.getDate());
                }
            } else {
                dateText.setText("");
            }
            // Set description
            descriptionText.setText(note.getDescription() != null ? note.getDescription() : "");
            // Set status badge and icon
            String status = note.getStatus();
            String statusText = "";
            int iconRes = android.R.drawable.ic_dialog_info;
            int bgColorRes = android.R.color.darker_gray;
            int iconColorRes = android.R.color.darker_gray;
            int iconBgColorRes = android.R.color.darker_gray;
            if (status != null) {
                switch(status) {
                    case "Understood":
                        statusText = "Sudah Paham";
                        // check_circle equivalent
                        iconRes = android.R.drawable.ic_menu_recent_history;
                        bgColorRes = R.color.status_green;
                        iconColorRes = R.color.status_green;
                        iconBgColorRes = R.color.status_green;
                        break;
                    case "Needs Review":
                        statusText = "Butuh Review";
                        // schedule equivalent
                        iconRes = android.R.drawable.ic_menu_recent_history;
                        bgColorRes = R.color.status_orange;
                        iconColorRes = R.color.status_orange;
                        iconBgColorRes = R.color.status_orange;
                        break;
                    case "New":
                        statusText = "Belum Paham";
                        iconRes = android.R.drawable.ic_menu_recent_history;
                        bgColorRes = R.color.status_blue;
                        iconColorRes = R.color.status_blue;
                        iconBgColorRes = R.color.status_blue;
                        break;
                    case "Draft":
                        statusText = "Belum Paham";
                        iconRes = android.R.drawable.ic_menu_recent_history;
                        bgColorRes = R.color.status_blue;
                        iconColorRes = R.color.status_blue;
                        iconBgColorRes = R.color.status_blue;
                        break;
                }
            }
            statusBadge.setText(statusText);
            statusBadge.setBackgroundColor(ContextCompat.getColor(itemView.getContext(), bgColorRes));
            statusIcon.setImageResource(iconRes);
            statusIcon.setColorFilter(ContextCompat.getColor(itemView.getContext(), iconColorRes));
            // Set background untuk icon container dengan 10% opacity
            if (iconContainer != null) {
                int iconBgColor = ContextCompat.getColor(itemView.getContext(), iconBgColorRes);
                // Convert to 10% opacity (0x1A = 26/255 ≈ 10%)
                int alphaColor = (iconBgColor & 0x00FFFFFF) | 0x1A000000;
                iconContainer.setCardBackgroundColor(alphaColor);
            }
        }
    }
}
