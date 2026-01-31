package fr.spacefox.perftests.quarkus.data.entity975;

import fr.spacefox.perftests.quarkus.core.port.data.Entity975DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service975.model.Model975;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity975Repository implements Entity975DatasourcePort, PanacheRepository<Entity975> {
    @Override
    public Optional<Model975> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
