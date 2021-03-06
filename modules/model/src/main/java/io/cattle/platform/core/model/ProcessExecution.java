/*
 * This file is generated by jOOQ.
*/
package io.cattle.platform.core.model;


import java.io.Serializable;
import java.util.Date;
import java.util.Map;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Entity
@Table(name = "process_execution", schema = "cattle")
public interface ProcessExecution extends Serializable {

    /**
     * Setter for <code>cattle.process_execution.id</code>.
     */
    public void setId(Long value);

    /**
     * Getter for <code>cattle.process_execution.id</code>.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false, precision = 19)
    public Long getId();

    /**
     * Setter for <code>cattle.process_execution.process_instance_id</code>.
     */
    public void setProcessInstanceId(Long value);

    /**
     * Getter for <code>cattle.process_execution.process_instance_id</code>.
     */
    @Column(name = "process_instance_id", nullable = false, precision = 19)
    public Long getProcessInstanceId();

    /**
     * Setter for <code>cattle.process_execution.uuid</code>.
     */
    public void setUuid(String value);

    /**
     * Getter for <code>cattle.process_execution.uuid</code>.
     */
    @Column(name = "uuid", unique = true, nullable = false, length = 128)
    public String getUuid();

    /**
     * Setter for <code>cattle.process_execution.log</code>.
     */
    public void setLog(Map<String,Object> value);

    /**
     * Getter for <code>cattle.process_execution.log</code>.
     */
    @Column(name = "log", length = 16777215)
    public Map<String,Object> getLog();

    /**
     * Setter for <code>cattle.process_execution.created</code>.
     */
    public void setCreated(Date value);

    /**
     * Getter for <code>cattle.process_execution.created</code>.
     */
    @Column(name = "created")
    public Date getCreated();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface ProcessExecution
     */
    public void from(io.cattle.platform.core.model.ProcessExecution from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface ProcessExecution
     */
    public <E extends io.cattle.platform.core.model.ProcessExecution> E into(E into);
}
