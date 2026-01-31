package fr.spacefox.perftests.quarkus.data.entity347;

import fr.spacefox.perftests.quarkus.core.port.data.Entity347DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service347.model.Model347;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity347Repository implements Entity347DatasourcePort, PanacheRepository<Entity347> {
    @Override
    public Optional<Model347> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
