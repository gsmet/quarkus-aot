package fr.spacefox.perftests.quarkus.data.entity291;

import fr.spacefox.perftests.quarkus.core.port.data.Entity291DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service291.model.Model291;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity291Repository implements Entity291DatasourcePort, PanacheRepository<Entity291> {
    @Override
    public Optional<Model291> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
