package dao;

import model.Address;
import org.hibernate.SessionFactory;

import java.util.Set;

public interface AddressDao {

    void createAddress(Address address, SessionFactory sessionFactory);

    void update(long id, Address address);

    void deleteById(long id);

    Address getAddressById(long id,SessionFactory sessionFactory);

    Set<Address> getAll();

    void deleteById(long id, SessionFactory sessionFactory);
}
