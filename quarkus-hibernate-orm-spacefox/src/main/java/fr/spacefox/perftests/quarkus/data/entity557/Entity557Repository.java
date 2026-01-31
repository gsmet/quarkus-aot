package fr.spacefox.perftests.quarkus.data.entity557;

import fr.spacefox.perftests.quarkus.core.port.data.Entity557DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service557.model.Model557;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity557Repository implements Entity557DatasourcePort, PanacheRepository<Entity557> {
    @Override
    public Optional<Model557> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
