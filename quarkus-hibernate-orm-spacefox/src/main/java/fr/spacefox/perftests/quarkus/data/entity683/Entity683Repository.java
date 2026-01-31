package fr.spacefox.perftests.quarkus.data.entity683;

import fr.spacefox.perftests.quarkus.core.port.data.Entity683DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service683.model.Model683;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity683Repository implements Entity683DatasourcePort, PanacheRepository<Entity683> {
    @Override
    public Optional<Model683> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
