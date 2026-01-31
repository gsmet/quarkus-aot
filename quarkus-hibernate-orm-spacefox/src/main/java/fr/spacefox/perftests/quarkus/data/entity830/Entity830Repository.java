package fr.spacefox.perftests.quarkus.data.entity830;

import fr.spacefox.perftests.quarkus.core.port.data.Entity830DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service830.model.Model830;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity830Repository implements Entity830DatasourcePort, PanacheRepository<Entity830> {
    @Override
    public Optional<Model830> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
