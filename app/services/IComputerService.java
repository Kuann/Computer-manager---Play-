package services;

import com.avaje.ebean.PagedList;
import models.Computer;

import java.util.List;

/**
 * Created by An on 12/6/2016.
 */
public interface IComputerService {
    public boolean createComputer(Computer computer);
    public boolean updateComputer(Computer computer);
    public Computer getComputerById(Long id);
    public boolean deleteComputer(Long id);
    public List<Computer> getAllComputers();
    public Long countComputers();
    public PagedList<Computer> page(int page, int pageSize, String sortBy, String order, String filter);
}
