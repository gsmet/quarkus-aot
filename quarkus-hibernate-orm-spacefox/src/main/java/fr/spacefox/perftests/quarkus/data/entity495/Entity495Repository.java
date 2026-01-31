package fr.spacefox.perftests.quarkus.data.entity495;

import fr.spacefox.perftests.quarkus.core.port.data.Entity495DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service495.model.Model495;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity495Repository implements Entity495DatasourcePort, PanacheRepository<Entity495> {
    @Override
    public Optional<Model495> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
