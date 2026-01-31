package fr.spacefox.perftests.quarkus.data.entity284;

import fr.spacefox.perftests.quarkus.core.port.data.Entity284DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service284.model.Model284;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity284Repository implements Entity284DatasourcePort, PanacheRepository<Entity284> {
    @Override
    public Optional<Model284> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
