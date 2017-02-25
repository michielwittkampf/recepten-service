package nl.michielwittkampf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class ReceptenService {

    @Autowired
    ReceptenRepository receptenRepository;

    @Cacheable(cacheNames = "recepten")
    public Iterable<Recept> getAll() {
        return receptenRepository.findAll();
    }

    @CacheEvict(cacheNames = "recepten", allEntries = true)
    public void add(Recept recept) {
        receptenRepository.save(recept);
    }
}
