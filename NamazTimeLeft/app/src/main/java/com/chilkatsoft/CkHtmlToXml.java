/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.chilkatsoft;

public class CkHtmlToXml {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CkHtmlToXml(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CkHtmlToXml obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        chilkatJNI.delete_CkHtmlToXml(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CkHtmlToXml() {
    this(chilkatJNI.new_CkHtmlToXml(), true);
  }

  public void LastErrorXml(CkString str) {
    chilkatJNI.CkHtmlToXml_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorHtml(CkString str) {
    chilkatJNI.CkHtmlToXml_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorText(CkString str) {
    chilkatJNI.CkHtmlToXml_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void get_DebugLogFilePath(CkString str) {
    chilkatJNI.CkHtmlToXml_get_DebugLogFilePath(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String debugLogFilePath() {
    return chilkatJNI.CkHtmlToXml_debugLogFilePath(swigCPtr, this);
  }

  public void put_DebugLogFilePath(String newVal) {
    chilkatJNI.CkHtmlToXml_put_DebugLogFilePath(swigCPtr, this, newVal);
  }

  public boolean get_DropCustomTags() {
    return chilkatJNI.CkHtmlToXml_get_DropCustomTags(swigCPtr, this);
  }

  public void put_DropCustomTags(boolean newVal) {
    chilkatJNI.CkHtmlToXml_put_DropCustomTags(swigCPtr, this, newVal);
  }

  public void get_Html(CkString str) {
    chilkatJNI.CkHtmlToXml_get_Html(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String html() {
    return chilkatJNI.CkHtmlToXml_html(swigCPtr, this);
  }

  public void put_Html(String newVal) {
    chilkatJNI.CkHtmlToXml_put_Html(swigCPtr, this, newVal);
  }

  public void get_LastErrorHtml(CkString str) {
    chilkatJNI.CkHtmlToXml_get_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorHtml() {
    return chilkatJNI.CkHtmlToXml_lastErrorHtml(swigCPtr, this);
  }

  public void get_LastErrorText(CkString str) {
    chilkatJNI.CkHtmlToXml_get_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorText() {
    return chilkatJNI.CkHtmlToXml_lastErrorText(swigCPtr, this);
  }

  public void get_LastErrorXml(CkString str) {
    chilkatJNI.CkHtmlToXml_get_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorXml() {
    return chilkatJNI.CkHtmlToXml_lastErrorXml(swigCPtr, this);
  }

  public boolean get_LastMethodSuccess() {
    return chilkatJNI.CkHtmlToXml_get_LastMethodSuccess(swigCPtr, this);
  }

  public void put_LastMethodSuccess(boolean newVal) {
    chilkatJNI.CkHtmlToXml_put_LastMethodSuccess(swigCPtr, this, newVal);
  }

  public int get_Nbsp() {
    return chilkatJNI.CkHtmlToXml_get_Nbsp(swigCPtr, this);
  }

  public void put_Nbsp(int newVal) {
    chilkatJNI.CkHtmlToXml_put_Nbsp(swigCPtr, this, newVal);
  }

  public boolean get_VerboseLogging() {
    return chilkatJNI.CkHtmlToXml_get_VerboseLogging(swigCPtr, this);
  }

  public void put_VerboseLogging(boolean newVal) {
    chilkatJNI.CkHtmlToXml_put_VerboseLogging(swigCPtr, this, newVal);
  }

  public void get_Version(CkString str) {
    chilkatJNI.CkHtmlToXml_get_Version(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String version() {
    return chilkatJNI.CkHtmlToXml_version(swigCPtr, this);
  }

  public void get_XmlCharset(CkString str) {
    chilkatJNI.CkHtmlToXml_get_XmlCharset(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String xmlCharset() {
    return chilkatJNI.CkHtmlToXml_xmlCharset(swigCPtr, this);
  }

  public void put_XmlCharset(String newVal) {
    chilkatJNI.CkHtmlToXml_put_XmlCharset(swigCPtr, this, newVal);
  }

  public boolean ConvertFile(String inHtmlPath, String destXmlPath) {
    return chilkatJNI.CkHtmlToXml_ConvertFile(swigCPtr, this, inHtmlPath, destXmlPath);
  }

  public void DropTagType(String tagName) {
    chilkatJNI.CkHtmlToXml_DropTagType(swigCPtr, this, tagName);
  }

  public void DropTextFormattingTags() {
    chilkatJNI.CkHtmlToXml_DropTextFormattingTags(swigCPtr, this);
  }

  public boolean IsUnlocked() {
    return chilkatJNI.CkHtmlToXml_IsUnlocked(swigCPtr, this);
  }

  public boolean ReadFile(String path, CkByteData outBytes) {
    return chilkatJNI.CkHtmlToXml_ReadFile(swigCPtr, this, path, CkByteData.getCPtr(outBytes), outBytes);
  }

  public boolean ReadFileToString(String filename, String srcCharset, CkString outStr) {
    return chilkatJNI.CkHtmlToXml_ReadFileToString(swigCPtr, this, filename, srcCharset, CkString.getCPtr(outStr), outStr);
  }

  public String readFileToString(String filename, String srcCharset) {
    return chilkatJNI.CkHtmlToXml_readFileToString(swigCPtr, this, filename, srcCharset);
  }

  public boolean SaveLastError(String path) {
    return chilkatJNI.CkHtmlToXml_SaveLastError(swigCPtr, this, path);
  }

  public boolean SetHtmlBd(CkBinData bd) {
    return chilkatJNI.CkHtmlToXml_SetHtmlBd(swigCPtr, this, CkBinData.getCPtr(bd), bd);
  }

  public void SetHtmlBytes(CkByteData inData) {
    chilkatJNI.CkHtmlToXml_SetHtmlBytes(swigCPtr, this, CkByteData.getCPtr(inData), inData);
  }

  public boolean SetHtmlFromFile(String filename) {
    return chilkatJNI.CkHtmlToXml_SetHtmlFromFile(swigCPtr, this, filename);
  }

  public boolean ToXml(CkString outStr) {
    return chilkatJNI.CkHtmlToXml_ToXml(swigCPtr, this, CkString.getCPtr(outStr), outStr);
  }

  public String toXml() {
    return chilkatJNI.CkHtmlToXml_toXml(swigCPtr, this);
  }

  public boolean ToXmlSb(CkStringBuilder sb) {
    return chilkatJNI.CkHtmlToXml_ToXmlSb(swigCPtr, this, CkStringBuilder.getCPtr(sb), sb);
  }

  public void UndropTagType(String tagName) {
    chilkatJNI.CkHtmlToXml_UndropTagType(swigCPtr, this, tagName);
  }

  public void UndropTextFormattingTags() {
    chilkatJNI.CkHtmlToXml_UndropTextFormattingTags(swigCPtr, this);
  }

  public boolean UnlockComponent(String unlockCode) {
    return chilkatJNI.CkHtmlToXml_UnlockComponent(swigCPtr, this, unlockCode);
  }

  public boolean WriteFile(String path, CkByteData fileData) {
    return chilkatJNI.CkHtmlToXml_WriteFile(swigCPtr, this, path, CkByteData.getCPtr(fileData), fileData);
  }

  public boolean WriteStringToFile(String stringToWrite, String filename, String charset) {
    return chilkatJNI.CkHtmlToXml_WriteStringToFile(swigCPtr, this, stringToWrite, filename, charset);
  }

  public boolean Xml(CkString outStr) {
    return chilkatJNI.CkHtmlToXml_Xml(swigCPtr, this, CkString.getCPtr(outStr), outStr);
  }

  public String xml() {
    return chilkatJNI.CkHtmlToXml_xml(swigCPtr, this);
  }

}
