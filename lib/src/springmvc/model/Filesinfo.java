package springmvc.model;

import java.util.Date;

public class Filesinfo {
    private Integer id;

    private String filename;

    private String path;

    private String upuser;

    private Date uptime;

    private Byte isdelete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public String getUpuser() {
        return upuser;
    }

    public void setUpuser(String upuser) {
        this.upuser = upuser == null ? null : upuser.trim();
    }

    public Date getUptime() {
        return uptime;
    }

    public void setUptime(Date uptime) {
        this.uptime = uptime;
    }

    public Byte getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Byte isdelete) {
        this.isdelete = isdelete;
    }
}