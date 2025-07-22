
/*
IPaymentService POJO Class
Author: Phindile Lisa Ngozi
Student Number: 230640893
Date: 2025/05/25
 */
package za.ac.cput.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Supplier;
import za.ac.cput.repository.SupplierRepository;
import za.ac.cput.service.ISupplierService;

import java.util.List;

@Service
public class SupplierService implements ISupplierService {
    private SupplierRepository repository;

    @Autowired
    public SupplierService(SupplierRepository repository) {
        this.repository = repository;
    }

    @Override
    public Supplier create(Supplier supplier) {
        return repository.save(supplier);
    }

    @Override
    public Supplier read(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Supplier update(Supplier supplier) {
        return repository.save(supplier);
    }

    @Override
    public boolean delete(String id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public List<Supplier> getAll() {
        return repository.findAll();
    }
}

