package fr.spacefox.perftests.quarkus.data.entity704;

import fr.spacefox.perftests.quarkus.core.port.data.Entity704DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service704.model.Model704;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity704Repository implements Entity704DatasourcePort, PanacheRepository<Entity704> {
    @Override
    public Optional<Model704> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
