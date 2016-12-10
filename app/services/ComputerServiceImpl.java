package services;

import com.avaje.ebean.PagedList;
import models.Computer;

import javax.inject.Singleton;
import java.util.List;

/**
 * Created by An on 12/6/2016.
 */
@Singleton
public class ComputerServiceImpl implements IComputerService {

    @Override
    public boolean createComputer(Computer computer) {
        return false;
    }

    @Override
    public boolean updateComputer(Computer computer) {
        computer.update();
        return true;
    }

    @Override
    public Computer getComputerById(Long id) {
        return Computer.find.byId(id);
    }

    @Override
    public boolean deleteComputer(Long id) {
        Computer.find.deleteById(id);
        return true;
    }

    @Override
    public List<Computer> getAllComputers() {
        return Computer.find.all();
    }

    @Override
    public Long countComputers() {
        return null;
    }

    @Override
    public PagedList<Computer> page(int page, int pageSize, String sortBy, String order, String filter) {
        return Computer.find.where()
                .ilike("name", "%" + filter + "%")
                .orderBy(sortBy + " " + order)
                .fetch("company")
                .findPagedList(page, pageSize);
    }
}
