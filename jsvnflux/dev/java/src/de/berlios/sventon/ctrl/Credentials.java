package de.berlios.sventon.ctrl;

/**
 * Wrapper class to hold credentials data.
 * 
 * @author patrikfr@users.berlios.de
 *
 */
public class Credentials {

  /** Password. */
  private String pwd;

  /** The user identification. */
  private String uid;

  /**
   * @return Returns the password.
   */
  public final String getPwd() {
    return pwd;
  }

  /**
   * @param pwd The password to set.
   */
  public final void setPwd(String pwd) {
    this.pwd = pwd;
  }

  /**
   * @return Returns the user id.
   */
  public final String getUid() {
    return uid;
  }

  /**
   * @param uid The user id to set.
   */
  public final void setUid(String uid) {
    this.uid = uid;
  }

  /**
   * {@inheritDoc}
   */
  public String toString() {
    return "Credential{" + 
    "uid=" + uid +
    ", pwd=(nope, will not tell)";
  }

}