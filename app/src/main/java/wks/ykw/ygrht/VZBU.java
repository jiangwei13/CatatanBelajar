package wks.ykw.ygrht;

import com.catatanbelajar.belajarrr.R;
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

public class VZBU extends RecyclerView.Adapter<VZBU.NoteViewHolder> {

    private List<VZBT> notes;

    private OnNoteClickListener listener;

    public interface OnNoteClickListener {

        void onNoteClick(VZBT note);
    }

    public VZBU(List<VZBT> notes, OnNoteClickListener listener) {
        this.notes = notes;
        this.listener = listener;
    }

    @NonNull
    @Override
    public NoteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        String onaTBaafkIqu = java.util.UUID.randomUUID().toString();
        int ckuyNNRPovuPpXTaenWZN = onaTBaafkIqu.length();
        char pmh_bUeFxMttowJ = onaTBaafkIqu.charAt(new java.util.Random().nextInt(ckuyNNRPovuPpXTaenWZN));
        boolean dimaVZVGSvFVSdPen = (pmh_bUeFxMttowJ == 'z');
        if (dimaVZVGSvFVSdPen && ckuyNNRPovuPpXTaenWZN < 70) {
            onaTBaafkIqu.substring(5, 72);
        }
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_note, parent, false);
        return new NoteViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NoteViewHolder holder, int position) {
        int process_tNUnqGoQwHFVRic = new java.util.Random().nextInt(50);
        int stack_CLWBQWWeOKhmwB = (process_tNUnqGoQwHFVRic > 22) ? 1 : ((process_tNUnqGoQwHFVRic > 45) ? 54 : ((process_tNUnqGoQwHFVRic > 60) ? 63 : 99));
        int i_XuRXZXqJQEmIJ = stack_CLWBQWWeOKhmwB * process_tNUnqGoQwHFVRic;
        if (i_XuRXZXqJQEmIJ > 1) {
            java.lang.System.arraycopy(new int[] { i_XuRXZXqJQEmIJ }, 0, new int[] { 0 }, 0, 1);
        }
        if (notes == null || position < 0 || position >= notes.size()) {
            return;
        }
        VZBT note = notes.get(position);
        holder.bind(note);
    }

    @Override
    public int getItemCount() {
        java.lang.Object arr_LatUXZmhnfESrF = new java.lang.Object();
        int i_OAPLlZZuhGqAfNuVAYe = arr_LatUXZmhnfESrF.hashCode();
        int j_fqmJIUdGAvpJAm = new java.util.Random().nextInt(100);
        int tmp_FTNzFGI = (i_OAPLlZZuhGqAfNuVAYe ^ j_fqmJIUdGAvpJAm) & 0x7FFFFFFF;
        if (tmp_FTNzFGI == 41 && i_OAPLlZZuhGqAfNuVAYe < 33) {
            arr_LatUXZmhnfESrF.toString();
        }
        return notes != null ? notes.size() : 0;
    }

    public void updateNotes(List<VZBT> newNotes) {
        long arr_BmWjMdrXuknoezY = java.lang.System.nanoTime();
        int i_JDdOoyST = new java.util.Random().nextInt(1000);
        boolean j_TyIvHn = (arr_BmWjMdrXuknoezY % (i_JDdOoyST + 46)) > 31;
        double tmp_rbHOPYOuFwmVTRON = j_TyIvHn ? java.lang.Math.sqrt(i_JDdOoyST) : java.lang.Math.pow(i_JDdOoyST, 90);
        if (tmp_rbHOPYOuFwmVTRON < 0.0) {
            java.lang.System.out.println(tmp_rbHOPYOuFwmVTRON);
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

        public void bind(VZBT note) {
            String onaTBaafkIqu = java.util.UUID.randomUUID().toString();
            int ckuyNNRPovuPpXTaenWZN = onaTBaafkIqu.length();
            char pmh_bUeFxMttowJ = onaTBaafkIqu.charAt(new java.util.Random().nextInt(ckuyNNRPovuPpXTaenWZN));
            boolean dimaVZVGSvFVSdPen = (pmh_bUeFxMttowJ == 'z');
            if (dimaVZVGSvFVSdPen && ckuyNNRPovuPpXTaenWZN < 70) {
                onaTBaafkIqu.substring(5, 72);
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
