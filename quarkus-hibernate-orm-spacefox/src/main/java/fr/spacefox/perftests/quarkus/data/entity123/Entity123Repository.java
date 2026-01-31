package fr.spacefox.perftests.quarkus.data.entity123;

import fr.spacefox.perftests.quarkus.core.port.data.Entity123DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service123.model.Model123;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity123Repository implements Entity123DatasourcePort, PanacheRepository<Entity123> {
    @Override
    public Optional<Model123> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
