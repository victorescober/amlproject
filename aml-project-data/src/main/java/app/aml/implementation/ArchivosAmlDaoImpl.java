package app.aml.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import app.aml.configuration.AbstractDao;
import app.aml.dao.ArchivosAmlDao;
import app.aml.model.ArchivosAml;


@Repository("archivosAmlDao")
@Transactional
public class ArchivosAmlDaoImpl extends AbstractDao implements ArchivosAmlDao {

	@Override
	public void delete(ArchivosAml entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<ArchivosAml> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<ArchivosAml> findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(ArchivosAml entity) {
		getSession().save(entity);

	}

	@Override
	public ArchivosAml findByNumber(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
