package fr.spacefox.perftests.quarkus.data.entity605;

import fr.spacefox.perftests.quarkus.core.port.data.Entity605DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service605.model.Model605;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity605Repository implements Entity605DatasourcePort, PanacheRepository<Entity605> {
    @Override
    public Optional<Model605> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
