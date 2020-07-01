/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.chilkatsoft;

public class CkSshKey {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CkSshKey(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CkSshKey obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        chilkatJNI.delete_CkSshKey(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CkSshKey() {
    this(chilkatJNI.new_CkSshKey(), true);
  }

  public void LastErrorXml(CkString str) {
    chilkatJNI.CkSshKey_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorHtml(CkString str) {
    chilkatJNI.CkSshKey_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorText(CkString str) {
    chilkatJNI.CkSshKey_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void get_Comment(CkString str) {
    chilkatJNI.CkSshKey_get_Comment(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String comment() {
    return chilkatJNI.CkSshKey_comment(swigCPtr, this);
  }

  public void put_Comment(String newVal) {
    chilkatJNI.CkSshKey_put_Comment(swigCPtr, this, newVal);
  }

  public void get_DebugLogFilePath(CkString str) {
    chilkatJNI.CkSshKey_get_DebugLogFilePath(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String debugLogFilePath() {
    return chilkatJNI.CkSshKey_debugLogFilePath(swigCPtr, this);
  }

  public void put_DebugLogFilePath(String newVal) {
    chilkatJNI.CkSshKey_put_DebugLogFilePath(swigCPtr, this, newVal);
  }

  public boolean get_IsDsaKey() {
    return chilkatJNI.CkSshKey_get_IsDsaKey(swigCPtr, this);
  }

  public boolean get_IsPrivateKey() {
    return chilkatJNI.CkSshKey_get_IsPrivateKey(swigCPtr, this);
  }

  public boolean get_IsRsaKey() {
    return chilkatJNI.CkSshKey_get_IsRsaKey(swigCPtr, this);
  }

  public void get_KeyType(CkString str) {
    chilkatJNI.CkSshKey_get_KeyType(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String keyType() {
    return chilkatJNI.CkSshKey_keyType(swigCPtr, this);
  }

  public void get_LastErrorHtml(CkString str) {
    chilkatJNI.CkSshKey_get_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorHtml() {
    return chilkatJNI.CkSshKey_lastErrorHtml(swigCPtr, this);
  }

  public void get_LastErrorText(CkString str) {
    chilkatJNI.CkSshKey_get_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorText() {
    return chilkatJNI.CkSshKey_lastErrorText(swigCPtr, this);
  }

  public void get_LastErrorXml(CkString str) {
    chilkatJNI.CkSshKey_get_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorXml() {
    return chilkatJNI.CkSshKey_lastErrorXml(swigCPtr, this);
  }

  public boolean get_LastMethodSuccess() {
    return chilkatJNI.CkSshKey_get_LastMethodSuccess(swigCPtr, this);
  }

  public void put_LastMethodSuccess(boolean newVal) {
    chilkatJNI.CkSshKey_put_LastMethodSuccess(swigCPtr, this, newVal);
  }

  public void get_Password(CkString str) {
    chilkatJNI.CkSshKey_get_Password(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String password() {
    return chilkatJNI.CkSshKey_password(swigCPtr, this);
  }

  public void put_Password(String newVal) {
    chilkatJNI.CkSshKey_put_Password(swigCPtr, this, newVal);
  }

  public void get_UncommonOptions(CkString str) {
    chilkatJNI.CkSshKey_get_UncommonOptions(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String uncommonOptions() {
    return chilkatJNI.CkSshKey_uncommonOptions(swigCPtr, this);
  }

  public void put_UncommonOptions(String newVal) {
    chilkatJNI.CkSshKey_put_UncommonOptions(swigCPtr, this, newVal);
  }

  public boolean get_VerboseLogging() {
    return chilkatJNI.CkSshKey_get_VerboseLogging(swigCPtr, this);
  }

  public void put_VerboseLogging(boolean newVal) {
    chilkatJNI.CkSshKey_put_VerboseLogging(swigCPtr, this, newVal);
  }

  public void get_Version(CkString str) {
    chilkatJNI.CkSshKey_get_Version(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String version() {
    return chilkatJNI.CkSshKey_version(swigCPtr, this);
  }

  public boolean FromOpenSshPrivateKey(String keyStr) {
    return chilkatJNI.CkSshKey_FromOpenSshPrivateKey(swigCPtr, this, keyStr);
  }

  public boolean FromOpenSshPublicKey(String keyStr) {
    return chilkatJNI.CkSshKey_FromOpenSshPublicKey(swigCPtr, this, keyStr);
  }

  public boolean FromPuttyPrivateKey(String keyStr) {
    return chilkatJNI.CkSshKey_FromPuttyPrivateKey(swigCPtr, this, keyStr);
  }

  public boolean FromRfc4716PublicKey(String keyStr) {
    return chilkatJNI.CkSshKey_FromRfc4716PublicKey(swigCPtr, this, keyStr);
  }

  public boolean FromXml(String xmlKey) {
    return chilkatJNI.CkSshKey_FromXml(swigCPtr, this, xmlKey);
  }

  public boolean GenerateDsaKey(int numBits) {
    return chilkatJNI.CkSshKey_GenerateDsaKey(swigCPtr, this, numBits);
  }

  public boolean GenerateEcdsaKey(String curveName) {
    return chilkatJNI.CkSshKey_GenerateEcdsaKey(swigCPtr, this, curveName);
  }

  public boolean GenerateEd25519Key() {
    return chilkatJNI.CkSshKey_GenerateEd25519Key(swigCPtr, this);
  }

  public boolean GenerateRsaKey(int numBits, int exponent) {
    return chilkatJNI.CkSshKey_GenerateRsaKey(swigCPtr, this, numBits, exponent);
  }

  public boolean GenFingerprint(CkString outStr) {
    return chilkatJNI.CkSshKey_GenFingerprint(swigCPtr, this, CkString.getCPtr(outStr), outStr);
  }

  public String genFingerprint() {
    return chilkatJNI.CkSshKey_genFingerprint(swigCPtr, this);
  }

  public boolean LoadText(String filename, CkString outStr) {
    return chilkatJNI.CkSshKey_LoadText(swigCPtr, this, filename, CkString.getCPtr(outStr), outStr);
  }

  public String loadText(String filename) {
    return chilkatJNI.CkSshKey_loadText(swigCPtr, this, filename);
  }

  public boolean SaveLastError(String path) {
    return chilkatJNI.CkSshKey_SaveLastError(swigCPtr, this, path);
  }

  public boolean SaveText(String strToSave, String filename) {
    return chilkatJNI.CkSshKey_SaveText(swigCPtr, this, strToSave, filename);
  }

  public boolean ToOpenSshPrivateKey(boolean bEncrypt, CkString outStr) {
    return chilkatJNI.CkSshKey_ToOpenSshPrivateKey(swigCPtr, this, bEncrypt, CkString.getCPtr(outStr), outStr);
  }

  public String toOpenSshPrivateKey(boolean bEncrypt) {
    return chilkatJNI.CkSshKey_toOpenSshPrivateKey(swigCPtr, this, bEncrypt);
  }

  public boolean ToOpenSshPublicKey(CkString outStr) {
    return chilkatJNI.CkSshKey_ToOpenSshPublicKey(swigCPtr, this, CkString.getCPtr(outStr), outStr);
  }

  public String toOpenSshPublicKey() {
    return chilkatJNI.CkSshKey_toOpenSshPublicKey(swigCPtr, this);
  }

  public boolean ToPuttyPrivateKey(boolean bEncrypt, CkString outStr) {
    return chilkatJNI.CkSshKey_ToPuttyPrivateKey(swigCPtr, this, bEncrypt, CkString.getCPtr(outStr), outStr);
  }

  public String toPuttyPrivateKey(boolean bEncrypt) {
    return chilkatJNI.CkSshKey_toPuttyPrivateKey(swigCPtr, this, bEncrypt);
  }

  public boolean ToRfc4716PublicKey(CkString outStr) {
    return chilkatJNI.CkSshKey_ToRfc4716PublicKey(swigCPtr, this, CkString.getCPtr(outStr), outStr);
  }

  public String toRfc4716PublicKey() {
    return chilkatJNI.CkSshKey_toRfc4716PublicKey(swigCPtr, this);
  }

  public boolean ToXml(CkString outStr) {
    return chilkatJNI.CkSshKey_ToXml(swigCPtr, this, CkString.getCPtr(outStr), outStr);
  }

  public String toXml() {
    return chilkatJNI.CkSshKey_toXml(swigCPtr, this);
  }

}
