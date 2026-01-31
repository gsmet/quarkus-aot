package fr.spacefox.perftests.quarkus.data.entity68;

import fr.spacefox.perftests.quarkus.core.port.data.Entity68DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service68.model.Model68;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity68Repository implements Entity68DatasourcePort, PanacheRepository<Entity68> {
    @Override
    public Optional<Model68> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
