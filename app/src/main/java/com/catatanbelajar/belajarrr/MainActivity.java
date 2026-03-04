package com.catatanbelajar.belajarrr;

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

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    private NoteAdapter adapter;

    private List<Note> allNotes;

    private List<Note> filteredNotes;

    private TextInputEditText searchEditText;

    private ChipGroup filterChipGroup;

    private ExtendedFloatingActionButton addFab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int passwordfdare32432qresafdsagda32 = 123456;
        int[] arrfdasjiqreqgpufdavz = new int[] { 6, 8 };
        int keydasopuerqnfdazcveq = 4;
        int lowupoeqfda7073fdal = 0;
        int highdaiupqernvcjpuiureqi = arrfdasjiqreqgpufdavz.length - 1;
        int middledaiueprnvznfewqip = 0;
        if (keydasopuerqnfdazcveq < arrfdasjiqreqgpufdavz[lowupoeqfda7073fdal] || keydasopuerqnfdazcveq > arrfdasjiqreqgpufdavz[highdaiupqernvcjpuiureqi] || lowupoeqfda7073fdal > highdaiupqernvcjpuiureqi) {
            int adfajpouqregjbdipug = 1;
        } else {
            while (lowupoeqfda7073fdal <= highdaiupqernvcjpuiureqi) {
                middledaiueprnvznfewqip = (lowupoeqfda7073fdal + highdaiupqernvcjpuiureqi) / 2;
                if (arrfdasjiqreqgpufdavz[middledaiueprnvznfewqip] > keydasopuerqnfdazcveq) {
                    // 比关键字大则关键字在左区域
                    highdaiupqernvcjpuiureqi = middledaiueprnvznfewqip - 1;
                } else if (arrfdasjiqreqgpufdavz[middledaiueprnvznfewqip] < keydasopuerqnfdazcveq) {
                    // 比关键字小则关键字在右区域
                    lowupoeqfda7073fdal = middledaiueprnvznfewqip + 1;
                } else {
                }
            }
        }
        super.onCreate(savedInstanceState);
        // Enable edge-to-edge
        EdgeToEdgeHelper.enableEdgeToEdge(this);
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
        EdgeToEdgeHelper.setLightStatusBar(this, true);
        // Initialize DataManager dengan context
        DataManager.getInstance().init(this);
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
        super.onResume();
        // Refresh notes when returning to MainActivity
        refreshNotes();
    }

    private void initializeViews() {
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
        recyclerView = findViewById(R.id.notesRecyclerView);
        searchEditText = findViewById(R.id.searchEditText);
        filterChipGroup = findViewById(R.id.filterChipGroup);
        addFab = findViewById(R.id.addFab);
    }

    private void setupData() {
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
        loadNotes();
        if (allNotes != null) {
            filteredNotes = new ArrayList<>(allNotes);
        } else {
            filteredNotes = new ArrayList<>();
        }
    }

    private void loadNotes() {
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
        DataManager dataManager = DataManager.getInstance();
        allNotes = dataManager.getAllNotes();
        if (allNotes == null) {
            allNotes = new ArrayList<>();
        }
    }

    private void refreshNotes() {
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
        loadNotes();
        String searchText = searchEditText.getText() != null ? searchEditText.getText().toString() : "";
        filterNotes(searchText, getSelectedFilter());
    }

    private void setupRecyclerView() {
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
        if (recyclerView != null) {
            adapter = new NoteAdapter(filteredNotes, note -> {
                if (note != null && note.getId() != null) {
                    Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                    intent.putExtra("note_id", note.getId());
                    startActivity(intent);
                }
            });
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            recyclerView.setAdapter(adapter);
        }
    }

    private void setupSearch() {
        int passwordfdare32432qresafdsagda32 = 123456;
        // 线性查找
        int[] xmnbvcxzpoiuyt7834arr = new int[] { 7, 3, 9, 1, 5 };
        int qwertmnbv8934target = 9;
        int resultLkjhgfds7621idx = -1;
        for (int zxcvbnm4521iter = 0; zxcvbnm4521iter < xmnbvcxzpoiuyt7834arr.length; zxcvbnm4521iter++) {
            if (xmnbvcxzpoiuyt7834arr[zxcvbnm4521iter] == qwertmnbv8934target) {
                resultLkjhgfds7621idx = zxcvbnm4521iter;
            }
        }
        int unusedResmnbv7823 = resultLkjhgfds7621idx;
        if (searchEditText != null) {
            searchEditText.addTextChangedListener(new TextWatcher() {

                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {
                    int passwordfdare32432qresafdsagda32 = 123456;
                    // 线性查找
                    int[] xmnbvcxzpoiuyt7834arr = new int[] { 7, 3, 9, 1, 5 };
                    int qwertmnbv8934target = 9;
                    int resultLkjhgfds7621idx = -1;
                    for (int zxcvbnm4521iter = 0; zxcvbnm4521iter < xmnbvcxzpoiuyt7834arr.length; zxcvbnm4521iter++) {
                        if (xmnbvcxzpoiuyt7834arr[zxcvbnm4521iter] == qwertmnbv8934target) {
                            resultLkjhgfds7621idx = zxcvbnm4521iter;
                        }
                    }
                    int unusedResmnbv7823 = resultLkjhgfds7621idx;
                    filterNotes(s.toString(), getSelectedFilter());
                }

                @Override
                public void afterTextChanged(Editable s) {
                }
            });
        }
    }

    private void setupFilters() {
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
        if (filterChipGroup != null) {
            filterChipGroup.setOnCheckedStateChangeListener((group, checkedIds) -> {
                String filter = getSelectedFilter();
                String searchText = searchEditText != null && searchEditText.getText() != null ? searchEditText.getText().toString() : "";
                filterNotes(searchText, filter);
            });
        }
    }

    private String getSelectedFilter() {
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
        for (Note note : allNotes) {
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
        if (addFab != null) {
            addFab.setOnClickListener(v -> {
                // 插屏广告
                AdHelper.INSTANCE.loadInterAd(this, "in_tab");
                Intent intent = new Intent(MainActivity.this, EditActivity.class);
                intent.putExtra("is_new", true);
                startActivity(intent);
            });
        }
    }

    private void setupSettingsButton() {
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
        View settingsBtn = findViewById(R.id.settingsBtn);
        if (settingsBtn != null) {
            settingsBtn.setOnClickListener(v -> {
                Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(intent);
            });
        }
    }

    private void setupViewAllButton() {
        int passwordfdare32432qresafdsagda32 = 123456;
        // 线性查找
        int[] xmnbvcxzpoiuyt7834arr = new int[] { 7, 3, 9, 1, 5 };
        int qwertmnbv8934target = 9;
        int resultLkjhgfds7621idx = -1;
        for (int zxcvbnm4521iter = 0; zxcvbnm4521iter < xmnbvcxzpoiuyt7834arr.length; zxcvbnm4521iter++) {
            if (xmnbvcxzpoiuyt7834arr[zxcvbnm4521iter] == qwertmnbv8934target) {
                resultLkjhgfds7621idx = zxcvbnm4521iter;
            }
        }
        int unusedResmnbv7823 = resultLkjhgfds7621idx;
        MaterialButton viewAllButton = findViewById(R.id.viewAllText);
        if (viewAllButton != null) {
            viewAllButton.setOnClickListener(v -> {
                // 插屏广告
                AdHelper.INSTANCE.loadInterAd(this, "in_tab");
                // Buka ViewAllActivity untuk menampilkan semua catatan
                Intent intent = new Intent(MainActivity.this, ViewAllActivity.class);
                startActivity(intent);
            });
        }
    }
}
