package fr.spacefox.perftests.quarkus.data.entity39;

import fr.spacefox.perftests.quarkus.core.port.data.Entity39DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service39.model.Model39;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity39Repository implements Entity39DatasourcePort, PanacheRepository<Entity39> {
    @Override
    public Optional<Model39> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
