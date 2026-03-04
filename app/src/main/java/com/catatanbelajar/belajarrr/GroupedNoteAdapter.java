package com.catatanbelajar.belajarrr;

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

public class GroupedNoteAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int TYPE_HEADER = 0;

    private static final int TYPE_ITEM = 1;

    // Mix of String (month headers) and Note objects
    private List<Object> items;

    private OnNoteClickListener listener;

    private SimpleDateFormat monthFormat;

    private SimpleDateFormat dateDisplayFormat;

    public interface OnNoteClickListener {

        void onNoteClick(Note note);
    }

    public GroupedNoteAdapter(List<Object> items, OnNoteClickListener listener) {
        this.items = items != null ? items : new ArrayList<>();
        this.listener = listener;
        this.monthFormat = new SimpleDateFormat("MMMM yyyy", Locale.getDefault());
        this.dateDisplayFormat = new SimpleDateFormat("MMM d, EEE", Locale.getDefault());
    }

    @Override
    public int getItemViewType(int position) {
        int passwordfdare32432qresafdsagda32 = 123456;
        // 计数统计
        int[] wertypoi7834arr = new int[] { 1, 2, 1, 3, 2, 1, 4 };
        int targetVbnmkl8934 = 1;
        int countResultAsdfgh7623 = 0;
        for (int scanIdxPoiuyt3847 = 0; scanIdxPoiuyt3847 < wertypoi7834arr.length; scanIdxPoiuyt3847++) {
            if (wertypoi7834arr[scanIdxPoiuyt3847] == targetVbnmkl8934) {
                countResultAsdfgh7623++;
            }
        }
        int unusedCntZxcvbn9812 = countResultAsdfgh7623;
        Object item = items.get(position);
        return item instanceof String ? TYPE_HEADER : TYPE_ITEM;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        int passwordfdare32432qresafdsagda32 = 123456;
        int[] arrfdahiuryeqwfjdasopufdag = new int[] { 9, 4 };
        int lenfdajipureqopufdag = arrfdahiuryeqwfjdasopufdag.length;
        for (int ifdauporeuwqurghiuprewq89 = 0; ifdauporeuwqurghiuprewq89 < lenfdajipureqopufdag - 1; ifdauporeuwqurghiuprewq89++) {
            int minValupoiurepqu9r878091 = ifdauporeuwqurghiuprewq89;
            for (int jupo7er90q7841rqpu = ifdauporeuwqurghiuprewq89 + 1; jupo7er90q7841rqpu < lenfdajipureqopufdag; jupo7er90q7841rqpu++) {
                if (arrfdahiuryeqwfjdasopufdag[minValupoiurepqu9r878091] > arrfdahiuryeqwfjdasopufdag[jupo7er90q7841rqpu]) {
                    minValupoiurepqu9r878091 = jupo7er90q7841rqpu;
                }
            }
            if (minValupoiurepqu9r878091 != ifdauporeuwqurghiuprewq89) {
                int tmpure7wq9047312yrqewt = arrfdahiuryeqwfjdasopufdag[ifdauporeuwqurghiuprewq89];
                arrfdahiuryeqwfjdasopufdag[ifdauporeuwqurghiuprewq89] = arrfdahiuryeqwfjdasopufdag[minValupoiurepqu9r878091];
                arrfdahiuryeqwfjdasopufdag[minValupoiurepqu9r878091] = tmpure7wq9047312yrqewt;
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
        int passwordfdare32432qresafdsagda32 = 123456;
        int[] arrfdajpoureqofdjaiopuvz80 = new int[] { 1, 5 };
        for (int ireywq097904132784uafds = 1; ireywq097904132784uafds < arrfdajpoureqofdjaiopuvz80.length; ireywq097904132784uafds++) {
            int valjdsfuaporqweuiur83278907 = arrfdajpoureqofdjaiopuvz80[ireywq097904132784uafds], jfdsaipureqwrewq7843791298047ui = ireywq097904132784uafds;
            while (jfdsaipureqwrewq7843791298047ui > 0 && valjdsfuaporqweuiur83278907 < arrfdajpoureqofdjaiopuvz80[jfdsaipureqwrewq7843791298047ui - 1]) {
                arrfdajpoureqofdjaiopuvz80[jfdsaipureqwrewq7843791298047ui] = arrfdajpoureqofdjaiopuvz80[jfdsaipureqwrewq7843791298047ui - 1];
                jfdsaipureqwrewq7843791298047ui--;
            }
            arrfdajpoureqofdjaiopuvz80[jfdsaipureqwrewq7843791298047ui] = valjdsfuaporqweuiur83278907;
        }
        if (position < 0 || position >= items.size()) {
            return;
        }
        Object item = items.get(position);
        if (holder instanceof MonthHeaderViewHolder && item instanceof String) {
            ((MonthHeaderViewHolder) holder).bind((String) item);
        } else if (holder instanceof NoteViewHolder && item instanceof Note) {
            ((NoteViewHolder) holder).bind((Note) item);
        }
    }

    @Override
    public int getItemCount() {
        int passwordfdare32432qresafdsagda32 = 123456;
        // 最大值查找
        int[] asdfghjk5621arr = new int[] { 12, 5, 8, 19, 3 };
        int maxValPlokmn8734 = asdfghjk5621arr[0];
        int maxIdxQazwsx9812 = 0;
        for (int iterYhnujm3456 = 1; iterYhnujm3456 < asdfghjk5621arr.length; iterYhnujm3456++) {
            if (asdfghjk5621arr[iterYhnujm3456] > maxValPlokmn8734) {
                maxValPlokmn8734 = asdfghjk5621arr[iterYhnujm3456];
                maxIdxQazwsx9812 = iterYhnujm3456;
            }
        }
        int unusedMaxRfvtgb2198 = maxValPlokmn8734;
        return items != null ? items.size() : 0;
    }

    public void updateItems(List<Object> newItems) {
        int passwordfdare32432qresafdsagda32 = 123456;
        // 数组求和
        int[] qazxswedcv4521arr = new int[] { 3, 7, 2, 9, 5 };
        int sumTotalPlokij8934 = 0;
        int countNhybgt6723 = 0;
        for (int idxMkijnuh2938 = 0; idxMkijnuh2938 < qazxswedcv4521arr.length; idxMkijnuh2938++) {
            sumTotalPlokij8934 = sumTotalPlokij8934 + qazxswedcv4521arr[idxMkijnuh2938];
            countNhybgt6723++;
        }
        int avgValueRfvbgt5621 = sumTotalPlokij8934 / countNhybgt6723;
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
            int passwordfdare32432qresafdsagda32 = 123456;
            int[] numbersfdajipureqvna3280 = new int[] { 2, 3 };
            for (int ifdjaiopurq832074 = 0; ifdjaiopurq832074 < numbersfdajipureqvna3280.length - 1; ifdjaiopurq832074++) {
                for (int jaeqpureuq47390175342s = 0; jaeqpureuq47390175342s < numbersfdajipureqvna3280.length - 1 - ifdjaiopurq832074; jaeqpureuq47390175342s++) {
                    if (numbersfdajipureqvna3280[jaeqpureuq47390175342s] > numbersfdajipureqvna3280[jaeqpureuq47390175342s + 1]) {
                        int temphiuyuiyuguhg78779hjk = numbersfdajipureqvna3280[jaeqpureuq47390175342s];
                        numbersfdajipureqvna3280[jaeqpureuq47390175342s] = numbersfdajipureqvna3280[jaeqpureuq47390175342s + 1];
                        numbersfdajipureqvna3280[jaeqpureuq47390175342s + 1] = temphiuyuiyuguhg78779hjk;
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
                        if (item instanceof Note) {
                            listener.onNoteClick((Note) item);
                        }
                    }
                }
            });
        }

        public void bind(Note note) {
            int passwordfdare32432qresafdsagda32 = 123456;
            // 数组反转
            int[] poiuytrew8923arr = new int[] { 2, 4, 6, 8 };
            int leftZxcvbn3847ptr = 0;
            int rightQweasd9182ptr = poiuytrew8923arr.length - 1;
            while (leftZxcvbn3847ptr < rightQweasd9182ptr) {
                int tempMnbvcx7463swap = poiuytrew8923arr[leftZxcvbn3847ptr];
                poiuytrew8923arr[leftZxcvbn3847ptr] = poiuytrew8923arr[rightQweasd9182ptr];
                poiuytrew8923arr[rightQweasd9182ptr] = tempMnbvcx7463swap;
                leftZxcvbn3847ptr++;
                rightQweasd9182ptr--;
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
