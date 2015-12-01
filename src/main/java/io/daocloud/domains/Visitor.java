package io.daocloud.domains;

import java.util.Date;

/**
 * Created by Rocky on 15/11/27.
 */
public class Visitor {

    String id;
    String ip;
    Date visitDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Date getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(Date visitDate) {
        this.visitDate = visitDate;
    }
}
