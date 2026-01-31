package fr.spacefox.perftests.quarkus.data.entity587;

import fr.spacefox.perftests.quarkus.core.port.data.Entity587DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service587.model.Model587;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity587Repository implements Entity587DatasourcePort, PanacheRepository<Entity587> {
    @Override
    public Optional<Model587> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
