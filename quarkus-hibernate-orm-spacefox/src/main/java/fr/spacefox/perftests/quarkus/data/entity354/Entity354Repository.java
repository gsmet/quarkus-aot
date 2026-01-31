package fr.spacefox.perftests.quarkus.data.entity354;

import fr.spacefox.perftests.quarkus.core.port.data.Entity354DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service354.model.Model354;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity354Repository implements Entity354DatasourcePort, PanacheRepository<Entity354> {
    @Override
    public Optional<Model354> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
