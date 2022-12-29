package weplus.sfg_pet_clinic.services.map;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import weplus.sfg_pet_clinic.model.Visit;
import weplus.sfg_pet_clinic.services.VisitService;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class VisitMapService extends AbstractMapService<Visit, Long>
        implements VisitService {

    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public Visit findById(Long id) {
        return null;
    }

    @Override
    public Visit save(Visit object) {

        if (object.getPet() == null ||
            object.getPet().getOwner() == null ||
            object.getPet().getId() == null ||
            object.getPet(). getOwner().getId() == null) {
            throw new RuntimeException("Invalid Visit");
        }
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Visit object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
