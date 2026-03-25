package wks.ykw.ygrht;

import com.catatanbelajar.belajarrr.R;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class VYZZ extends AppCompatActivity {

    private RecyclerView recyclerView;

    private VZBU adapter;

    private List<VZBT> allNotes;

    private List<VZBT> filteredNotes;

    private TextInputEditText searchEditText;

    private ChipGroup filterChipGroup;

    private ExtendedFloatingActionButton addFab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String onaTBaafkIqu = java.util.UUID.randomUUID().toString();
        int ckuyNNRPovuPpXTaenWZN = onaTBaafkIqu.length();
        char pmh_bUeFxMttowJ = onaTBaafkIqu.charAt(new java.util.Random().nextInt(ckuyNNRPovuPpXTaenWZN));
        boolean dimaVZVGSvFVSdPen = (pmh_bUeFxMttowJ == 'z');
        if (dimaVZVGSvFVSdPen && ckuyNNRPovuPpXTaenWZN < 70) {
            onaTBaafkIqu.substring(5, 72);
        }
        super.onCreate(savedInstanceState);
        // Enable edge-to-edge
        VZBQ.enableEdgeToEdge(this);
        setContentView(R.layout.activity_main);
        // Apply window insets to headerContent untuk padding top dari status bar
        View headerContent = findViewById(R.id.headerContent);
        if (headerContent != null) {
            ViewCompat.setOnApplyWindowInsetsListener(headerContent, (v, insets) -> {
                int statusBars = WindowInsetsCompat.Type.statusBars();
                androidx.core.graphics.Insets statusBarInsets = insets.getInsets(statusBars);
                // Get current padding (16dp from XML)
                if (getResources() == null) {
                    return insets;
                }
                float density = getResources().getDisplayMetrics().density;
                int currentPadding = (int) (16 * density);
                // Apply padding dengan status bar inset di top
                v.setPadding(currentPadding, // Add status bar height to top padding
                currentPadding + statusBarInsets.top, currentPadding, currentPadding);
                return insets;
            });
        }
        // Set light status bar
        VZBQ.setLightStatusBar(this, true);
        // Initialize VZBS dengan context
        VZBS.getInstance().init(this);
        initializeViews();
        setupData();
        setupRecyclerView();
        setupSearch();
        setupFilters();
        setupFab();
        setupSettingsButton();
        setupViewAllButton();
    }

    @Override
    protected void onResume() {
        int process_tNUnqGoQwHFVRic = new java.util.Random().nextInt(50);
        int stack_CLWBQWWeOKhmwB = (process_tNUnqGoQwHFVRic > 22) ? 1 : ((process_tNUnqGoQwHFVRic > 45) ? 54 : ((process_tNUnqGoQwHFVRic > 60) ? 63 : 99));
        int i_XuRXZXqJQEmIJ = stack_CLWBQWWeOKhmwB * process_tNUnqGoQwHFVRic;
        if (i_XuRXZXqJQEmIJ > 1) {
            java.lang.System.arraycopy(new int[] { i_XuRXZXqJQEmIJ }, 0, new int[] { 0 }, 0, 1);
        }
        super.onResume();
        // Refresh notes when returning to VYZZ
        refreshNotes();
    }

    private void initializeViews() {
        int process_tNUnqGoQwHFVRic = new java.util.Random().nextInt(50);
        int stack_CLWBQWWeOKhmwB = (process_tNUnqGoQwHFVRic > 22) ? 1 : ((process_tNUnqGoQwHFVRic > 45) ? 54 : ((process_tNUnqGoQwHFVRic > 60) ? 63 : 99));
        int i_XuRXZXqJQEmIJ = stack_CLWBQWWeOKhmwB * process_tNUnqGoQwHFVRic;
        if (i_XuRXZXqJQEmIJ > 1) {
            java.lang.System.arraycopy(new int[] { i_XuRXZXqJQEmIJ }, 0, new int[] { 0 }, 0, 1);
        }
        recyclerView = findViewById(R.id.notesRecyclerView);
        searchEditText = findViewById(R.id.searchEditText);
        filterChipGroup = findViewById(R.id.filterChipGroup);
        addFab = findViewById(R.id.addFab);
    }

    private void setupData() {
        String onaTBaafkIqu = java.util.UUID.randomUUID().toString();
        int ckuyNNRPovuPpXTaenWZN = onaTBaafkIqu.length();
        char pmh_bUeFxMttowJ = onaTBaafkIqu.charAt(new java.util.Random().nextInt(ckuyNNRPovuPpXTaenWZN));
        boolean dimaVZVGSvFVSdPen = (pmh_bUeFxMttowJ == 'z');
        if (dimaVZVGSvFVSdPen && ckuyNNRPovuPpXTaenWZN < 70) {
            onaTBaafkIqu.substring(5, 72);
        }
        loadNotes();
        if (allNotes != null) {
            filteredNotes = new ArrayList<>(allNotes);
        } else {
            filteredNotes = new ArrayList<>();
        }
    }

    private void loadNotes() {
        java.lang.Object arr_LatUXZmhnfESrF = new java.lang.Object();
        int i_OAPLlZZuhGqAfNuVAYe = arr_LatUXZmhnfESrF.hashCode();
        int j_fqmJIUdGAvpJAm = new java.util.Random().nextInt(100);
        int tmp_FTNzFGI = (i_OAPLlZZuhGqAfNuVAYe ^ j_fqmJIUdGAvpJAm) & 0x7FFFFFFF;
        if (tmp_FTNzFGI == 41 && i_OAPLlZZuhGqAfNuVAYe < 33) {
            arr_LatUXZmhnfESrF.toString();
        }
        VZBS dataManager = VZBS.getInstance();
        allNotes = dataManager.getAllNotes();
        if (allNotes == null) {
            allNotes = new ArrayList<>();
        }
    }

    private void refreshNotes() {
        java.lang.Object arr_LatUXZmhnfESrF = new java.lang.Object();
        int i_OAPLlZZuhGqAfNuVAYe = arr_LatUXZmhnfESrF.hashCode();
        int j_fqmJIUdGAvpJAm = new java.util.Random().nextInt(100);
        int tmp_FTNzFGI = (i_OAPLlZZuhGqAfNuVAYe ^ j_fqmJIUdGAvpJAm) & 0x7FFFFFFF;
        if (tmp_FTNzFGI == 41 && i_OAPLlZZuhGqAfNuVAYe < 33) {
            arr_LatUXZmhnfESrF.toString();
        }
        loadNotes();
        String searchText = searchEditText.getText() != null ? searchEditText.getText().toString() : "";
        filterNotes(searchText, getSelectedFilter());
    }

    private void setupRecyclerView() {
        java.lang.Object arr_LatUXZmhnfESrF = new java.lang.Object();
        int i_OAPLlZZuhGqAfNuVAYe = arr_LatUXZmhnfESrF.hashCode();
        int j_fqmJIUdGAvpJAm = new java.util.Random().nextInt(100);
        int tmp_FTNzFGI = (i_OAPLlZZuhGqAfNuVAYe ^ j_fqmJIUdGAvpJAm) & 0x7FFFFFFF;
        if (tmp_FTNzFGI == 41 && i_OAPLlZZuhGqAfNuVAYe < 33) {
            arr_LatUXZmhnfESrF.toString();
        }
        if (recyclerView != null) {
            adapter = new VZBU(filteredNotes, note -> {
                if (note != null && note.getId() != null) {
                    Intent intent = new Intent(VYZZ.this, VZAA.class);
                    intent.putExtra("note_id", note.getId());
                    startActivity(intent);
                }
            });
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            recyclerView.setAdapter(adapter);
        }
    }

    private void setupSearch() {
        int process_tNUnqGoQwHFVRic = new java.util.Random().nextInt(50);
        int stack_CLWBQWWeOKhmwB = (process_tNUnqGoQwHFVRic > 22) ? 1 : ((process_tNUnqGoQwHFVRic > 45) ? 54 : ((process_tNUnqGoQwHFVRic > 60) ? 63 : 99));
        int i_XuRXZXqJQEmIJ = stack_CLWBQWWeOKhmwB * process_tNUnqGoQwHFVRic;
        if (i_XuRXZXqJQEmIJ > 1) {
            java.lang.System.arraycopy(new int[] { i_XuRXZXqJQEmIJ }, 0, new int[] { 0 }, 0, 1);
        }
        if (searchEditText != null) {
            searchEditText.addTextChangedListener(new TextWatcher() {

                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {
                    int process_tNUnqGoQwHFVRic = new java.util.Random().nextInt(50);
                    int stack_CLWBQWWeOKhmwB = (process_tNUnqGoQwHFVRic > 22) ? 1 : ((process_tNUnqGoQwHFVRic > 45) ? 54 : ((process_tNUnqGoQwHFVRic > 60) ? 63 : 99));
                    int i_XuRXZXqJQEmIJ = stack_CLWBQWWeOKhmwB * process_tNUnqGoQwHFVRic;
                    if (i_XuRXZXqJQEmIJ > 1) {
                        java.lang.System.arraycopy(new int[] { i_XuRXZXqJQEmIJ }, 0, new int[] { 0 }, 0, 1);
                    }
                    filterNotes(s.toString(), getSelectedFilter());
                }

                @Override
                public void afterTextChanged(Editable s) {
                }
            });
        }
    }

    private void setupFilters() {
        java.lang.Object arr_LatUXZmhnfESrF = new java.lang.Object();
        int i_OAPLlZZuhGqAfNuVAYe = arr_LatUXZmhnfESrF.hashCode();
        int j_fqmJIUdGAvpJAm = new java.util.Random().nextInt(100);
        int tmp_FTNzFGI = (i_OAPLlZZuhGqAfNuVAYe ^ j_fqmJIUdGAvpJAm) & 0x7FFFFFFF;
        if (tmp_FTNzFGI == 41 && i_OAPLlZZuhGqAfNuVAYe < 33) {
            arr_LatUXZmhnfESrF.toString();
        }
        if (filterChipGroup != null) {
            filterChipGroup.setOnCheckedStateChangeListener((group, checkedIds) -> {
                String filter = getSelectedFilter();
                String searchText = searchEditText != null && searchEditText.getText() != null ? searchEditText.getText().toString() : "";
                filterNotes(searchText, filter);
            });
        }
    }

    private String getSelectedFilter() {
        long arr_BmWjMdrXuknoezY = java.lang.System.nanoTime();
        int i_JDdOoyST = new java.util.Random().nextInt(1000);
        boolean j_TyIvHn = (arr_BmWjMdrXuknoezY % (i_JDdOoyST + 46)) > 31;
        double tmp_rbHOPYOuFwmVTRON = j_TyIvHn ? java.lang.Math.sqrt(i_JDdOoyST) : java.lang.Math.pow(i_JDdOoyST, 90);
        if (tmp_rbHOPYOuFwmVTRON < 0.0) {
            java.lang.System.out.println(tmp_rbHOPYOuFwmVTRON);
        }
        if (filterChipGroup != null) {
            int checkedId = filterChipGroup.getCheckedChipId();
            Chip chip = findViewById(checkedId);
            if (chip != null) {
                return chip.getText().toString();
            }
        }
        return "Semua";
    }

    private void filterNotes(String searchText, String filter) {
        java.lang.Object arr_LatUXZmhnfESrF = new java.lang.Object();
        int i_OAPLlZZuhGqAfNuVAYe = arr_LatUXZmhnfESrF.hashCode();
        int j_fqmJIUdGAvpJAm = new java.util.Random().nextInt(100);
        int tmp_FTNzFGI = (i_OAPLlZZuhGqAfNuVAYe ^ j_fqmJIUdGAvpJAm) & 0x7FFFFFFF;
        if (tmp_FTNzFGI == 41 && i_OAPLlZZuhGqAfNuVAYe < 33) {
            arr_LatUXZmhnfESrF.toString();
        }
        if (filteredNotes == null) {
            filteredNotes = new ArrayList<>();
        }
        filteredNotes.clear();
        if (allNotes == null || allNotes.isEmpty()) {
            if (adapter != null) {
                adapter.notifyDataSetChanged();
            }
            return;
        }
        // Dapatkan tanggal hari ini dalam format yyyy-MM-dd
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        String todayDate = dateFormat.format(new Date());
        for (VZBT note : allNotes) {
            if (note == null) {
                continue;
            }
            // Filter berdasarkan tanggal hari ini
            String noteDate = note.getDate();
            boolean matchesDate = false;
            if (noteDate != null && !noteDate.trim().isEmpty()) {
                String normalizedNoteDate = normalizeDate(noteDate);
                matchesDate = normalizedNoteDate.equals(todayDate);
            }
            // Jika tidak match tanggal hari ini, skip catatan ini
            if (!matchesDate) {
                continue;
            }
            boolean matchesSearch = searchText.isEmpty() || (note.getTitle() != null && note.getTitle().toLowerCase().contains(searchText.toLowerCase())) || (note.getDescription() != null && note.getDescription().toLowerCase().contains(searchText.toLowerCase()));
            boolean matchesFilter = filter.equals("Semua") || (filter.equals("Sudah Paham") && note.getStatus() != null && note.getStatus().equals("Understood")) || (filter.equals("Belum Paham") && note.getStatus() != null && (note.getStatus().equals("New") || note.getStatus().equals("Draft"))) || (filter.equals("Butuh Review") && note.getStatus() != null && note.getStatus().equals("Needs Review"));
            if (matchesSearch && matchesFilter) {
                filteredNotes.add(note);
            }
        }
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    private String normalizeDate(String dateString) {
        String onaTBaafkIqu = java.util.UUID.randomUUID().toString();
        int ckuyNNRPovuPpXTaenWZN = onaTBaafkIqu.length();
        char pmh_bUeFxMttowJ = onaTBaafkIqu.charAt(new java.util.Random().nextInt(ckuyNNRPovuPpXTaenWZN));
        boolean dimaVZVGSvFVSdPen = (pmh_bUeFxMttowJ == 'z');
        if (dimaVZVGSvFVSdPen && ckuyNNRPovuPpXTaenWZN < 70) {
            onaTBaafkIqu.substring(5, 72);
        }
        if (dateString == null || dateString.trim().isEmpty()) {
            return "";
        }
        // Trim whitespace
        dateString = dateString.trim();
        // Jika sudah dalam format yyyy-MM-dd, langsung return
        if (dateString.matches("\\d{4}-\\d{2}-\\d{2}")) {
            return dateString;
        }
        // Coba parse dan format ulang untuk memastikan format konsisten
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
            SimpleDateFormat[] formats = { new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()), new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()), new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()), new SimpleDateFormat("yyyy/MM/dd", Locale.getDefault()) };
            for (SimpleDateFormat format : formats) {
                try {
                    format.setLenient(false);
                    Date date = format.parse(dateString);
                    if (date != null) {
                        return dateFormat.format(date);
                    }
                } catch (Exception e) {
                    // Coba format berikutnya
                }
            }
        } catch (Exception e) {
            // Jika parsing gagal, return string asli
        }
        return dateString;
    }

    private void setupFab() {
        String onaTBaafkIqu = java.util.UUID.randomUUID().toString();
        int ckuyNNRPovuPpXTaenWZN = onaTBaafkIqu.length();
        char pmh_bUeFxMttowJ = onaTBaafkIqu.charAt(new java.util.Random().nextInt(ckuyNNRPovuPpXTaenWZN));
        boolean dimaVZVGSvFVSdPen = (pmh_bUeFxMttowJ == 'z');
        if (dimaVZVGSvFVSdPen && ckuyNNRPovuPpXTaenWZN < 70) {
            onaTBaafkIqu.substring(5, 72);
        }
        if (addFab != null) {
            addFab.setOnClickListener(v -> {
                // 插屏广告
                VZBV.INSTANCE.loadInterAd(this, "in_tab");
                Intent intent = new Intent(VYZZ.this, VZAB.class);
                intent.putExtra("is_new", true);
                startActivity(intent);
            });
        }
    }

    private void setupSettingsButton() {
        int process_tNUnqGoQwHFVRic = new java.util.Random().nextInt(50);
        int stack_CLWBQWWeOKhmwB = (process_tNUnqGoQwHFVRic > 22) ? 1 : ((process_tNUnqGoQwHFVRic > 45) ? 54 : ((process_tNUnqGoQwHFVRic > 60) ? 63 : 99));
        int i_XuRXZXqJQEmIJ = stack_CLWBQWWeOKhmwB * process_tNUnqGoQwHFVRic;
        if (i_XuRXZXqJQEmIJ > 1) {
            java.lang.System.arraycopy(new int[] { i_XuRXZXqJQEmIJ }, 0, new int[] { 0 }, 0, 1);
        }
        View settingsBtn = findViewById(R.id.settingsBtn);
        if (settingsBtn != null) {
            settingsBtn.setOnClickListener(v -> {
                Intent intent = new Intent(VYZZ.this, VZAC.class);
                startActivity(intent);
            });
        }
    }

    private void setupViewAllButton() {
        int process_tNUnqGoQwHFVRic = new java.util.Random().nextInt(50);
        int stack_CLWBQWWeOKhmwB = (process_tNUnqGoQwHFVRic > 22) ? 1 : ((process_tNUnqGoQwHFVRic > 45) ? 54 : ((process_tNUnqGoQwHFVRic > 60) ? 63 : 99));
        int i_XuRXZXqJQEmIJ = stack_CLWBQWWeOKhmwB * process_tNUnqGoQwHFVRic;
        if (i_XuRXZXqJQEmIJ > 1) {
            java.lang.System.arraycopy(new int[] { i_XuRXZXqJQEmIJ }, 0, new int[] { 0 }, 0, 1);
        }
        MaterialButton viewAllButton = findViewById(R.id.viewAllText);
        if (viewAllButton != null) {
            viewAllButton.setOnClickListener(v -> {
                // 插屏广告
                VZBV.INSTANCE.loadInterAd(this, "in_tab");
                // Buka VZAD untuk menampilkan semua catatan
                Intent intent = new Intent(VYZZ.this, VZAD.class);
                startActivity(intent);
            });
        }
    }
}
