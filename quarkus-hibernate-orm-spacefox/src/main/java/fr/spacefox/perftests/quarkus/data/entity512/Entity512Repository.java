package fr.spacefox.perftests.quarkus.data.entity512;

import fr.spacefox.perftests.quarkus.core.port.data.Entity512DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service512.model.Model512;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity512Repository implements Entity512DatasourcePort, PanacheRepository<Entity512> {
    @Override
    public Optional<Model512> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
