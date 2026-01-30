package svd.xsu.ktxy;

import java.util.ArrayList;
import java.util.List;

public class JNVD {

    private String id;

    private String title;

    private String description;

    private String category;

    private String date;

    private String time;

    // "Understood", "Needs Review", "New", "Draft"
    private String status;

    // "Matematika", "Biologi", etc.
    private String subject;

    // Icon resource ID
    private int iconResId;

    // List of image file paths/URIs
    private List<String> attachments;

    public JNVD() {
        attachments = new ArrayList<>();
    }

    public JNVD(String id, String title, String description, String category, String date, String time, String status, String subject, int iconResId) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.category = category;
        this.date = date;
        this.time = time;
        this.status = status;
        this.subject = subject;
        this.iconResId = iconResId;
        this.attachments = new ArrayList<>();
    }

    // Getters and Setters
    public String getId() {
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
        return id;
    }

    public void setId(String id) {
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
        this.id = id;
    }

    public String getTitle() {
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
        return title;
    }

    public void setTitle(String title) {
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
        this.title = title;
    }

    public String getDescription() {
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
        return description;
    }

    public void setDescription(String description) {
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
        this.description = description;
    }

    public String getCategory() {
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
        return category;
    }

    public void setCategory(String category) {
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
        this.category = category;
    }

    public String getDate() {
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
        return date;
    }

    public void setDate(String date) {
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
        this.date = date;
    }

    public String getTime() {
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
        return time;
    }

    public void setTime(String time) {
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
        this.time = time;
    }

    public String getStatus() {
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
        return status;
    }

    public void setStatus(String status) {
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
        this.status = status;
    }

    public String getSubject() {
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
        return subject;
    }

    public void setSubject(String subject) {
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
        this.subject = subject;
    }

    public int getIconResId() {
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
        return iconResId;
    }

    public void setIconResId(int iconResId) {
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
        this.iconResId = iconResId;
    }

    public List<String> getAttachments() {
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
        return attachments;
    }

    public void setAttachments(List<String> attachments) {
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
        this.attachments = attachments != null ? attachments : new ArrayList<>();
    }
}
