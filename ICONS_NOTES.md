# Icon Resources - Catatan Belajar

## 📊 Status Saat Ini

**Current Implementation:**
- Menggunakan `@android:drawable/...` (default Android icons)
- ✅ Bisa digunakan dan berfungsi
- ⚠️ Tidak konsisten dengan desain HTML (yang menggunakan Material Symbols)
- ⚠️ Terbatas dan mungkin tidak sesuai dengan brand

## 🎯 Rekomendasi untuk Production

### Opsi 1: Material Icons (Recommended)
Gunakan Material Icons dari Google yang sesuai dengan Material Symbols di HTML.

**Cara:**
1. Download icon dari https://fonts.google.com/icons
2. Convert ke Vector Drawable (.xml)
3. Simpan di `app/src/main/res/drawable/`

### Opsi 2: Material Icons Library
Gunakan library Material Icons untuk Android.

**Dependency:**
```gradle
implementation 'com.google.android.material:material:1.13.0' // Already included
```

**Usage:**
```xml
<com.google.android.material.iconbutton.IconButton
    android:icon="@drawable/ic_add_24" />
```

### Opsi 3: Custom Vector Drawables
Buat custom vector drawable berdasarkan Material Symbols.

---

## 📋 Daftar Icon yang Digunakan di HTML

### Navigation & Actions
- `arrow_back_ios_new` - Back button
- `add` - Tambah catatan (FAB)
- `save` - Simpan
- `delete` - Hapus
- `delete_forever` - Reset data
- `edit` / `sticky_note_2` - Edit/Note
- `chevron_right` - Menu arrow

### Status & Info
- `wifi_off` - Offline mode indicator
- `notifications` - Notifications button
- `settings` - Settings button
- `check_circle` - Status "Understood"

### Search & Filter
- `search` - Search icon
- `keyboard_arrow_down` - Dropdown

### Date & Time
- `calendar_today` - Date
- `schedule` - Time/Duration

### Categories & Subjects
- `functions` - Matematika
- `biotech` - Biologi
- `history_edu` - Sejarah
- `science` - Fisika
- `translate` - Bahasa
- `category` - Category

### Content
- `menu_book` - Splash screen logo
- `attachment` - Attachments
- `add_photo_alternate` - Add photo

### Settings
- `info` - Tentang Aplikasi
- `domain` - Tentang Organisasi
- `policy` - Privacy Policy
- `school` - App icon

---

## 🔧 Implementasi Saat Ini (Default Android Icons)

Icon yang digunakan saat ini dari `@android:drawable/`:

| Material Symbol | Android Drawable | Status |
|----------------|------------------|--------|
| arrow_back_ios_new | ic_menu_revert | ⚠️ Close |
| add | ic_input_add | ⚠️ Close |
| save | ic_menu_save | ✅ Good |
| delete | ic_menu_delete | ✅ Good |
| search | (TextInputLayout) | ✅ Good |
| notifications | ic_dialog_info | ⚠️ Different |
| settings | ic_menu_preferences | ✅ Good |
| calendar_today | ic_menu_today | ✅ Good |
| menu_book | ic_menu_view | ⚠️ Different |

---

## 💡 Saran Implementasi

### Quick Fix (Minimal Changes)
Jika ingin cepat, bisa tetap pakai `@android:drawable/` yang sudah ada. Aplikasi tetap berfungsi dengan baik.

### Better Solution (Recommended)
1. Download Material Icons yang penting dulu:
   - `arrow_back_ios_new` → Back
   - `add` → Add/FAB
   - `menu_book` → Logo/Splash
   - `search` → Search
   - `settings` → Settings
   - `delete` → Delete
   - `save` → Save

2. Convert ke Vector Drawable format (.xml)
3. Simpan di `app/src/main/res/drawable/`
4. Update layout files untuk menggunakan icon baru

### Best Practice
1. Buat semua icon sebagai Vector Drawable
2. Organize dalam folder/drawable dengan naming convention: `ic_[name]_24.xml`
3. Support multiple sizes jika diperlukan (24dp, 48dp)
4. Support dark mode dengan tint colors

---

## 📁 Struktur Recommended

```
app/src/main/res/
├── drawable/
│   ├── ic_add_24.xml
│   ├── ic_arrow_back_24.xml
│   ├── ic_menu_book_24.xml
│   ├── ic_search_24.xml
│   ├── ic_settings_24.xml
│   ├── ic_delete_24.xml
│   ├── ic_save_24.xml
│   ├── ic_calendar_today_24.xml
│   ├── ic_notifications_24.xml
│   └── ...
└── drawable-night/
    └── (optional night variants)
```

---

## 🚀 Next Steps

1. **Decide:** Pilih opsi yang sesuai (Quick fix atau Better solution)
2. **Download:** Ambil icon dari Material Icons jika memilih better solution
3. **Convert:** Convert ke Vector Drawable
4. **Update:** Update layout files
5. **Test:** Test di berbagai ukuran dan tema

---

**Note:** Untuk sekarang, aplikasi sudah bisa digunakan dengan `@android:drawable/`. Icon resources bisa ditambahkan kemudian sebagai improvement.

