package fr.spacefox.perftests.quarkus.data.entity897;

import fr.spacefox.perftests.quarkus.core.port.data.Entity897DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service897.model.Model897;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity897Repository implements Entity897DatasourcePort, PanacheRepository<Entity897> {
    @Override
    public Optional<Model897> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
