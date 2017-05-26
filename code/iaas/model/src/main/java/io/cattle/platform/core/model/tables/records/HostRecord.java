/**
 * This class is generated by jOOQ
 */
package io.cattle.platform.core.model.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "host", schema = "cattle")
public class HostRecord extends org.jooq.impl.UpdatableRecordImpl<io.cattle.platform.core.model.tables.records.HostRecord> implements io.cattle.platform.db.jooq.utils.TableRecordJaxb, io.cattle.platform.core.model.Host {

	private static final long serialVersionUID = -2040513012;

	/**
	 * Setter for <code>cattle.host.id</code>.
	 */
	@Override
	public void setId(java.lang.Long value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>cattle.host.id</code>.
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 19)
	@Override
	public java.lang.Long getId() {
		return (java.lang.Long) getValue(0);
	}

	/**
	 * Setter for <code>cattle.host.name</code>.
	 */
	@Override
	public void setName(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>cattle.host.name</code>.
	 */
	@javax.persistence.Column(name = "name", length = 255)
	@Override
	public java.lang.String getName() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>cattle.host.account_id</code>.
	 */
	@Override
	public void setAccountId(java.lang.Long value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>cattle.host.account_id</code>.
	 */
	@javax.persistence.Column(name = "account_id", precision = 19)
	@Override
	public java.lang.Long getAccountId() {
		return (java.lang.Long) getValue(2);
	}

	/**
	 * Setter for <code>cattle.host.kind</code>.
	 */
	@Override
	public void setKind(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>cattle.host.kind</code>.
	 */
	@javax.persistence.Column(name = "kind", nullable = false, length = 255)
	@Override
	public java.lang.String getKind() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>cattle.host.uuid</code>.
	 */
	@Override
	public void setUuid(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>cattle.host.uuid</code>.
	 */
	@javax.persistence.Column(name = "uuid", unique = true, nullable = false, length = 128)
	@Override
	public java.lang.String getUuid() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>cattle.host.description</code>.
	 */
	@Override
	public void setDescription(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>cattle.host.description</code>.
	 */
	@javax.persistence.Column(name = "description", length = 1024)
	@Override
	public java.lang.String getDescription() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>cattle.host.state</code>.
	 */
	@Override
	public void setState(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>cattle.host.state</code>.
	 */
	@javax.persistence.Column(name = "state", nullable = false, length = 128)
	@Override
	public java.lang.String getState() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>cattle.host.created</code>.
	 */
	@Override
	public void setCreated(java.util.Date value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>cattle.host.created</code>.
	 */
	@javax.persistence.Column(name = "created")
	@Override
	public java.util.Date getCreated() {
		return (java.util.Date) getValue(7);
	}

	/**
	 * Setter for <code>cattle.host.removed</code>.
	 */
	@Override
	public void setRemoved(java.util.Date value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>cattle.host.removed</code>.
	 */
	@javax.persistence.Column(name = "removed")
	@Override
	public java.util.Date getRemoved() {
		return (java.util.Date) getValue(8);
	}

	/**
	 * Setter for <code>cattle.host.remove_time</code>.
	 */
	@Override
	public void setRemoveTime(java.util.Date value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>cattle.host.remove_time</code>.
	 */
	@javax.persistence.Column(name = "remove_time")
	@Override
	public java.util.Date getRemoveTime() {
		return (java.util.Date) getValue(9);
	}

	/**
	 * Setter for <code>cattle.host.data</code>.
	 */
	@Override
	public void setData(java.util.Map<String,Object> value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>cattle.host.data</code>.
	 */
	@javax.persistence.Column(name = "data", length = 16777215)
	@Override
	public java.util.Map<String,Object> getData() {
		return (java.util.Map<String,Object>) getValue(10);
	}

	/**
	 * Setter for <code>cattle.host.uri</code>.
	 */
	@Override
	public void setUri(java.lang.String value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>cattle.host.uri</code>.
	 */
	@javax.persistence.Column(name = "uri", length = 255)
	@Override
	public java.lang.String getUri() {
		return (java.lang.String) getValue(11);
	}

	/**
	 * Setter for <code>cattle.host.compute_free</code>.
	 */
	@Override
	public void setComputeFree(java.lang.Long value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>cattle.host.compute_free</code>.
	 */
	@javax.persistence.Column(name = "compute_free", precision = 19)
	@Override
	public java.lang.Long getComputeFree() {
		return (java.lang.Long) getValue(12);
	}

	/**
	 * Setter for <code>cattle.host.compute_total</code>.
	 */
	@Override
	public void setComputeTotal(java.lang.Long value) {
		setValue(13, value);
	}

	/**
	 * Getter for <code>cattle.host.compute_total</code>.
	 */
	@javax.persistence.Column(name = "compute_total", precision = 19)
	@Override
	public java.lang.Long getComputeTotal() {
		return (java.lang.Long) getValue(13);
	}

	/**
	 * Setter for <code>cattle.host.agent_id</code>.
	 */
	@Override
	public void setAgentId(java.lang.Long value) {
		setValue(14, value);
	}

	/**
	 * Getter for <code>cattle.host.agent_id</code>.
	 */
	@javax.persistence.Column(name = "agent_id", precision = 19)
	@Override
	public java.lang.Long getAgentId() {
		return (java.lang.Long) getValue(14);
	}

	/**
	 * Setter for <code>cattle.host.physical_host_id</code>.
	 */
	@Override
	public void setPhysicalHostId(java.lang.Long value) {
		setValue(15, value);
	}

	/**
	 * Getter for <code>cattle.host.physical_host_id</code>.
	 */
	@javax.persistence.Column(name = "physical_host_id", precision = 19)
	@Override
	public java.lang.Long getPhysicalHostId() {
		return (java.lang.Long) getValue(15);
	}

	/**
	 * Setter for <code>cattle.host.is_public</code>.
	 */
	@Override
	public void setIsPublic(java.lang.Boolean value) {
		setValue(16, value);
	}

	/**
	 * Getter for <code>cattle.host.is_public</code>.
	 */
	@javax.persistence.Column(name = "is_public", nullable = false, precision = 1)
	@Override
	public java.lang.Boolean getIsPublic() {
		return (java.lang.Boolean) getValue(16);
	}

	/**
	 * Setter for <code>cattle.host.agent_state</code>.
	 */
	@Override
	public void setAgentState(java.lang.String value) {
		setValue(17, value);
	}

	/**
	 * Getter for <code>cattle.host.agent_state</code>.
	 */
	@javax.persistence.Column(name = "agent_state", length = 128)
	@Override
	public java.lang.String getAgentState() {
		return (java.lang.String) getValue(17);
	}

	/**
	 * Setter for <code>cattle.host.local_storage_mb</code>.
	 */
	@Override
	public void setLocalStorageMb(java.lang.Long value) {
		setValue(18, value);
	}

	/**
	 * Getter for <code>cattle.host.local_storage_mb</code>.
	 */
	@javax.persistence.Column(name = "local_storage_mb", precision = 19)
	@Override
	public java.lang.Long getLocalStorageMb() {
		return (java.lang.Long) getValue(18);
	}

	/**
	 * Setter for <code>cattle.host.memory</code>.
	 */
	@Override
	public void setMemory(java.lang.Long value) {
		setValue(19, value);
	}

	/**
	 * Getter for <code>cattle.host.memory</code>.
	 */
	@javax.persistence.Column(name = "memory", precision = 19)
	@Override
	public java.lang.Long getMemory() {
		return (java.lang.Long) getValue(19);
	}

	/**
	 * Setter for <code>cattle.host.milli_cpu</code>.
	 */
	@Override
	public void setMilliCpu(java.lang.Long value) {
		setValue(20, value);
	}

	/**
	 * Getter for <code>cattle.host.milli_cpu</code>.
	 */
	@javax.persistence.Column(name = "milli_cpu", precision = 19)
	@Override
	public java.lang.Long getMilliCpu() {
		return (java.lang.Long) getValue(20);
	}

	/**
	 * Setter for <code>cattle.host.environment_id</code>.
	 */
	@Override
	public void setStackId(java.lang.Long value) {
		setValue(21, value);
	}

	/**
	 * Getter for <code>cattle.host.environment_id</code>.
	 */
	@javax.persistence.Column(name = "environment_id", precision = 19)
	@Override
	public java.lang.Long getStackId() {
		return (java.lang.Long) getValue(21);
	}

	/**
	 * Setter for <code>cattle.host.remove_after</code>.
	 */
	@Override
	public void setRemoveAfter(java.util.Date value) {
		setValue(22, value);
	}

	/**
	 * Getter for <code>cattle.host.remove_after</code>.
	 */
	@javax.persistence.Column(name = "remove_after")
	@Override
	public java.util.Date getRemoveAfter() {
		return (java.util.Date) getValue(22);
	}

	/**
	 * Setter for <code>cattle.host.host_template_id</code>.
	 */
	@Override
	public void setHostTemplateId(java.lang.Long value) {
		setValue(23, value);
	}

	/**
	 * Getter for <code>cattle.host.host_template_id</code>.
	 */
	@javax.persistence.Column(name = "host_template_id", precision = 19)
	@Override
	public java.lang.Long getHostTemplateId() {
		return (java.lang.Long) getValue(23);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Long> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void from(io.cattle.platform.core.model.Host from) {
		setId(from.getId());
		setName(from.getName());
		setAccountId(from.getAccountId());
		setKind(from.getKind());
		setUuid(from.getUuid());
		setDescription(from.getDescription());
		setState(from.getState());
		setCreated(from.getCreated());
		setRemoved(from.getRemoved());
		setRemoveTime(from.getRemoveTime());
		setData(from.getData());
		setUri(from.getUri());
		setComputeFree(from.getComputeFree());
		setComputeTotal(from.getComputeTotal());
		setAgentId(from.getAgentId());
		setPhysicalHostId(from.getPhysicalHostId());
		setIsPublic(from.getIsPublic());
		setAgentState(from.getAgentState());
		setLocalStorageMb(from.getLocalStorageMb());
		setMemory(from.getMemory());
		setMilliCpu(from.getMilliCpu());
		setStackId(from.getStackId());
		setRemoveAfter(from.getRemoveAfter());
		setHostTemplateId(from.getHostTemplateId());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <E extends io.cattle.platform.core.model.Host> E into(E into) {
		into.from(this);
		return into;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached HostRecord
	 */
	public HostRecord() {
		super(io.cattle.platform.core.model.tables.HostTable.HOST);
	}

	/**
	 * Create a detached, initialised HostRecord
	 */
	public HostRecord(java.lang.Long id, java.lang.String name, java.lang.Long accountId, java.lang.String kind, java.lang.String uuid, java.lang.String description, java.lang.String state, java.util.Date created, java.util.Date removed, java.util.Date removeTime, java.util.Map<String,Object> data, java.lang.String uri, java.lang.Long computeFree, java.lang.Long computeTotal, java.lang.Long agentId, java.lang.Long physicalHostId, java.lang.Boolean isPublic, java.lang.String agentState, java.lang.Long localStorageMb, java.lang.Long memory, java.lang.Long milliCpu, java.lang.Long environmentId, java.util.Date removeAfter, java.lang.Long hostTemplateId) {
		super(io.cattle.platform.core.model.tables.HostTable.HOST);

		setValue(0, id);
		setValue(1, name);
		setValue(2, accountId);
		setValue(3, kind);
		setValue(4, uuid);
		setValue(5, description);
		setValue(6, state);
		setValue(7, created);
		setValue(8, removed);
		setValue(9, removeTime);
		setValue(10, data);
		setValue(11, uri);
		setValue(12, computeFree);
		setValue(13, computeTotal);
		setValue(14, agentId);
		setValue(15, physicalHostId);
		setValue(16, isPublic);
		setValue(17, agentState);
		setValue(18, localStorageMb);
		setValue(19, memory);
		setValue(20, milliCpu);
		setValue(21, environmentId);
		setValue(22, removeAfter);
		setValue(23, hostTemplateId);
	}
}
