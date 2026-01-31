package fr.spacefox.perftests.quarkus.data.entity549;

import fr.spacefox.perftests.quarkus.core.port.data.Entity549DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service549.model.Model549;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity549Repository implements Entity549DatasourcePort, PanacheRepository<Entity549> {
    @Override
    public Optional<Model549> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
