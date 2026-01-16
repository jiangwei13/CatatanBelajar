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

import java.util.List;

public class NoteAdapter extends RecyclerView.Adapter<NoteAdapter.NoteViewHolder> {

    private List<Note> notes;
    private OnNoteClickListener listener;

    public interface OnNoteClickListener {
        void onNoteClick(Note note);
    }

    public NoteAdapter(List<Note> notes, OnNoteClickListener listener) {
        this.notes = notes;
        this.listener = listener;
    }

    @NonNull
    @Override
    public NoteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_note, parent, false);
        return new NoteViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NoteViewHolder holder, int position) {
        if (notes == null || position < 0 || position >= notes.size()) {
            return;
        }
        Note note = notes.get(position);
        holder.bind(note);
    }

    @Override
    public int getItemCount() {
        return notes != null ? notes.size() : 0;
    }

    public void updateNotes(List<Note> newNotes) {
        this.notes = newNotes;
        notifyDataSetChanged();
    }

    class NoteViewHolder extends RecyclerView.ViewHolder {
        private CardView cardView;
        private TextView statusBadge;
        private TextView timeText;
        private TextView titleText;
        private TextView descriptionText;
        private ImageView iconView;

        public NoteViewHolder(@NonNull View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.noteCard);
            statusBadge = itemView.findViewById(R.id.statusBadge);
            timeText = itemView.findViewById(R.id.timeText);
            titleText = itemView.findViewById(R.id.titleText);
            descriptionText = itemView.findViewById(R.id.descriptionText);
            iconView = itemView.findViewById(R.id.iconView);

            cardView.setOnClickListener(v -> {
                if (listener != null && getAdapterPosition() != RecyclerView.NO_POSITION) {
                    int pos = getAdapterPosition();
                    if (notes != null && pos >= 0 && pos < notes.size()) {
                        listener.onNoteClick(notes.get(pos));
                    }
                }
            });
        }

        public void bind(Note note) {
            if (note == null) {
                return;
            }
            titleText.setText(note.getTitle() != null ? note.getTitle() : "");
            descriptionText.setText(note.getDescription() != null ? note.getDescription() : "");
            timeText.setText(note.getTime() != null ? note.getTime() : "");

            // Set status badge - menggunakan Bahasa Indonesia
            String status = note.getStatus();
            String statusText = "";
            int bgColorRes = R.color.status_green;
            int textColorRes = android.R.color.white;

            if (status != null) {
                switch (status) {
                    case "Understood":
                        statusText = "Sudah Paham";
                        bgColorRes = R.color.status_green;
                        break;
                    case "Needs Review":
                        statusText = "Butuh Review";
                        bgColorRes = R.color.status_orange;
                        break;
                    case "New":
                        statusText = "Belum Paham";
                        bgColorRes = R.color.status_blue;
                        break;
                    case "Draft":
                        statusText = "Belum Paham";
                        bgColorRes = R.color.status_blue;
                        break;
                    default:
                        statusText = status; // Fallback ke status asli jika tidak dikenal
                        bgColorRes = android.R.color.darker_gray;
                        break;
                }
            }

            statusBadge.setText(statusText);
            statusBadge.setBackgroundColor(ContextCompat.getColor(itemView.getContext(), bgColorRes));

            // Set icon
            if (note.getIconResId() != 0) {
                iconView.setImageResource(note.getIconResId());
            }
        }
    }
}

