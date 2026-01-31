package fr.spacefox.perftests.quarkus.data.entity873;

import fr.spacefox.perftests.quarkus.core.port.data.Entity873DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service873.model.Model873;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity873Repository implements Entity873DatasourcePort, PanacheRepository<Entity873> {
    @Override
    public Optional<Model873> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
