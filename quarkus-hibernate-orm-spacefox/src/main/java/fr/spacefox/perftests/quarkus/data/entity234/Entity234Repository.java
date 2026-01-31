package fr.spacefox.perftests.quarkus.data.entity234;

import fr.spacefox.perftests.quarkus.core.port.data.Entity234DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service234.model.Model234;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity234Repository implements Entity234DatasourcePort, PanacheRepository<Entity234> {
    @Override
    public Optional<Model234> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
