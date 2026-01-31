package fr.spacefox.perftests.quarkus.data.entity62;

import fr.spacefox.perftests.quarkus.core.port.data.Entity62DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service62.model.Model62;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity62Repository implements Entity62DatasourcePort, PanacheRepository<Entity62> {
    @Override
    public Optional<Model62> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
