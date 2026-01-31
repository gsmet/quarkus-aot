package fr.spacefox.perftests.quarkus.data.entity7;

import fr.spacefox.perftests.quarkus.core.port.data.Entity7DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service7.model.Model7;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity7Repository implements Entity7DatasourcePort, PanacheRepository<Entity7> {
    @Override
    public Optional<Model7> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
