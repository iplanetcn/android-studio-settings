#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")
public final class ${NAME} {
  /**
     * 工具类,避免初始化
     */
    private ${NAME}() {}
}
