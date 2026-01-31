package fr.spacefox.perftests.quarkus.data.entity430;

import fr.spacefox.perftests.quarkus.core.port.data.Entity430DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service430.model.Model430;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity430Repository implements Entity430DatasourcePort, PanacheRepository<Entity430> {
    @Override
    public Optional<Model430> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
