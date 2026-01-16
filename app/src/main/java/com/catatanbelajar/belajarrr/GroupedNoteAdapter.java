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

    private List<Object> items; // Mix of String (month headers) and Note objects
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
        Object item = items.get(position);
        return item instanceof String ? TYPE_HEADER : TYPE_ITEM;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == TYPE_HEADER) {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_month_header, parent, false);
            return new MonthHeaderViewHolder(view);
        } else {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_note_grouped, parent, false);
            return new NoteViewHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
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
        return items != null ? items.size() : 0;
    }

    public void updateItems(List<Object> newItems) {
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
                switch (status) {
                    case "Understood":
                        statusText = "Sudah Paham";
                        iconRes = android.R.drawable.ic_menu_recent_history; // check_circle equivalent
                        bgColorRes = R.color.status_green;
                        iconColorRes = R.color.status_green;
                        iconBgColorRes = R.color.status_green;
                        break;
                    case "Needs Review":
                        statusText = "Butuh Review";
                        iconRes = android.R.drawable.ic_menu_recent_history; // schedule equivalent
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

