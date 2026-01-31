package fr.spacefox.perftests.quarkus.data.entity425;

import fr.spacefox.perftests.quarkus.core.port.data.Entity425DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service425.model.Model425;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity425Repository implements Entity425DatasourcePort, PanacheRepository<Entity425> {
    @Override
    public Optional<Model425> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
