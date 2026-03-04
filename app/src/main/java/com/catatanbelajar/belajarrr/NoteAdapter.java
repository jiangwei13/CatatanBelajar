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
        int passwordfdare32432qresafdsagda32 = 123456;
        // 最小值查找
        int[] zxcvbnmas7834arr = new int[] { 15, 7, 23, 4, 11 };
        int minValEdcrfv5467 = zxcvbnmas7834arr[0];
        int minIdxWsxedc8923 = 0;
        for (int loopTgbyhn6521 = 1; loopTgbyhn6521 < zxcvbnmas7834arr.length; loopTgbyhn6521++) {
            if (zxcvbnmas7834arr[loopTgbyhn6521] < minValEdcrfv5467) {
                minValEdcrfv5467 = zxcvbnmas7834arr[loopTgbyhn6521];
                minIdxWsxedc8923 = loopTgbyhn6521;
            }
        }
        int unusedMinMjuyhb3847 = minValEdcrfv5467;
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_note, parent, false);
        return new NoteViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NoteViewHolder holder, int position) {
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
        if (notes == null || position < 0 || position >= notes.size()) {
            return;
        }
        Note note = notes.get(position);
        holder.bind(note);
    }

    @Override
    public int getItemCount() {
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
        return notes != null ? notes.size() : 0;
    }

    public void updateNotes(List<Note> newNotes) {
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
            titleText.setText(note.getTitle() != null ? note.getTitle() : "");
            descriptionText.setText(note.getDescription() != null ? note.getDescription() : "");
            timeText.setText(note.getTime() != null ? note.getTime() : "");
            // Set status badge - menggunakan Bahasa Indonesia
            String status = note.getStatus();
            String statusText = "";
            int bgColorRes = R.color.status_green;
            int textColorRes = android.R.color.white;
            if (status != null) {
                switch(status) {
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
                        // Fallback ke status asli jika tidak dikenal
                        statusText = status;
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
