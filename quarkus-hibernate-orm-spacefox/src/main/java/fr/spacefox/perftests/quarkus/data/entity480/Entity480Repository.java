package fr.spacefox.perftests.quarkus.data.entity480;

import fr.spacefox.perftests.quarkus.core.port.data.Entity480DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service480.model.Model480;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity480Repository implements Entity480DatasourcePort, PanacheRepository<Entity480> {
    @Override
    public Optional<Model480> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
