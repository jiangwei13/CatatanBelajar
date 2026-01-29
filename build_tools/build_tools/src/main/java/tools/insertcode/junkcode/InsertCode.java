package tools.insertcode.junkcode;

import java.util.Random;

public class InsertCode {




    public static String generateDynamicJunkCode4() {


        Random random = new Random();
        // 随机生成所有的变量名
        String methodName = "insertCode_" + getRandomString();
        String arrayName = "arr_" + getRandomString();
        String outerLoopVar = "i_" + getRandomString();
        String innerLoopVar = "j_" + getRandomString();
        String tempVar = "tmp_" + getRandomString();

        // 构造代码字符串
        StringBuilder sb = new StringBuilder();
        sb.append("    public static void ").append(methodName).append("() {\n");
        sb.append("        int[] ").append(arrayName).append(" = new int[] { ").append(random.nextInt(10)).append(", ").append(random.nextInt(10)).append(" };\n");
        sb.append("        for (int ").append(outerLoopVar).append(" = 0; ").append(outerLoopVar).append(" < ").append(arrayName).append(".length - 1; ").append(outerLoopVar).append("++) {\n");
        sb.append("            for (int ").append(innerLoopVar).append(" = 0; ").append(innerLoopVar).append(" < ").append(arrayName).append(".length - 1 - ").append(outerLoopVar).append("; ").append(innerLoopVar).append("++) {\n");
        sb.append("                if (").append(arrayName).append("[").append(innerLoopVar).append("] > ").append(arrayName).append("[").append(innerLoopVar).append(" + 1]) {\n");
        sb.append("                    int ").append(tempVar).append(" = ").append(arrayName).append("[").append(innerLoopVar).append("];\n");
        sb.append("                    ").append(arrayName).append("[").append(innerLoopVar).append("] = ").append(arrayName).append("[").append(innerLoopVar).append(" + 1];\n");
        sb.append("                    ").append(arrayName).append("[").append(innerLoopVar).append(" + 1] = ").append(tempVar).append(";\n");
        sb.append("                }\n");
        sb.append("            }\n");
        sb.append("        }\n");
        sb.append("    }");

        return sb.toString();

    }

    public static String generateDynamicJunkCode3() {


        Random random = new Random();

        // 1. 随机生成变量名（仅限字母，确保符合 Java 命名规范）
        String methodName = "ona" + getRandomString();
        String stateVar = "ckuy" + getRandomString();
        String loopVar = "pmh_" + getRandomString();

        // 2. 随机生成初始值和循环次数，增加动态性
        int initialValue = random.nextInt(1000) + 1;
        int maxLoop = random.nextInt(50) + 50; // 50-100 次循环

        // 3. 构造源码字符串
        StringBuilder sb = new StringBuilder();
        sb.append("    public static void ").append(methodName).append("() {\n");
        sb.append("        int ").append(stateVar).append(" = ").append(initialValue).append(";\n");
        sb.append("        for (int ").append(loopVar).append(" = 0; ").append(loopVar).append(" < ").append(maxLoop).append("; ").append(loopVar).append("++) {\n");
        sb.append("            ").append(stateVar).append(" ^= (").append(stateVar).append(" << "+random.nextInt(100)+");\n");
        sb.append("            ").append(stateVar).append(" ^= (").append(stateVar).append(" >>> "+random.nextInt(50)+");\n");
        sb.append("            ").append(stateVar).append(" ^= (").append(stateVar).append(" << "+random.nextInt(70)+");\n");
        sb.append("            // 混淆用判断流\n");
        sb.append("            if (").append(stateVar).append(" == 0) {\n");
        sb.append("                ").append(stateVar).append(" = ").append(loopVar).append(";\n");
        sb.append("            }\n");
        sb.append("        }\n");
        sb.append("    }");

        return sb.toString();


    }
    public static String generateDynamicJunkCode2() {

        Random random = new Random();
        // 1. 随机生成变量名和方法名
        String methodName = "process_" + getRandomString();
        String arrayName = "stack_" + getRandomString();
        String outerIdx = "i_" + getRandomString();
        String innerIdx = "j_" + getRandomString();
        String tempVar = "val_" + getRandomString();

        // 2. 随机生成数组长度 (3-6之间) 和 初始内容
        int arrayLength = random.nextInt(4) + 3;
        StringBuilder arrayContent = new StringBuilder();
        for (int k = 0; k < arrayLength; k++) {
            arrayContent.append(random.nextInt(100));
            if (k < arrayLength - 1) arrayContent.append(", ");
        }

        // 3. 构造源码字符串
        StringBuilder sb = new StringBuilder();
        sb.append("    public static void ").append(methodName).append("() {\n");
        sb.append("        // 栈上分配的小数组，内存开销极低\n");
        sb.append("        int[] ").append(arrayName).append(" = {").append(arrayContent).append("};\n");
        sb.append("        for (int ").append(outerIdx).append(" = 0; ").append(outerIdx).append(" < ").append(arrayName).append(".length; ").append(outerIdx).append("++) {\n");
        sb.append("            for (int ").append(innerIdx).append(" = ").append(outerIdx).append(" + 1; ").append(innerIdx).append(" < ").append(arrayName).append(".length; ").append(innerIdx).append("++) {\n");
        sb.append("                if (").append(arrayName).append("[").append(outerIdx).append("] > ").append(arrayName).append("[").append(innerIdx).append("]) {\n");
        sb.append("                    int ").append(tempVar).append(" = ").append(arrayName).append("[").append(outerIdx).append("];\n");
        sb.append("                    ").append(arrayName).append("[").append(outerIdx).append("] = ").append(arrayName).append("[").append(innerIdx).append("];\n");
        sb.append("                    ").append(arrayName).append("[").append(innerIdx).append("] = ").append(tempVar).append(";\n");
        sb.append("                }\n");
        sb.append("            }\n");
        sb.append("        }\n");
        sb.append("    }");

        return sb.toString();


    }
    public static String generateDynamicJunkCode() {


        int index = new Random().nextInt(5);

        String arrayName = "arr_" + getRandomString();
        String outerLoop = "i_" + getRandomString();
        String innerLoop = "j_" + getRandomString();
        String tempVar = "tmp_" + getRandomString();

        return "    public static void junkMethod_" + index + "() {\n" +
                "        int[] " + arrayName + " = new int[] { " + new Random().nextInt(100) + ", " + new Random().nextInt(100) + " };\n" +
                "        for (int " + outerLoop + " = 0; " + outerLoop + " < " + arrayName + ".length - 1; " + outerLoop + "++) {\n" +
                "            for (int " + innerLoop + " = 0; " + innerLoop + " < " + arrayName + ".length - 1 - " + outerLoop + "; " + innerLoop + "++) {\n" +
                "                if (" + arrayName + "[" + innerLoop + "] > " + arrayName + "[" + innerLoop + " + 1]) {\n" +
                "                    int " + tempVar + " = " + arrayName + "[" + innerLoop + "];\n" +
                "                    " + arrayName + "[" + innerLoop + "] = " + arrayName + "[" + innerLoop + " + 1];\n" +
                "                    " + arrayName + "[" + innerLoop + " + 1] = " + tempVar + ";\n" +
                "                }\n" +
                "            }\n" +
                "        }\n" +
                "    }";
    }




    private static String getRandomString() {
        int length = new Random().nextInt(5,20);
        String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();
        Random rd = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(chars.charAt(rd.nextInt(chars.length())));
        }
        return sb.toString();
    }





}
