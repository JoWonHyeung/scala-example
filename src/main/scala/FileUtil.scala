import net.lingala.zip4j.ZipFile
import net.lingala.zip4j.model.ZipParameters
import net.lingala.zip4j.model.enums.EncryptionMethod

import java.io.File

object FileUtil {

  /**
   * .zip 암호 암축
   *
   * @param output 생성될 zip 파일 경로
   * @param source 압축할 폴더 경로
   * @param password 암호
   */
  def compressToZip(source: String, output: String, password: String): Unit = {
    // Zip 파일 생성 및 암호화 설정
    val zipFile = new ZipFile(output, password.toCharArray)
    val zipParameters = new ZipParameters()
    zipParameters.setEncryptFiles(true)
    zipParameters.setEncryptionMethod(EncryptionMethod.AES) // 암호화 방법 설정 (예: ZIP_STANDARD, AES)

    // 폴더를 zip 파일로 압축
    zipFile.addFolder(new java.io.File(source), zipParameters)
  }

}
