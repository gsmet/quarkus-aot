package fr.spacefox.perftests.quarkus.data.entity755;

import fr.spacefox.perftests.quarkus.core.port.data.Entity755DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service755.model.Model755;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity755Repository implements Entity755DatasourcePort, PanacheRepository<Entity755> {
    @Override
    public Optional<Model755> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
