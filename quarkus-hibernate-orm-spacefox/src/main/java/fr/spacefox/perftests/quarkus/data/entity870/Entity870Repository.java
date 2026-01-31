package fr.spacefox.perftests.quarkus.data.entity870;

import fr.spacefox.perftests.quarkus.core.port.data.Entity870DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service870.model.Model870;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity870Repository implements Entity870DatasourcePort, PanacheRepository<Entity870> {
    @Override
    public Optional<Model870> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
