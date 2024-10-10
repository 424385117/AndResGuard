package com.tencent.gradle

class AndResGuardAssetsMappingExtension {

  public boolean enable
  public String fileName
  public String password

  AndResGuardAssetsMappingExtension() {
    enable = false
    fileName = "res_mapping.txt"
    password = ""
  }

  @Override
  String toString() {
    """| enable = ${this.enable}
           | fileName = ${this.fileName}
           | password = ${this.password}
        """.stripMargin()
  }
}