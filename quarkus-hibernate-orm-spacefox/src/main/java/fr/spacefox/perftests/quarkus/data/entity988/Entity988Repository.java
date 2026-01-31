package fr.spacefox.perftests.quarkus.data.entity988;

import fr.spacefox.perftests.quarkus.core.port.data.Entity988DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service988.model.Model988;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity988Repository implements Entity988DatasourcePort, PanacheRepository<Entity988> {
    @Override
    public Optional<Model988> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
