package fr.spacefox.perftests.quarkus.data.entity328;

import fr.spacefox.perftests.quarkus.core.port.data.Entity328DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service328.model.Model328;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity328Repository implements Entity328DatasourcePort, PanacheRepository<Entity328> {
    @Override
    public Optional<Model328> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
