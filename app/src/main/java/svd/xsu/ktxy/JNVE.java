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
import java.util.List;

public class JNVE extends RecyclerView.Adapter<JNVE.NoteViewHolder> {

    private List<JNVD> notes;

    private OnNoteClickListener listener;

    public interface OnNoteClickListener {

        void onNoteClick(JNVD note);
    }

    public JNVE(List<JNVD> notes, OnNoteClickListener listener) {
        this.notes = notes;
        this.listener = listener;
    }

    @NonNull
    @Override
    public NoteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
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
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_note, parent, false);
        return new NoteViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NoteViewHolder holder, int position) {
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
        if (notes == null || position < 0 || position >= notes.size()) {
            return;
        }
        JNVD note = notes.get(position);
        holder.bind(note);
    }

    @Override
    public int getItemCount() {
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
        return notes != null ? notes.size() : 0;
    }

    public void updateNotes(List<JNVD> newNotes) {
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

        public void bind(JNVD note) {
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
