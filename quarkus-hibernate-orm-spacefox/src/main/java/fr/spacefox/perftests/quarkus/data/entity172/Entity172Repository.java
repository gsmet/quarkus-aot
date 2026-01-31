package fr.spacefox.perftests.quarkus.data.entity172;

import fr.spacefox.perftests.quarkus.core.port.data.Entity172DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service172.model.Model172;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity172Repository implements Entity172DatasourcePort, PanacheRepository<Entity172> {
    @Override
    public Optional<Model172> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
