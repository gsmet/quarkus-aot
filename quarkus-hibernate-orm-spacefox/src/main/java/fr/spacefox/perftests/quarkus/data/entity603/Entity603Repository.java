package fr.spacefox.perftests.quarkus.data.entity603;

import fr.spacefox.perftests.quarkus.core.port.data.Entity603DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service603.model.Model603;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity603Repository implements Entity603DatasourcePort, PanacheRepository<Entity603> {
    @Override
    public Optional<Model603> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
