package fr.spacefox.perftests.quarkus.data.entity267;

import fr.spacefox.perftests.quarkus.core.port.data.Entity267DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service267.model.Model267;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity267Repository implements Entity267DatasourcePort, PanacheRepository<Entity267> {
    @Override
    public Optional<Model267> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
