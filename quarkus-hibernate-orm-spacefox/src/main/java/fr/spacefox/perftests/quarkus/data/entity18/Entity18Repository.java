package fr.spacefox.perftests.quarkus.data.entity18;

import fr.spacefox.perftests.quarkus.core.port.data.Entity18DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service18.model.Model18;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity18Repository implements Entity18DatasourcePort, PanacheRepository<Entity18> {
    @Override
    public Optional<Model18> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
