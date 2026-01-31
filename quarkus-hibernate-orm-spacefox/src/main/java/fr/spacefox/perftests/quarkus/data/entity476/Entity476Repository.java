package fr.spacefox.perftests.quarkus.data.entity476;

import fr.spacefox.perftests.quarkus.core.port.data.Entity476DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service476.model.Model476;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity476Repository implements Entity476DatasourcePort, PanacheRepository<Entity476> {
    @Override
    public Optional<Model476> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
