package fr.spacefox.perftests.quarkus.data.entity833;

import fr.spacefox.perftests.quarkus.core.port.data.Entity833DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service833.model.Model833;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity833Repository implements Entity833DatasourcePort, PanacheRepository<Entity833> {
    @Override
    public Optional<Model833> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
