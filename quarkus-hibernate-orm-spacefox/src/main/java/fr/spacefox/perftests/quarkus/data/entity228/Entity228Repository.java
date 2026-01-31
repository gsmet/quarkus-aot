package fr.spacefox.perftests.quarkus.data.entity228;

import fr.spacefox.perftests.quarkus.core.port.data.Entity228DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service228.model.Model228;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity228Repository implements Entity228DatasourcePort, PanacheRepository<Entity228> {
    @Override
    public Optional<Model228> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
