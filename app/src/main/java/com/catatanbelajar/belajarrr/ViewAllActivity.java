package com.catatanbelajar.belajarrr;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputEditText;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class ViewAllActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private GroupedNoteAdapter adapter;
    private List<Note> allNotes;
    private List<Object> groupedItems; // Mix of String (headers) and Note objects
    
    private TextInputEditText startDateEditText;
    private TextInputEditText endDateEditText;
    private Chip chipThisMonth;
    private Chip chipLast7Days;
    private Chip chipSudahPaham;
    private Chip chipButuhReview;
    private Chip chipBelumPaham;
    
    private String startDate = null;
    private String endDate = null;
    private boolean filterThisMonth = false;
    private boolean filterLast7Days = false;
    private boolean filterSudahPaham = false;
    private boolean filterButuhReview = false;
    private boolean filterBelumPaham = false;
    
    private SimpleDateFormat dateFormat;
    private SimpleDateFormat displayDateFormat;
    private SimpleDateFormat monthFormat;
    private Calendar calendar;
    private Calendar startDateCalendar;
    private Calendar endDateCalendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // Enable edge-to-edge
        EdgeToEdgeHelper.enableEdgeToEdge(this);
        
        setContentView(R.layout.activity_view_all);
        
        // Apply window insets
        View rootView = findViewById(android.R.id.content);
        if (rootView != null) {
            EdgeToEdgeHelper.applyWindowInsets(rootView);
        }
        
        // Set light status bar
        EdgeToEdgeHelper.setLightStatusBar(this, true);
        
        // Initialize DataManager dengan context
        DataManager.getInstance().init(this);

        dateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        displayDateFormat = new SimpleDateFormat("MMM d, yyyy", Locale.getDefault());
        monthFormat = new SimpleDateFormat("MMMM yyyy", Locale.getDefault());
        calendar = Calendar.getInstance();
        startDateCalendar = Calendar.getInstance();
        endDateCalendar = Calendar.getInstance();

        initializeViews();
        loadNotes();
        setupRecyclerView();
        setupBackButton();
        setupDateFilters();
        setupChipFilters();
        applyFilters();
    }

    @Override
    protected void onResume() {
        super.onResume();
        loadNotes();
        applyFilters();
    }

    private void initializeViews() {
        recyclerView = findViewById(R.id.notesRecyclerView);
        startDateEditText = findViewById(R.id.startDateEditText);
        endDateEditText = findViewById(R.id.endDateEditText);
        chipThisMonth = findViewById(R.id.chipThisMonth);
        chipLast7Days = findViewById(R.id.chipLast7Days);
        chipSudahPaham = findViewById(R.id.chipSudahPaham);
        chipButuhReview = findViewById(R.id.chipButuhReview);
        chipBelumPaham = findViewById(R.id.chipBelumPaham);
    }

    private void loadNotes() {
        DataManager dataManager = DataManager.getInstance();
        allNotes = dataManager.getAllNotes();
        groupedItems = new ArrayList<>();
    }

    private void setupRecyclerView() {
        if (recyclerView != null) {
            adapter = new GroupedNoteAdapter(groupedItems, note -> {
                if (note != null && note.getId() != null) {
                    Intent intent = new Intent(ViewAllActivity.this, DetailActivity.class);
                    intent.putExtra("note_id", note.getId());
                    startActivity(intent);
                }
            });
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            recyclerView.setAdapter(adapter);
        }
    }

    private void setupBackButton() {
        findViewById(R.id.backBtn).setOnClickListener(v -> finish());
    }

    private void setupDateFilters() {
        if (startDateEditText != null) {
            startDateEditText.setOnClickListener(v -> showStartDatePicker());
        }
        if (endDateEditText != null) {
            endDateEditText.setOnClickListener(v -> showEndDatePicker());
        }
    }

    private void setupChipFilters() {
        if (chipThisMonth != null) {
            chipThisMonth.setOnCheckedChangeListener((buttonView, isChecked) -> {
            filterThisMonth = isChecked;
            if (isChecked) {
                // Uncheck other time filters
                filterLast7Days = false;
                chipLast7Days.setChecked(false);
                
                // Set date range untuk bulan ini
                Calendar cal = Calendar.getInstance();
                cal.set(Calendar.DAY_OF_MONTH, 1);
                startDate = dateFormat.format(cal.getTime());
                
                cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
                endDate = dateFormat.format(cal.getTime());
                
                // Update calendars
                try {
                    startDateCalendar.setTime(dateFormat.parse(startDate));
                    endDateCalendar.setTime(dateFormat.parse(endDate));
                } catch (Exception e) {
                    // Keep current calendars if parsing fails
                }
                
                updateDateDisplay();
            } else {
                // Clear date range when unchecked
                startDate = null;
                endDate = null;
                updateDateDisplay();
            }
            applyFilters();
            });
        }

        if (chipLast7Days != null) {
            chipLast7Days.setOnCheckedChangeListener((buttonView, isChecked) -> {
            filterLast7Days = isChecked;
            if (isChecked) {
                // Uncheck other time filters
                filterThisMonth = false;
                chipThisMonth.setChecked(false);
                
                Calendar cal = Calendar.getInstance();
                endDate = dateFormat.format(cal.getTime());
                
                cal.add(Calendar.DAY_OF_MONTH, -6);
                startDate = dateFormat.format(cal.getTime());
                
                // Update calendars
                try {
                    startDateCalendar.setTime(dateFormat.parse(startDate));
                    endDateCalendar.setTime(dateFormat.parse(endDate));
                } catch (Exception e) {
                    // Keep current calendars if parsing fails
                }
                
                updateDateDisplay();
            } else {
                // Clear date range when unchecked
                startDate = null;
                endDate = null;
                updateDateDisplay();
            }
            applyFilters();
            });
        }

        if (chipSudahPaham != null) {
            chipSudahPaham.setOnCheckedChangeListener((buttonView, isChecked) -> {
                filterSudahPaham = isChecked;
                applyFilters();
            });
        }

        if (chipButuhReview != null) {
            chipButuhReview.setOnCheckedChangeListener((buttonView, isChecked) -> {
                filterButuhReview = isChecked;
                applyFilters();
            });
        }

        if (chipBelumPaham != null) {
            chipBelumPaham.setOnCheckedChangeListener((buttonView, isChecked) -> {
                filterBelumPaham = isChecked;
                applyFilters();
            });
        }
    }

    private void showStartDatePicker() {
        // Use startDateCalendar or default to current date
        if (startDate != null && !startDate.isEmpty()) {
            try {
                Date date = dateFormat.parse(startDate);
                if (date != null) {
                    startDateCalendar.setTime(date);
                }
            } catch (Exception e) {
                startDateCalendar = Calendar.getInstance();
            }
        } else {
            startDateCalendar = Calendar.getInstance();
        }
        
        int year = startDateCalendar.get(Calendar.YEAR);
        int month = startDateCalendar.get(Calendar.MONTH);
        int day = startDateCalendar.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog datePickerDialog = new DatePickerDialog(
            this,
            (view, selectedYear, selectedMonth, selectedDay) -> {
                startDateCalendar.set(selectedYear, selectedMonth, selectedDay);
                startDate = dateFormat.format(startDateCalendar.getTime());
                updateDateDisplay();
                applyFilters();
            },
            year, month, day
        );
        
        // Batasi maksimal tanggal ke hari ini (tidak bisa memilih tanggal di masa depan)
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        
        datePickerDialog.show();
    }

    private void showEndDatePicker() {
        // Use endDateCalendar or default to current date
        if (endDate != null && !endDate.isEmpty()) {
            try {
                Date date = dateFormat.parse(endDate);
                if (date != null) {
                    endDateCalendar.setTime(date);
                }
            } catch (Exception e) {
                endDateCalendar = Calendar.getInstance();
            }
        } else {
            endDateCalendar = Calendar.getInstance();
        }
        
        int year = endDateCalendar.get(Calendar.YEAR);
        int month = endDateCalendar.get(Calendar.MONTH);
        int day = endDateCalendar.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog datePickerDialog = new DatePickerDialog(
            this,
            (view, selectedYear, selectedMonth, selectedDay) -> {
                endDateCalendar.set(selectedYear, selectedMonth, selectedDay);
                endDate = dateFormat.format(endDateCalendar.getTime());
                updateDateDisplay();
                applyFilters();
            },
            year, month, day
        );
        
        // Batasi maksimal tanggal ke hari ini (tidak bisa memilih tanggal di masa depan)
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        
        datePickerDialog.show();
    }

    private void updateDateDisplay() {
        if (startDateEditText == null || endDateEditText == null) {
            return; // Views not initialized yet
        }
        try {
            if (startDate != null && !startDate.isEmpty()) {
                Date date = dateFormat.parse(startDate);
                if (date != null) {
                    startDateEditText.setText(displayDateFormat.format(date));
                } else {
                    startDateEditText.setText("");
                }
            } else {
                startDateEditText.setText("");
            }
            
            if (endDate != null && !endDate.isEmpty()) {
                Date date = dateFormat.parse(endDate);
                if (date != null) {
                    endDateEditText.setText(displayDateFormat.format(date));
                } else {
                    endDateEditText.setText("");
                }
            } else {
                endDateEditText.setText("");
            }
        } catch (Exception e) {
            // Error updating date display - set empty text
            if (startDateEditText != null) {
                startDateEditText.setText("");
            }
            if (endDateEditText != null) {
                endDateEditText.setText("");
            }
        }
    }

    private void applyFilters() {
        if (allNotes == null) {
            return;
        }

        List<Note> filtered = new ArrayList<>();

        // Filter berdasarkan tanggal
        String todayDate = dateFormat.format(new Date());
        
        for (Note note : allNotes) {
            String noteDate = note.getDate();
            if (noteDate == null || noteDate.trim().isEmpty()) {
                continue;
            }

            String normalizedNoteDate = normalizeDate(noteDate);

            // Filter date range
            if (normalizedNoteDate == null || normalizedNoteDate.isEmpty()) {
                continue; // Skip notes with invalid dates
            }
            
            // Skip catatan dengan tanggal di masa depan (extra safety)
            if (normalizedNoteDate.compareTo(todayDate) > 0) {
                continue; // Skip notes with future dates
            }
            
            if (startDate != null && !startDate.isEmpty() && endDate != null && !endDate.isEmpty()) {
                if (normalizedNoteDate.compareTo(startDate) < 0 || normalizedNoteDate.compareTo(endDate) > 0) {
                    continue;
                }
            } else if (startDate != null && !startDate.isEmpty()) {
                if (normalizedNoteDate.compareTo(startDate) < 0) {
                    continue;
                }
            } else if (endDate != null && !endDate.isEmpty()) {
                if (normalizedNoteDate.compareTo(endDate) > 0) {
                    continue;
                }
            }

            // Filter status - menggunakan Bahasa Indonesia yang konsisten
            // Sudah Paham = Understood
            // Butuh Review = Needs Review
            // Belum Paham = New atau Draft
            String status = note.getStatus();
            
            // Jika ada filter yang aktif, cek apakah status cocok
            boolean hasStatusFilter = filterSudahPaham || filterButuhReview || filterBelumPaham;
            
            if (hasStatusFilter) {
                boolean matchesFilter = false;
                
                if (filterSudahPaham && "Understood".equals(status)) {
                    matchesFilter = true;
                }
                if (filterButuhReview && "Needs Review".equals(status)) {
                    matchesFilter = true;
                }
                if (filterBelumPaham && ("New".equals(status) || "Draft".equals(status))) {
                    matchesFilter = true;
                }
                
                // Jika ada filter aktif tapi tidak match, skip catatan ini
                if (!matchesFilter) {
                    continue;
                }
            }

            filtered.add(note);
        }

        // Sort by date (newest first)
        Collections.sort(filtered, (n1, n2) -> {
            if (n1 == null || n2 == null) {
                return 0;
            }
            String d1 = normalizeDate(n1.getDate());
            String d2 = normalizeDate(n2.getDate());
            if (d1 == null || d1.isEmpty()) {
                return 1; // Put null dates at the end
            }
            if (d2 == null || d2.isEmpty()) {
                return -1; // Put null dates at the end
            }
            return d2.compareTo(d1); // Descending
        });

        // Group by month
        groupNotesByMonth(filtered);
    }

    private void groupNotesByMonth(List<Note> notes) {
        groupedItems.clear();
        
        if (notes.isEmpty()) {
            adapter.updateItems(groupedItems);
            return;
        }

        Map<String, List<Note>> monthGroups = new HashMap<>();
        
        for (Note note : notes) {
            String noteDate = normalizeDate(note.getDate());
            try {
                Date date = dateFormat.parse(noteDate);
                if (date != null) {
                    String monthKey = monthFormat.format(date);
                    if (!monthGroups.containsKey(monthKey)) {
                        monthGroups.put(monthKey, new ArrayList<>());
                    }
                    monthGroups.get(monthKey).add(note);
                }
            } catch (Exception e) {
                // Error parsing date for grouping - skip this note
            }
        }

        // Sort months descending
        List<String> sortedMonths = new ArrayList<>(monthGroups.keySet());
        Collections.sort(sortedMonths, Collections.reverseOrder());

        // Build grouped items list
        for (String month : sortedMonths) {
            groupedItems.add(month); // Header
            groupedItems.addAll(monthGroups.get(month)); // Notes
        }

        adapter.updateItems(groupedItems);
    }

    private String normalizeDate(String dateString) {
        if (dateString == null || dateString.trim().isEmpty()) {
            return "";
        }

        dateString = dateString.trim();

        if (dateString.matches("\\d{4}-\\d{2}-\\d{2}")) {
            return dateString;
        }

        try {
            SimpleDateFormat[] formats = {
                new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()),
                new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()),
                new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()),
                new SimpleDateFormat("yyyy/MM/dd", Locale.getDefault())
            };

            for (SimpleDateFormat format : formats) {
                try {
                    format.setLenient(false);
                    Date date = format.parse(dateString);
                    if (date != null) {
                        return dateFormat.format(date);
                    }
                } catch (Exception e) {
                    // Try next format
                }
            }
        } catch (Exception e) {
            // Error normalizing date - return original string
        }

        return dateString;
    }
}
