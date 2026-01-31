package fr.spacefox.perftests.quarkus.data.entity388;

import fr.spacefox.perftests.quarkus.core.port.data.Entity388DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service388.model.Model388;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity388Repository implements Entity388DatasourcePort, PanacheRepository<Entity388> {
    @Override
    public Optional<Model388> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
