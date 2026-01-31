package fr.spacefox.perftests.quarkus.data.entity530;

import fr.spacefox.perftests.quarkus.core.port.data.Entity530DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service530.model.Model530;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity530Repository implements Entity530DatasourcePort, PanacheRepository<Entity530> {
    @Override
    public Optional<Model530> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
