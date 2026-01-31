package fr.spacefox.perftests.quarkus.data.entity361;

import fr.spacefox.perftests.quarkus.core.port.data.Entity361DatasourcePort;
import fr.spacefox.perftests.quarkus.core.service361.model.Model361;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
@RunOnVirtualThread
public class Entity361Repository implements Entity361DatasourcePort, PanacheRepository<Entity361> {
    @Override
    public Optional<Model361> find(Long id) {
        return findByIdOptional(id).map(Mapper::of);
    }
}
