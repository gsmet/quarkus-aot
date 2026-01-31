package fr.spacefox.perftests.quarkus.data.entity415;

import fr.spacefox.perftests.quarkus.core.port.data.Entity415DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service415.model.Model415;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity415Repository implements Entity415DatasourcePort, PanacheRepository<Entity415> {
    @Override
    public Optional<Model415> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
