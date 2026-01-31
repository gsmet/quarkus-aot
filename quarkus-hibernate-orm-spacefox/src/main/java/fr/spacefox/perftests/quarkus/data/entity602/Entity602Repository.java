package fr.spacefox.perftests.quarkus.data.entity602;

import fr.spacefox.perftests.quarkus.core.port.data.Entity602DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service602.model.Model602;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity602Repository implements Entity602DatasourcePort, PanacheRepository<Entity602> {
    @Override
    public Optional<Model602> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
