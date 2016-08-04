package app.aml.dao;

import app.aml.configuration.BaseRepositoryDao;
import app.aml.model.ArchivosAml;

public interface ArchivosAmlDao extends BaseRepositoryDao<ArchivosAml, Long> {
	ArchivosAml findByNumber(Integer id);
}
