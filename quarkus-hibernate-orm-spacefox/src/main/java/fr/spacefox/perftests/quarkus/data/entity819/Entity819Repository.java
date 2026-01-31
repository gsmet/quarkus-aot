package fr.spacefox.perftests.quarkus.data.entity819;

import fr.spacefox.perftests.quarkus.core.port.data.Entity819DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service819.model.Model819;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity819Repository implements Entity819DatasourcePort, PanacheRepository<Entity819> {
    @Override
    public Optional<Model819> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
