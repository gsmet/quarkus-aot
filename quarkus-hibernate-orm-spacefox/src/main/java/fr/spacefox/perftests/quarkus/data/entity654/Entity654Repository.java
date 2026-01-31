package fr.spacefox.perftests.quarkus.data.entity654;

import fr.spacefox.perftests.quarkus.core.port.data.Entity654DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service654.model.Model654;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity654Repository implements Entity654DatasourcePort, PanacheRepository<Entity654> {
    @Override
    public Optional<Model654> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
