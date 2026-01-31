package fr.spacefox.perftests.quarkus.data.entity774;

import fr.spacefox.perftests.quarkus.core.port.data.Entity774DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service774.model.Model774;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity774Repository implements Entity774DatasourcePort, PanacheRepository<Entity774> {
    @Override
    public Optional<Model774> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
