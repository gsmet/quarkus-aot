package fr.spacefox.perftests.quarkus.data.entity485;

import fr.spacefox.perftests.quarkus.core.port.data.Entity485DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service485.model.Model485;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity485Repository implements Entity485DatasourcePort, PanacheRepository<Entity485> {
    @Override
    public Optional<Model485> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
