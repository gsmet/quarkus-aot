package fr.spacefox.perftests.quarkus.data.entity196;

import fr.spacefox.perftests.quarkus.core.port.data.Entity196DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service196.model.Model196;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity196Repository implements Entity196DatasourcePort, PanacheRepository<Entity196> {
    @Override
    public Optional<Model196> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
