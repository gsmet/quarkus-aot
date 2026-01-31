package fr.spacefox.perftests.quarkus.data.entity694;

import fr.spacefox.perftests.quarkus.core.port.data.Entity694DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service694.model.Model694;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity694Repository implements Entity694DatasourcePort, PanacheRepository<Entity694> {
    @Override
    public Optional<Model694> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
