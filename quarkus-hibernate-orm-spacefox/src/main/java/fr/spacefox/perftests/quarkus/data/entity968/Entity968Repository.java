package fr.spacefox.perftests.quarkus.data.entity968;

import fr.spacefox.perftests.quarkus.core.port.data.Entity968DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service968.model.Model968;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity968Repository implements Entity968DatasourcePort, PanacheRepository<Entity968> {
    @Override
    public Optional<Model968> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
