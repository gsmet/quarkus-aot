package fr.spacefox.perftests.quarkus.data.entity692;

import fr.spacefox.perftests.quarkus.core.port.data.Entity692DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service692.model.Model692;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity692Repository implements Entity692DatasourcePort, PanacheRepository<Entity692> {
    @Override
    public Optional<Model692> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
