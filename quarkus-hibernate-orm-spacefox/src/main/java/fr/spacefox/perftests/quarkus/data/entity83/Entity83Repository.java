package fr.spacefox.perftests.quarkus.data.entity83;

import fr.spacefox.perftests.quarkus.core.port.data.Entity83DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service83.model.Model83;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity83Repository implements Entity83DatasourcePort, PanacheRepository<Entity83> {
    @Override
    public Optional<Model83> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
