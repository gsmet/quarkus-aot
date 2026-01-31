package fr.spacefox.perftests.quarkus.data.entity948;

import fr.spacefox.perftests.quarkus.core.port.data.Entity948DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service948.model.Model948;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity948Repository implements Entity948DatasourcePort, PanacheRepository<Entity948> {
    @Override
    public Optional<Model948> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
