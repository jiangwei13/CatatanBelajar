package tools.insertcode


import tools.BaseBuilder
import java.io.File
import java.util.Random


class InsertKotlinCode : BaseBuilder("","",1){

    companion object {
 
        val methodNumMin = 5
        val methodNumMax= 20


//        @JvmStatic
//        fun main(args: Array<String>) {
//
//        }

        fun insertKotlinCode(){
            //当前项目
            val file = File(System.getProperty("user.dir"))
            System.out.println("main file ${file.absolutePath}")
            //模板代码文件
            findJavaFile(file)
        }








        private fun findJavaFile(file: File) {

            if (file.isDirectory()&& (file.name.equals("androidTest")|| file.name.equals("test") || file.name.equals("insertCode"))){
                System.out.println("过滤文件 ${file.absolutePath}")
            }else if (file.isDirectory()) {
                file.listFiles().forEach {
                    findJavaFile(it)
                }
            }//不处理build目录下的文件 和模板文件
            else if (!file.absolutePath.contains("build")) {
                val isJavaFile = file.name.endsWith(".kt")
                if (isJavaFile) {
                    injectCodeToFile(file)
//                    getJavaMethods(file.absolutePath)
//                    System.out.println("file ${file.name} 写完了")
                }
            }
        }






        fun getJavaMethods(filePath: String) {

            val file = File(filePath)
            if (!file.exists()) return

            val content = file.readText()

            // 更加严谨的正则表达式：
            // 匹配 fun 关键字 + 空格 + 方法名 + (
            val regex = Regex("""fun\s+([a-zA-Z0-9_]+)\s*[\(<]""")

            val matches = regex.findAll(content)
            matches.forEach { matchResult ->
                // groupValues[1] 是括号里匹配到的第一个组（即方法名）
                val methodName = matchResult.groupValues[1]
                println("从源码中找到方法: $methodName")
            }
        }






        fun injectCodeToFile(file: File) {
            val lines = file.readLines()
            val result = mutableListOf<String>()
            var modified = false

            for (line in lines) {
                result.add(line)

                // 匹配原则：包含 fun 关键字，且包含 {
                // 排除：已经包含 insertCode1 的方法（防止重复插入），排除接口和抽象方法
                if (line.contains("fun ") && line.contains("{")
                    && !line.contains("abstract ")
                ) {
                    // 获取缩进量
                    val indent = line.takeWhile { it.isWhitespace() }
                    val innerIndent = "$indent    "

                    // 将垃圾代码按行处理并添加缩进
                    val formattedJunkCode =  getRandomFun().lines().joinToString("\n") {
                        println("成功加入:${it}")
                        if (it.isBlank()) it else innerIndent + it
                    }

                    result.add(formattedJunkCode)
                    modified = true
                }
            }

            if (modified) {
                file.writeText(result.joinToString("\n"))
                println("已修改: ${file.absolutePath}"+result.joinToString("\n"))
            }
        }


        fun getRandomFun(): String{
//            val JUNK_LIST = listOf(generateDynamicJunkCode(), generateDynamicJunkCode2(), generateDynamicJunkCode3(), generateDynamicJunkCode4())
            val random = (0..3).random()
            println("nextInt======: ${random}")
            when(random){
                0->{
                    return generateDynamicJunkCode()
                }

                1->{
                    return generateDynamicJunkCode2()
                }

                2->{
                    return generateDynamicJunkCode3()
                }

                3->{
                    return generateDynamicJunkCode4()
                }
            }


            return generateDynamicJunkCode()
        }




        fun generateDynamicJunkCode4(): String {

            val random = Random()
            val arrayName =   getRandomString()
            val codeMethod1 = getRandomString()
            val codeMethod2 = getRandomString()
            val codeMethod3 = getRandomString()

            

            return """
          val ${arrayName} = intArrayOf(${random.nextInt(100)}, ${random.nextInt(100)})
            for (${codeMethod1}  in 1..<${arrayName} .size) {
                val ${codeMethod2}  = ${arrayName} [${codeMethod1} ]
                var ${codeMethod3}  = ${codeMethod1} 
                while (${codeMethod3}  > 0 && ${codeMethod2}  < ${arrayName} [${codeMethod3}  - 1]) {
                    ${arrayName} [${codeMethod3} ] =
                        ${arrayName} [${codeMethod3}  - 1]
                    ${codeMethod3} --
                }
                ${arrayName} [${codeMethod3} ] =
                    ${codeMethod2} 
            }
    """.trimIndent()
        }





        /**
         * 动态生成 Kotlin 格式的垃圾代码字符串
         */
        fun generateDynamicJunkCode3(): String {
            val random = Random()

            val arrayName =   getRandomString()
            val mCodeMethod1 = getRandomString()
            val mCodeMethod2 = getRandomString()
            val mCodeMethod3 =  getRandomString()
            val mCodeMethod4 =  getRandomString()
            val mCodeMethod5 =  getRandomString()

            
           return """
                      val ${arrayName} = intArrayOf(${random.nextInt(100)}, ${random.nextInt(100)})
        val ${mCodeMethod1} = ${arrayName}.size
        for (${mCodeMethod2}  in 0..<${mCodeMethod1}  - 1) {
            var ${mCodeMethod3}  = ${mCodeMethod2} 
            for (${mCodeMethod4}  in ${mCodeMethod2}  + 1..<${mCodeMethod1} ) {
                if (${arrayName}[${mCodeMethod3} ] > ${arrayName}[${mCodeMethod4} ]) {
                    ${mCodeMethod3}  = ${mCodeMethod4} 
                }
            }
            if (${mCodeMethod3}  != ${mCodeMethod2} ) {
                val ${mCodeMethod5}  = ${arrayName}[${mCodeMethod2} ]
                ${arrayName}[${mCodeMethod2} ] =
                    ${arrayName}[${mCodeMethod3} ]
                ${arrayName}[${mCodeMethod3} ] = ${mCodeMethod5} 
            }
        }
""".trimIndent()
            
            
        }
        fun generateDynamicJunkCode2(): String {

            val random = Random()

            val arrayName = "arr_${getRandomString()}"
            val mMethodName1 = "ad_${getRandomString()}"
            val mMethodName2 = "sd${getRandomString()}"
            val mMethodName3 = "cxad_${getRandomString()}"
            val mMethodName4 = "cxad_${getRandomString()}"
            val mMethodName5 = "cxad_${getRandomString()}"

            return  """
             val ${arrayName} = intArrayOf(${random.nextInt(100)}, ${random.nextInt(100)})
                val ${mMethodName1} = ${random.nextInt(10)}
                var ${mMethodName2} = 0
                var ${mMethodName3} = ${arrayName} .size - 1
                var ${mMethodName4} = 0
                if ( ${mMethodName1} < ${arrayName} [${mMethodName2}] ||  ${mMethodName1} > ${arrayName} [${mMethodName3}] || ${mMethodName2} > ${mMethodName3}) {
                    val ${mMethodName5} = 1
                } else {
                    while (${mMethodName2} <= ${mMethodName3}) {
                        ${mMethodName4} = (${mMethodName2} + ${mMethodName3}) / 2
                        if (${arrayName} [${mMethodName4}] >  ${mMethodName1}) {
                            // 比关键字大则关键字在左区域
                            ${mMethodName3} = ${mMethodName4} - 1
                        } else if (${arrayName} [${mMethodName4}] <  ${mMethodName1}) {
                            // 比关键字小则关键字在右区域
                            ${mMethodName2} = ${mMethodName4} + 1
                        } else {
                        }
                    }
                }
""".trimIndent()
        
        }
            
            
            
            fun generateDynamicJunkCode(): String {
 
            val random = Random()

            // 随机生成变量名和函数名
            val arrayName = "arr_${getRandomString()}"
            val outerLoop = "i_${getRandomString()}"
            val innerLoop = "j_${getRandomString()}"
            val tempVar = "tmp_${getRandomString()}"

            // 使用 Kotlin 的三引号字符串 (""")，支持多行且不需要大量的 \n 和 + 号
            // 使用 $ 符号直接嵌入变量
            return """
                        val $arrayName = intArrayOf(${random.nextInt(100)}, ${random.nextInt(100)})
                        for ($outerLoop in 0 until $arrayName.size - 1) {
                            for ($innerLoop in 0 until $arrayName.size - 1 - $outerLoop) {
                                if ($arrayName[$innerLoop] > $arrayName[$innerLoop + 1]) {
                                    val $tempVar = $arrayName[$innerLoop]
                                    $arrayName[$innerLoop] = $arrayName[$innerLoop + 1]
                                    $arrayName[$innerLoop + 1] = $tempVar
                                }
                            }
                        }
    """.trimIndent()
        }
        
        
        
        
        
        
        
        
        

        /**
         * 生成随机字符串
         */
        private fun getRandomString(): String {
            val random = Random()
           val length =  random.nextInt(methodNumMin,methodNumMax)
            val chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
            // Kotlin 风格的随机字符串生成：更加简洁
            return (1..length)
                .map { chars.random() }
                .joinToString("")
        }
 

    }

}

