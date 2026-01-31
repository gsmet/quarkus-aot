package fr.spacefox.perftests.quarkus.data.entity283;

import fr.spacefox.perftests.quarkus.core.port.data.Entity283DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service283.model.Model283;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity283Repository implements Entity283DatasourcePort, PanacheRepository<Entity283> {
    @Override
    public Optional<Model283> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
