package svd.xsu.ktxy;

import svd.xsu.ktxy.R;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.gridlayout.widget.GridLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class JNUU extends AppCompatActivity {

    private TextInputLayout titleInputLayout;

    private TextInputEditText titleEditText;

    private TextInputEditText subjectEditText;

    private AutoCompleteTextView categoryAutoComplete;

    private TextInputEditText dateEditText;

    private TextInputEditText durationEditText;

    private EditText contentEditText;

    private MaterialButton saveBtn;

    private MaterialButton cancelBtn;

    private GridLayout attachmentsGrid;

    private MaterialCardView addAttachmentCard;

    private Calendar calendar;

    private SimpleDateFormat dateFormat;

    private String noteId;

    private boolean isNew;

    // List of attachment file paths
    private List<String> attachmentPaths;

    private ActivityResultLauncher<Intent> imagePickerLauncher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
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
        super.onCreate(savedInstanceState);
        // Enable edge-to-edge
        JNVA.enableEdgeToEdge(this);
        setContentView(R.layout.activity_edit);
        // Apply window insets
        View rootView = findViewById(android.R.id.content);
        if (rootView != null) {
            JNVA.applyWindowInsets(rootView);
        }
        // Set light status bar
        JNVA.setLightStatusBar(this, true);
        // Initialize JNVC dengan context
        JNVC.getInstance().init(this);
        noteId = getIntent().getStringExtra("note_id");
        isNew = getIntent().getBooleanExtra("is_new", true);
        calendar = Calendar.getInstance();
        dateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        initializeViews();
        setupListeners();
        setupCategoryDropdown();
        setupDatePicker();
        setupAttachments();
        setupImagePicker();
        loadNoteData();
    }

    private void setupAttachments() {
    }

    private void setupImagePicker() {
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
        imagePickerLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), result -> {
            if (result.getResultCode() == RESULT_OK && result.getData() != null) {
                Uri selectedImageUri = result.getData().getData();
                if (selectedImageUri != null) {
                    try {
                        // Ensure attachmentPaths is initialized
                        if (attachmentPaths == null) {
                            attachmentPaths = new ArrayList<>();
                        }
                        // Copy image to app's internal storage
                        String imagePath = copyImageToInternalStorage(selectedImageUri);
                        if (imagePath != null && !imagePath.isEmpty()) {
                            attachmentPaths.add(imagePath);
                            addAttachmentToGrid(imagePath, attachmentPaths.size() - 1);
                        }
                    } catch (Exception e) {
                        Toast.makeText(this, "Gagal memuat gambar", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

    private void pickImageFromGallery() {
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
        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
        intent.setType("image/*");
        imagePickerLauncher.launch(Intent.createChooser(intent, "Pilih Gambar"));
    }

    private String copyImageToInternalStorage(Uri imageUri) {
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
        InputStream inputStream = null;
        FileOutputStream outputStream = null;
        try {
            File imagesDir = new File(getFilesDir(), "note_images");
            if (!imagesDir.exists()) {
                imagesDir.mkdirs();
            }
            String fileName = "img_" + System.currentTimeMillis() + ".jpg";
            File destFile = new File(imagesDir, fileName);
            inputStream = getContentResolver().openInputStream(imageUri);
            if (inputStream == null) {
                return null;
            }
            outputStream = new FileOutputStream(destFile);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, length);
            }
            return destFile.getAbsolutePath();
        } catch (Exception e) {
            // Error copying image - return null silently
            return null;
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
            } catch (Exception e) {
                // Error closing streams - ignore
            }
        }
    }

    private void addAttachmentToGrid(String imagePath, int index) {
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
        if (getResources() == null || attachmentsGrid == null) {
            // Activity might be destroyed
            return;
        }
        // Create card for attachment
        MaterialCardView cardView = new MaterialCardView(this);
        GridLayout.Spec rowSpec = GridLayout.spec(GridLayout.UNDEFINED);
        GridLayout.Spec colSpec = GridLayout.spec(GridLayout.UNDEFINED);
        GridLayout.LayoutParams params = new GridLayout.LayoutParams(rowSpec, colSpec);
        float density = getResources().getDisplayMetrics().density;
        params.width = (int) (160 * density);
        params.height = (int) (120 * density);
        params.setMargins(0, 0, (int) (8 * density), (int) (8 * density));
        cardView.setLayoutParams(params);
        cardView.setRadius(12);
        cardView.setCardElevation(1);
        // Create ImageView for preview
        ImageView imageView = new ImageView(this);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        File imageFile = new File(imagePath);
        if (imageFile.exists() && imageFile.canRead()) {
            try {
                imageView.setImageURI(Uri.fromFile(imageFile));
            } catch (Exception e) {
                // If image cannot be loaded, use placeholder or skip
                return;
            }
        } else {
            // If file doesn't exist, skip this attachment
            return;
        }
        // Add delete button overlay
        ImageView deleteBtn = new ImageView(this);
        LinearLayout.LayoutParams deleteParams = new LinearLayout.LayoutParams((int) (32 * density), (int) (32 * density));
        deleteParams.gravity = android.view.Gravity.END | android.view.Gravity.TOP;
        deleteParams.setMargins(0, 8, 8, 0);
        deleteBtn.setLayoutParams(deleteParams);
        deleteBtn.setImageResource(android.R.drawable.ic_menu_delete);
        deleteBtn.setBackgroundResource(android.R.drawable.presence_online);
        deleteBtn.setPadding(4, 4, 4, 4);
        deleteBtn.setTag(index);
        deleteBtn.setOnClickListener(v -> {
            if (attachmentPaths == null) {
                return;
            }
            Object tag = v.getTag();
            if (tag instanceof Integer) {
                int position = (Integer) tag;
                if (position >= 0 && position < attachmentPaths.size()) {
                    attachmentPaths.remove(position);
                    if (attachmentsGrid != null) {
                        attachmentsGrid.removeView(cardView);
                        refreshAttachmentsGrid();
                    }
                }
            }
        });
        // Wrap in FrameLayout for overlay
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(this);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
        frameLayout.addView(imageView);
        frameLayout.addView(deleteBtn);
        cardView.addView(frameLayout);
        attachmentsGrid.addView(cardView);
    }

    private void refreshAttachmentsGrid() {
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
        if (attachmentsGrid == null || attachmentPaths == null) {
            return;
        }
        // Remove all attachment cards (except add button)
        int childCount = attachmentsGrid.getChildCount();
        for (int i = childCount - 1; i >= 0; i--) {
            View child = attachmentsGrid.getChildAt(i);
            if (child != null && child.getId() != R.id.addAttachmentCard) {
                attachmentsGrid.removeViewAt(i);
            }
        }
        // Re-add all attachments with updated indices
        for (int i = 0; i < attachmentPaths.size(); i++) {
            String path = attachmentPaths.get(i);
            if (path != null && !path.isEmpty()) {
                addAttachmentToGrid(path, i);
            }
        }
    }

    private void initializeViews() {
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
        titleInputLayout = findViewById(R.id.titleInputLayout);
        titleEditText = findViewById(R.id.titleEditText);
        subjectEditText = findViewById(R.id.subjectEditText);
        categoryAutoComplete = findViewById(R.id.categoryAutoComplete);
        dateEditText = findViewById(R.id.dateEditText);
        durationEditText = findViewById(R.id.durationEditText);
        contentEditText = findViewById(R.id.contentEditText);
        saveBtn = findViewById(R.id.saveBtn);
        cancelBtn = findViewById(R.id.cancelBtn);
        attachmentsGrid = findViewById(R.id.attachmentsGrid);
        addAttachmentCard = findViewById(R.id.addAttachmentCard);
        attachmentPaths = new ArrayList<>();
        findViewById(R.id.backBtn).setOnClickListener(v -> finish());
        findViewById(R.id.deleteBtn).setOnClickListener(v -> showDeleteConfirmation());
        // Hide delete button if creating new note
        if (isNew) {
            findViewById(R.id.deleteBtn).setVisibility(View.GONE);
        }
        // Setup attachment card click listener
        if (addAttachmentCard != null) {
            addAttachmentCard.setOnClickListener(v -> pickImageFromGallery());
        }
    }

    private void setupListeners() {
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
        if (saveBtn != null) {
            saveBtn.setOnClickListener(v -> saveNote());
        }
        if (cancelBtn != null) {
            cancelBtn.setOnClickListener(v -> finish());
        }
        // Clear error when user starts typing
        if (titleEditText != null && titleInputLayout != null) {
            titleEditText.addTextChangedListener(new TextWatcher() {

                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {
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
                    if (titleInputLayout.getError() != null) {
                        titleInputLayout.setError(null);
                    }
                }

                @Override
                public void afterTextChanged(Editable s) {
                }
            });
        }
    }

    private void setupCategoryDropdown() {
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
        if (categoryAutoComplete == null) {
            return;
        }
        // Kategori dropdown berisi: Sudah Paham, Belum Paham, Butuh Review
        String[] categories = { "Sudah Paham", "Belum Paham", "Butuh Review" };
        ArrayAdapter<String> categoryAdapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, categories);
        categoryAutoComplete.setAdapter(categoryAdapter);
    }

    private void setupDatePicker() {
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
        if (dateEditText != null) {
            dateEditText.setText(dateFormat.format(calendar.getTime()));
            dateEditText.setOnClickListener(v -> showDatePickerDialog());
        }
    }

    private void showDatePickerDialog() {
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
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, (view, year, month, dayOfMonth) -> {
            calendar.set(year, month, dayOfMonth);
            dateEditText.setText(dateFormat.format(calendar.getTime()));
        }, calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH));
        // Batasi maksimal tanggal ke hari ini (tidak bisa memilih tanggal di masa depan)
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
        datePickerDialog.show();
    }

    private void loadNoteData() {
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
        if (!isNew && noteId != null) {
            JNVC dataManager = JNVC.getInstance();
            JNVD note = dataManager.getNoteById(noteId);
            if (note != null) {
                // Populate form fields with note data
                titleEditText.setText(note.getTitle());
                if (note.getSubject() != null && !note.getSubject().isEmpty()) {
                    subjectEditText.setText(note.getSubject());
                }
                // Load category - convert status to category display text if needed
                if (note.getCategory() != null && !note.getCategory().isEmpty()) {
                    // If category is one of the display values, use it directly
                    String categoryValue = note.getCategory();
                    if (categoryValue.equals("Sudah Paham") || categoryValue.equals("Belum Paham") || categoryValue.equals("Butuh Review")) {
                        categoryAutoComplete.setText(categoryValue);
                    } else {
                        // Map status to category display value
                        String status = note.getStatus();
                        if (status != null) {
                            if (status.equals("Understood")) {
                                categoryAutoComplete.setText("Sudah Paham");
                            } else if (status.equals("Needs Review")) {
                                categoryAutoComplete.setText("Butuh Review");
                            } else {
                                categoryAutoComplete.setText("Belum Paham");
                            }
                        }
                    }
                } else {
                    // Default to "Belum Paham" if no category
                    categoryAutoComplete.setText("Belum Paham", false);
                }
                if (note.getDate() != null && !note.getDate().isEmpty()) {
                    // Validasi tanggal - jika di masa depan, set ke hari ini
                    try {
                        Date noteDate = dateFormat.parse(note.getDate());
                        Date today = new Date();
                        if (noteDate != null && noteDate.after(today)) {
                            // Jika tanggal di masa depan, set ke hari ini
                            String todayStr = dateFormat.format(today);
                            dateEditText.setText(todayStr);
                            calendar.setTime(today);
                            // Update note dengan tanggal yang benar
                            note.setDate(todayStr);
                            dataManager.updateNote(note);
                        } else {
                            dateEditText.setText(note.getDate());
                            if (noteDate != null) {
                                calendar.setTime(noteDate);
                            }
                        }
                    } catch (Exception e) {
                        // If parsing fails, try alternative formats
                        try {
                            SimpleDateFormat altFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
                            Date noteDate = altFormat.parse(note.getDate());
                            Date today = new Date();
                            if (noteDate != null && noteDate.after(today)) {
                                // Jika tanggal di masa depan, set ke hari ini
                                String todayStr = dateFormat.format(today);
                                dateEditText.setText(todayStr);
                                calendar.setTime(today);
                                note.setDate(todayStr);
                                dataManager.updateNote(note);
                            } else {
                                if (noteDate != null) {
                                    String formattedDate = dateFormat.format(noteDate);
                                    dateEditText.setText(formattedDate);
                                    calendar.setTime(noteDate);
                                }
                            }
                        } catch (Exception e2) {
                            // Keep current calendar date if all parsing fails
                            String todayStr = dateFormat.format(new Date());
                            dateEditText.setText(todayStr);
                            calendar.setTime(new Date());
                        }
                    }
                }
                // Duration/time can be stored in time field or separate field
                // For now, we'll use the time field for duration display
                if (note.getTime() != null && !note.getTime().isEmpty()) {
                    durationEditText.setText(note.getTime());
                }
                if (note.getDescription() != null && !note.getDescription().isEmpty()) {
                    contentEditText.setText(note.getDescription());
                }
                // Load attachments
                if (note.getAttachments() != null && !note.getAttachments().isEmpty()) {
                    attachmentPaths = new ArrayList<>(note.getAttachments());
                    for (int i = 0; i < attachmentPaths.size(); i++) {
                        String path = attachmentPaths.get(i);
                        if (path != null && !path.isEmpty()) {
                            addAttachmentToGrid(path, i);
                        }
                    }
                } else {
                    attachmentPaths = new ArrayList<>();
                }
            }
        } else {
            // Set default value for new notes
            if (categoryAutoComplete != null) {
                categoryAutoComplete.setText("Belum Paham", false);
            }
        }
    }

    private void saveNote() {
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
        if (titleEditText == null || subjectEditText == null || categoryAutoComplete == null || dateEditText == null || durationEditText == null || contentEditText == null || titleInputLayout == null) {
            // Views not initialized
            return;
        }
        String title = titleEditText.getText() != null ? titleEditText.getText().toString() : "";
        String subject = subjectEditText.getText() != null ? subjectEditText.getText().toString() : "";
        String category = categoryAutoComplete.getText() != null ? categoryAutoComplete.getText().toString() : "";
        String date = dateEditText.getText() != null ? dateEditText.getText().toString() : "";
        String duration = durationEditText.getText() != null ? durationEditText.getText().toString() : "";
        String content = contentEditText.getText() != null ? contentEditText.getText().toString() : "";
        // Validasi judul wajib diisi
        if (title.trim().isEmpty()) {
            titleInputLayout.setError("Judul wajib diisi");
            titleEditText.requestFocus();
            return;
        }
        // Clear error jika sudah valid
        titleInputLayout.setError(null);
        // Validasi tanggal - tidak boleh di masa depan
        String validatedDate = date;
        if (date != null && !date.trim().isEmpty()) {
            try {
                Date selectedDate = dateFormat.parse(date);
                Date today = new Date();
                // Jika tanggal yang dipilih di masa depan, set ke hari ini
                if (selectedDate != null && selectedDate.after(today)) {
                    validatedDate = dateFormat.format(today);
                    // Update dateEditText juga
                    if (dateEditText != null) {
                        dateEditText.setText(validatedDate);
                        calendar.setTime(today);
                    }
                }
            } catch (Exception e) {
                // Jika parsing gagal, gunakan tanggal hari ini
                validatedDate = dateFormat.format(new Date());
                if (dateEditText != null) {
                    dateEditText.setText(validatedDate);
                }
            }
        } else {
            // Jika tanggal kosong, set ke hari ini
            validatedDate = dateFormat.format(new Date());
            if (dateEditText != null) {
                dateEditText.setText(validatedDate);
            }
        }
        // Simpan note ke JNVC
        JNVC dataManager = JNVC.getInstance();
        JNVD note;
        // Convert category to status
        String finalCategory = category.trim().isEmpty() ? "Belum Paham" : category.trim();
        // Default
        String finalStatus = "New";
        // Update status based on category
        if (finalCategory.equals("Sudah Paham")) {
            finalStatus = "Understood";
        } else if (finalCategory.equals("Butuh Review")) {
            finalStatus = "Needs Review";
        } else if (finalCategory.equals("Belum Paham")) {
            finalStatus = "New";
        }
        if (isNew) {
            // Create new note
            note = new JNVD();
            note.setTitle(title.trim());
            note.setDescription(content.trim());
            note.setStatus(finalStatus);
            note.setSubject(subject.trim());
            note.setCategory(finalCategory);
            note.setDate(validatedDate);
            // Simpan durasi yang diinput user (jika kosong, biarkan kosong)
            note.setTime(duration.trim());
            note.setIconResId(JNVC.getIconResIdForSubject(subject));
            if (attachmentPaths != null) {
                note.setAttachments(new ArrayList<>(attachmentPaths));
            } else {
                note.setAttachments(new ArrayList<>());
            }
            dataManager.addNote(note);
        } else {
            // Update existing note
            note = dataManager.getNoteById(noteId);
            if (note != null) {
                note.setTitle(title.trim());
                note.setDescription(content.trim());
                note.setStatus(finalStatus);
                note.setSubject(subject.trim());
                note.setCategory(finalCategory);
                note.setDate(validatedDate);
                // Simpan durasi yang diinput user (jika kosong, biarkan kosong)
                note.setTime(duration.trim());
                note.setIconResId(JNVC.getIconResIdForSubject(subject));
                if (attachmentPaths != null) {
                    note.setAttachments(new ArrayList<>(attachmentPaths));
                } else {
                    note.setAttachments(new ArrayList<>());
                }
                dataManager.updateNote(note);
            } else {
                Toast.makeText(this, "Catatan tidak ditemukan", Toast.LENGTH_SHORT).show();
                return;
            }
        }
        // Show success message
        String message = isNew ? "Catatan berhasil ditambahkan" : "Catatan berhasil diperbarui";
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        // Finish activity dan kembali ke GMFY
        finish();
    }

    private void showDeleteConfirmation() {
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
        new AlertDialog.Builder(this).setTitle("Hapus Catatan").setMessage("Apakah Anda yakin ingin menghapus catatan ini?").setPositiveButton("Hapus", (dialog, which) -> {
            JNVC dataManager = JNVC.getInstance();
            dataManager.deleteNote(noteId);
            Toast.makeText(this, "Catatan berhasil dihapus", Toast.LENGTH_SHORT).show();
            finish();
        }).setNegativeButton("Batal", null).show();
    }
}
