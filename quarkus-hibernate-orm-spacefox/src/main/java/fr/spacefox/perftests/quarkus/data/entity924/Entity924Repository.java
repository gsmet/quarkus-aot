package fr.spacefox.perftests.quarkus.data.entity924;

import fr.spacefox.perftests.quarkus.core.port.data.Entity924DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service924.model.Model924;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity924Repository implements Entity924DatasourcePort, PanacheRepository<Entity924> {
    @Override
    public Optional<Model924> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
